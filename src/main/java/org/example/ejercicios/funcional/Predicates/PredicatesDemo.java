package org.example.ejercicios.funcional.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {

    public static void main(String[] args) {
        Predicate<String> isLong = x -> x.length() > 10;
        Predicate<String> lastLetterA = x -> x.charAt(x.length() - 1) == 'A';

        List<String> strings = Arrays.asList("aaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaB", "eeA", "eeea");

        System.out.println("is Long and lastLetterA");
        System.out.println(strings.stream().filter(isLong.and(lastLetterA)).toList());
        System.out.println("is Long or lastLetterA");
        System.out.println(strings.stream().filter(isLong.or(lastLetterA)).toList());
        System.out.println("Neither long nor lastLetterA");
        System.out.println(strings.stream().filter(isLong.or(lastLetterA).negate()).toList());
    }
}
