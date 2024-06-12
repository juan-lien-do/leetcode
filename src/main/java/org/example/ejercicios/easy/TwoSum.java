package org.example.ejercicios.easy;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int ans1 = 0;
        int ans2 = 0;
        boolean exitFlag = false;
        for (int i = 0; i < nums.length; i++) {
            if (exitFlag) break;
            for (int j = i; j < nums.length; j++) {
                if (j == i || exitFlag) {
                    continue;
                } else {
                    if (nums[i] + nums[j] == target) {
                        ans1 = i;
                        ans2 = j;
                        exitFlag = true;
                    }
                }
            }
        }
        int[] ans = {ans1, ans2};
        return ans;
    }
}
