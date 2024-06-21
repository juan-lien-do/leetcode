package org.example.ejercicios.hard;

public class MedianOfTwoSortedArrays {
    // TODO get this thing working
    /*public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // now imma make both pointers begin from the top.
        int l1 = nums1.length;
        int l2 = nums2.length;
        int remaining = (nums1.length + nums2.length) / 2;
        // the main goal here is make remaining == 0 and get the pointer.
        while (true){

        }
    }*/

}
    /*
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // How can I tackle this problem:
        // if the length of both arrays combined is an odd number,
        // the median is a number that is smaller than (length1 + length2 - 1 ) / 2 numbers.
        // but I can't go asking each number present in the arrays.
        // Neither can I merge the two arrays.
        // This algorithm must be (O)Log(n) so it's gonna be a challenge.
        // I should try advance by slices of varying length.
        int l1 = nums1.length;
        int l2 = nums2.length;
        boolean isEven = (l1 + l2) % 2 == 0;
        // I could generate two pointers, each one pointing to the center of each array.
        // By comparing each number I can realize which array has a bigger median.
        // The final median is a number in between those two.
        int i1 = nums1[nums1.length / 2];
        int i2 = nums2[nums2.length / 2];
        // nums 2 median is bigger
        boolean nums2IsBigger = nums1[i1] < nums2[i2];
        while (true) {
            if (nums1[i1] < nums2[i2] == nums2IsBigger) {
                if (nums2IsBigger) {
                    i1++;
                    i2--;
                } else {
                    i1--;
                    i2++;

                }
                // what if the index is out of bounds?
                // then the problem would be solved with ease,
                // looking for the answer in the other array.
                if (i1 >= l1) {

                }

            } else {

                break;
            }
        }

    }
}
*/