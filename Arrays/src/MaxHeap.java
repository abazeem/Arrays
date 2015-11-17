public class MaxHeap {
	
	int capacity;
	int heapsize ;
	int[] a;
	
	public MaxHeap()
	{
		capacity = 20;
		a= new int[capacity];
		heapsize = 0;
	}
	
	public void insert(int x)
	{
		heapsize++;
		int i = heapsize -1;
		a[i] = x;
		while(i!= 0 && a[parent(i)]<a[i])
		{
			int temp = a[parent(i)];
			a[parent(i)] = a[i];
			a[i] = temp;
			i = parent(i);
		}
	}
	
	public void maxheapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int max = i;
		if(l<heapsize && a[l]>a[i])
			max = l;
		if(r<heapsize && a[r] > a[max])
			max = r;
		if(max!=i)
		{
			int temp = a[max];
			a[max] = a[i];
			a[i] = temp;
			maxheapify(max);
		}
	}
	
	public int extracttop()
	{
		int x = a[0];
		int temp = a[0];
		a[0] = a[heapsize - 1];
		a[heapsize - 1] = temp;
		heapsize--;
		maxheapify(0);
		return x;
	}
	
	public int parent(int i)
	{
		return (i-1)/2;
	}
	public int left(int i)
	{
		return 2*i+1;
	}
	public int right(int i)
	{
		return 2*i+2;
	}
	
	public int gettop()
	{
		return a[0];
	}
	
}
