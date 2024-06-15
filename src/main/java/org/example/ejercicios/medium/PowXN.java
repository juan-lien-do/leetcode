package org.example.ejercicios.medium;

public class PowXN {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(n<0) nn=nn*-1;

        while (nn>0){
            if(nn%2==1){
                ans =ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;

    }
}
        /*
        // for values of n equal to 0, return 1.
        // for n>0 implement for loop with multiplication
        // for n < 0 implement for loop with division
        if (n == 0) return 1;
        double acum;
        if (n > 0) {
            acum = x;
            int i = 1;
            while (i < n) {
                // hay que hacerle un tweak para que avance de forma cuadratica
                if (2 * i < n){
                    acum *= acum;
                    i *= 2;
                }
                else {
                    i++;
                    acum *= x;
                }
                //acum *= (double) x;
            }
        } else {
            acum = 1/x;
            int i = -1;
            while (i > n) {
                // hay que hacerle un tweak para que avance de forma cuadratica
                if (2 * i > n){
                    acum *= acum;
                    i *= 2;
                }
                else {
                    i--;
                    acum /= x;
                }
                //acum *= (double) x;
            }
        }
        return acum;


    }
*/