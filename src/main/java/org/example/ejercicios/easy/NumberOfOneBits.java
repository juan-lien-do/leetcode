package org.example.ejercicios.easy;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        long newN = (long) n;
        // we should first get a big power of 2
        if (newN == 0) return 0;
        long potencia = 2;
        int exponente = 1;
        while (potencia < newN){
            potencia*= 2;
            exponente += 1;
        }
        if (exponente == 1) return 1;
        // ahora q tenemos la potencia hay q restarle valores
        long restar = 0;
        int ans = 0;
        while (exponente >= 0){
            restar = (long) Math.pow(2, exponente);
            if ( newN - restar >= 0){
                newN -= restar;
                ans++;
            }
            exponente--;
        }
        return ans;
    }
}
