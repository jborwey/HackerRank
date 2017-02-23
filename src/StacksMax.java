import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jb039k on 10/11/2016.
 */
public class StacksMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int queries = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<queries; i++){
            int operation = sc.nextInt();

            if(operation == 1){
                int num = sc.nextInt();
                st.push(num);
                if(num>max){
                    max = num;
                }
            }
            else if(operation == 2){
                int num = st.pop();
                if(num == max){
                    max = Integer.MIN_VALUE;
                    for(Iterator<Integer> it = st.iterator(); it.hasNext();){
                        Integer integer = it.next();
                        if(integer > max){
                            max = integer;
                        }
                    }
                }
            }
            else{
                System.out.println(max);
            }
        }
    }
}
