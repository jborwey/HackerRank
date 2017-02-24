import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jb039k on 1/24/2017.
 */
public class BeautifulTriplets {

    public static int findBeauty(int beautiful, List<Integer> sequence){
        int beautyCount = 0;
        for(Integer integer : sequence){
                if(sequence.contains(integer+beautiful) && sequence.contains((integer + 2*beautiful))){
                    beautyCount = beautyCount + 1;
                }
            }

        return beautyCount;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int beautiful = sc.nextInt();
        List<Integer> sequence = new ArrayList<>();

        for(int i=0; i<length; i++){
            sequence.add(sc.nextInt());
        }

        int numTriplets = findBeauty(beautiful, sequence);
        System.out.println(numTriplets);
    }
}
