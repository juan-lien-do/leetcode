package org.example.ejercicios.patrones.StrategyPattern;

public class StratDemo {
    public static void main(String[] args) {
        Strategy strat = new StrategyImplA();
        String txt = "Hola mundo";

        imprimirCantidad(txt, strat);
        imprimirCantidad(txt, new StrategyImplB());
        imprimirCantidad(txt, x -> x.length());
        imprimirCantidad(txt, String::length);

    }

    public static void imprimirCantidad(String txt, Strategy strategy){
        System.out.println("--------------------\n");
        System.out.println(strategy.contarCaracteres(txt));
    }
}
