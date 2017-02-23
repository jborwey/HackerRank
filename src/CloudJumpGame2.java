/**
 * Created by jb039k on 9/1/2016.
 */

import java.util.Scanner;

public class CloudJumpGame2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int e = 100;

        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int jump = 0;
        while (jump < n) {
            jump += k;

            if(jump == n && c[0] == 1){
                e += -3;
                break;
            }

            else if(jump == n && c[0] == 0){
                e --;
                break;
            }

            else if (c[jump] == 1) {
                e += -3;
            }
            else {
                e--;
            }


        }
        System.out.println(e);
    }
}