package org.example.ejercicios.hard;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}

    /*
    public int candy(int[] ratings) {
        // I'm given an array with a rating per child.
        // I guess that candy will end up looking like some kind of connected stairs,
        // because the variation from one element to another will be -1, 0 or +1
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        int lastValue = 1;
        for (int i = 0; i < candy.length; i++) {
            // a specific function for zero? and another one for length-1
            if (i == 0) {
                if (ratings[0] > ratings[1]) {
                    candy[0] = 2;

                }
                lastValue = candy[0];
                continue;
            }
            if (i == candy.length - 1) {
                System.out.println("llegue al fin");
                if (ratings[i] > ratings[i - 1]) {
                    candy[i] = ++lastValue;
                }
                break;
            }
            // a function that increases current value?
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = ++lastValue;
            } else if (ratings[i] > ratings[i + 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (candy[j] >= candy[j + 1] + 1) {
                        break;
                    }
                    candy[j]++;
                }
                candy[i] = 2;
                lastValue = 2;
            } else {
                lastValue = 1;
            }
            // a function that increases al previous values in 1???? so it matches the values
        }

        System.out.println(Arrays.toString(candy));
        int ans = 0;
        for (int i = 0; i < candy.length; i++) {
            ans += candy[i];
        }
        return ans;

    }
*/