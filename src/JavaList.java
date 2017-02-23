/**
 * Created by jb039k on 7/11/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] str = sc.nextLine().split("\\s+");
        List<Integer> L = new ArrayList<>();
        for(String s : str) L.add(Integer.valueOf(s));

        String queries = sc.nextLine();
        int Q = Integer.parseInt(queries);


        for(int i=0; i<Q;i++){
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("Insert")){
                String[] insert = sc.nextLine().split("\\s+");
                int x = Integer.parseInt(insert[0]);
                int y = Integer.parseInt(insert[1]);
                L.add(x, y);
            }
            else if(input.equalsIgnoreCase("Delete")){
                String[] del = sc.nextLine().split("\\s+");
                int x = Integer.parseInt(del[0]);
                L.remove(x);
            }
        }

        for(int c=0; c<L.size();c++){
            System.out.print(L.get(c) + " ");
        }
    }
}
