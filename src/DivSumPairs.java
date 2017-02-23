/**
 * Created by jb039k on 8/18/2016.
 */

import java.util.Scanner;

public class DivSumPairs {

    public static int countPairs(int[] intArray, int divisor){
        int count = 0;
        int length = intArray.length;

        for(int i=0; i<=length; i++) {
            for (int j = 0; j < length; j++) {
                if (i < j) {
                    if ((intArray[i] + intArray[j]) % divisor == 0) {
                        count++;
                    }
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count = countPairs(a, k);
        System.out.println(count);
    }
}