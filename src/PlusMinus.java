/**
 * Created by jb039k on 7/29/2016.
 */

import java.util.Scanner;

class ProcessFraction {
    public void getFraction(int x, int y) {
        double num = (double)x;
        double den = (double)y;

        System.out.println(num/den);
    }
}

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ProcessFraction processFraction = new ProcessFraction();
        int arr[] = new int[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0) {
                positive += 1;
            }
            else if(arr[arr_i] < 0) {
                negative += 1;
            }
            else {
                zero += 1;
            }
        }
        processFraction.getFraction(positive, arr.length);
        processFraction.getFraction(negative, arr.length);
        processFraction.getFraction(zero, arr.length);


}
}
