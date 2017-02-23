/**
 * Created by jb039k on 8/5/2016.
 */

import java.util.Scanner;


public class ArrayRotation {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
       // List<Integer> iList = new ArrayList<>();
        int rotation = k%n;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        for(int j=0; j<q; j++) {
            int m = sc.nextInt();
            if((m-rotation) >= 0){
                System.out.println(arr[m-rotation]);
            }
            else{
                System.out.println(arr[m-rotation+arr.length]);
            }
        }
    }
}
