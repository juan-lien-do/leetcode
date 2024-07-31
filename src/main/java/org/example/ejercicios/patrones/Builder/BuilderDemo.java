package org.example.ejercicios.patrones.Builder;

public class BuilderDemo {
    public static void main( String[] args )
    {
        Persona persona1 = Persona.builder().edad(56).nombre("Mariana").build();
        System.out.println(persona1.toString());
        Persona persona2 = new Persona("Mariana", 48);
        System.out.println(persona2.toString());
    }
}
