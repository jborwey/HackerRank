/**
 * Created by jb039k on 7/5/2016.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("<.*?>");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
            else {
                System.out.println("None");
            }


            testCases--;
        }
    }
}
