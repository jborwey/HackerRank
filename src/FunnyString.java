/**
 * Created by jb039k on 11/14/2016.
 */

import java.util.HashMap;
import java.util.Scanner;

public class FunnyString {

    public static void isItFunny(HashMap<Character, Integer> alphabet, String testStr){
        boolean isItFunny = true;
        int strLength = testStr.length();
        StringBuilder reverse = new StringBuilder(strLength);

        for(int ch=strLength-1; ch>=0; ch--){
            reverse.append(testStr.charAt(ch));
        }

        String reverseStr = reverse.toString();

        for(int i=1; i<strLength; i++){
            int origStr = Math.abs((alphabet.get(testStr.charAt(i)))-(alphabet.get(testStr.charAt(i-1))));
            int revStr = Math.abs((alphabet.get(reverseStr.charAt(i)))-(alphabet.get(reverseStr.charAt(i-1))));
            if(origStr != revStr){
                isItFunny = false;
                break;
            }
        }
        if(isItFunny){
            System.out.println("Funny");
        }
        else{
            System.out.println("Not Funny");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        int alphaPos = 1;
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for(char ch = 'a'; ch <= 'z'; ++ch){
            alphabet.put(ch, alphaPos);
            alphaPos++;
        }

        for(int i=0; i<tests; i++){
            String test = sc.next();
            isItFunny(alphabet, test);
        }
    }
}
