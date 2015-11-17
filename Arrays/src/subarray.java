public class subarray {

	public static void main(String args[])
	{
		int [] a = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		dispsubarray(a);
	}
	
	public static void dispsubarray(int[] a)
	{
		int s,e;
		for(s = 0; s < a.length; s++)
		{
			if(a[s] > a[s+1])
				break;
		}
		if( s == a.length -1)
		{
			System.out.print("Array is sorted");
			return;
		}
		for(e = a.length-1;e>=s;e--)
		{
			if(a[e] < a[e-1])
				break;
		}
		int max  = a[s];
		int min = a[s];
		for(int i = s; i<= e;i++)
		{
			if(a[i]>max)
				max = a[i];
			else if(a[i]<min)
				min = a[i];
		}
		
		for(int i = 0;i<=s;i++)
		{
			if(a[i] >min)
			{
				s = i;
				break;
			}
		}
		for(int j = e+1;j<a.length;j++)
		{
			if(a[j]<max)
			{
				e = j;
				break;
			}
		}
		System.out.print(s + " " + e);
	}
}
