package org.example.ejercicios.patrones.StrategyPattern;

public class StrategyImplA implements Strategy{

    @Override
    public Integer contarCaracteres(String str) {
        char[] array = str.toCharArray();

        return array.length;
    }
}
