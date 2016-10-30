import java.util.ArrayList;

public class contructtreewithpreorderwithspecialpropertuy {
static	int count=-1;
	public static cNode generatetree(ArrayList<String> p){
		   count++;
		   if(count>p.size()){return null;}
	   if(p.get(count).equals("L")){
		   cNode newb = new cNode("L");
		   return newb;}
	   
	   if(p.get(count).equals("I")){
		   cNode newb = new cNode("I");
		  // count++;
		  newb.left= generatetree(p) ;
		  newb.right= generatetree(p) ;
		  return newb;
		 }
		return null;
		
	}
	public static void preorder(cNode m){
		if(m==null){
			return ;
		}
	
		preorder(m.left) ;
		System.out.print(m.data+" ");
		preorder(m.right );
	}
	
	public static void main(String[] args) {
	ArrayList<String> preo = new ArrayList<String>();
	preo.add("I");
	preo.add("I");
	preo.add("L");
	preo.add("L");
	preo.add("I");
	preo.add("L");
	preo.add("L");
	
	cNode bn=generatetree(preo);
	preorder(bn);

}}
