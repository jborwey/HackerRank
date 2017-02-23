import java.util.Scanner;

/**
 * Created by JTB on 9/23/2016.
 */
public class CountingSort {

    public static class KeyValuePair<V> {
        private final int key;
        private final V value;

        public KeyValuePair(int key, V value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KeyValuePair<?> that = (KeyValuePair<?>) o;

            if (key != that.key) return false;
            return value.equals(that.value);

        }

        @Override
        public int hashCode() {
            int result = key;
            result = 31 * result + value.hashCode();
            return result;
        }
    }

    /**
     *
     * @param inputArray
     * @param k
     * @param <T> value type of the key value pair
     * @return method will return a sorted array of key value pair with the same type T as the input
     */
    public static <T> KeyValuePair<T>[] countSort(KeyValuePair<T>[] inputArray, int k){

        // step 1: get counts for the keys
        int[] counts = new int[k];
        for(KeyValuePair<T> keyValue : inputArray){
            counts[keyValue.getKey()] += 1;
        }

        // step 2: calculate offsets
        int[] offsets = new int[k];
        for(int i=1; i<k; i++){
            offsets[i] = offsets[i-1]+counts[i-1];
        }

        //step 3: copy the input array into a new array in sorted order
        KeyValuePair<T>[] outputArray = new KeyValuePair[inputArray.length];
        for(KeyValuePair<T> keyValue : inputArray){
            outputArray[offsets[keyValue.getKey()]] = keyValue;
            offsets[keyValue.getKey()] += 1;
        }
        return outputArray;
    }
    /**
     *
     * @param array
     * @param k
     * @return
     */
    public static int[] countOccurrences(int[] array, int k){
        int[] counts = new int[k];

        for(int num : array){
            counts[num] += 1;
        }

        return counts;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        KeyValuePair<String>[] inputArray = new KeyValuePair[n];

        // load the array
        for(int i=0; i<n; i++){
            inputArray[i] = new KeyValuePair<>(sc.nextInt(), sc.nextLine());
        }
        KeyValuePair<String>[] outputArray = countSort(inputArray, n); // pass in max value
        printArray(outputArray);

    }
    public static void printArray(KeyValuePair<?>[] outputArray){
        for(KeyValuePair e : outputArray){

            System.out.print(e.getValue() +" ");
        }
    }
}
