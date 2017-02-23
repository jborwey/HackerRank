/**
 * Created by jb039k on 9/20/2016.
 */

import java.util.Scanner;

public class ArrayHourGlasses {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];

        // fill the array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // calculate the hour glasses
        int largest = 0;

        for(int k=0; k<4; k++){
            for(int c=0; c<4; c++){
                int sum = (array[k][c]+array[k][c+1]+array[k][c+2]+array[k+1][c+1]+array[k+2][c]+array[k+2][c+1]+array[k+2][c+2]);
                if(sum>largest || (k==0 && c==0)){
                    largest = sum;
                }
            }
        }

        System.out.println(largest);
    }
}
