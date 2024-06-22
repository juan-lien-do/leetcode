package org.example.ejercicios.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class FindTheIndexOfTheFirstOcurrenceInAString {
    public int strStr(String haystack, String needle) {
        // I can solve this by using a hashmap
        // the key will be the index where we started analysing
        // the value will be the progress.
        // if progress reaches needle.length then there is success
        // so we set the answer
        Map<Integer, Integer> mapa = new HashMap<>();

        boolean success = false;
        int ans = -1;
        char[] charHaystack = haystack.toCharArray();
        char[] charNeedle = needle.toCharArray();

        for (int i = 0; i < charHaystack.length; i++){

            if (charHaystack[i] == charNeedle[0]){
                if (charNeedle.length == 1) return i;
                mapa.put(i, 1);
            }
            //System.out.println(mapa.toString());
            Stack<Integer> removeStack = new Stack<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = mapa.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, Integer> entry = iterator.next();
                if (entry.getKey() == i) continue;
                if (charHaystack[i] == charNeedle[entry.getValue()]){
                    entry.setValue(entry.getValue()+1);
                    if (entry.getValue() == charNeedle.length){
                        ans = entry.getKey();
                        success = true;
                        break;
                    }
                } else {
                    removeStack.push(entry.getKey());
                }
            }
            while (!removeStack.isEmpty()){
                mapa.remove(removeStack.pop());
            }
            if (success) break;

        }

        return ans;
    }
}