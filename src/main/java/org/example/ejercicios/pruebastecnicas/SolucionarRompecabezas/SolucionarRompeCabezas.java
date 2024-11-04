package org.example.ejercicios.pruebastecnicas.SolucionarRompecabezas;
/*
* ¿Cuál sería el resultado de ejecutar el siguiente pseudocódigo? teniendo en cuenta que el dispositivo
*  dispone de los recursos necesarios para finalizar su ejecución. Los puntos a
* continuación son para indentación.

función solucionarRompecabezas(N) {
.var_A = 1
.var_B = 1
.var_C = 1
.var_D = 1

.para i en el rango de 1 a N {
..resultado = 3 * var_D + var_C + 4 * var_B + var_A
..var_A = var_B
..var_B = var_C
..var_C = var_D
..var_D = resultado
.}

.devolver var_D % 10000000000 // últimos 10 dígitos de var_D
}

mostrar solucionarRompecabezas(10)
mostrar solucionarRompecabezas(100)
mostrar solucionarRompecabezas(pot(2023, 100)) // 2023 elevado a la 100

Salida
902441
8042318513
??
*/


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

// TODO este codigo no funciona todavia, seguro tenga que implementar hashmap o algo asi
public class SolucionarRompeCabezas {
    class Estado {
        Long var_A;
        Long var_B;
        Long var_C;
        Long var_D;

        public Estado(Long var_A, Long var_B, Long var_C, Long var_D) {
            this.var_A = var_A;
            this.var_B = var_B;
            this.var_C = var_C;
            this.var_D = var_D;
        }

        // Sobrescribir equals para comparar correctamente
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Estado estado = (Estado) o;
            return Objects.equals(var_A, estado.var_A) &&
                    Objects.equals(var_B, estado.var_B) &&
                    Objects.equals(var_C, estado.var_C) &&
                    Objects.equals(var_D, estado.var_D);
        }

        // Sobrescribir hashCode para asegurar que el HashMap funcione correctamente
        @Override
        public int hashCode() {
            return Objects.hash(var_A, var_B, var_C, var_D);
        }
    }

    public static Long solucionarRompecabezasOptimizada(Long n){
        long var_A = 1L, var_B = 1L, var_C = 1L, var_D = 1L;

        // definimos la variable afuera para que no consuma recursos extra
        // inicializando la variable n veces
        long resultado = 0L;
        for (long i = 1; i < n + 1; i++) {
            // hacemos el módulo para evitar el overflow
            resultado = (3 * var_D + var_C + 4 * var_B + var_A) % 10000000000L;
            var_A = var_B;
            var_B = var_C;
            var_C = var_D;
            var_D = resultado;



        }

        return var_D % 10000000000L;
    }

    public static Long solucionarRompecabezas(Long n){
        long var_A = 1L, var_B = 1L, var_C = 1L, var_D = 1L;

        for (long i = 1; i < n + 1; i++) {
            long resultado = 3 * var_D + var_C + 4 * var_B + var_A;
            var_A = var_B;
            var_B = var_C;
            var_C = var_D;
            var_D = resultado;
        }

        return var_D % 10000000000L;
    }


    public static void main(String[] args){
        //System.out.println(Long.MAX_VALUE);
        LocalDateTime t1 = LocalDateTime.now();
            System.out.println(solucionarRompecabezasOptimizada(100000000000L));
        LocalDateTime t2 = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between(t1, t2));

        //System.out.println(solucionarRompecabezas(100L));
    }
}
