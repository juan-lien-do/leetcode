package org.example.ejercicios.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            }
            else {
                nums[i - zeroes] = nums[i];
            }


            if (i + zeroes >= nums.length) {

                if (nums[i] == 0) {
                    nums[nums.length - zeroes] = 0;
                }
                nums[i] = 0;
            }





            for (int x : nums) {
                System.out.print(x + ",");
            }
            System.out.print("\n");


        }
        return nums;
    }
}
