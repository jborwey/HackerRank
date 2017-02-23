/**
 * Created by jb039k on 9/6/2016.
 */

import java.util.Scanner;

public class InsertionSort {

    public static void insertIntoSorted(int[] ar, int length) {
        //holds shifting value
        int temp;

        //sort through old array and place into new array
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j - 1]) {
                    temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }
            }
            printArray(ar);
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];

        //fill the array
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        int length = ar.length;
        // the last item in the array is the only unsorted int
        insertIntoSorted(ar, length);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }


}
