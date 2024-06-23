package org.example.ejercicios.medium;

public class MovingStonesUntilConsecutive {
    public int[] numMovesStones(int a, int b, int c) {
        // we shall sort this so that a < b < c
        int newC = Math.max(Math.max(a,b), c);
        int newA = Math.min(Math.min(a,b),c);
        int newB = (a != newC && a!= newA ? a : (b!=newC && b!= newA ? b : c ));
        // we can get the maximum just by doing some sums
        int ansMax = (newC - newB - 1) + (newB - newA - 1);

        // now for the minimum, we know it is between 0 and 2.
        // if they are all consecutive, then it is 0. otherwise, it is 2.
        // also, if they are not consecutive, then it should be
        // the smallest difference between A to B and B to C
        //int ansMin = (newA+1==newB ? 0 : 1) + (newB+1==newC ? 0 : 1);
        // if the ansmax == 0 then they are consecutive.
        int ansMin = (ansMax == 0 ? 0 : (newA+2 == newB || newB+2 == newC ? 1 : (newA+1==newB ? 0 : 1) + (newB+1==newC ? 0 : 1)));
        return new int[]{ansMin, ansMax};
    }
}