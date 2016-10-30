
public class mirrorbinarytree {
	
	public static void convertmirror(bNode n){
		
		if(n==null){return; }
		
		convertmirror( n.left)  ;
		convertmirror( n.right) ;
		if(n.left!=null || n.right !=null){bNode temp=n.left;
		n.left=n.right;
		n.right = temp;  
		
		}
		
	}
	public static void print(bNode n){
		if(n==null){return; }
		
		print(n.left);
		print( n.right) ;
		System.out.print(n.data);
		
	}

	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		n.right.right.left=new bNode(9) ;
	    n.left.left.right=new bNode(8) ;
		print(n);
		convertmirror(n);
		System.out.println("");
		print(n);
	}
}
