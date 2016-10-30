import java.util.ArrayList;

public class checkexistanceofpathwithsumoptimalapproach {
	
	public static void checkpath(bNode n,int s){
		if(n==null){return;}
		
		
		s=s-n.data;
		System.out.println("subtACTING"+n.data);
		checkpath(n.left,s);
		checkpath(n.right,s);
	
	/*	if(n.left!=null){
			s=s-n.data;
			System.out.println("subtACTING"+n.data);
			checkpath(n.left,s);}
		if(n.right!=null){
			s=s-n.data;
			checkpath(n.right,s);}
		*/
		if(n.left==null && n.right==null)
		{if(s==0){System.out.println("exist");}
		s=s+n.data;
		System.out.println("addinG"+n.data);
		}
		//System.out.println("s value"+s);
		
	}
	
	public static void main(String[] args) {
		
		
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
		n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		//ArrayList<Integer> a = new ArrayList<Integer>();
		//a.add(n.data);
		int s=10 ;
		checkpath(n,s);
	}


}
