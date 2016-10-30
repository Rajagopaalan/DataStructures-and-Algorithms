
public class LCAofbinarytree {
	
	public static bNode findlca(bNode n,int x,int y){
		
		if(n==null){return null;}
		
		if(n.data==x || n.data==y){return n;}
	
		n.left=findlca(n.left,x,y);
		n.right=findlca(n.right,x,y);
		if(n.left!=null && n.right!=null){return n;}
		else {if(n.left!=null){return n.left;}else{return n.right;}}
		
	}

	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		bNode m=findlca(n,7,3 );
		if(m!=null){
		System.out.println(m.data);}
	}
}
