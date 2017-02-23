/**
 * Created by jb039k on 12/13/2016.
 */

import java.util.Calendar;
import java.util.Scanner;

public class LibraryFine {

    public static void calculateFees(long daysLate, int[] rDate, int[] eDate){
        long fees = 0;
        if(daysLate <= 0){
            System.out.println(fees);
            return;
        }
        if(rDate[2] > eDate[2]){
            fees = 10000;
        }
        else if(rDate[1] == eDate[1] && daysLate > 0){
            fees = 15*daysLate;
        }
        else{
            fees = 500 * (rDate[1]-eDate[1]);
        }
        System.out.println(fees);
    }

    public static long getDaysLate(Calendar dateReturned, Calendar dateExpected){
        /*
		 * Use getTimeInMillis() method to get the Calendar's time value in
		 * milliseconds. This method returns the current time as UTC
		 * milliseconds from the epoch
		 */
        long miliSecondForReturn = dateReturned.getTimeInMillis();
        long miliSecondForExpected = dateExpected.getTimeInMillis();

        // Calculate the difference in millisecond between two dates
        long diffInMilis = miliSecondForReturn - miliSecondForExpected;
        // Convert to days 24*60*60*1000 = 86400000
        double diffInDays = Math.ceil((double)diffInMilis / 86400000);

        return (long)diffInDays;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] returned = new int[3];
        int[] expected = new int[3];
        Calendar dateReturned = Calendar.getInstance();
        Calendar dateExpected = Calendar.getInstance();

        // DAY, MONTH, YEAR
        for(int i=0; i<3; i++){
            returned[i] = sc.nextInt();
        }

        for(int j=0; j<3; j++){
            expected[j] = sc.nextInt();
        }
        // set values for the calendar fields YEAR, MONTH and DAY_OF_MONTH
        dateReturned.set(returned[2], returned[1], returned[0]);
        dateExpected.set(expected[2], expected[1], expected[0]);
        long daysLate = getDaysLate(dateReturned, dateExpected);
        calculateFees(daysLate, returned, expected);
    }
}