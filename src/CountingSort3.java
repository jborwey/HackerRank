import java.util.Scanner;

/**
 * Created by JTB on 10/3/2016.
 */


public class CountingSort3 {

    /**
     *
     * @param array
     * @param k
     * @return
     */
    public static int[] countOccurrences(int[] array, int k){
        int[] counts = new int[k];

        for(int num : array){
            counts[num]+=1;
        }

        int[] countSorted = new int[k];

        for(int i=1; i< countSorted.length; i++){
            countSorted[i] = counts[i] += counts[i-1];
        }

        return counts;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            String input = sc.nextLine().split("\\s+")[0];
            if(input != null && !input.isEmpty()){
                array[i] = Integer.parseInt(input);
            }
            else{
                i--;
            }

        }

        int[] counts = countOccurrences(array, 99); // pass in max value
        printArray(counts);

    }
    public static void printArray(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
    }
}