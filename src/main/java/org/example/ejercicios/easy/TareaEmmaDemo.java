package org.example.ejercicios.easy;

import java.util.Arrays;

public class TareaEmmaDemo {

    public static void main(String[] args){
        int max = 5;
        int i = 1;
        int op = 1;
        while (i > 0){
            if (i == max){
                op = -1;
            }
            i += op;
            char[] print = new char[i];
            Arrays.fill(print, 'a');
            System.out.println(print);
        }
    }
}
