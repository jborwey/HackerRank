/**
 * Created by jb039k on 11/21/2016.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static int makeAnagram(String testStr, int strLength){
        if(strLength%2 != 0){
            return -1;
        }
        int changes = 0;

        int arrHalf = ((strLength/2));
        char[] testArray = testStr.toCharArray();
        Map<Character, Integer> str2 = new HashMap<>();

        for(int i=arrHalf; i<strLength; i++){
            char ch = testArray[i];
            if(str2.containsKey(ch)){
                str2.merge(ch, 1, (oldValue, one) -> oldValue + one);
            }
            else{
                str2.put(ch, 1);
            }
        }

        /**
         * check if map contains value
         * if map contains value check to make sure value is greater than 0; else increment changes
         * if map contains value and greater than one, decrement map value
         * else increment changes
         */
        for(int j=0; j<arrHalf; j++){
            char ch = testArray[j];

            if(str2.containsKey(ch)){
                int occurrences = str2.get(ch);
                if(occurrences == 0){
                    changes++;
                }
                else{
                    str2.merge(ch, -1, (oldValue, one) -> oldValue + one);
                }
            }
            else{
                changes++;
            }
        }
        return changes;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0; i<testCases; i++){
            String testStr = sc.next();
            int length = testStr.length();
            int numChanges = makeAnagram(testStr, length);
            System.out.println(numChanges);
        }
    }
}