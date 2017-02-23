/**
 * Created by jb039k on 11/2/2016.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("\\s+", "").trim();

        HashMap<String, Integer> alphabet = new HashMap<>();

        for(int i=0; i<input.length(); i++){
            if(alphabet.size()==26){
                break;
            }
            String letter = String.valueOf(input.charAt(i)).toLowerCase();
            if(!alphabet.containsKey(letter)){
                alphabet.put(letter, i);
            }
        }
        if(alphabet.size() == 26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
