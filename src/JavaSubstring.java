/**
 * Created by jb039k on 1/20/2017.
 */

import java.util.Scanner;

public class JavaSubstring {

    public static void printSubstring(String str, int start, int end){
        System.out.println(str.substring(start, end));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        printSubstring(str, start, end);
    }
}
