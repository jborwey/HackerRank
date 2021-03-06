import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

/**
 * Created by jb039k on 6/22/2016.
 */
public class Access {
    public static void main(String[] args) throws Exception {
        Do_Not_Terminate.forbidExit();

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int num=Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private


            // code here
            Inner.Private inner = new Inner().new Private();
            o = inner;
            String str = ((Access.Inner.Private)o).powerof2(num);
            System.out.println(num + " is a " + str);











            System.out.println("An instance of class: "+o.getClass().getCanonicalName()+" has been created");

        }//end of try

        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner
    {
        private class Private{
            private String powerof2(int num)
            {
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner
}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
