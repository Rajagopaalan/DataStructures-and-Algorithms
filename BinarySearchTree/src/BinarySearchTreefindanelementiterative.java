
public class BinarySearchTreefindanelementiterative {

	public static Bstlink returnnode(Bstlink n,int x){
		Bstlink root= n ;
		System.out.println(root.right.right.data);
		while(root!=null){
			System.out.println(root.data);
			
			if(root.data==x){
				
				return root;}
			else 	if(root==null){return null;}
			else 	if(root.data > x ){root=root.left;}
		else if(root.data < x){root=root.right;}

	
		}
			
		return root;
	}
	public static void main(String args[]){
		
		
		 Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
		 bst.right = new Bstlink(9) ;
		 bst.left.left = new Bstlink(2);
		 bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
		 bst.right.right  =new Bstlink(10);
		 Bstlink blink = returnnode(bst,101);
		 if(blink==null){System.out.println("not found");
			 }
		 else{System.out.println("Narayana"+blink.data);
			 }
	}
}
