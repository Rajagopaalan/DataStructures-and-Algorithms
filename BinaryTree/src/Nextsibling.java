import java.util.LinkedList;
import java.util.Queue;

class Nlink{
	int data;
	Nlink left;
	Nlink right;
	Nlink nextsibling ;
	Nlink(int x){
		data=x;
		left=null;
		right=null;
		nextsibling = null ;
	}
	public Nlink returnnextsibling(int x){
		return nextsibling;}
}

public class Nextsibling {
public static void nextsibling(Nlink a, int x){

	Queue<Nlink> q = new LinkedList<Nlink>();
	q.add(a);
 q.add(null);
	while(!q.isEmpty()){
		Nlink temp  = q.poll();
		if(temp==null){q.add(null);}
		if(temp!=null){
		if(temp.left!=null){q.add(temp.left);}
		if(temp.right!=null){q.add(temp.right);}
		Nlink t = q.peek();
		temp.nextsibling = t;
		if( temp.nextsibling!=null)
		{System.out.println(temp.data +"-" +temp.nextsibling.data);}
	else {System.out.println(temp.data +"-" +"null");}}
	}
}
	
	public static  void main(String[] args) {
		Nlink n =new Nlink(1);
		n.left=new Nlink(2) ; 
		n.right=new Nlink(3) ;
	    n.left.left=new Nlink(4) ;
		//n.left.right=new Nlink(5) ;
		n.right.left=new Nlink(6) ;
		//n.right.right=new Nlink(7) ;
		nextsibling(n,5);
	}
}
