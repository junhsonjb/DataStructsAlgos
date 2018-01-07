package Sorting;

import java.util.Arrays;


public class Sorts {

    /* Eplanation:
    A selection sort looks at the entire array, picks the minimum and swaps it with the 0th
    element. Then it picks the next minimum (the least value after the previous minimum)
    and swaps it with the 1st element, since everything before it is sorted. It repeats this
    process up to the ith element where i is equal to number of elements in the array.
    Run Time: O(N^2)
     */
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

    /* Explanation:
    The bubble sort compares the 0th and 1st elements and if the 0th is greater than
     the 1st swaps them to get an increasing order. Then it does this with 1st and 2nd,
     and so on until it compares the ith and i+1th values, where i is equal to the
     length of the arrays minus 1 (to account for zero indexing). We do this process the
     amount of times equalvalent to the amount of elements in the array, but with each
     iteration, we reduce i by one. This way we are not repeating the process on elemeents
     that are already sorted (elements are sorted starting from the end going to the front).
     Run Time: O(N^2)
     */
    public static void bubble(int[] a) {

        int temp;
        /* Mistake == you had the boolean (second clause of if) as i == 0 */
        /* This will make the code only run as long as i is equal tp 0 */
        /* That was a dumb mistake */
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

        int[] a = {12, 1, 8, 7, 6, -1};
        //selection(a);
        bubble(a);
        System.out.println(Arrays.toString(a));

    }
}
