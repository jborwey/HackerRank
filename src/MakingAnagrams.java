/**
 * Created by jb039k on 11/30/2016.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagrams {

    public static int findDifferences(Map<Character, Integer> charOccurrences, String str2){
        HashMap<Character, Integer> occurCopy = new HashMap<>(charOccurrences);
        char[] str2Array = str2.toCharArray();
        int differences = 0;

        for(int j=0; j<str2Array.length; j++){
            char ch2 = str2Array[j];
            if(occurCopy.containsKey(ch2)){
                occurCopy.merge(ch2, 1, (oldValue, one) -> oldValue - one);
                int chVal = occurCopy.get(ch2);
                if(chVal <= 0) {
                    occurCopy.remove(ch2);
                }
            }
            else{
                differences++;
            }
        }

        int mapCopyRemain = 0;
        for(Map.Entry<Character, Integer> entry : occurCopy.entrySet()){
            mapCopyRemain = mapCopyRemain + entry.getValue();
        }

        differences = differences + mapCopyRemain;
        return differences;
    }

    public static int makeAnagram(String str1, String str2){
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(charOccurrences.containsKey(ch)){
                charOccurrences.merge(ch, 1, (oldValue, one) -> oldValue + one);
            }
            else{
                charOccurrences.put(ch, 1);
            }
        }
        return (findDifferences(charOccurrences, str2));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int deletions =  makeAnagram(str1, str2);
        System.out.println(deletions);


    }
}
