package org.example.ejercicios.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        // podria hacer un hashmap con las apariciones por cada entero.
        // luego agarrar cada uno de esos numeros y hacer un factorial dividido 2
        // y sumarlo
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> mapita = new HashMap<>();
        int acum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mapita.containsKey(nums[i])) {
                mapita.put(nums[i], mapita.get(nums[i]) + 1);
            } else mapita.put(nums[i], 1);
        }
        //System.out.println(mapita.values());
        for(Integer entero : mapita.values()){
            if(entero > 1){
                int increase = sum(entero - 1);
                //System.out.println(increase);
                acum += increase;
            }
        }
        return acum;
    }

    private int sum (int num){
        //System.out.println(acum);
        if(num > 0){
            return num + sum(num - 1);
        }else {
            return 0;
        }
    }
}