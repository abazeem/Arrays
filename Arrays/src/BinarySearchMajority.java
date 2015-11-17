public class BinarySearchMajority {

	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 3, 3, 3, 10};
		if(ismajority(arr,10))
			System.out.println("Majority found");
		else
			System.out.println("Majority not found");
	}
	
	public static boolean ismajority(int[] a, int x)
	{
		int i = binarysearch(a,0,a.length-1,x);
		int n = a.length;
		if((i+n/2 <=n-1) && (a[i+n/2]==x))
			return true;
		else
			return false;
				
	}
	
	public static int binarysearch(int[] a , int l, int r, int x)
	{
		if(l<=r)
		{
			int mid = (l+r)/2;
			if((mid==0||x>a[mid-1]&& a[mid]==x))
				return mid;
			else
			{
				if(a[mid]>x)
					return binarysearch(a,l,mid-1,x);
				else
					return binarysearch(a,mid+1,r,x);
			}
		}
		return -1;
	}
}
