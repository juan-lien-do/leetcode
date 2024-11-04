package org.example.ejercicios.pruebastecnicas.ComputadoraImprimeNumeros;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;


// Este no es la demo, es el otro
public class BuscarPatronImprimeNumeros {
    public class Numeros {
        private int indice;
        private long[] numeros;

        public Numeros(long num1, long num2, long num3) {
            this.indice = 0;
            this.numeros = new long[]{num1, num2, num3};
        }

        public Numeros(long[] numeros){
            this.numeros = numeros;
        }

        public void iterar() {
            numeros[indice] = (numeros[0] + numeros[1] + numeros[2]) % 10000; //ultimos 4 digitos
            indice = (indice + 1) % 3;
        }
        public void iterarConDebug() {
            long nuevoValor = (numeros[0] + numeros[1] + numeros[2]) % 10000;

            System.out.println(Arrays.toString(this.numeros) + nuevoValor);

            numeros[indice] = nuevoValor; //ultimos 4 digitos
            indice = (indice + 1) % 3;
        }

        public long mostrar() {
            return numeros[Math.abs((indice - 1) % 3)];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Numeros objeto = (Numeros) o;
            return Objects.equals(numeros[0], objeto.numeros[0]) &&
                    Objects.equals(numeros[1], objeto.numeros[1]) &&
                    Objects.equals(numeros[2], objeto.numeros[2]);
        }

        @Override
        public int hashCode() {
            return Objects.hash(numeros[0], numeros[1], numeros[2]);
        }

        public Numeros getClone(){
            return new Numeros(Arrays.copyOf(this.numeros, 3));
        }
    }

    public Long imprimirNumero(Long posicion) {
        if (posicion <= 3) return 2022 + posicion;

        Numeros num = new Numeros(2023, 2024, 2025);
        HashMap<Numeros, Boolean> hashMap = new HashMap<>();
        num.iterar();
        hashMap.put(num.getClone(), Boolean.TRUE);
        for (long i = 4; i < posicion; i++) {
            if (i % (posicion / 100L) == 0) System.out.println(i);
            num.iterar();

            Numeros clon = num.getClone();
            if (hashMap.containsKey(clon)){
                if (hashMap.get(clon)){
                    System.out.println("se encontro una repeticion en la posición: " + Objects.toString(i));

                    return num.mostrar();
                }
            } else {
                hashMap.put(clon, Boolean.TRUE);
            }

        }
        return num.mostrar();
    }

    public static void main(String[] args) {
        BuscarPatronImprimeNumeros cin= new BuscarPatronImprimeNumeros();
        System.out.println(cin.imprimirNumero(2023202320232023L));
    }
}
