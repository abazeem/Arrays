public class MedianHeap {

	public static void main(String args[])
	{
		int[] a = {0,1,2,3,4,5,6,7};
		printmedian(a);
	}
	
	public static void printmedian(int[] a)
	{
		int m = 0;
		MaxHeap left = new MaxHeap();
		MinHeap right = new MinHeap();
		for(int i = 0;i<a.length;i++)
		{
			int x = m;
			m = getmedian(a[i],x, left, right);
			System.out.print(m + " ");
		}
	}
	
	public static int getmedian(int e, int m, MaxHeap left, MinHeap right)
	{
		int var = sigma(left.heapsize,right.heapsize);
		switch(var)
		{
		case -1 :
			if(e<m)
			{
				right.insert(left.extracttop());
				left.insert(e);
			}
			else
			{
				right.insert(e);
			}
			m = (left.gettop() + right.gettop())/2;
			break;
				
		case  0 :
			if(e<m)
			{
				left.insert(e);
				m = left.gettop();
			}
			else
			{
				right.insert(e);
				m = right.gettop();
			}
			break;
		case  1 :
			if(e<m)
			{
				left.insert(e);
			}
			else
			{
				left.insert(right.extracttop());
				right.insert(e);
			}
			m = (left.gettop() + right.gettop())/2;
			break;
			
			
		}
		return m;
	}
	
	public static int sigma(int a , int b)
	{
		if(a==b)
			return 0;
		else
		{
			if(a>b)
				return -1;
			else 
				return 1;
		}
	}
	
}
