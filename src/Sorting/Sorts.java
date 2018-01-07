package Sorting;

import java.util.Arrays;


public class Sorts {


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

    /* Method is not correct yet, results in same loop */
    /* compile this code on paper to find exact problem */
    public static void bubble(int[] a) {

        for (int i = a.length - 2; i == 0; i--) {

            for (int j = 0; j <= i; j++) {

                int temp;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }

        }

    }


    public static void main(String[] args) {

        int[] a = {12, 1, 8, 7, 6};
        //selection(a);
        bubble(a);
        System.out.println(Arrays.toString(a));

    }
}
