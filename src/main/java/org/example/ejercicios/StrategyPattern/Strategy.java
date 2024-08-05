package org.example.ejercicios.StrategyPattern;

@FunctionalInterface
public interface Strategy {
    public Integer contarCaracteres(String str);
}
