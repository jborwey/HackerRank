/**
 * Created by jb039k on 8/3/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StaircasePrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List stairs = new ArrayList<>();
        for(int i=0;i<n;i++) {
            stairs.add(" ");
        }

        for(int j=n;0<j;j--) {
            stairs.set(j-1, "#");
            stairs.forEach(System.out::print);
            System.out.println();
        }
    }
}