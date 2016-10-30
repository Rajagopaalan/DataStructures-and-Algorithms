
public class ArraytoBSt {

	public ArraytoBSt() {
		// TODO Auto-generated constructor stub
	}
	public static Bstlink createTree(int a[],int left,int right){
		
		if(left > right){return null;}
		int mid = (left + right)/2;
		
		Bstlink node = new Bstlink(a[mid]);	
		node.left = createTree(a,left,mid-1);
		node.right = createTree(a,mid+1,right);
		return node;}
	
	static void print(Bstlink tree){
		if(tree==null){return;}
		System.out.print(" "+tree.data);
		print(tree.left);

		print(tree.right);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(10) ;
		bst.left.left = new Bstlink(2);
	    bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
	 bst.right.right  =new Bstlink(11);
		 bst.right.right.right  =new Bstlink(101);
       int arr[]={1, 2, 3, 4, 5, 6, 7} ;
      Bstlink tree= createTree(arr,0,arr.length -1);
      print(tree);
	}

}
