package org.example.ejercicios.medium;

public class LargestPalindromicNumber {
    public String largestPalindromic(String num) {
        // first we are gonna count the times each number appears in the sequence.
        int[] digitAppearences = new int[10]; // 0 index is for 0, 1 index is for 1, etc
        boolean flagCanPutZeroes = false;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            digitAppearences[Character.getNumericValue(c)] += 1;
        }
        // Now, we should iterate backwards the digit appearences array.
        // if it is even and above 1, divide it by 2 and place as many chars and save it as middle char.
        // if odd and above 2, divide by 2 and place as many chars.
        // if odd and equal to 1, save it as middlechar.
        // I'm gonna add a String Builder
        StringBuilder sb1 = new StringBuilder();
        Character middleChar = null;
        // the zeroes work in a messy way so imma work on 'em after the loop


        for (int i = 9; i >= 0; i--) {
            if (digitAppearences[i] >= 2 && ((i == 0 && flagCanPutZeroes) || i != 0)) {
                for (int j = 0; j < digitAppearences[i] / 2; j++) {
                    sb1.append(Integer.toString(i));
                    flagCanPutZeroes = true;
                }
                digitAppearences[i] = digitAppearences[i] % 2;
            }
            if (middleChar == null && digitAppearences[i] % 2 == 1) {
                middleChar = (char) (i + 48);
            }
        }
        if (middleChar == null && !flagCanPutZeroes) return "0";


        // from here we just have to build one string, then reverse the string builder, append the middleChar,
        // and add the previously built string. then generate the final string.
        sb1.reverse();
        String midString = sb1.toString();
        sb1.reverse();
        if (middleChar != null) sb1.append(middleChar);
        sb1.append(midString);
        return sb1.toString();
    }
}
