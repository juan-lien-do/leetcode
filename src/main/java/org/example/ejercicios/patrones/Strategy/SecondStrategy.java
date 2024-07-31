package org.example.ejercicios.patrones.Strategy;

public class SecondStrategy implements Strategy {
    @Override
    public Integer algorythm(String texto) {
        System.out.println("Second Strategy");

        int num = 0;
        for (Character e : texto.toCharArray() ) {
            num++;
        }
        return num;
    }
}
