/**
 * Created by jb039k on 10/27/2016.
 */

import java.util.Scanner;

public class ServiceLane {

    public static void largestVehicle(int entry, int exit, int[] highway){
        int in = highway[entry];
        int out = highway[exit];

        if(in < out){
            System.out.println(in);
        }
        else{
            System.out.println(out);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int cases = in.nextInt();
        int[] widths = new int[length];
        for(int width_i=0; width_i < length; width_i++){
            widths[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < cases; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            largestVehicle(i, j, widths);
        }
    }
}

