/**
 * Created by jb039k on 7/18/2016.
 */

import java.util.Scanner;

public class CompareTrips {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};
        int aTotal = 0;
        int bTotal = 0;

        for(int i=0; i<3; i++) {
            if(a[i] > b[i]) {
                aTotal += 1;
            }
            else if(a[i] < b[i]) {
                bTotal += 1;
            }
            else {

            }
        }

        System.out.println(aTotal + " " + bTotal);
    }
}
