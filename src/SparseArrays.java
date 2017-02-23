import java.util.Scanner;

/**
 * Created by jb039k on 10/3/2016.
 */
public class SparseArrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()) ;
        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextLine();
        }

        int Q = Integer.parseInt(sc.nextLine());
        for(int j=0; j<Q; j++){
            String check = sc.nextLine();
            int count = 0;
            for(String word : arr){
                if(check.equals(word)){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
