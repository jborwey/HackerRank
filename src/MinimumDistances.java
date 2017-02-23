/**
 * Created by jb039k on 10/13/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {

    public static HashMap<Integer, ArrayList<Integer>> count(int[] valArray, int length){
        HashMap<Integer, ArrayList<Integer>> countMap = new HashMap<>();

        ArrayList<Integer> list;
        for(int i=0; i<length; i++) {
            /**
             * Use the value in the array as a key for the hashmap
             * since we are trying to find the difference between two points
             *
             */
            if(countMap.containsKey(valArray[i])){
                list = countMap.get(valArray[i]);
                list.add(i);
            }
            else{
                list = new ArrayList<>();
                list.add(i);
                countMap.put(valArray[i], list);
            }

        }
        return countMap;
    }

    public static int findMinimumDistance(HashMap<Integer, ArrayList<Integer>> countMap){
        int minDistance = -1;

        for(Map.Entry<Integer, ArrayList<Integer>> elements : countMap.entrySet()){
            ArrayList<Integer> list = new ArrayList<>(elements.getValue());
            int listSize = list.size();

            if(listSize >= 2){
                for(int i=1; i<listSize; i++){
                    int distance = (list.get(i) - list.get(i-1));
                    if(minDistance == -1 || distance < minDistance){
                        minDistance = distance;
                    }
                }
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int length = A.length;
        HashMap<Integer, ArrayList<Integer>> distanceMap = count(A, length);
        int minDistance = findMinimumDistance(distanceMap);

        System.out.println(minDistance);
    }
}
