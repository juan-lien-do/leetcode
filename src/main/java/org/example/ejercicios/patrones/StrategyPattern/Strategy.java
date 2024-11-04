package org.example.ejercicios.patrones.StrategyPattern;

@FunctionalInterface
public interface Strategy {
    public Integer contarCaracteres(String str);
}
