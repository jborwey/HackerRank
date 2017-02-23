/**
 * Created by jb039k on 9/21/2016.
 */

import java.util.Scanner;

public class LeftRotation {

    public int[] rotateLeft(int[] array, int rotations) {

        if (array == null || array.length <= 1) {
            return array;
        }
        int length = array.length;

        for(int i=0; i<rotations; i++) {
            int start = array[0];
            System.arraycopy(array, 1, array, 0, length - 1);
            array[length - 1] = start;

        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        LeftRotation rotation = new LeftRotation();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        printArray(rotation.rotateLeft(array, d));

    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
