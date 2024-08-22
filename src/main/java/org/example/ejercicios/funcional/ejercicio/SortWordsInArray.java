package org.example.ejercicios.funcional.ejercicio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortWordsInArray {
    public static void main(String[] args) {
        System.out.print("Please, enter words separated by space: ");
        //<write your code here>
        Scanner sc = new Scanner(System.in);

        String baseStr = sc.nextLine();

        List<String> strs = new java.util.ArrayList<>(Arrays.stream(baseStr.split(" ")).toList());

        //System.out.println(strs);

        strs.sort(Comparator.comparing(String::length).reversed());
        System.out.println(strs);
    }
}
