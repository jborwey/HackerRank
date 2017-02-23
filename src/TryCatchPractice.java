/**
 * Created by jb039k on 6/14/2016.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        }
        catch(InputMismatchException m) {
            System.err.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException z) {
            System.err.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
