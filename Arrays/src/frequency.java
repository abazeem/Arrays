public class frequency {

	public static void main(String args[])
	{
		int[] a = {3,5,8,3,5,8,6,8};
		calc(a);
	}
	
	public static void calc(int[] a)
	{
		sort(a,0,a.length-1);
		int temp = a[0];
		int[][] arr = new int[a.length][2];
		int count = 0;
		int j = 0;
		for(int i = 0;i < a.length;i++)
		{
			if(a[i] == temp)
				count++;
			else
			{
				temp = a[i];
				arr[j][0] = a[i-1];
				arr[j][1] = count;
				j++;
				count = 1;
			}
		}
		arr[j][0] = temp;
		arr[j][1] = count;
		
	}
	
	public static void sort (int[] a,int l, int r)
	{
		if(l<=r)
		{
			int p = findpivot(a,l,r);
			sort(a,l,p-1);
			sort(a,p+1,r);
		}
	}
	
	public static int findpivot(int[] a, int l ,int r)
	{
		int x = a[r];
		int i = l-1;
		for(int j=l;j<r;j++)
		{
			if(a[j]< x)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[r];
		a[r] = a[i+1];
		a[i+1] = temp;
		return i+1;
	}
}
