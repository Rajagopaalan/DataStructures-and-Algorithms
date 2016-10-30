
public class findsumofallnodes {
	
	static int sum=0;
	public static int  sum(bNode n){
		 if(n==null){return 0;
		 }
		
		 sum(n.left);
		 sum(n.right);
		 sum=sum+n.data;return sum;
	}
	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
		n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		n.right.right.left=new bNode(7) ;
		n.right.right.left.right=new bNode(70) ;
		int a=sum(n);
		System.out.println(a);
	}

}
