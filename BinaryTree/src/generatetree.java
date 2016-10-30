import java.util.ArrayList;

public class generatetree {

	static int preorderindex=0;
	public  cNode generate(ArrayList<String> inorder,ArrayList<String> preorder,int start,int end){

		if(start>end){return null;}
		
	String root=preorder.get(preorderindex);
	int inorderindex=locate(inorder, root) ;
	//if(preorderindex<preorder.size()-){
	//System.out.println(inorderindex);
	preorderindex++;//}
	cNode rootnode=new cNode(root);
	System.out.println(root);
	if(start==end){
	return rootnode;}

	
	if(inorderindex>0){
	rootnode.left=generate(inorder,preorder,start,inorderindex-1);
	rootnode.right = generate(inorder,preorder,inorderindex+1,end);}
	
	return rootnode;
	
		
		
		
		
	
		
		
	}
public int locate(ArrayList<String> inorder,String x){
	for(int y=0;y<inorder.size();y++){if(x.equals(inorder.get(y))) return y;}
	return -1;
	
}
	
public static void inorder(cNode m){
	if(m==null){
		return ;
	}
	inorder(m.left) ;
	System.out.print(m.data+" ");
	inorder(m.right );

}
public static void preorder(cNode m){
	if(m==null){
		return ;
	}
	System.out.print(m.data+" ");
	preorder(m.left) ;

	preorder(m.right );
//	System.out.print(m.data+" ");
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
		generatetree gt = new generatetree();
		cNode tree = gt.generate(inorder, preorder, 0, inorder.size()-1) ;
		inorder(tree);
		System.out.println("");
		System.out.println(tree.data+""+tree.left.data+""+tree.left.left.data);
		preorder(tree);
	}
}
