import java.util.ArrayList;

public class checkexistanceofpathwithgivensum {
	
	public static  void checkpath(bNode n,ArrayList b,int x){
		int xs = x;
		if(n==null){return ;}
		if(n.left!=null){b.add(n.left.data);}
		checkpath(n.left,b,xs);
		
		if(n.right!=null){b.add(n.right.data);}
		checkpath(n.right,b,xs);
		
		if(n.left==null && n.right==null){
			int sum=checkadd(b);
			if(sum==xs){System.out.println("exists");}
		}
		
		if(b.size()>0){
			b.remove(b.size()-1);
		}
		
	}
	public static int checkadd(ArrayList x){
		int sum=0;
		for(int y=0;y<x.size();y++){
			sum = sum + (int)x.get(y);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
		n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(n.data);
		int s=7 ;
		checkpath(n,a,s);
	}

}
