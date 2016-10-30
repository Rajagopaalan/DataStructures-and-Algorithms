import java.util.LinkedList;
import java.util.Queue;

public class nooflevelslevelordertraversal {
	
	
	public void findnooflevels(aNode n){
		
		Queue<aNode> qi = new LinkedList<aNode>();
		qi.add(n) ;
		qi.add(null);
		int level = 0; 
		while(!qi.isEmpty()){
			 
			aNode t = qi.poll() ;
			if(t==null){
				if(!qi.isEmpty()){qi.add(null);}
				level++;
			}
			else{
				if(t.left!=null){qi.add(t.left);}
				if(t.right!=null){qi.add(t.right);}
			}
			}
		System.out.println("no of levels"+level);
	}
	
	
	
	
	
	public static void main(String args[]){
		
		aNode n =new aNode(10);
	//	n.left=new aNode(-2) ;
		//n.left.left=new aNode(4);
		//n.left.right = new aNode(-5);
	//	n.right=new aNode(-3);
	//	n.right.left=new aNode(6);
	//	n.right.right = new aNode(7);
	//	System.out.println(n.data);
		 nooflevelslevelordertraversal l =  new  nooflevelslevelordertraversal();
		
		l.findnooflevels(n);
	}

}
