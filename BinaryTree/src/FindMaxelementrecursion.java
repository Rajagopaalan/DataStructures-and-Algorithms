
class Tnode{
	int data;
	Tnode left;
	Tnode right;
	Tnode(int a){data =a;}
}
public class FindMaxelementrecursion {
	int datamax;
	
	FindMaxelementrecursion (int data){
		datamax=data;
	}
	public void findmax(Tnode t){
		Tnode root = t;
		//datamax=t.data ;
		if(root==null){return ;}
	
			
				if(root.data > datamax){datamax=root.data;}
				
			findmax(root.left);
		findmax(root.right);
		
		
	}
	public void print(){System.out.println(datamax);}
	
	public static void main(String args[]){
		
		Tnode t = new Tnode(-1);
		t.left = new Tnode(-2);
		t.right = new Tnode(-30);
		t.left.left = new Tnode(-4);
		t.left.right = new Tnode(5000);
		t.right.left = new Tnode(-6);
		t.right.right = new Tnode(-712);
		FindMaxelementrecursion f = new FindMaxelementrecursion(t.data);
		f.findmax(t);
		f.print();
		
	}
}
