import java.util.ArrayList;

class bNode{
	 int data;
	 bNode left ;
	 bNode right ;
	 bNode(int x){
		 data=x;
		 left=null;
		 right=null;
	 }
	
}
public class printallpaths {

	public static void  printlevels(bNode a,ArrayList b){
		
		
		if(a==null){
			
			return;}
		if(a.left!=null)
		{b.add(a.left.data);}
		printlevels(a.left,b);
	
		//printlevels(a.right);
		if(a.right!=null){
			b.add(a.right.data);}
		printlevels(a.right,b);
		
		if(a.right==null && a.left==null){
		printpaths(b);
		}
	
		if(b.size()>0){
			b.remove(b.size()-1);}
		
	}
	public static void printpaths(ArrayList c){
		System.out.println("");
		for(int x=0;x<c.size();x++)
		{System.out.print(c.get(x)+"-");}
	}
	public static void main(String args[]){
		
		bNode n =new bNode(1);
		n.left=new bNode(2) ;
		n.right=new bNode(3) ;
		n.left.right=new bNode(20) ;
	/*	n.left.left=new bNode(4);
		n.left.left.right=new bNode(40);
		n.left.right = new bNode(5);
		n.left.right.left = new bNode(50);
		n.left.right.left.right = new bNode(500);
		n.right=new bNode(3);
		n.right.left=new bNode(6);
		n.right.left.right=new bNode(60);
		n.right.left.left=new bNode(61);
		n.right.right = new bNode(7);
		n.right.right.left = new bNode(71);*/
		
		System.out.println(n.data);
		ArrayList<Integer>  a = new ArrayList<Integer>();
		a.add(n.data);
		printlevels(n,a) ;
		
	}
}
