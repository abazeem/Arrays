public class InversionMerge {

	public static void main(String args[])
	{
		int[] a = {4,1,5,3};
		System.out.println(mergecount(a,a,0,a.length-1));
	}
	
	public static int mergecount(int[] a,int[] temp, int l , int r)
	{
		int count = 0;
		int mid;
		if(r>l)
		{
			mid = (l + r)/2;
			count = mergecount(a,temp,l,mid);
			count += mergecount(a,temp,mid+1,r);
			count = merge(a,temp,l,mid+1,r);
		}
		return count;
	}
	
	public static int merge(int[] a,int[] temp, int l,int mid, int r)
	{
		int i = l;
		int k = l;
		int j = mid;
		int count = 0;
		while(i <= mid-1 && j <= r)
		{
			if(a[i]<=a[j])
				temp[k++] = a[i++];
			else
			{
				temp[k++] = a[j++];
				count += mid-i;
			}
		}
		while(i<= mid-1)
			temp[k++] = a[i++];
		while(j<=r)
			temp[k++] = a[j++];
		for(i=l;i<=r;i++)
			a[i] = temp[i];
		return count;
	}
}
