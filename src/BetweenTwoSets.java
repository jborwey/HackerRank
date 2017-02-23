/**
 * Created by jb039k on 12/12/2016.
 */

import java.util.Scanner;

public class BetweenTwoSets {

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for(int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for(int i = 1; i < input.length; i++){
            result = gcd(result, input[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arrayA = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            arrayA[a_i] = in.nextInt();
        }
        int[] arrayB = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            arrayB[b_i] = in.nextInt();
        }

        int LCM = lcm(arrayA);
        int GCD = gcd(arrayB);
        int count = 0;
        // iterate through LCMs up to GCD and check if evenly divisible
        for(int i = LCM, j = 2; i<=GCD; i=LCM*j,j++){
            if(GCD%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
