/**
 * Created by jb039k on 10/20/2016.
 */

import java.util.Scanner;

public class RepeatedString {

    public static long findFrequenceyLetters(String str, long totalLength){
        int lenStr = str.length();
        int numA = 0;
        long remainder = totalLength%lenStr;
        // calculate value of the string and number of 'a's
        for(char ch : str.toCharArray()){
            if(ch == 'a'){
                numA++;
            }
        }

        long total = (totalLength/lenStr)*numA;
        if(remainder == 0 && numA > 0){
            return total;
        }
        for(int i=0; i<remainder; i++){
            if(str.charAt(i) == 'a'){
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        long n = in.nextLong();

        long occurrences = findFrequenceyLetters(str, n);
        System.out.println(occurrences);
    }
}
