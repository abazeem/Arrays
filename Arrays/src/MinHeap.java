
public class MinHeap {


	int capacity;
	int heapsize ;
	int[] a;
	
	public MinHeap()
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
		while(i!= 0 && a[parent(i)]>a[i])
		{
			int temp = a[parent(i)];
			a[parent(i)] = a[i];
			a[i] = temp;
			i = parent(i);
		}
	}
	
	public void minheapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int min = i;
		if(l<heapsize && a[l]<a[i])
			min = l;
		if(r<heapsize && a[r]<a[min])
			min = r;
		if(min!=i)
		{
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			minheapify(min);
		}
	}
	
	public int extracttop()
	{
		int x = a[0];
		int temp = a[0];
		a[0] = a[heapsize - 1];
		a[heapsize - 1] = temp;
		heapsize--;
		minheapify(0);
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
