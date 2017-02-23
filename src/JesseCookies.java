import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Created by jb039k on 1/25/2017.
 */
public class JesseCookies {

    public static int combineCookies(int cookieA, int cookieB){
        return cookieA + (2*cookieB);
    }

    public static int findMinOps(PriorityQueue<Integer> cookieHeap, int sweetness, int operations) {
        if(cookieHeap.size() <= 1 && !cookieHeap.contains(sweetness)){
            return -1;
        }

        int cookie1 = cookieHeap.poll();
        int cookie2 = cookieHeap.poll();
        if(cookie1 >= sweetness){
            return operations;
        }
        int sweeter = combineCookies(cookie1, cookie2);
        cookieHeap.add(sweeter);

        return findMinOps(cookieHeap, sweetness, operations+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCookies = sc.nextInt();
        int minSweetness = sc.nextInt();
        int[] cookies = new int[numCookies];
        Comparator<Integer> comparator = new CookieSweetnessComparator();
        PriorityQueue<Integer> heap = new PriorityQueue<>(numCookies, comparator);


        for(int i=0; i<numCookies; i++){
            cookies[i] = sc.nextInt();
        }
        for(int cookie : cookies){
            heap.add(cookie);
        }
        int operations = findMinOps(heap, minSweetness, 0);
        System.out.println(operations);

    }
    public static class CookieSweetnessComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1 < o2){
                return -1;
            }
            if(o1 > o2){
                return 1;
            }
            return 0;
        }
    }
}
