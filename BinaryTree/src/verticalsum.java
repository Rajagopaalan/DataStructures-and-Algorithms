import java.util.HashMap;

public class verticalsum {
	
	static HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	
	public static  void  verticalsum(bNode m,int c){
		
	
		if(m==null){return ;}
		verticalsum(m.left,c-1);
		if(hmap.get(c)==null){
		//	System.out.println(hmap.get(c));
			hmap.put(c, m.data);}
		else{
		//	System.out.println(hmap.get(c));
			int temp= hmap.get(c)+m.data;
		//	System.out.println(hmap.get(c)+" "+temp+" "+m.data);
			hmap.put(c,temp);
			
		//hmap.get(c-). hmap.get(c-1)+m.data ;
		}
		
		verticalsum(m.right,c+1);
		
		
	}
	
public static void print(){
	System.out.println(hmap);
}
	
	public static void main(String[] args) {
		bNode n =new bNode(1);
		n.left=new bNode(2) ; 
		n.right=new bNode(3) ;
	    n.left.left=new bNode(4) ;
		n.left.right=new bNode(5) ;
		n.right.left=new bNode(6) ;
		n.right.right=new bNode(7) ;
		int c=0;
		verticalsum(n,c);
		print();
	}




	
}
