/**
 * Created by jb039k on 10/11/2016.
 */

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] meal = new int[n];
        int annaBill = 0;

        for(int i=0; i<n; i++){
            meal[i] = sc.nextInt();
            annaBill += meal[i];
        }
        int charged = sc.nextInt();
        annaBill = (annaBill - meal[k])/2;

        if(charged == annaBill){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(charged-annaBill);
        }

    }
}