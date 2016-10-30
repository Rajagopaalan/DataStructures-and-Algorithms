
public class checkrecursivelyifmirror {
	public static boolean checkifmirror(bNode a,bNode b){
		
	if(a==null && b==null){return true;}
	if(a==null || b==null){return false;}
	boolean x=(a.data == b.data && checkifmirror(a.left,b.right) &&  checkifmirror(a.right,b.left) );
		 return x;
	}
	
	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		
		bNode m =new bNode(1);
		m.left=new bNode(3) ; 
		m.right=new bNode(2) ;
	    m.left.left=new bNode(7) ;
		m.left.right=new bNode(6) ;
		m.right.left=new bNode(5) ;
		m.right.right=new bNode(4) ;
		boolean check = checkifmirror(n,m) ;
		if(check == true){System.out.println("perfect mirror");}
		else{System.out.println("Not a  mirror");}
	    
		
	}

}
