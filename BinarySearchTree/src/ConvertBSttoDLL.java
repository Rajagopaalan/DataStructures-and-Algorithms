
public class ConvertBSttoDLL {

	public ConvertBSttoDLL() {
		// TODO Auto-generated constructor stub
	}
	
public static void Nodeconvert(Bstlink bt){
	
	Bstlink node = convertDLL(bt);
	System.out.println(node.data);
	while(node.left!=null){node=node.left;}

	
	
	while(node.right!=null){System.out.print(node.data+"->");node=node.right;}
	System.out.println("");
	while(node.left!=null){node=node.left;System.out.print(node.data+"->");}
	
}

public static Bstlink convertDLL(Bstlink bst){
	
	if(bst==null){return bst;}
//	Bstlink left = convertDLL(bst.left);

	if(bst.left!=null){
		
		Bstlink left = convertDLL(bst.left); 
		while(left.right!=null){left = left.right ;}
		left.right =bst;
		bst.left =left ;
		
	}
	if(bst.right!=null){
		
		Bstlink right = convertDLL(bst.right); 
		while(right.left!=null){right =right.left ;}
		right.left =bst;
		bst.right=right ;
		
	}
	
	return  bst;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bstlink bst = new Bstlink(8);
		 bst.left =new Bstlink(4) ;
		 bst.left.left =new Bstlink(2) ;
		 bst.left.right =new Bstlink(6) ;
		 bst.left.right.right =new Bstlink(7) ;
		 bst.left.right.left =new Bstlink(5) ;
		 bst.left.left.right =new Bstlink(3) ;
		 bst.left.left.left =new Bstlink(1) ;
	   bst.right = new Bstlink(11) ;
	   bst.right.left = new Bstlink(10) ;
	   bst.right.right = new Bstlink(12) ;
	   bst.right.right.right = new Bstlink(14) ;
	   bst.right.right.right.left = new Bstlink(13) ;
	   bst.right.right.right.right = new Bstlink(16) ;
	   Nodeconvert(bst);
	}

}
