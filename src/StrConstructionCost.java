/**
 * Created by jb039k on 11/21/2016.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StrConstructionCost {

    public static void constructStr(String buildStr){
        Set<Character> costSet = new HashSet<>();
        char[] charArr = buildStr.toCharArray();
        int cost = 0;

        for(Character ch : charArr){
            if(charArr.length == 26){
                break;
            }
            if(!costSet.contains(ch)){
                costSet.add(ch);
                cost++;
            }
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int a0 = 0; a0 < tests; a0++){
            String s = in.next();
            constructStr(s);
        }
    }
}

