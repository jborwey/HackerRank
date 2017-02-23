/**
 * Created by jb039k on 9/6/2016.
 */

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int valueToSearch = sc.nextInt();
        int nSize = sc.nextInt();
        int[] ar = new int[nSize];
        int offSet = 0;
        int length = ar.length;

        //load the array
        for(int i=0; i<nSize; i++){
            ar[i] = sc.nextInt();
        }

        //find value
        int indexOfValue = binSearch(ar, valueToSearch, offSet, length);
        System.out.println(indexOfValue);
    }
    public static int binSearch(int[] valArray, int valueToSearch, int offSet, int length){
        //value cant be empty array
        if(length <= 0 || offSet >= valArray.length){
            return -1;
        }

        int middleIndex = (length/2)+offSet;
        int middleValue = valArray[middleIndex];

        //check if value is value were looking for
        if (middleValue == valueToSearch){
            return middleIndex;
        }

        //if value is greater than value were looking for our value has to be to the left in the array
        if (middleValue > valueToSearch){
            int leftLength = middleIndex-offSet;
            return binSearch(valArray, valueToSearch, offSet, leftLength);
        }

        //if middle value is less than our value search the right half
        int rightOffSet = middleIndex+1;
        int rightLength = length+offSet-rightOffSet;
        return binSearch(valArray, valueToSearch, rightOffSet, rightLength);

    }
}