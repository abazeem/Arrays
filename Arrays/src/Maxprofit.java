
public class Maxprofit {

	public static void main(String args[])
	{
		int[] a = {2, 30, 15, 10, 8, 25, 80};
		profit(a);
	}
	
	public static void profit(int[] price)
	{
		int n = price.length;
		int[] profit = new int[n];
		int max = price[n-1];
		for(int i = n-2; i>=0; i--)
		{
			if(price[i] > max)
				max = price[i];
			profit[i] = Math.max(profit[i+1],max - price[i]);
		}
		int min = price[0];
		for(int i = 1; i< n; i++)
		{
			if(price[i]<min)
				min = price[i];
			profit[i] = Math.max(profit[i-1], profit[i] + (price[i] - min));
		}
		System.out.println(profit[n-1]);
	}
}
