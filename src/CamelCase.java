/**
 * Created by jb039k on 11/2/2016.
 */

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inWord = sc.next();
        String[] regex = inWord.split("(?=\\p{Upper})");
        System.out.println(regex.length);
    }
}

