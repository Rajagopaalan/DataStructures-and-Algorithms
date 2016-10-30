
public class DeleteNodeinbstnew {
	static  int max;
		
	public static Bstlink deleteNode(Bstlink N,int data){
		
		if(N==null){System.out.println("NO element found");}
		else	if(N.data == data){
			if(N.left ==null && N.right==null){
				System.out.println(N.data+"Vasudeva");
				return null;
			}
			
			else{
				 if(N.left!=null && N.right!=null ){
						//Bstlink temp = returnmax(N.left);
						int temp =returnmax(N.left); 
						System.out.println(temp);
						N.data =temp ;
						//max=temp.data ;
						N.left=deleteNode(N.left,N.data);
						if(N.left==null){System.out.println("govinda");
							}
						return N;
					}				
			else if(N.right!=null){return N.right;}
			else  if(N.left!=null){return N.left;}
					
				
			
			//	else{return null;}
				
			}
		}
		else{
			if(data<N.data){N.left=deleteNode(N.left,data);}
			if(data>N.data){N.right=deleteNode(N.right,data);}
		}	
		
		return N;		
	}
	public static int returnmax(Bstlink b){
	int t=b.data;
		while(b!=null){t=b.data;b=b.right;}
		//int t=returnmax(b.right);
		return t;}
	
	
	public static void print(Bstlink t){
		if(t==null){return;}
	
		print(t.left) ;
		System.out.print(" "+t.data);
	print(t.right) ;
	
			
	}
	public static void main(String[] args) {
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
		 System.out.println(" ");

		Bstlink bstnew = deleteNode(bst,106);
	//	if(bst==bstnew){System.out.println("NO elemnet found");}
		//if(bstnew==null){System.out.println("NO elemnet found");
		//}

//		Bstlink bstnew1 = deleteNode(bst,max);
		 print(bstnew);
	}

}
