/**
 * Created by jb039k on 8/22/2016.
 */

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int tardy = 0;

            for (int j = 0; j < N; j++) {
                int student = sc.nextInt();
                if(student > 0) {
                    tardy++;
                }
            }
            if ((N-tardy) < K) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}