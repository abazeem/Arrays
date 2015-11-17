public class Leader {

	public static void main(String args[])
	{
		int [] a = {10,16,12,5,3};
		printleader(a);
	}
	
	public static void printleader(int [] a)
	{
		int r = a.length -1;
		System.out.print(a[r]+ " ");
		int max = a[r];
		for(int j = r-1;j>=0;j--)
		{
			if(max < a[j])
			{
				max = a[j];
				System.out.print(max + " ");
			}
		}
	}
}
