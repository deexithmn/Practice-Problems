/* Find the maximum profit by buying and selling the stocks in the same day,
given the price of the stock at the certain time in the day at a paticular time

Sample Input :
5
60 90 0 20 1

Output :

30

*/

import java.util.*;

public class StockProblem {
    int[] stocks;

    public List input() {
        Scanner inputArr = new Scanner(System.in);
        List<Integer> inputStock = new ArrayList<Integer>();
        System.out.println("Kindly enter the number of stocks recorded:");
        int listSize = inputArr.nextInt();
        System.out.println("Kindly enter the Stock Prices");
        while (listSize > 0) {
            int temp = Integer.parseInt(inputArr.next());
            inputStock.add(temp);
            listSize--;
        }
        return inputStock;
    }

    public int calculatedStock(List<Integer> stockList) {
        if (stockList.size() < 2) {
            throw new IllegalArgumentException("Can't trade given a single stock time");
        }
        int profit = stockList.get(1) - stockList.get(0);
        int minPrice = stockList.get(0);
// Using a this greedy approach you will end up to the result in O(n) time complexity
        for (int stock : stockList) {
            int tempProfit = stock - minPrice;
            minPrice = Math.min(minPrice, stock);
            profit = Math.max(profit, tempProfit);

        }
        // Using a this method you will end up to the result in O(n^2) time complexity
//        for (int i=0;i<stockList.size()-1;i++){
//            for(int j=i+1;j<stockList.size()-1;j++) {
//                int difference = stockList.get(j) - stockList.get(i);
//                if(difference>profit){
//                    profit = difference;
//                }
//            }
//        }
        return profit;
    }

    public static void main(String[] args) {
        StockProblem A1 = new StockProblem();
        List<Integer> dayStock = A1.input();
        int profitSelling = A1.calculatedStock(dayStock);
        if (profitSelling == 0) {
            System.out.println("You Just can't get any profile! All stocks went down");
        } else {
            System.out.println("You could have got this much Profit : " + profitSelling);
        }

    }
}
