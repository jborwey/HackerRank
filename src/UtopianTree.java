/**
 * Created by jb039k on 10/26/2016.
 */

import java.util.Scanner;

public class UtopianTree {

    public static boolean isSpring(int cycle){
        boolean isSpring = false;

        if(cycle%2 != 0){
            isSpring = true;
        }

        return isSpring;
    }

    public static void utopianTreeHeight(int totalGrowthCycles){
        int height = 1;

        for(int cycle=1; cycle <= totalGrowthCycles; cycle++){
            if(isSpring(cycle)){
                height = (height*2);
            }
            else{
                height = height + 1;
            }
        }

        System.out.println(height);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            utopianTreeHeight(n);
        }
    }
}

