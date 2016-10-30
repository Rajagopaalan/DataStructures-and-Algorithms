import java.util.LinkedList;
import java.util.Queue;

public class sumofallthenodeslevelordertraversal {

	public static void sumlevelordertrversal(bNode n){
		int sum=0;
		Queue<bNode> s = new LinkedList<bNode>() ;
		s.add(n);
		
		while(!s.isEmpty()){
		bNode peek = s.poll();
		if(peek.left!=null){s.add(peek.left);}
		if(peek.right!=null){s.add(peek.right);}
		sum = sum + peek.data ;
		}
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	//	n.left.left=new bNode(4) ;
	//	n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		n.right.right.left=new bNode(7) ;
	//	n.right.right.left.right=new bNode(70) ;
		
		sumlevelordertrversal(n);
	}
}
