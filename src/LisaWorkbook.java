/**
 * Created by jb039k on 10/12/2016.
 */

import java.util.Scanner;

public class LisaWorkbook {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numChapters = sc.nextInt();
        int probPerPage = sc.nextInt();
        int[] probPerChapter = new int[numChapters];
        int numPages = 0;

        for(int t=0; t<numChapters; t++){
            double numProblems = sc.nextDouble();
            numPages += (int)Math.ceil(numProblems/probPerPage);
            probPerChapter[t] = (int)numProblems;
        }


        int currentChapter = 0;
        int specialProblems = 0;
        for(int i=1; i<numPages+1; i++){
            int numProblems = probPerChapter[currentChapter];
            for(int j=1; j<=numProblems; j++){
                if(j == i){
                    specialProblems++;
                }
                if(j%probPerPage == 0 && j != numProblems){
                    i++;
                }
            }
            currentChapter++;
        }
        System.out.println(specialProblems);
    }
}
