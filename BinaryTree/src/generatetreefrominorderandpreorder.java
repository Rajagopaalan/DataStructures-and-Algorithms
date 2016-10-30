import java.util.ArrayList;

class cNode{
	String data;
	 cNode left ;
	 cNode right ;
	 cNode(String x){
		 data=x;
		 left=null;
		 right=null;
	 }
	
}

public class generatetreefrominorderandpreorder {
	static  int  preorderindex=0;	
	public static int returnpos(String x,ArrayList<String> inorder){
		for(int y=0;y<inorder.size();y++ ){
			if(inorder.get(y).equals(x)){return y;}
		}
		return -1;}
	
	public cNode constructtree(ArrayList<String> inorder,ArrayList<String> preorder,int start,int end){
		

		if(start > end){return null;}
		System.out.println(preorderindex);
	
	cNode n = new cNode(preorder.get(preorderindex));
	if(start==end){return n;}
	if(preorderindex<preorder.size()-1){
		preorderindex++;}
		int inorderindex=returnpos(n.data,inorder);
		if(inorderindex>0){
		n.left=constructtree(preorder,inorder,start,inorderindex-1);
		n.right=constructtree(preorder,inorder,inorderindex+1,end);}
		else{return null;}
		return n;
	}
	public static void inorder(cNode n){
		if(n==null){
			return ;
		}
		inorder(n.left) ;
		System.out.print(n.data+" ");
		inorder(n.right );
	
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> inorder = new ArrayList<String>();
		ArrayList<String> preorder = new ArrayList<String>() ;
		/*Inorder sequence: D B E A F C
Preorder sequence: A B D E C F*/
		inorder.add("D");
		inorder.add("B");
		inorder.add("E");
		inorder.add("A");
		inorder.add("F");
		inorder.add("C");
		
		preorder.add("A");
		preorder.add("B");
		preorder.add("D");
		preorder.add("E");
		preorder.add("C");
		preorder.add("F");
		generatetreefrominorderandpreorder g = new generatetreefrominorderandpreorder ();
		cNode n=g.constructtree(inorder,preorder, 0,inorder.size()-1);
		inorder(n);
		
		
	}

}
