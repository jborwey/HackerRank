/**
 * Created by jb039k on 12/15/2016.
 */

import java.util.Scanner;

public class ViralAdvertising {

    public static int peopleAdvertised(int nPeople){
        return nPeople/2;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numDays = sc.nextInt();
        int totalLiked = 0;
        int numLiked = 0;
        int totalAdvertised;

        for(int i=0; i<numDays; i++){

            if(i==0){
                totalAdvertised = 5;
                numLiked = peopleAdvertised(totalAdvertised);
                totalLiked = numLiked;
            }
            else{
                totalAdvertised = numLiked*3;
                numLiked = peopleAdvertised(totalAdvertised);
                totalLiked = totalLiked + numLiked;
            }
        }
        System.out.println(totalLiked);
    }
}
