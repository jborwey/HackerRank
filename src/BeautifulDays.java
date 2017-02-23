/**
 * Created by jb039k on 12/12/2016.
 */

import java.util.Scanner;

public class BeautifulDays {

    public static boolean beautifulDay(int day, int divisor){
        boolean isBeaut = false;
        String forward = String.valueOf(day);
        String reverse = new StringBuilder(forward).reverse().toString();

        if((Math.abs(day-Integer.parseInt(reverse)))%divisor==0){
            isBeaut = true;
        }
        return isBeaut;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int firstDay = sc.nextInt();
        int lastDay = sc.nextInt();
        int divisor = sc.nextInt();

        int count = 0;
        for(int i=firstDay; i<lastDay; i++){
            boolean beautifulDay = beautifulDay(i, divisor);

            if(beautifulDay){
                count++;
            }
        }
        System.out.println(count);
    }
}
