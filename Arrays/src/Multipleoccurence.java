public class Multipleoccurence {
	public static void main(String args[])
	{
		int[] a ={5,4,5,4,5,3,1,3,3};
		calc(a);
	}
	public static void calc(int[] a)
	{
		int count = 0;
		for(int i =0;i<a.length-1;)
		{
			count = 0;
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					int temp = a[j];
					a[j]= a[i+1+count];
					a[i+1+count]= temp;
					count++;
				}			
			}
			i=i+count+1;
		}
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	
}
