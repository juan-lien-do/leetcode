package org.example.ejercicios.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int currentArea = 0;
        while (left < right) {
            currentArea = ((height[left] < height[right]) ? height[left] : height[right]) * (right - left);
            maxArea = maxArea > currentArea ? maxArea : currentArea;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
    /* //slow version
    public int maxArea(int[] height) {
        // this can be solved with nested for loops.
        // could be improved by getting the highest stick first and then make assumptions
        // to stop the loops.
        int capacity = 0;
        int currentCapacity = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = 0; j < height.length; j++){
                if (j == i) continue;
                currentCapacity = Math.abs(i - j) * Math.min(height[i], height[j]) ;
                if(capacity < currentCapacity) capacity = currentCapacity;

            }

        }
        return capacity;
    }
}
*/