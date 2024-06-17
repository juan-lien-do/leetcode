package org.example.ejercicios.hard;

public class RegularExpressionMatching {
    // unfinished
    public boolean isMatch(String s, String p) {
        // no empty strings
        boolean sStringIsOver = false;
        boolean exitLoop = false;
        boolean mismatch = false;
        int sIterator = s.length() - 1;
        int pIterator = p.length() - 1;
        boolean canLookBack = false;
        char prevSChar = s.charAt(sIterator);
        char currSChar = '!';

        char currPChar = '!';
        while (!exitLoop) {
            System.out.println(" ");
            currSChar = s.charAt(sIterator);
            currPChar = p.charAt(pIterator);
            System.out.println(sIterator);
            System.out.println(pIterator);
            System.out.println(currSChar);
            System.out.println(currPChar);

            if (currPChar == '.') {
                pIterator--;
                canLookBack = false;
            } else if (currPChar == '*') {
                // utilizar el prev?
                if (canLookBack) {
                    if (sIterator == 0 && pIterator == 1){
                        exitLoop = true;
                        mismatch =!((p.charAt(0) == prevSChar) || (p.charAt(0) == '.'));
                    }
                    if (prevSChar != currSChar) {
                        char nextPChar = p.charAt(pIterator - 1);
                        if (nextPChar == '.' || nextPChar == prevSChar) {
                            pIterator -= 2;
                            //pIterator = pIterator < 0 ? 1 : pIterator;
                            canLookBack = false;
                        } else {
                            exitLoop = true;
                            mismatch = true;
                        }
                    }
                } else {
                    canLookBack = true;
                }


            } else if (currPChar == currSChar) {
                pIterator--;
                canLookBack = false;
            } else {
                exitLoop = true;
                mismatch = true;
            }

            sIterator--;
            prevSChar = currSChar;
            canLookBack = currPChar == '*';

            if (sIterator < 0 || pIterator < 0) {
                exitLoop = true;
                if (sIterator != pIterator) {
                    mismatch = true;
                }
            }


        }
        System.out.println(" ");
        System.out.println(pIterator);
        System.out.println(sIterator);

        return !mismatch;
    }
}

// something i've learned: when working with regex it is better to draw a state diagram before getting my hands into coding