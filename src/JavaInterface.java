/**
 * Created by jb039k on 6/10/2016.
 */

import java.util.Scanner;

interface AdvancedArithmetic{
    public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    int total = 0;

    @Override
    public int divisorSum(int n) {

        for(int i=1; i <= n; i++) {
            if(n % i == 0) {
                total += i;
            }
            else {
                continue;
            }
        }

        return total;
    }
}

public class JavaInterface {

    public static void main(String []argh)
    {
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(my_calculator.divisorSum(n)+"\n");

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
