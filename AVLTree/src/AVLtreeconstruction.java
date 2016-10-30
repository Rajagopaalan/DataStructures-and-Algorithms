
class AVLtree
	{
		
	    int data;
	    AVLtree left;
	    AVLtree right;
	    int height;
	    public  AVLtree(int d){height=1;data = d;}
	}
	


public class AVLtreeconstruction {
	static int x = 0;
	static int y=0 ;
public static int height(AVLtree avl ){ 
	 if(avl == null){return 0;}
	 
	return avl.height;
	 
 }

public static void updateheights(AVLtree a){
	 if(a == null){return ;}
	 a.height =  Math.max(height(a.left),height(a.right)) + 1;
		
	 updateheights(a.left);
	 updateheights(a.right);
	 
}

public static AVLtree singlerightrotate(AVLtree at){

	
	System.out.println(at.data);
  	AVLtree temproot = at.right ;
    at.right         = temproot.left ;
    temproot.left =at;
   
    temproot.height=Math.max(height(temproot.left),height(temproot.right)) + 1;
  
	at.height =  Math.max(height(at.left),height(at.right)) + 1;
	//  System.out.println("gopala"+at.left);
	return temproot;

}
public static AVLtree SingleLeftrotate(AVLtree at){
	
	System.out.println("callinhere");
	AVLtree temproot =at.left ;
//	System.out.println(at.left.data) ;
	at.left = temproot.right ;
	temproot.right = at;
	temproot.height=Math.max(height(temproot.left),height(temproot.right)) + 1;
	at.height =  Math.max(height(at.left),height(at.right)) + 1;
	

	
	return temproot;
	}


public static AVLtree LeftRightrotate(AVLtree at){

	 at.left = singlerightrotate(at.left) ;

	 return SingleLeftrotate(at);
	 
	
	

}


public static AVLtree  RightLeftrotate(AVLtree at){

	 at.right = SingleLeftrotate(at.right) ;
	 return  singlerightrotate(at);

}


public  static AVLtree insert(AVLtree root,int key){
	if(root==null){AVLtree n = new AVLtree(key);return n;}
	
	if(root.data > key){
		
	root.left =	 insert(root.left, key) ;

	}
	if(root.data < key){
		
		root.right =	 insert(root.right ,key) ;
		}
	
		int balance = height(root.left) - height(root.right) ;
	if(balance > 1){
		
		if(root.left!=null && root.left.data > key){System.out.println("Narayana");	root = SingleLeftrotate(root) ;}
		
			if(root.left!=null && root.left.data < key){root = LeftRightrotate(root) ;}
	
	}

	if(balance < -1){
		if(root.right!=null && root.right.data < key){
			if(x==0){x++;
			root = singlerightrotate(root) ;}}
		if(root.right!=null && root.right.data > key){root = RightLeftrotate(root) ;}
	}
	root.height = Math.max(height(root.left),height(root.right)) +1;

	return root;
	
	
}
 static void printpreorder(AVLtree a){
	 if(a==null){return;}
	 System.out.print(a.data+" ");
	 printpreorder(a.left);

	 printpreorder(a.right);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AVLtree a = new AVLtree (8);
	 a.left = new AVLtree (5);
	 a.left.left = new AVLtree (3);
	 a.left.right = new AVLtree (6);
    a.right = new AVLtree(9);
 
	 
		 updateheights(a);

	  printpreorder(a);
        AVLtree s = insert(a,7);
    
      System.out.println("height"+s.right.right.data);
  	    System.out.println(" ");
     printpreorder(s);

  	   
	}

}
