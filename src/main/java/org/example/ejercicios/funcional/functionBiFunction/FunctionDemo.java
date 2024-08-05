package org.example.ejercicios.funcional.functionBiFunction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FunctionDemo {
    public static Function<Integer, Integer> function;
    public static void main(String[] args){
        Function<Integer, Integer> duplicador =
                x -> x * 2;
        Function<Integer, Integer> sumador =
                x -> x- 1;

        FunctionDemo.function = sumador.andThen(duplicador);

        List<Integer> list = Arrays.asList(1, 2, 8, 4, 2, 9);


        list.sort(Comparator.comparing(Integer::valueOf));

        System.out.println(list.stream().map(FunctionDemo.function).toList());
        System.out.println();

    }
}
