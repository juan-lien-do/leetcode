package org.example.ejercicios.patrones.StrategyPattern;

public class StrategyImplB implements Strategy{
    @Override
    public Integer contarCaracteres(String str) {
        int cont = 0;
        for (int i = 0; i < str.toCharArray().length; i++){
            cont++;
        }

        return cont;
    }
}
