import java.util.Stack;

public class Zigzagtraversal {
	static int count=-1;
	public void zigzagtravversal(bNode root,Stack<bNode> a,Stack<bNode> b){
	
		while(!b.isEmpty()){
	//	while(a!=b){
		
			count++;
			//System.out.println("govinda");
		if(count%2==0){
		
			while(!b.isEmpty()){
				bNode pop = b.pop() ;
				if(pop!=null){
			//	System.out.println(pop.data);
				a.push(pop);}
				//a.push(pop);
				
			}
			while(!a.isEmpty()){
				bNode pop =a.pop() ;
				if(pop!=null){
				System.out.println(pop.data);
				
			b.push(pop.left);
			b.push(pop.right);}
				
			}
			
			 
		}
		else{			
			while(!b.isEmpty()){
				bNode pop = b.pop() ;
				if(pop!=null){
				System.out.println(pop.data);
				a.push(pop);}
				//a.push(pop);
				
			}
			while(!a.isEmpty()){
				bNode pop =a.pop() ;
		//	System.out.println(pop.data);
				if(pop!=null){
			b.push(pop.left);
			b.push(pop.right);}
				
			}
		}
	
		}
		
		
	}

	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		   n.left.left.left=new bNode(40) ;
		   n.left.left.left.right=new bNode(400) ;
		n.right.right.right=new bNode(70) ;
		n.right.right.right.left=new bNode(700) ;
		n.right.right.right.left.right=new bNode(7000) ;
		 n.left.left.left.right.left=new bNode(4000) ;
		 n.right.right.right.left.right.right=new bNode(70000) ;
		 n.left.left.left.right.left.right=new bNode(40000) ;
		Stack<bNode> a = new Stack<bNode>();
		Stack<bNode> b = new Stack<bNode>();
		b.add(n);
		Zigzagtraversal  at = new Zigzagtraversal ();
		at.zigzagtravversal(n, a, b);
		
	}
}
