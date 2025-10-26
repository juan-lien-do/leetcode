package org.example.ejercicios.easy;

import java.util.LinkedList;
import java.util.Queue;

public class AddBinary {
    public static String addBinary(String a, String b) {
        Queue<Character> queueA = new LinkedList<>();
        Queue<Character> queueB = new LinkedList<>();

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        for (int i = charA.length-1; i >= 0; i--) {
            queueA.add(charA[i]);
        }
        for (int i = charB.length-1; i >= 0; i--) {
            queueB.add(charB[i]);
        }



        StringBuilder sb = new StringBuilder();
        boolean exitNow = false;
        boolean hasCarry = false;
        int currVal = 0;
        while(!exitNow){

            currVal = 0;
            Character currCharA = queueA.poll();
            Character currCharB = queueB.poll();

            if (currCharB == null && currCharA == null){
                if (hasCarry){
                    sb.append('1');
                }
                exitNow = true;
                continue;
            }

            if (currCharA != null && currCharA == '1'){
                currVal += 1;
            }
            if (currCharB != null && currCharB == '1'){
                currVal += 1;
            }
            if (hasCarry){
                currVal +=1;
            }
            hasCarry = false;

            if (currVal == 0){
                sb.append('0');
            } else if (currVal == 1) {
                sb.append('1');
            } else if (currVal == 2){
                sb.append('0');
                hasCarry = true;
            } else {
                sb.append('1');
                hasCarry = true;
            }

            System.out.print(currVal);
            System.out.print(currCharA);
            System.out.println(currCharB);

        }

        sb.reverse();
        return sb.toString();
    }


    /// DEMO
    public static void main(String[] args){
        String ans = addBinary("1111", "1111");
        System.out.println(ans);
    }
}
