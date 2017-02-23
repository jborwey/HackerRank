/**
 * Created by jb039k on 1/23/2017.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ImplQuicksort {

    public static int[] Quicksort(int pivot, int[] array, int length){
        int min = Integer.MIN_VALUE;
        int[] equal = new int[length];
        Arrays.fill(equal, min);
        int[] left = new int[length];
        Arrays.fill(left, min);
        int[] right = new int[length];
        Arrays.fill(right, min);

        for(int i=0; i<length; i++){
            int value = array[i];
            if(value == pivot){
                equal[i] = value;
            }
            else if(value < pivot){
                left[i] = value;
            }
            else{
                right[i] = value;
            }
        }
        return StitchArray(left, equal, right, length);
    }

    public static int[] StitchArray(int[] left, int[] middle, int[] right, int length){
        int[] stitched = new int[length];
        int min = Integer.MIN_VALUE;

        int a_i = 0;
        while(a_i<length){
            for(int element : left){
                if(element != min){
                    stitched[a_i] = element;
                    a_i++;
                }
            }
            for(int element : middle){
                if(element != min){
                    stitched[a_i] = element;
                    a_i++;
                }
            }
            for(int element : right){
                if(element != min){
                    stitched[a_i] = element;
                    a_i++;
                }
            }
        }
        return stitched;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int sizeArr = sc.nextInt();
        int[] array = new int[sizeArr];
        //load array
        for(int i=0; i<sizeArr; i++){
            array[i] = sc.nextInt();
        }
        int pivot = array[0];
        int[] sorted = Quicksort(pivot, array, sizeArr);
        for(int num : sorted){
            System.out.printf("%d" + " ", num);
        }

    }
}
