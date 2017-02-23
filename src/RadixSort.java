
/**
 * Created by jb039k on 9/19/2016.
 */

import java.util.Scanner;

public class RadixSort {

    private void radixSort(int[] ar){

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

    }
    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
