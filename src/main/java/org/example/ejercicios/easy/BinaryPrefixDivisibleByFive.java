package org.example.ejercicios.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleByFive {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();

        int temp = 0;
        for (int num : nums) {
            temp = (temp * 2 + num) % 5;
            res.add(0 == temp);
        }

        return res;
    }
}
