/**
 * Created by jb039k on 11/9/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gemstones {

    public static HashMap<String, ArrayList<Integer>> countElements(HashMap<String, ArrayList<Integer>> composition, String rockElements, int rockID){
        int rockSize = rockElements.length();
        ArrayList<Integer> rockList;

        for(int i=0; i<rockSize; i++){
            // iterate through each rock's element composition and use unique elements as keys in the composition HashMap
            String element = String.valueOf(rockElements.charAt(i));
            boolean hasElement = composition.containsKey(element);
            if(hasElement){
                rockList = composition.get(element);
                if(!rockList.contains(rockID)){
                    rockList.add(rockID);
                }
            }
            else{
                rockList = new ArrayList<>();
                rockList.add(rockID);
                composition.put(element, rockList);
            }
        }
        return composition;
    }

    public static void findGems(HashMap<String, ArrayList<Integer>> composition, int totalRocks){
        int gemElements = 0;

        for(Map.Entry<String, ArrayList<Integer>> entry : composition.entrySet()){
            // select key from each entry
            String key = entry.getKey();
            // get int attached to each key
            int rockList = composition.get(key).size();
            if (rockList == totalRocks) {
                gemElements++;
            }
        }
        System.out.println(gemElements);
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int totalRocks = sc.nextInt();
        HashMap<String, ArrayList<Integer>> composition = new HashMap<>();

        for(int rockID=0; rockID<totalRocks; rockID++){
            String rockElements = sc.next();
            composition = countElements(composition, rockElements, rockID);
        }
        findGems(composition, totalRocks);
    }
}