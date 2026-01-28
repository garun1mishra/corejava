package hackerrank;

/**
 * 
 * 
 * @author Garun Mishra
 * 
  Say you have an array for which ith element is the price of a given stock on a day.
  If you will only permitted to complete atmos one transaction (Example, buy one and sell one share of the stock), design an 
  algorithm to find a maximum profit.
  
  Note: You can not sell a stock before buying one.
  
  Example: 
  Input : [7,1,5,3,6,4]
  Output: 5
  Explaination: Buy on day 2nd (price = 1) and sale on day the price is 5. profite : 6-1 = 5. Not 7-1 = 6  as selling price needs to 
  be larger than buying prices. 


 */

public class BuySellStock {

	public static void main(String[] args) {
		BuySellStock bss = new BuySellStock();
		int [] prices = {7,1,5,3,6,4};
		System.out.println(bss.buySellStocks(prices));
	}

	private int  buySellStocks(int[] prices) {
		int minumumPrice = prices[0];
		int calculateProfite = 0;
		for(int i=1; i< prices.length;i++) {
			calculateProfite = Math.max(calculateProfite, prices[i] - minumumPrice);
			minumumPrice = Math.min(minumumPrice, prices[i]);
		}
		return calculateProfite;
	}
}
