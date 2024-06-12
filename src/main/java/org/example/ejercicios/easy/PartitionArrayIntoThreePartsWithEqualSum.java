package org.example.ejercicios.easy;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        // conseguir promedio
        int sumatoria = 0;
        for (int x : arr) {
            sumatoria += x;
        }
        if (sumatoria % 3 != 0) return false;

        sumatoria /= 3;
        // recorrer lista armando subgrupos
        int accum = 0;
        int gruposFormados = 0;

        for (int x = 0; x < arr.length; x++) {
            accum += arr[x];
            if (accum == sumatoria) {
                accum = 0;
                gruposFormados++;
            }

        }
        return gruposFormados >= 3;
        // devolver resultado
    }
}
