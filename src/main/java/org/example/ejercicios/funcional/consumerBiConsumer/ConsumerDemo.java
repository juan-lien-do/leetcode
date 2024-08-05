package org.example.ejercicios.funcional.consumerBiConsumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerDemo {
    public static BiConsumer<Integer, List<Integer>> ingresarAListaSi =
            (entero, lista) -> {
                if (entero > 7) lista.add(entero);
            };

    public static void main(String[] args) {
        // vamos a llenar esta lista
        List<Integer> listaFinal = new ArrayList<>();
        List<Integer> origen = Arrays.asList(1,5,8,9,8,7);

        //origen.stream().forEach(x -> ingresarAListaSi.accept(x, listaFinal));
        origen.iterator().forEachRemaining(x -> ingresarAListaSi.accept(x, listaFinal));
        System.out.println(listaFinal);
    }
}
