/**
 * Created by jb039k on 6/27/2016.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

class Prime {

    public void checkPrime(int... integers) {
        int intIndex = 0;
        for(int i : integers) {
            intIndex++;
            for(int j=i; j>= 0; j--) {
                int primus = i%j;
                if(i != 1 && primus == 0 && integers.length == 1){
                    System.out.println(i);
                    break;
                }
                else if(i == 1 && intIndex == integers.length) {
                    System.out.println();
                    break;
                }
                else if(primus == 0 && j<i && j != 1 && intIndex == integers.length) {
                    System.out.println();
                    break;
                }
                else if(primus == 0 && j<i && j != 1) {
                    break;
                }
                else if(intIndex < integers.length && i==1){
                    break;
                }
                else if(primus == 0 && j == 1 && intIndex == integers.length && i != 1) {
                    System.out.print(i);
                    System.out.println();
                    break;
                }
                else if(primus == 0 && j == 1 && i != 1) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }

    }
}




public class ProcessPrime {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
