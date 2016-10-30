

 class TTNode{
	 int data;
	 int lheight ;
	 int rheight;
	 int height ;
	 TTNode left ;
	 TTNode right ;
	 TTNode(int x){
		 data=x;
		 left=null;
		 right=null;
	 }
	
}
public class diameteroftreeoptimalsolution {   //optimal solution O(N)

	public int totaldiameter(TTNode tn){
		int currheight=0;
		if(tn==null){return 0;}
		
		if(tn.left==null){tn.lheight=0;}
		if(tn.right==null){tn.rheight=0;}
		if(tn.left!=null){
			totaldiameter(tn.left) ;
		}
		if(tn.right!=null){
			totaldiameter(tn.right) ;
		}
		if(tn.left!=null){
			int templ=0;
		    templ = (tn.left.lheight > tn.left.rheight ?tn.left.lheight : tn.left.rheight) ;
		    tn.lheight= templ+1 ;
		    
		}
		if(tn.right!=null){
			int tempr=0;
		    tempr = (tn.right.lheight > tn.right.rheight ? tn.right.lheight : tn.right.rheight) ;
		    tn.rheight= tempr+1 ;
		    
		}
	//	currheight = tn.lheight + tn.rheight + 1;
	//	currheight = (tn.lheight > tn.rheight ? tn.lheight : tn.rheight);
		if(tn.lheight + tn.rheight > currheight){currheight = tn.lheight + tn.rheight +1 ;}
		return currheight;
	}
	
	public static  void main(String args[]){
		
			TTNode tn = new TTNode(1);
		    tn.left=new TTNode(2);
		    tn.right = new TTNode(3);
		    tn.left.left = new TTNode(4) ;
		    tn.left.right = new TTNode(5) ;
		    tn.left.left.left = new TTNode(60);
		    tn.left.left.right = new TTNode(61);
		    tn.left.left.right.left = new TTNode(62);
		    tn.right.left = new TTNode(6) ; 
		    tn.right.right = new TTNode(7) ;
		    tn.right.right.right = new TTNode(9) ;
		    tn.right.right.left = new TTNode(10) ;
		    tn.right.right.right.left = new TTNode(11) ;
	    tn.right.right.right.right = new TTNode(12) ;
		
			
			/*	TTNode tn = new TTNode(1);
			  tn.left=new TTNode(2);
			    tn.right = new TTNode(3);
			 //   tn.right.right = new TTNode(30);
			    tn.left.left = new TTNode(4) ;
			    tn.left.right = new TTNode(5) ;
			    tn.left.left.left = new TTNode(60);
			    tn.left.left.right = new TTNode(51) ;
			    tn.left.left.right.left = new TTNode(52) ;
			    tn.left.left.right.left.left = new TTNode(514) ;
			    tn.left.left.right.left.left = new TTNode(5141) ;
			    tn.left.right=new TTNode(22);  /* Diameter thrugh subTTs*/
		
		/*	TTNode tn = new TTNode(1);
			  tn.left=new TTNode(2);
			  tn.right=new TTNode(2);
			  tn.left.left=new TTNode(2);
			 // tn.left.left=new TTNode(2);
			  tn.left.right=new TTNode(2);
			  tn.left.right.right=new TTNode(2);
			  tn.left.right.left=new TTNode(2);
				
			  tn.right.right=new TTNode(2);
			  tn.right.right.right=new TTNode(2);
			  tn.right.right.right.right=new TTNode(2);
			  tn.right.right.right.left =  new TTNode(2);
			//  tn.right.right.right.left.left =  new TTNode(2);
			//  tn.right.right.right.left.right =  new TTNode(2);
			//    tn.left.right.right=new TTNode(2);
			 //   tn.left.right.right.left = new TTNode(290);
			//    tn.left.right.right.right=new TTNode(20);
			  //  tn.left.right.right.right.right=new TTNode(25);*/
			  diameteroftreeoptimalsolution dt = new diameteroftreeoptimalsolution();
		//	int lheight =  dt.finddiameter(tn.left) ;
		//	int rheight =  dt.finddiameter(tn.right) ;

		//	int totalheight = lheight + rheight -1;
		//	int lheight =  dt.totaldiameter(tn) ;
				int finheight =  dt.totaldiameter(tn) ;

				//int totalheight = lheight + rheight -1;
			System.out.println("ji"+finheight);
				
	}
}
