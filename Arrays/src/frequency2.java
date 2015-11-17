public class frequency2 {

	public static void main(String args[])
	{
		int[] a = {1,2,3,4,1};
		calc(a);
 	}
	
	public static void calc(int[] a)
	{
		NodeBST root = new NodeBST(a[0]);
		for(int i = 1;i<a.length;i++)
		{
			root = insert(root,a[i],i);
		}
		disp(root);
	}
	
	public static void disp(NodeBST x)
	{
		if( x == null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static NodeBST insert(NodeBST x, int v, int index)
	{
		if(x == null)
		{
			x = new NodeBST(v);
			x.index = index;
			return x;
		}
		if(x.val < v)
			x.right = insert(x.right,v,index);
		else if(x.val > v)
			x.left = insert(x.left,v,index);
		else if(x.val == v)
		{
			x.count++;
			return x;
		}
		return x;
	}
}
