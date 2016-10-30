import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

public class reverselevelordertraversal {
	public void reverse(Nodes N ){
		
		Queue<Nodes> q = new LinkedList<Nodes>();
		Stack<Nodes> S= new Stack<Nodes>();
		Nodes root = N;
		q.add(N);
		
		while(!q.isEmpty()){
			root = q.peek() ;
			
			if(root==null){q.poll();}
			
			
			if(root.right!=null)
			q.add(root.right);
			if(root.left!=null)
				q.add(root.left) ;
			//Nodes m = q.poll() ;
			
			S.add(q.poll()) ;

			
			
		}
		
		while(!S.isEmpty()){System.out.print(" "+S.pop().data);}
		
	}

	
	public static void main(String[] args) {
		
		Nodes n =new Nodes(1);
		n.left=new Nodes(2) ;
		n.left.left=new Nodes(4);
		n.left.right = new Nodes(5);
		n.left.right.right = new Nodes(90);
		n.right=new Nodes(3);
		n.right.left=new Nodes(6);
		n.right.right = new Nodes(7);
		n.right.right.left = new Nodes(8);
		n.right.right.right = new Nodes(800);
		n.right.right.left.left = new Nodes(900);
		reverselevelordertraversal as = new reverselevelordertraversal();
		as.reverse(n);
	}
	
}
