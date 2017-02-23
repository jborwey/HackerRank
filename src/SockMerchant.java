/**
 * Created by jb039k on 10/11/2016.
 */

import java.util.Scanner;

public class SockMerchant {

    public static int[] sockSort(int[] socks, int size){
        int[] sortedSocks = new int[size];

        for(int sock : socks){
            sortedSocks[sock] += 1;
        }
        return sortedSocks;
    }

    public static int count(int[] sortedSocks){
        int pairs = 0;

        for(int socks : sortedSocks){
            if(socks > 1){
                pairs += socks/2;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int size = 101;
        int[] sortedSocks = sockSort(c,size);
        int pairs = count(sortedSocks);
        System.out.println(pairs);
    }
}