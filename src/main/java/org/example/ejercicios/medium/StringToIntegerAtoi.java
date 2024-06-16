package org.example.ejercicios.medium;

public class StringToIntegerAtoi {
    public boolean isADigit(char c) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < 10; i++) {
            if (c == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    public int myAtoi(String s) {
        /*
        Whitespace: Ignore any leading whitespace (" ").
        Signedness: Determine the sign by checking if the next character is '-' or '+',
         assuming positivity is neither present.
        Conversion: Read the integer by skipping leading zeros until a non-digit character
         is encountered or the end of the string is reached. If no digits were read,
          then the result is 0.
        Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1],
         then round the integer to remain in the range. Specifically,
          integers less than -2^31 should be rounded to -2^31, and integers greater than 2^31 - 1
           should be rounded to 2^31 - 1.*/
        boolean isNotANumber = true;
        boolean stageRemoveWhitespace = true;
        boolean stageConversion = false;
        boolean isNegative = false;
        long answer = 0;
        char currentChar;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (stageRemoveWhitespace) {
                if (currentChar == ' ') continue;
                if (currentChar == '+') {
                    stageConversion = true;
                    stageRemoveWhitespace = false;
                    continue;
                } else if (currentChar == '-') {
                    isNegative = true;
                    stageConversion = true;
                    stageRemoveWhitespace = false;
                    continue;

                } else if (isADigit(currentChar)) {
                    stageConversion = true;
                    stageRemoveWhitespace = false;
                    isNotANumber = false;
                } else {
                    break;
                }

            }

            if (stageConversion) {
                if (isADigit(currentChar)) {
                    isNotANumber = false;


                    answer *= 10;
                    answer += ((long) currentChar) - 48L;
                    // here comes an eager rounding
                    if (answer > 2147483647L && (!isNegative)){
                        return Integer.MAX_VALUE;
                    } else if (answer > 2147483648L && (isNegative)) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    break;
                }
            }

        }

        if (isNotANumber) return 0;
        // here goes the rounding
        return isNegative ? -(int) answer : (int) answer;
    }
}