public class Oddeven {

	public static void main(String args[])
	{
		int[] a = {12,5,7,34,3,2,1};
		disp(a);
	}
	
	public static void disp(int[] a)
	{
		int left = 0;
		int right = a.length-1;
		while(left<right)
		{
			while(a[left]%2==0)
				left++;
			while(a[right]%2==1)
				right--;
			if(left<right)
			{
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i] + " ");
	}
}
