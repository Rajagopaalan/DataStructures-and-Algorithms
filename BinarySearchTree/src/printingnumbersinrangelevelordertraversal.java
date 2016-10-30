import java.util.LinkedList;
import java.util.Queue;

public class printingnumbersinrangelevelordertraversal {

	public static void printingnumbersinrangelevelordertraversal(Bstlink bt , int k1, int k2) {
				
		// TODO Auto-generated constructor stub
		
		Queue<Bstlink> q = new LinkedList<Bstlink>();
		q.add(bt);
		while(!q.isEmpty()){
			Bstlink temp = q.peek() ;
			if(temp.data<=k2 && temp.data>=k1 ){
				
				System.out.println(temp.data);
			}
			if(temp.left!=null)
			  q.add(temp.left);
			if(temp.right!=null)
			q.add(temp.right);
			q.poll();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Bstlink bst = new Bstlink(6);
			bst.left = new Bstlink(4);
			 bst.left.left =new Bstlink(3) ;
		 bst.right = new Bstlink(9) ;
		bst.left.left.left = new Bstlink(2);
	//	 bst.left.left.right = new Bstlink(4);
			 bst.right.left  =new Bstlink(8);
		 bst.right.right  =new Bstlink(10);
		// print(bst,2,6);
		 
		 printingnumbersinrangelevelordertraversal(bst, 2, 10);

	}

}
