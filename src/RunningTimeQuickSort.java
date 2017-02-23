import java.util.Scanner;
/**
 * Created by jb039k on 1/30/2017.
 */
public class RunningTimeQuickSort {

    public static void quickSort(int[] inputArray, int low, int high, MutableCounter quickSortCounter){
        if(low < high){
            int p = partition(inputArray, low, high, quickSortCounter);
            quickSort(inputArray, low, p-1, quickSortCounter);
            quickSort(inputArray, p+1, high, quickSortCounter);
        }
    }

    public static int partition(int[] inputArray, int low, int high, MutableCounter quickSortCounter){
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
        quickSortCounter.setCount(quickSortCounter.getCount()+1);
        return i;
    }

    public static void insertionSort(int[] inputArray, int length, MutableCounter insertionSortCounter){
        if(length > 1){
            insertionSort(inputArray, length-1, insertionSortCounter);
            int i = inputArray[length];
            int j = length-1;
            while(j>=0 && inputArray[j] > i){
                inputArray[j+1] = inputArray[j];
                j = j-1;

                insertionSortCounter.setCount(insertionSortCounter.getCount()+1);
            }
            inputArray[j+1] = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] inputArray = new int[length];
        int[] inputArray2 = inputArray.clone();


        for(int i=0; i<length; i++){
            inputArray[i] = sc.nextInt();
        }
        MutableCounter insertionSortCounter = new MutableCounter(0);
        insertionSort(inputArray, length-1, insertionSortCounter);

        MutableCounter quickSortCounter = new MutableCounter(0);
        quickSort(inputArray2, 0, length-1, quickSortCounter);

        System.out.println(insertionSortCounter.getCount());
        System.out.println(quickSortCounter.getCount());

    }
}
class MutableCounter {

    private int count;

    public MutableCounter(int aCount){
        count = aCount;
    }
    public void setCount(int aCount){
        count = aCount;
    }
    public int getCount(){
        return count;
    }
}