/**
 * Created by jb039k on 6/15/2016.
 */

import java.util.Scanner;

import static java.lang.Math.pow;

class myCalculator {

    int powered = 0;

    int power(int n, int p) throws Exception{
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        else {
            System.out.println(pow(n, p));
        }
        return powered;
    }
}


public class ExceptionHandlingPrac {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
