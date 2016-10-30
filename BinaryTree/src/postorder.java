import java.util.Stack;

class Nodelink{
	int data;
	Nodelink left;
	Nodelink right;
	Nodelink(int x){
		data=x;
		left=null;
		right=null;
		
	}
	public void postorder(Nodelink a){
	 Nodelink prev= null ;
	// Nodelink current = a;
	 Stack<Nodelink> S = new Stack<Nodelink>() ;
	 S.push(a) ;
	 Nodelink previous=null ;
			 
	while(!S.isEmpty()){
		
		Nodelink current=S.peek() ;
	
		if(previous ==null || previous.left==current || previous.right ==current){
			if(current.left!=null){
				S.push(current.left);
			}
			else if(current.right!=null){
				S.push(current.right);
			}
			else{
				Nodelink te=S.pop();
				System.out.println(te.data);
			}
		}
		else if(current.left==previous){
			if(current.right!=null){
				S.push(current.right);
			}
			else{
			Nodelink tmp=	S.pop();
			System.out.println(tmp.data);
			}
		}
		else if(current.right==previous){
			Nodelink tp=S.pop();
			System.out.println(tp.data);
			
		}
		previous=current;
	}
	
}
	
	
}
public class postorder {

	public static void main(String args[]){
		Nodelink n=new Nodelink(1);
		n.left= new Nodelink(2);
		n.right=new Nodelink(3);
		n.left.left = new Nodelink(4);
		n.left.right= new Nodelink(5);
		n.right.left = new Nodelink(6);
		n.right.right = new Nodelink(7);
		
		n.postorder(n);
			
	}
	
	
}
