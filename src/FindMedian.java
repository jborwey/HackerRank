/**
 * Created by jb039k on 12/12/2016.
 */

import java.util.Scanner;

public class FindMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lenArr = sc.nextInt();
        int[] vals = new int[lenArr];

        for(int i=0; i<lenArr; i++){
            vals[i] = sc.nextInt();
        }
    }
}
