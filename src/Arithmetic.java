/**
 * Created by jb039k on 6/9/2016.
 */
class Arithmetic {

    int sum = 0;

    int add(int x, int y) {
        this.sum = x + y;

        return sum;
    }
}

class Adder extends Arithmetic {

}
class addSolution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
