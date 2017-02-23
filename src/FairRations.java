/**
 * Created by jb039k on 10/24/2016.
 */

import java.util.Scanner;

public class FairRations {

    public static boolean calcLoaves(int numLoaves){
        boolean evenLoaves = false;

        if(numLoaves%2==0){
            evenLoaves = true;
        }
        return evenLoaves;
    }

    public static void distributeLoaves(int[] plebs){
        int lineLength = plebs.length;
        int distributedLoaves = 0;

        for(int i=0; i<lineLength; i++){
            if(!calcLoaves(plebs[i])){
                plebs[i]++;
                plebs[i+1]++;
                distributedLoaves += 2;
            }
        }
        System.out.println(distributedLoaves);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int lineCount = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            lineCount+= B[B_i];
        }

        /**
         * If the sum of loaves in the current line is even the line can be all even
         * else the line can only be odd
         */
        if(!calcLoaves(lineCount)){
            System.out.println("NO");
        }
        else{
            distributeLoaves(B);
        }


    }
}

