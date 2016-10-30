
public class Nextsiblingusingrecursion {
	public static void nextsibling(Nlink a){
		
		if(a==null){return;}
		//a.left.nextsibling = a.right ;
		if(a.left!=null){
			if(a.right!=null)
			{	a.left.nextsibling = a.right;System.out.println(a.left.data+"-"+a.right.data);}}
	//	else{	a.left.nextsibling =null;System.out.println(a.left.data+"-null");}
		if(a.right!=null){
		if(a.nextsibling!=null){a.right.nextsibling=a.nextsibling.left ;System.out.println(a.right.data+"-"+a.nextsibling.left.data);}
		else{a.right.nextsibling = null ;System.out.println(a.right.data+"-"+null);}
		//a.right.nextsibling =(a.nextsibling) ?  : null ;}
		}
		nextsibling(a.left) ;
		nextsibling(a.right) ;
	}
	
	
	public static void main(String[] args) {
		Nlink n =new Nlink(1);
		n.left=new Nlink(2) ; 
		n.right=new Nlink(3) ;
	    n.left.left=new Nlink(4) ;
		n.left.right=new Nlink(5) ;
		//n.right.left=new Nlink(6) ;
		n.right.right=new Nlink(7) ;
		nextsibling(n);
	}
}
