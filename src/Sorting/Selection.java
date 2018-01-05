package Sorting;

import java.util.Arrays;


public class Selection {

    /* This function ended up not being used */
    public static int minimum(int[] a) {
        //int min;

        if (a == null) return -1; //handles null arguments
        if (a.length < 1) return -1; //handles empty lists
        if (a.length == 1) return a[0]; //handles one-element arrays

        //all other situations
        int min = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < min) min = a[i];
        }

        return min;
    }

    public static void selection(int[] a) {

        //we're gonna want to do this for each element in the array
        for (int i = 0; i < a.length; i++) {

            //find the minimum value and it's index
            int min = a[i];
            int index = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }

            //swap the minimum with leftmost unsorted element
            int temp = a[i];
            a[i] = min;
            a[index] = temp;

        }

    }


    public static void main(String[] args) {

        int[] a = {100, 1, 8, 7, 6};
        selection(a);
        //System.out.println(minimum(a)); //test for minimum function
        System.out.println(Arrays.toString(a));

    }
}
