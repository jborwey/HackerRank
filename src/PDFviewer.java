/**
 * Created by jb039k on 1/4/2017.
 */

import java.util.Scanner;

public class PDFviewer {

    public static int findLargestChar(int[] array, String word){
        int length = word.length();
        int largestHeight = 1;

        for(int i=0; i<length; i++){
            char ch = word.charAt(i);
            int newHeight = array[ch-97];

            if(newHeight > largestHeight){
                largestHeight = newHeight;
            }
        }
        return largestHeight;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int largestHeight = findLargestChar(h, word);
        System.out.println((word.length())*largestHeight);
    }
}

