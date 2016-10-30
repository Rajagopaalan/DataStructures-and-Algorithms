import java.util.LinkedList;
import java.util.Queue;

class Tnode1{
	int data;
	Tnode1 left;
	Tnode1 right ;
	Tnode1(int d){
		 d=data;
	}
	
	
	
}
public class Findmaxlevelordertraversal {
	
	public void findmax(Tnode t){
		int datamax ;
		Tnode root =t ;
		Queue<Tnode> q= new LinkedList<Tnode>();
		q.add(root) ;
		datamax=t.data;
		while(!q.isEmpty()){
			Tnode  n = q.peek();
			if(n.left!=null){q.add(n.left);
			if(n.left.data>datamax){datamax=n.left.data;}}
			
			if(n.right!=null){q.add(n.right);
			if(n.right.data>datamax){datamax=n.right.data;
			}}
			q.poll();
			
			
			
			}
			System.out.print("hel"+datamax);	
		
		
		
	}

	
	public static void main(String args[]){
		Findmaxlevelordertraversal n =new Findmaxlevelordertraversal();
		Tnode t = new Tnode(1);
		t.left = new Tnode(20090);
		t.right = new Tnode(9930);
		t.left.left = new Tnode(4);
		t.left.right = new Tnode(5);
		t.right.left = new Tnode(96);
		t.right.right = new Tnode(712);
		n.findmax(t);
	}
}
