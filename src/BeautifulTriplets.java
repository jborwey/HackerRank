import java.util.Scanner;
/**
 * Created by jb039k on 1/24/2017.
 */
public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int beautiful = sc.nextInt();
        int[] sequence = new int[length];

        for(int i=0; i<length; i++){
            sequence[i] = sc.nextInt();
        }
    }
}
