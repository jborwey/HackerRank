/**
 * Created by jb039k on 11/15/2016.
 */

import java.util.HashMap;
import java.util.Scanner;

public class MarsExploration {

    public static HashMap<Integer, StringBuilder> getComposition(String SOS, int tLength){
        HashMap<Integer, StringBuilder> composition = new HashMap<>();

        StringBuilder subStr;
        int commSegment = 1;

        /**
         * for each 3 character substring in the SOS add it as a value to the HashMap key will be int inc by 1
         * increment the HashMap value by merging previous value with new value
         */
        for(int i=0; i<tLength; i++){
            char ch = SOS.charAt(i);
            if(i==0){
                subStr = new StringBuilder(3);
                subStr.append(ch);
                composition.put(commSegment, subStr);
            }
            else if(i%3==0){
                commSegment++;
                subStr = new StringBuilder(3);
                subStr.append(ch);
                composition.put(commSegment, subStr);
            }
            else{
                subStr = composition.get(commSegment);
                subStr.append(ch);
            }
        }
        return composition;
    }

    public static void transmissionChanges(String SOS){
        int transmissionLength = SOS.length();
        HashMap<Integer, StringBuilder> composition = getComposition(SOS, transmissionLength);

        int alterations = 0;

        // select key from each entry
        for(Integer key : composition.keySet()){
            String transmission = composition.get(key).toString();
            if(!transmission.equals("SOS")){
                // get int attached to each key
                if(!Character.toString(transmission.charAt(0)).equals("S")){
                    alterations++;
                }
                if(!Character.toString(transmission.charAt(1)).equals("O")){
                    alterations++;
                }
                if(!Character.toString(transmission.charAt(2)).equals("S")){
                    alterations++;
                }
            }
        }
        System.out.println(alterations);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SOS = in.next();
        transmissionChanges(SOS);
    }
}
