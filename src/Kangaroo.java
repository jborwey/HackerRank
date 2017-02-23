/**
 * Created by jb039k on 8/9/2016.
 */

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(v1 > v2 && x1 < x2){
            int changeV = (v1-v2);
            int position = (x2-x1);
            if(position%changeV == 0){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }

        else if(v1 < v2 && x1 > x2){
            int changeV = (v2-v1);
            int position = (x1-x2);
            if(position%changeV == 0){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else {
            System.out.print("NO");
        }
    }

}
