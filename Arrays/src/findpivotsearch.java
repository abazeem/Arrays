
public class findpivotsearch {

	public static void main(String args[])
	{
		int[] a={4,5,6,1,2,3};
		if(search(a,10))
			System.out.print("Number found");
		else
			System.out.print("Number not found");
	}
	
	public static int findpivot(int[] a, int l, int r)
	{
		if(l > r)
			return -1;
		if(l == r)
			return l;
		int m = (l + r)/2;
		if(m < r && a[m]>a[m+1])
			return m;
		if(m > l && a[m]<a[m-1])
			return m-1;
		if(a[l]>= a[m])
			return findpivot(a,l,m-1);
		else
			return findpivot(a,m+1,r);
	}
	
	public static boolean search(int [] a, int x)
	{
		int p = findpivot(a,0,a.length-1);
		if(a[p]==x)
			return true;
		if(a[0] <= x)
			return binarysearch(a,0,p-1,x);
		else
			return binarysearch(a,p+1,a.length-1,x);
	}
	
	public static boolean binarysearch(int [] a, int l , int r, int x)
	{
		if(l>r)
			return false;
		int m = (l+r)/2;
		if(a[m]==x)
			return true;
		if(x>a[m])
			return binarysearch(a,m+1,r,x);
		else
			return binarysearch(a,l,m-1,x);
	}
}