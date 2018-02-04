package LeetCode;

public class BuyandSellStock {

	public static void main(String[] args) {
		int[] a= {9,1,5,3,10,4};
		System.out.println(maxProfit(a));

	}
public static int maxProfit(int [] a) {
	int minprice=Integer.MAX_VALUE;
	int maxprofit=0;
	for(int i=0; i<a.length; i++) {
		
	if(a[i]< minprice)
		minprice= a[i];
	if(a[i]-minprice > maxprofit)
		maxprofit= a[i]-minprice;
		}
return maxprofit;	
}
}
