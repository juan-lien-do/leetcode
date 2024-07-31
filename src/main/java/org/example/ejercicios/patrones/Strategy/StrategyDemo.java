package org.example.ejercicios.patrones.Strategy;

public class StrategyDemo {
    public static void doSomething(String txt, Strategy strategy) {
        System.out.println("--------------\n");
        System.out.println(strategy.algorythm(txt));
    }

    public static void main( String[] args )
    {


    }

}
