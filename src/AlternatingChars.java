/**
 * Created by jb039k on 11/9/2016.
 */

import java.util.Scanner;

public class AlternatingChars {

    public static void findDeletions(String testStr, int strLength){
        int deletions = 0;
        char[] charArr = testStr.toCharArray();

        for(int i=1; i<strLength; i++){
            if(charArr[i] == charArr[i-1]){
                deletions++;
            }
        }
        System.out.println(deletions);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int test=0; test<testCases; test++){
            String testStr = sc.next();
            int strLength = testStr.length();
            findDeletions(testStr, strLength);
        }
    }
}
