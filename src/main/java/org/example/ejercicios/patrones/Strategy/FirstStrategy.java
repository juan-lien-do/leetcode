package org.example.ejercicios.patrones.Strategy;

public class FirstStrategy implements Strategy{
    @Override
    public Integer algorythm(String texto) {
        System.out.println("First Strategy");
        char[] charText = texto.toCharArray();
        return charText.length;
    }
}
