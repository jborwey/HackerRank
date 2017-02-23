/**
 * Created by jb039k on 6/3/2016.
 */
public class GenericMethod {
    static void printArray(Object[] anyArray) {
        for(int i=0; i < anyArray.length; i++) {
            System.out.println(anyArray[i].toString());
        }
    }
}
