/**
 * Created by jb039k on 6/9/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class JavaStack{

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while(sc.hasNext()){
            list.add(sc.next());
        }

        for(String e : list){
            boolean validStr = isValid(e);
            System.out.println(validStr);
        }
    }
}
