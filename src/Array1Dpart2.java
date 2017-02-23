/**
 * Created by jb039k on 1/3/2017.
 */

import java.util.Scanner;

public class Array1Dpart2 {

    public static boolean canWin(int position, int maxJump, int[] array){
        /**
         * The goal is to get from the beginning of the array to the end
         * position can only be advanced either forward/backward by 1 OR forward by the maxJump
         * a new position is valid only if the element in the array of the position is equal to 0
         * check if you can move forward by 1, if not check if you can use the max jump, if not move back 1 and check the max jump
         */
        if(position<0 || array[position] == 1){
            return false;
        }
        if((position == array.length-1) || position+maxJump > array.length-1){
            return true;
        }
        array[position] = 1;

        return canWin(position+1, maxJump, array) || canWin(position-1, maxJump, array) || canWin(position+maxJump, maxJump, array);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0; i<testCases; i++){
            int arrayLength = sc.nextInt();
            int maxJump = sc.nextInt();
            int[] array = new int[arrayLength];

            for(int a_j=0; a_j<arrayLength; a_j++){
                array[a_j] = sc.nextInt();
            }

            boolean canWin = canWin(0, maxJump, array);
            if(canWin){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
