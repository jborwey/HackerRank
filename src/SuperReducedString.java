/**
 * Created by jb039k on 11/14/2016.
 */

import java.util.Scanner;

public class SuperReducedString {

    public static boolean checker(String reducedStr){
        boolean isReduced = true;
        int strSize = reducedStr.length();
        for(int i=1; i<strSize; i++){
            if(reducedStr.charAt(i)==reducedStr.charAt(i-1)){
                isReduced = false;
            }
        }
        return isReduced;
    }

    public static int[] count(char[] charArray){
        int arrLength = charArray.length;
        int[] countArray = new int[arrLength];

        for(int i=1; i<arrLength; i++){
            char ch1 = charArray[i];
            char ch2 = charArray[i-1];

            if(ch1 == ch2){
                countArray[i]++;
                countArray[i-1]++;
                i++;
            }

        }
        return countArray;
    }

    public static void superReducer(char[] charArray){
        int arrayLength = charArray.length;
        StringBuilder strBldr = new StringBuilder(arrayLength);
        int[] count = count(charArray);

        for(int i=0; i<arrayLength; i++){
            if(count[i] == 0){
                strBldr.append(charArray[i]);
            }
        }

        String reducedStr = strBldr.toString();
        if(reducedStr.length() == 0){
            System.out.println("Empty String");
        }

        if(checker(reducedStr)){
            System.out.println(reducedStr);
        }
        else{
            superReducer(reducedStr.toCharArray());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String testString = sc.next();

        char[] testArray = testString.toCharArray();
        superReducer(testArray);

    }
}
