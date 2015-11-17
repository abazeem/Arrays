
public class mergemedian {

	public static void main(String args[])
	{
		int[]	ar1 = {1,2,3,4};
		int[]   ar2 = {5,6,7,8};
		System.out.print(getmedian(ar1,ar2,0,0,5));
		 
	}
	
	public static int median(int [] a, int l, int n)
	{
		
		if(n%2==0)
			return (a[l + n/2]+ a[l + n/2-1])/2;
		else
			return a[l + n/2];
	}
	
	public static int getmedian(int[] a, int [] b, int l, int r, int n)
	{
		int m1 = median(a,l,n);
		int m2 = median(b,r,n);
		if(n==0)
			return -1;
		if(n==1)
			return (a[l]+b[r])/2;
		if(n==2)
			return (Math.max(a[l],b[r]) + Math.min(a[l+1], b[r+1]))/2;
		if(m1<m2)
		{
			if(n%2==0)
				return getmedian(a,b,n/2,r,n/2);
			else
				return getmedian(a,b,n/2,r,n/2+1);
		}
		else 
		{
			if(n%2==0)
				return getmedian(a,b,l,n/2,n/2);
			else
				return getmedian(a,b,l,n/2,n/2+1);
		}
	}
}
