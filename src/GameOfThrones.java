/**
 * Created by jb039k on 11/28/2016.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones {

    public static boolean canPalindrome(Map<Character, Integer> keyMap, int keyLength){
        boolean canPalindrome = false;
        boolean isOdd = true;
        int reqChars = 0;

        if(keyLength%2==0) {
            isOdd = false;
        }
        int middleChar = 0;
        for(Character keyChar : keyMap.keySet()){

            int numChars = keyMap.get(keyChar);
                if(numChars%2!=0){
                    middleChar++;
                }
            }

        if(middleChar < 2){
            canPalindrome = true;
        }
        return canPalindrome;
    }

    public static void findAnagram(String key){

        Map<Character, Integer> strMap = new HashMap<>();
        char[] strArr = key.toCharArray();
        int keyLength = strArr.length;

        for(Character ch : strArr){
            if(strMap.containsKey(ch)){
                strMap.merge(ch, 1, (OldValue, one) -> OldValue + one);
            }
            else{
                strMap.put(ch, 1);
            }
        }
        boolean canPalindrome = canPalindrome(strMap, keyLength);

        if(canPalindrome){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        findAnagram(str);

    }
}
