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

    /* WORKS, thank God */
    /* There is an implementation of this method that uses booleans and a while/do While loop. I prefer this way */
    public static void bubble(int[] a) {

        int temp;
        /* Mistake == you had the boolean (second clause of if) as i == 0 */
        /* This will make the code only run as long as i is equal tp 0 */
        /* That was a dubm mistake */
        for (int i = a.length - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (a[j] > a[j + 1]) { //if ith element is greater than i+1th element
                    //swap em
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
