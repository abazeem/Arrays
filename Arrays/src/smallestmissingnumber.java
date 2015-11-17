
public class smallestmissingnumber {

	public static void main(String args[])
	{
		int[]a = {0,1,2,3,6,7,8};
		System.out.println(missingnumber(a,0,a.length-1));
	}
	
	public static int missingnumber(int[]a , int l, int r )
	{
		if(l>r)
			return r+1;
		if(l!=a[l])
			return l;
		int mid = (l+r)/2;
		if(a[mid] > mid)
			return missingnumber(a,l,mid);
		else
			return missingnumber(a,mid+1,r);
	}
}
