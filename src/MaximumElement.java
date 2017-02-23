/**
 * Created by jb039k on 1/18/2017.
 */

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numQueries = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numQueries; i++){
            int operation = sc.nextInt();

            if(operation == 1){
                int num = sc.nextInt();
                st.push(num);
                if(num > max){
                    max = num;
                }
            }
            else if(operation == 2){
                int numPop = st.pop();
                if(st.empty()){
                    max = Integer.MIN_VALUE;
                }
                else if(numPop == max){
                    max = Integer.MIN_VALUE;
                    Stack<Integer> lifoCopy = (Stack<Integer>) st.clone();
                    while (!lifoCopy.isEmpty()) {
                        max = Math.max(lifoCopy.pop(), max);
                    }
                }
            }
            else{
                System.out.println(max);
            }
        }
    }
}
