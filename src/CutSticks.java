/**
 * Created by jb039k on 8/23/2016.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutSticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> sticks = new ArrayList<>();

        for(int i=0; i<N; i++) {
            sticks.add(sc.nextInt());
        }


        while(sticks.size() > 0) {
            sticks = cut(sticks);
        }

    }
    private static List<Integer> cut(List<Integer> sticks) {
        Collections.sort(sticks);
        int cut = sticks.get(0);
        System.out.println(sticks.size());

        List<Integer> remaining = new ArrayList<>();
        for(int j=0; j<sticks.size(); j++) {
            int stick = sticks.get(j);
            int newStick = stick-cut;
            if(newStick > 0) {
                remaining.add(newStick);
            }
        }

        return remaining;
    }
}
