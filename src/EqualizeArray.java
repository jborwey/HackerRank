/**
 * Created by jb039k on 10/31/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeArray {

    public static int minDeletions(HashMap<Integer, ArrayList<Integer>> intMap){
        int valueSize = 0;
        int max = 0;

        // enhanced for loop HashMap entrySet use entry to grab each index of the HashMap
        for(Map.Entry<Integer, ArrayList<Integer>> entry : intMap.entrySet()){
            int key = entry.getKey();
            // get largest
            int totalInts = intMap.get(key).size();
            valueSize = valueSize + totalInts;
            if(totalInts > max){
                max = totalInts;
            }
        }
        return (valueSize-max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> intMap = new HashMap<>();
        ArrayList<Integer> list;

        for(int i=0; i<length; i++){
            //use input elements as key and position in loop as elements of the list
            int nextInt = sc.nextInt();
            if(intMap.containsKey(nextInt)){
                list = intMap.get(nextInt);
                list.add(i);
            }
            else{
                list = new ArrayList<>();
                list.add(i);
                intMap.put(nextInt, list);
            }

        }
        int minDeletions = minDeletions(intMap);
        System.out.println(minDeletions);

    }
}
