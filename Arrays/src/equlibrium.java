
public class equlibrium {

	public static void main(String args[])
	{
		int[] a = {-7, 1, 5, 2, -4, 3, 0};
		disp2(a,a.length);
	}
	
	public static void disp(int[] a , int n)
	{
		int[] L = new int[n];
		int[] R = new int[n];
		L[0] = 0;
		R[n-1] = 0;
		for(int i = 1;i<n;i++)
			L[i] = L[i-1]+a[i-1];
		for(int j = n-2;j<=0;j--)
			R[j] = R[j+1]+a[j+1];
		for(int i = 0;i<n;i++)
		{
			if(L[i] == R[i])
				System.out.print(i + " ");
		}
	}
	
	public static void disp2(int[] a , int n)
	{
		int leftsum = 0;
		int sum = 0;
		for(int i =0;i<n;i++)
			sum+=a[i];
		for(int j = 0;j<n;j++)
		{
			sum-=a[j];
			if(leftsum==sum)
				System.out.println(j + " ");
			leftsum += a[j];
		}
	}
}
