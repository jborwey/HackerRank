/**
 * Created by jb039k on 7/25/2016.
 */

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();

            }
        }
        int diagonalOne = 0;
        int diagonalTwo = 0;

        for(int j=0; j<n; j++) {
            diagonalOne += a[j][j];
            diagonalTwo += a[j][n-1-j];
        }
        System.out.print(Math.abs(diagonalOne - diagonalTwo));
    }
}