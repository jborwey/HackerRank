import java.util.Scanner;

/**
 * Created by jb039k on 1/26/2017.
 */
public class QuickSortInPlace {

    public static void quickSort(int[] inputArray, int low, int high){
        if(low < high){
            int p = partition(inputArray, low, high);
            print(inputArray);
            quickSort(inputArray, low, p-1);
            quickSort(inputArray, p+1, high);
        }
    }

    public static int partition(int[] inputArray, int low, int high){
        int pivot = inputArray[high]; //we want to check the values against the pivot to see if they need to be swapped
        int i = low; // left is our leftmost element that will be our opposite pivot in the sub-array with smallers values
        for(int j = low; j<high; j++){
            if(inputArray[j] <= pivot){
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i = i + 1;
            }
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[high];
        inputArray[high] = temp;
        return i;
    }

    public static void print(int[] inputArray){
        for(int i : inputArray){
            System.out.printf("%d" + " ", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenArray = sc.nextInt();
        int[] inputArray = new int[lenArray];

        for(int i=0; i<lenArray; i++){
            inputArray[i] = sc.nextInt();
        }
        quickSort(inputArray, 0, lenArray-1);

    }
}
