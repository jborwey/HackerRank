import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jb039k on 2/24/2017.
 */
public class Pairs {

    public static int findPairs(int[] array, int length, int difference){
        Arrays.sort(array);
        int numPairs = 0;
        int i = 0;

        for(int j=i+1; j<length; j++){
            int findDifference = array[j]-array[i];
            if(findDifference == difference){
                numPairs++;
            }
            else if(findDifference > difference){
                i++;
                j--;
            }
        }
        return numPairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int difference = sc.nextInt();
        int[] array = new int[length];

        for(int i=0; i<length; i++){
            array[i] = sc.nextInt();
        }
        int pairs = findPairs(array, length, difference);
        System.out.println(pairs);
    }
}
