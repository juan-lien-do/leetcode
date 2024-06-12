package org.example.ejercicios.easy;

public class NumberOfLinesToWriteString {
    public static int[] numberOfLines(int[] widths, String s) {
        int currLine = 0;
        int numberLines = 1;
        for (int i = 0; i < s.length(); i++) {
            int currSize = widths[((int) s.charAt(i)) - 97];
            if (currLine + currSize > 100) {
                currLine = currSize;
                numberLines++;
            } else {
                currLine += currSize;
            }
        }
        int[] ans = {numberLines, currLine};
        return ans;
    }
}