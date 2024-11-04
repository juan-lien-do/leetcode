package org.example.ejercicios.pruebastecnicas.ComputadoraImprimeNumeros;

import java.util.Arrays;
import java.util.Objects;

//este es la demo
public class ComputadoraImprimeNumeros {
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

        // i es el indice del bucle for
        public void iterarConDebug(long i) {
            long nuevoValor = (numeros[0] + numeros[1] + numeros[2]) % 10000;

            System.out.println(Arrays.toString(this.numeros) + Objects.toString(nuevoValor) + "," + Objects.toString(i));

            numeros[indice] = nuevoValor; //ultimos 4 digitos
            indice = (indice + 1) % 3;
        }

        public long mostrar() {
            switch (this.indice){
                case 0:
                    return numeros[2];
                case 1:
                    return numeros[0];
                default:
                    return numeros[1];
            }
            //return numeros[Math.abs((indice + 1) % 3)];
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

        // este clon es para el hashmap
        public Numeros getClone(){
            return new Numeros(Arrays.copyOf(this.numeros, 3));
        }
    }

    public Long conseguirNumero(Long posicion) {
        posicion %= 124000;
        if (posicion <= 3) return 2022 + posicion;

        Numeros num = new Numeros(2023, 2024, 2025);
        num.iterar();
        for (long i = 4; i < posicion; i++) {
            //if (i % (posicion / 100L) == 0) System.out.println(i);
            num.iterar();

        }
        return num.mostrar();
    }

    public static void main(String[] args) {
        ComputadoraImprimeNumeros cin= new ComputadoraImprimeNumeros();
        System.out.println(cin.conseguirNumero(2023202320232023L));
    }
}
