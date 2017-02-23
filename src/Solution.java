import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<int[]> al = new ArrayList<>();

        for(int i=0; i<=n; i++) {
            String arr = sc.nextLine();
            String[] items = arr.split(" ");
            int[] results = new int[items.length];
            for (int j=0; j<items.length;j++)
                try {
                    results[j] = Integer.parseInt(items[j]);
                } catch (NumberFormatException nfe) {
                }
            al.add(results);
        }

        int n2 = sc.nextInt();

        for(int j=0; j<=n2; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try{
                System.out.println(al.get(x)[y]);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

        }
    }
}