/**
 * Created by jb039k on 10/31/2016.
 */

import java.util.Scanner;

public class ApplesOranges {

    public static int calcApples(int[] appleTree, int tree, int houseStart, int houseEnd){
        int count = 0;

        for (int apple=0; apple<appleTree.length; apple++){
            int appleFall = tree + appleTree[apple];
            if(appleFall < houseStart || appleFall > houseEnd){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static int calcOranges(int[] orangeTree, int tree, int houseStart, int houseEnd){
        int count = 0;

        for (int orange=0; orange<orangeTree.length; orange++){
            int orangeFall = tree + orangeTree[orange];
            if(orangeFall < houseStart || orangeFall > houseEnd){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }

        int apples = calcApples(apple, a, s, t);

        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int oranges = calcOranges(orange, b, s, t);

        System.out.println(apples);
        System.out.println(oranges);
    }
}
