package org.example.ejercicios.medium;

import java.util.Arrays;

public class ReverseInteger {
    public int reverse(int x) {
        // la mision es dar vuelta un entero. si cuando lo queremos dar vuelta se excede de 2^31-1 o -2^32
        // entonces retornamos cero. supongo que se puede hacer fácil con el ListNode o un hashMap.
        // primero lo volvería un número positivo y anotaría si era antes negativo.
        // pero tengo que tener cuidado si es el negativo mas alto de todos. directamente lo resuelvo como caso aparte.
        // tambien hay que resolver a priori el caso de que sea cero.
        boolean flagIsNegative = x < 0;
        if (x == 0) return 0;
        if (x == Integer.MIN_VALUE) return 0;


        try {
            x = Math.abs(x);

            // iniciamos un acumulador para ir eliminando digitos con el operador modulo
            // y un array para guardar los numeros
            int[] arrayNums = new int[10];
            int digitsProcessed = -1;
            int currDigit;
            while (true) {
                digitsProcessed++;
                if (x < (int) Math.pow(10, digitsProcessed)) break;

                currDigit = ((x % (int) Math.pow(10, digitsProcessed + 1)) / (int) Math.pow(10, digitsProcessed));

                arrayNums[digitsProcessed] = currDigit;

                x -= currDigit * (int) Math.pow(10, digitsProcessed);


                // fotografia de las variables

                /*
                System.out.println("\nXDDDDDDDDDDD\n");
                System.out.println(digitsProcessed);
                System.out.println(currDigit);
                System.out.println(Arrays.toString(arrayNums));
                System.out.println(x);*/

            }

            digitsProcessed--;

            // ya con los numeros guardados en el array, vamos a ir armando el numerito de vuelta
            long y = 0;
            long nuevoNumeroDeDigito = 0;
            do {

                y += (long) arrayNums[digitsProcessed] * (long) Math.pow(10, nuevoNumeroDeDigito);
                nuevoNumeroDeDigito++;
                digitsProcessed--;
                //System.out.println(y);
                //System.out.println(Math.pow(10, nuevoNumeroDeDigito));
            } while (digitsProcessed >= 0);


            // devolvemos el numero positivo o negativo segun se requiera.
            //System.out.println(y);
            //System.out.println(Arrays.toString(arrayNums));
            if (y > (long) Integer.MAX_VALUE) throw new Exception();
            return (int) (flagIsNegative ? -y : y);

        } catch (Exception e) {
            //System.out.println("Algo falló" + e.getMessage() );
            return 0;
        }

    }
}
