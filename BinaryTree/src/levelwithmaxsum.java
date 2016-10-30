import java.util.LinkedList;
import java.util.Queue;

class aNode{
	 int data;
	 aNode left ;
	 aNode right ;
	 aNode(int x){
		 data=x;
		 left=null;
		 right=null;
	 }
	
}
public class levelwithmaxsum {

	public void findmaxlevel(aNode n){
		aNode ti = n;
		Queue<aNode> qi = new LinkedList<aNode>() ;
		qi.add(ti);
		qi.add(null) ;
		int sum = ti.data ;
		int maxsum=0;
		int level=0;
		int i=0;
		while(!qi.isEmpty()){
			//System.out.println("Gopalan");
		aNode t = qi.poll();
	//	System.out.println(t.data);
	
		 if(t==null){
			 if(!qi.isEmpty()){
		     qi.add(null);	}
		      i++ ;
		       if(maxsum<sum){maxsum=sum;
		       level = i; 
		       sum=0;
		       }
		 }
		 
		 else{ //System.out.println("hi"+t.data);
			sum=sum+t.data ;
			 if(t.left!=null ){qi.add(t.left);}
			 if(t.right!=null){qi.add(t.right);}
		 }
	
		// qi.poll();
		 }
		System.out.println("level"+level);
	}
	
	public static void main(String args[]){
		
		aNode n =new aNode(10);
		n.left=new aNode(-2) ;
		n.left.left=new aNode(4);
		n.left.right = new aNode(-5);
		n.right=new aNode(-3);
		n.right.left=new aNode(6);
	//	n.right.right = new aNode(7);
		System.out.println(n.data);
		levelwithmaxsum l =  new levelwithmaxsum();
		
		l.findmaxlevel(n);
	}
}
