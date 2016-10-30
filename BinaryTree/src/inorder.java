 class Node{
	 int data;
	 Node left ;
	 Node right ;
	 Node(int x){
		 data=x;
		 left=null;
		 right=null;
	 }
	
}
public class inorder {
	public static void inorder(Node m){
		if(m==null){
			return ;
		}
		inorder(m.left) ;
		System.out.print(m.data+" ");
		inorder(m.right );
	
	}
	
	
	public static void preorder(Node m){
		
		if(m==null){
			return ;
		}
		System.out.print(m.data+" ");
		preorder(m.left) ;
		
		preorder(m.right );
	}
	
	
	public static void postorder(Node m){
		//  bb
		if(m==null){
			return ;
		}

		postorder(m.left) ;
		
		
		postorder(m.right );
		System.out.print(m.data+" ");
	}
	public static void main(String args[]){
		
		Node n =new Node(1);
		n.left=new Node(2) ;
		n.left.left=new Node(4);
		n.left.right = new Node(5);
		n.right=new Node(3);
		n.right.left=new Node(6);
		n.right.right = new Node(7);
//		n.left.left.right = new Node(10);
		inorder(n);
		System.out.println(" ");
		preorder(n);
		System.out.println(" ");
		postorder(n);
	}
	 

}
