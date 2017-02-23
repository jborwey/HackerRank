/**
 * Created by jb039k on 11/3/2016.
 */

import java.util.Scanner;

public class BeautifulBinary {

    public static int beautifyString(String[] binaryString, int offSet, int changes)
    {
        int totalChanges = changes;
        int arrLength = binaryString.length;

        // where to start reading in the array from.  Want to move forward one element at a time
        // copy original array starting from offset
        StringBuilder binCheck = new StringBuilder(3);
        int lastElement = offSet+2;

        if(offSet < arrLength-2){
        // check first 3 elements of the copied array add them to string builder
            for(int i=offSet; i<lastElement+1; i++){
                binCheck.append(binaryString[i]);
            }

            if(binCheck.toString().equals("010")){
                binaryString[lastElement] = "1";
                changes++;
                offSet++;
                return beautifyString(binaryString, offSet, changes);
            }
            else{
                offSet++;
                return beautifyString(binaryString, offSet, changes);
            }
        }
        return totalChanges;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String binStr = in.next();
        String[] binaryString = binStr.split("");

        int numChanges = beautifyString(binaryString, 0, 0);
        System.out.println(numChanges);
    }
}
