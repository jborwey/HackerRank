/**
 * Created by jb039k on 10/13/2016.
 */

import java.util.Scanner;

public class FlatlandSpaceStation {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }

        // array of cities
        int[] cities = new int[n];
        for(int stations : c){
            cities[stations] += 1;
        }
    }
}