
public class BSTdeleteNodeversiontwowithrightside {

	
	public static Bstlink deleteN(Bstlink b,int d){
		if(b==null){System.out.println("Not found");
			
			}
		else{
		if(b.data==d){
			if(b.left!=null && b.right!=null){
				int temp=returnmin(b.right) ;
				b.data=temp;
				b.right=deleteN(b.right,b.data);
				return b;
							
				
			}
		   else if(b.left!=null){return b.left; }
			else if(b.right!=null){return b.right;}
			else{return null;}
					
		}
		else if(b.data > d){b.left=deleteN(b.left,d);}
		else if(b.data < d){b.right=deleteN(b.right,d);}
			
		}
		return b;
			
	}
	public static  int returnmin(Bstlink bt){
		int min=bt.data;
		while(bt!=null){min=bt.data;bt=bt.left;}
		return min;
		}
	public static void print(Bstlink b){
		if(b==null){return ;}
		print(b.left);
		System.out.print(b.data+" ");
		print(b.right);
	}
public static void main(String args[]){
	
	Bstlink bst = new Bstlink(7);
	 bst.left =new Bstlink(4) ;
   bst.right = new Bstlink(10) ;
	bst.left.left = new Bstlink(2);
   bst.left.right = new Bstlink(5);
	 bst.right.left  =new Bstlink(8);
	 bst.right.left.right  =new Bstlink(9);
	 bst.right.right  =new Bstlink(11);
	 bst.right.right.right  =new Bstlink(101);
	 bst.right.right.right.right  =new Bstlink(107);
	 bst.right.right.right.right.left  =new Bstlink(103);
	 bst.right.right.right.right.left.left  =new Bstlink(102);
	 bst.right.right.right.right.left.right=new Bstlink(105);
	 bst.right.right.right.right.left.right.left=new Bstlink(104);
	// bst.right.right.right.right.left.right.left.left=new Bstlink(100);
	 bst.right.right.right.right.left.right.right=new Bstlink(106);
	 bst.right.right.right.right.right =  new Bstlink(108);
	 
	 print(bst);
	 Bstlink bstnew=deleteN(bst, 103);
	 System.out.println(" ");
	 print(bstnew);
}
}
