/**
 * Created by jb039k on 11/22/2016.
 */

import java.util.Scanner;

public class LoveLetterShenanigans {

    public static void makePalindrome(String str){
        char[] changeArr = str.toCharArray();
        int numChanges = 0;

        int L1 = 0;
        int L2 = changeArr.length-1;

        while(L2 > L1){
            if(changeArr[L2] > changeArr[L1]){
                changeArr[L2]--;
                numChanges++;
            }
            else if(changeArr[L1] > changeArr[L2]){
                changeArr[L1]--;
                numChanges++;
            }
            else{
                ++L1;
                --L2;
            }
        }
        System.out.println(numChanges);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0; i<testCases; i++){
            String str = sc.next();
            makePalindrome(str);
        }
    }
}
