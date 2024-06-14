package org.example.ejercicios.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int wordLength = 0;
        char c = ' ';
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c == ' ' && wordLength > 0) {
                break;
            } else if (c != ' ') {
                wordLength++;
            }

        }

        return wordLength;
    }
}