package org.example.ejercicios.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // I'm given a digits array that represents a number
        // where the most significant digit is at arr[0]
        // I have to add 1 and sum.
        // if overflowed, increase the size of the array.
        // increasing the size of the array might be the hardest thing of all.
        // PD not at all
        boolean overflow = false;
        for (int i = digits.length-1; i>=0; i--){
            // carry
            if (digits[i] == 9){
                // overflow
                if (i == 0){
                    overflow = true;
                    break;
                }else {
                    digits[i] = 0;
                }
            } else {
                digits[i]++;
                break;
            }
        }
        if (overflow){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        } else return digits;
    }
}