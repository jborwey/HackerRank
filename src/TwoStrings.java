/**
 * Created by jb039k on 11/22/2016.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

    public static boolean findSubStr(String a, String b){
        Set<Character> str1 = new HashSet<>();
        char[] str2 = b.toCharArray();
        boolean containsSubStr = false;

        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            str1.add(ch);
        }

        for(Character ch : str2){
            if(str1.contains(ch)){
                containsSubStr = true;
                break;
            }
        }

        return containsSubStr;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for(int i=0; i<cases; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            boolean hasSubStr = findSubStr(str1, str2);
            printResult(hasSubStr);
        }
    }

    public static void printResult(boolean hasSubStr){
        if(hasSubStr){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
