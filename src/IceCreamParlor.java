/**
 * Created by jb039k on 12/5/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {

    //TODO pass in price to check for AND money separately
    public static int findFlavor(int price, int money, List<Integer> prices){
        // Check for a price -1 of our total money
        int moneyRemaining = money;
        int priceCheck = price;
        int flavor = -1;

        if(priceCheck == 0){
            priceCheck = 1;
        }
        // Check if the price list contains a value equal to what were looking for
        if(prices.contains(priceCheck)){
            flavor = prices.indexOf(priceCheck);
            moneyRemaining = moneyRemaining - priceCheck;
        }

        // Check if the price list now contains the remainder of our money, if not find a new flavor starting with
        // a lower first flavor price
        if(!prices.contains(moneyRemaining) && moneyRemaining > 0){
            return findFlavor(price-1, money, prices);
        }
        return flavor;
    }

    public static void buyIceCream(int money, List<Integer> prices){
        int remainingMoney = money;

        // find first flavor and calculate the remaining money
        // Check for a price -1 of our total money
        int firstFlavor = findFlavor(money-1, money, prices);
        remainingMoney = remainingMoney - prices.get(firstFlavor);
        prices.set(firstFlavor, -1);

        // find second flavor and calculate the remaining money
        int secondFlavor = findFlavor(remainingMoney, remainingMoney, prices);

        if(secondFlavor < firstFlavor) {
            System.out.println(secondFlavor + 1 + " " + (firstFlavor + 1));
        }
        else{
            System.out.println(firstFlavor + 1 + " " + (secondFlavor + 1));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int trips = sc.nextInt();

        int money;
        int numFlavors;

        for(int i=0; i<trips; i++){
            money = sc.nextInt();
            numFlavors = sc.nextInt();
            //TODO use a map instead of an array
            List<Integer> prices = new ArrayList<>();
            //load the array
            for(int j=0; j<numFlavors; j++){
                int price = sc.nextInt();
                prices.add(price);
            }
            buyIceCream(money, prices);
        }
    }
}
