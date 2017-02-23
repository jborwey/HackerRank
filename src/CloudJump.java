/**
 * Created by jb039k on 8/25/2016.
 */

import java.util.Scanner;

public class CloudJump {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int playerPlace = 0;
        for(int i=0; i < c.length; i++) {
            if(i+2 == c.length-1 || i+1 == c.length-1) {
                playerPlace++;
                break;
            }
            else if(c[i+2] == 0) {
                playerPlace++;
                i++;
                continue;
            }
            else if(c[i+1] == 0){
                playerPlace++;
                continue;
            }
            else{
                continue;
            }
        }
        System.out.println(playerPlace);
    }
}
