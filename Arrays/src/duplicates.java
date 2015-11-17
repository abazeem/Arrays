class duplicates {

	public static void main(String args[])
	{
		int[] a = {1, 2, 3, 1, 3, 6, 6};
		dispduplicate(a);
	}
	
	public static void dispduplicate(int [] a)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[Math.abs(a[i])]>=0)
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			else
				System.out.print(Math.abs(a[i]));
				
		}
	}
}
