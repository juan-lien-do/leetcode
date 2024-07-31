package org.example.ejercicios.patrones.Builder;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(){}

    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    public static class PersonaBuilder{
        private Persona persona;

        public PersonaBuilder(){
            this.persona = new Persona();
        }

        public PersonaBuilder edad(int edad){
            persona.setEdad(edad);
            return this;
        }
        public PersonaBuilder nombre(String nombre){
            persona.setNombre(nombre);
            return this;
        }
        public Persona build(){
            return persona;
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
