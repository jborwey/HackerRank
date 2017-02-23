/**
 * Created by jb039k on 12/13/2016.
 */

import java.util.Scanner;

public class AppendAndDelete {

    public static void compareStrings(String s, String t, int numChanges){
        int lenS = s.length();
        int lenT = t.length();

        int deletions = 0;
        int additions = 0;
        for(int i=0; i<lenT; i++){
            //base case
            if(i == lenS){
                additions = (lenT-i);
                break;
            }

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(ch1 != ch2){
                deletions = (lenS-i);
                additions = (lenT-i);
                break;
            }
        }

        if((deletions+additions) <= numChanges){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        compareStrings(s, t, k);
    }
}
