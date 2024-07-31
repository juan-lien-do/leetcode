package org.example.ejercicios.patrones.Singleton;

public class Singleton {
    public static Singleton instance;
    private int value;

    public int getValue(){
        return value;
    }
    public void setValue(int val){
        this.value = val;
    }

    private Singleton(int val){
        this.value = val;
    }

    public Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(0);
        }
        return instance;
    }
}
