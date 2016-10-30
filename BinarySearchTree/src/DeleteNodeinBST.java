
public class DeleteNodeinBST {
	public static  Bstlink deleteNode(Bstlink bt,int data){
	/*	if(bt.data == data && bt.left==null && bt.right==null){ bt=null ;return bt ;}
		if(bt.data == data &&(bt.left!=null && bt.right==null)){ 
		 return bt.left;
			
		}
		if(bt.data == data &&(bt.left==null && bt.right!=null)){ 
			 return bt.right;
				
			}
		if(bt.data == data &&(bt.left!=null && bt.right!=null)){ 
			Bstlink temp= returnmax(bt.left);
			temp.left= bt.left; 
			temp.right=bt.right;
			bt=temp;
			
		}
		else{return null; }
		if(bt.data < data ){bt.right = deleteNode(bt.right,data);}
		
		if(bt.data > data ){bt.left = deleteNode(bt.left,data);}
		
	
		return  bt ;*/
		if(bt==null){return null;}
	if( bt.data==data){
		if((bt.left!=null) && (bt.right!=null)){
			Bstlink temp = bt;
					Bstlink btnew =  deleteoriginal(bt.left) ;
		//	bt = returnmax(bt.left);
			bt.data = btnew.data;
			if(temp.left.left==null && temp.left.right ==null){bt.left=null;bt.right=temp.right;}
			else{
		    bt.left = temp.left;
		    bt.right = temp.right;}
		  
		//	deleteNode(temp,temp.data);
			return bt;
			
			
		}
		else if(bt.left==null){Bstlink temp =bt.right;
		bt=temp;return bt;}
		else if(bt.right==null){
			Bstlink temp =bt.left;
			bt=temp;
			return bt;
		}
		
	}
      if(bt.data < data ){bt.right = deleteNode(bt.right,data);}
	  if(bt.data > data ){bt.left = deleteNode(bt.left,data);}
		
		return bt;
	}

	public static Bstlink returnmax(Bstlink bs){
		//if(bs.right==null){return bs;}
	System.out.println("here"+bs.data); 
		if(bs.right==null){return bs;}
		//System.out.println(bs.right.data) ;
		return returnmax(bs.right);}
	
	
	public static Bstlink deleteoriginal(Bstlink bs){
		
		if(bs.right==null){
			
			//return  null;
			return bs.right ;
			}
	//	else{returnmax(bs.right);}
		return returnmax(bs.right);
		}
	
	public static void print(Bstlink t){
		if(t==null){return;}
		print(t.left) ;
	System.out.print(" "+t.data);
	print(t.right) ;
		
		
	}
	public static void main(String args[]){
		
	/*	Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(9) ;
		bst.left.left = new Bstlink(2);
	    bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
		// bst.right.left.right  =new Bstlink(8);
		 bst.right.right  =new Bstlink(10);
		 bst.right.right.right  =new Bstlink(101);*/
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(10) ;
		bst.left.left = new Bstlink(2);
	    bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
	//	 bst.right.left.right  =new Bstlink(9);
		 bst.right.right  =new Bstlink(11);
		 bst.right.right.right  =new Bstlink(101);
		 print(bst);
		Bstlink bstnew = deleteNode(bst,10);
		 System.out.println("");
		 print(bstnew);
		// System.out.println( bst.right.left.right.left.data);
		// System.out.println(bstnew.right.left.left.left.left.left.left.left.left.left.left.left.left.left.left.left.left.data);
		 
	
		 
	}
}
