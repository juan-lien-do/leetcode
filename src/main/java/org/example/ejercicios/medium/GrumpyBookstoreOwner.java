package org.example.ejercicios.medium;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        if (minutes>=customers.length){
            int ans = 0;
            for (int i = 0; i < customers.length; i++){
                //if (grumpy[i] == 0){
                    ans += customers[i];
                //}
            }
            return ans;
        }
        // I must iterate the first 'minutes' items. 1 for loop shall be enough.
        // I only must find the subsequence that adds the most value. That can be done in a second loop.
        int currentAddedValue = 0;
        int maxAddedValue = 0;
        int originalValue = 0;
        // first Iteration
        for (int i = 0; i< customers.length; i++){
            if (i < minutes){
                if (grumpy[i] != 0){
                    currentAddedValue += customers[i];
                } else {
                    originalValue += customers[i];
                }
            } else{
                if (grumpy[i] == 0){
                    originalValue += customers[i];
                } else {
                    currentAddedValue += customers[i];
                }
                if (grumpy[i-minutes] != 0){
                    currentAddedValue-= customers[i-minutes];
                }
            }

            maxAddedValue = maxAddedValue > currentAddedValue ? maxAddedValue : currentAddedValue;

        }
        return maxAddedValue + originalValue;

    }
}