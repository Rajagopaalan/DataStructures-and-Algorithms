import java.util.Stack;

class Nodes{
	Nodes right=null;
	Nodes left=null; 
	int data;
	Nodes(int d){
		data=d;
	}
}
public class inorderstack {

	public static  void preorder(Nodes m){
		Stack<Nodes> st= new Stack<Nodes>();
		
		while(true){
		while(m!=null){
			
			
			System.out.print(" "+m.data);
		     st.push(m) ;
		     m=m.left;
		    }
		     
		     

		 if(st.isEmpty()){break;}
		m=st.pop().right;
	}
		
		
	}
	public static  void inorder(Nodes m){
		Stack<Nodes> st= new Stack<Nodes>();
		
		while(true){
		while(m!=null){
			
			
		
		     st.push(m) ;
		     m=m.left;
		    }
		     
		 if(st.isEmpty()){break;}
		
	
	  
	     m=st.pop();
	     System.out.print(" "+ m.data) ;
	
	 
	     m=m.right;
	     
	}}
	
	public static  void postorder(Nodes m){
Stack<Nodes> n = new Stack<Nodes>();

while(true){
	while(m!=null){
		n.push(m);
		m=m.left ;
	}
	if(n.isEmpty()){break;}
	
	m=n.peek();
	
	
	if(m.right!=null){m=m.right;}
	else{
   System.out.print(" "+m.data);
  }
	
}

	}
	
	
	public static void main(String args[]){
		Nodes n =new Nodes(1);
		n.left=new Nodes(2) ;
		n.left.left=new Nodes(4);
		n.left.right = new Nodes(5);
		n.right=new Nodes(3);
		n.right.left=new Nodes(6);
		n.right.right = new Nodes(7);
		//n.left.left.right=new Nodes(10);
		//n.left.left.left=new Nodes(11);
		//preorder(n);
		inorder(n);
	//	postorder(n);
	}
	
}
