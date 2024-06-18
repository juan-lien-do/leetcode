package org.example.ejercicios.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> map = new HashMap<>();
        int valCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                map.put(valCount, i);
                valCount++;
            }
        }
        //if (valCount == 0) return 0;

        int mapIterator = 0;
        int swap = 0;
        int eagerAppearences = 0;
        for (int i = nums.length - 1; mapIterator != valCount - eagerAppearences; i--) {
            if (nums[i] != val) {
                System.out.println();
                swap = nums[i];
                nums[i] = nums[map.get(mapIterator)];
                nums[map.get(mapIterator)] = swap;
                mapIterator++;
            } else {
                eagerAppearences++;
                map.remove(map.size()-1);
            }

        }
        return nums.length - valCount;

    }

    public int removeElement1(int[] nums, int val) {
        if (nums.length == 0) return 0;
        // hay que borrar todos los valores val del array, y reemplazarlos por otros numeros en el array.
        // seria mejor borrar ceros desde el principio e ir buscando numeros desde el final del array
        // dos bucles for ????
        // y si uso un hashmap
        int j = nums.length - 1;
        int cantVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (j = nums.length - 1; i < j; j--) {
                    if (nums[j] != val) {
                        break;
                    }
                }
                cantVal++;
                nums[i] = nums[j];
                nums[j] = val;
            }
            System.out.println(cantVal);
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(nums));
        return nums.length - cantVal + 1;
    }
}