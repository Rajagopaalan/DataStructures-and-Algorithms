import java.util.ArrayList;

public class findallancestors {
	public  boolean  print(bNode n,int x){
		
		if(n==null){return  false; }
		//if(n.right.data == x || n.left.data == x ||( print(n.right,x) || print(n.left,x))){
		if(n.data == x ||( print(n.right,x) || print(n.left,x))){
			if(n.data!=x){
			System.out.println(n.data);}
			return true;
			}
		return false;
	}
		
	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		n.left.right.left=new bNode(50) ;
		findallancestors fa = new findallancestors();
	boolean t=	fa.print(n,6);
	//	n.right.right.left=new bNode(9) ;
	  //  n.left.left.right=new bNode(8) ;
	  //  ArrayList<Integer> printancestors = getpath(n,3);
	//    for(int x=0;x<printancestors.size();x++){System.out.print(" "+printancestors.get(x));}
	}

}
