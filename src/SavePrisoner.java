/**
 * Created by jb039k on 8/29/2016.
 */

import java.util.Scanner;

public class SavePrisoner {

    public static int lastPrisoner(Scanner sc){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();

        int prisonerID = S;

        for(int i=M; i>1; i--){
            if(M>1 && S==N){
                S = 1;
            }
            prisonerID++;
        }

        return prisonerID;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int prisonerID = lastPrisoner(sc);
            System.out.println(prisonerID);
        }

    }

}
