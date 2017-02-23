/**
 * Created by jb039k on 1/16/2017.
 */

import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<11; i++){
            int multiple = N*i;
            System.out.printf(N + " x " + i + " = " + "%d", multiple);
            System.out.println();
        }
    }
}