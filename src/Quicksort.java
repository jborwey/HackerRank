/**
 * Created by jb039k on 9/13/2016.
 */

import java.util.Scanner;

public class Quicksort {

    private int array[];
    private int length;

    public void sort(int[] inputAr){

        if (inputAr == null || inputAr.length == 0){
            return;
        }
        this.array = inputAr;
        length = inputAr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int upperIndex){

        int i = lowerIndex;
        int j = upperIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(upperIndex-lowerIndex)/2];
        // Divide into two arrays
        while(i <= j){
            /**
             * In each iteration, we will identify a number from the left side which
             * is greater than the pivot value, and we will also identify a number
             * from the right side which is less than the pivot value. Once the search
             * is complete, then both numbers are exchanged
             */
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
                printArray(array);
            }
        }
        // call quickSort() method recursively
        if(lowerIndex < j) {
            quickSort(lowerIndex, j);

        }
        if(i < upperIndex){
            quickSort(i, upperIndex);
        }

    }

    private void exchangeNumbers(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] inputAr = new int[length];
        Quicksort sorter = new Quicksort();

        for(int i=0; i<length; i++){
            inputAr[i]=sc.nextInt();
        }
        sorter.sort(inputAr);

    }
    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
