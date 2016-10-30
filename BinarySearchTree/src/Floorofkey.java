
public class Floorofkey {

	public Floorofkey() {
		// TODO Auto-generated constructor stub
	}
	static Bstlink floor ;
	public static Bstlink Floor(Bstlink bt,int key){
		if(bt==null){return null;}
		Bstlink btlft = Floor(bt.left ,key);
		if(btlft!=null){return btlft;}
		if(bt.data > key){return floor ;}
		//if(bt.data < key){return null ;}
		if(bt.data == key){return bt ;}
		floor=bt ;
		//System.out.println(bt.data);
		
		
		return Floor(bt.right ,key);
		
		
	}
public static Bstlink findmax(Bstlink b){
	while(b.right !=null){b = b.right ;}
	return b;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(10) ;
		bst.left.left = new Bstlink(2);
	    bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
	 bst.right.right  =new Bstlink(11);
		 bst.right.right.right  =new Bstlink(110);
		 bst.right.right.right.left  =new Bstlink(105);
		 bst.right.right.right.left.right  =new Bstlink(106);
		 bst.right.right.right.left.right.left  =new Bstlink(104);
		 bst.right.right.right.left.right.right  =new Bstlink(108);*/
		Bstlink tree = new Bstlink(8);
       // tree.root = new Node(8);
        tree.left = new Bstlink(4);
        tree.right = new Bstlink(12);
        tree.left.left = new Bstlink(2);
        tree.left.right = new Bstlink(6);
        tree.right.left = new Bstlink(10);
        tree.right.right = new Bstlink(14);
        int data = 13;
	Bstlink floorbst = Floor(tree, data);
	if(floorbst == null){int max = findmax(tree).data;if(data>max ){System.out.println(max);}
	else{System.out.println("No floor exixtx");}
	}
	else{
	System.out.println(floorbst.data);}
	
	
	
	}

}
