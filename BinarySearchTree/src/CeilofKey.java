
public class CeilofKey {

	public CeilofKey() {
		// TODO Auto-generated constructor stub
	}
	
	static Bstlink prev ;
	public static Bstlink ceilval(Bstlink bt,int key){
		
		if(bt==null){return null;}
		Bstlink ntleft = ceilval(bt.left,key);
		if(ntleft!=null){return ntleft;}
	    if(bt.data > key){return bt;}
	    if(bt.data == key){return bt;}
		
		return  ceilval(bt.right,key);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Bstlink bst = new Bstlink(7);
		bst.right = new Bstlink(8) ;
		bst.right.right = new Bstlink(13) ;
		bst.right.right.right = new Bstlink(20) ;*/
		Bstlink bst = new Bstlink(7);
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
		 bst.right.right.right.left.right.right  =new Bstlink(108);
		 Bstlink node = ceilval(bst,109);
		 if(node==null){System.out.println("NO ceil exits");}
		 else{System.out.println(node.data) ;}

	}

}
