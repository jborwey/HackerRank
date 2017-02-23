/**
 * Created by jb039k on 10/21/2016.
 */

import java.util.Scanner;

public class FindDigits {

    public static void printEvenDivsers(char[] strDigit, int num){
        int[] count = new int[10];
        int countLength = 0;
        int divisers = 0;

        for(int i=0; i<strDigit.length; i++){
            int charVal = Character.getNumericValue(strDigit[i]);
            if(countLength == strDigit.length){
                break;
            }
            else{
                count[charVal]++;
                countLength++;
            }
        }
        for(int j=1; j<count.length; j++){
            int remainder = num%j;
            if(remainder == 0){
                divisers = (divisers + count[j]);
            }
        }
        System.out.println(divisers);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        /**
         * get int from input
         * convert and save int to a string
         * pass string as char array and original num
         */
        for(int a0 = 0; a0 < t; a0++){
            int num = in.nextInt();
            String strDigit = Integer.toString(num);
            printEvenDivsers(strDigit.toCharArray(), num);
        }
    }
}

