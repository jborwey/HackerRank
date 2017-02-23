import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Created by jb039k on 1/25/2017.
 */
public class QHEAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<queries; i++){
            int operation = sc.nextInt();
            if(operation == 1){
                int value = sc.nextInt();
                heap.add(value);
                if(value < min){
                    min = value;
                }
            }
            else if(operation == 2){
                int value = sc.nextInt();
                heap.remove(value);
                if(value == min){
                    min = Integer.MAX_VALUE;
                    for(Iterator<Integer> it = heap.iterator(); it.hasNext();){
                        Integer integer = it.next();
                        if(integer < min){
                            min = integer;
                        }
                    }
                }
            }
            else{
                System.out.println(min);
            }
        }
    }
}
