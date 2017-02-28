import java.util.Scanner;

/**
 * Created by jb039k on 2/28/2017.
 */
public class MissingNumbers {

    public static int[] findMissingNumbers(int[] listA, int[] listB, int lenA, int lenB){
        int[] result = new int[10001];

        for(int i=0; i<lenA; i++){
            result[listA[i]]++;
        }

        for(int j=0; j<lenB; j++){
            result[listB[j]]--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenB = sc.nextInt();
        int[] listB = new int[lenB];
        for(int i=0; i<lenB; i++){
            listB[i] = sc.nextInt();
        }

        int lenA = sc.nextInt();
        int[] listA = new int[lenA];
        for(int i=0; i<lenA; i++){
            listA[i] = sc.nextInt();
        }

        int[] result = findMissingNumbers(listA, listB, lenA, lenB);
        for(int i=0; i < result.length; i++){
            if(result[i]>0){
                System.out.printf("%d" + " ", i);
            }

        }
    }
}
