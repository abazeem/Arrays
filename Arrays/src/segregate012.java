public class segregate012 {

	public static void main(String args[])
	{
		int[] a = {0,1,2,1,1,2};
		disp(a);
	}
	
	public static void disp(int[] a)
	{
		int n = a.length;
		int l = 0;
		int mid = 0;
		int r = n-1;
		while(mid<=r)
		{
			switch(a[mid])
			{
				case 0 : 
					int temp1 = a[l];
					a[l] = a[mid];
					a[mid] = temp1;
					l++;
					mid++;
					break;
				case 1 :
					mid++;
					break;
				case 2 : 
					int temp2 = a[r];
					a[r] = a[mid];
					a[mid] = temp2;
					r--;					
					break;
			}
		}
		
		for(int i =0;i<a.length;i++)
			System.out.print(a[i] + " ");
				
	}
}
