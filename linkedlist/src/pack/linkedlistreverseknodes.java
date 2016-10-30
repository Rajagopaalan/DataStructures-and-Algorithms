package pack;

public class linkedlistreverseknodes {

	int data;
	linkedlistreverseknodes Next;
	public linkedlistreverseknodes(int d){
		data=d;
		Next=null;
	
		
	}
	public static linkedlistreverseknodes retreviekthnode(linkedlistreverseknodes k,int count){
		int kcount=1;
		linkedlistreverseknodes kstart=k;
		while(k.Next!=null && kcount <count){
			kcount++;
		
			
			k=k.Next ;
		}
		//System.out.println(kcount+"-"+count);
		if(kcount==(count)){
			//break;
			return k;
		}
		else{
			return kstart;
		}
		
	//	return null;
		
		
	}
	public static void linkedlistreversalknodes(linkedlistreverseknodes li,int kcount) {
		// TODO Auto-generated method stub
		
		linkedlistreverseknodes  licount=li;
		
		linkedlistreverseknodes  listart=li;
		linkedlistreverseknodes  current=li;
		linkedlistreverseknodes temp=null;
		linkedlistreverseknodes  newstart=null;
		linkedlistreverseknodes nextnode=null;
		
		linkedlistreverseknodes  endofsegment=null;
		int start=0;
while(li!=null ){
		int count =1;
	
		linkedlistreverseknodes liget = retreviekthnode(licount,kcount);
		System.out.println("if nhello"+liget.data);
		if(liget==licount){
	break;
			
		}
		else{
			temp=liget;
			System.out.println("df"+temp.data);
			while(count!=kcount){
			
				if(current!=null && current.Next!=null){
					nextnode=current.Next ;
					current.Next=temp;
					//if(temp.Next.Next!=null)
					//System.out.print(current.data +" "+temp.data+" "+ temp.Next.data  +" "+temp.Next.Next.data +" "+nextnode.data );
				//	else{System.out.print(current.data +" "+temp.data+" "+nextnode.data );}
					System.out.println(" ");
					if(endofsegment==null){
					//	endofsegment=current;
					}
					if(count==(kcount-3)){
						endofsegment=current;
				
					}
					temp=current;
					current=nextnode;
					
			     count++;
				}
				
			}
		
			if(start==0){listart=temp;
	//		System.out.println("gopal"+listart.data);
			start=1;}
		//	else{endofsegment.Next=temp;}
		//	li=endofsegment;
		//	endofsegment=current;
		//	endofsegment.Next = temp;
		}
		//endofsegment.Next = temp;
	//	}
	//	while(li!=null && li.Next!=null){
		//	System.out.println(li.data);
		licount=current;
			li= current ;
		}
//System.out.println(endofsegment.data);
		
		while(listart!=null && listart.Next!=null){
			System.out.println(" "+listart.data);
			listart= listart.Next;
		}
	
	
		
	}
	public static void main(String args[]){
		
		
linkedlistreverseknodes li = new linkedlistreverseknodes(1);
		
		li.Next=new  linkedlistreverseknodes(2);
		
		(li.Next).Next=new  linkedlistreverseknodes(3);
		((li.Next).Next).Next=new  linkedlistreverseknodes(4);
		(((li.Next).Next).Next).Next=new  linkedlistreverseknodes(5);
		((((li.Next).Next).Next).Next).Next = 	new  linkedlistreverseknodes(6);
		(((((li.Next).Next).Next).Next).Next).Next = new  linkedlistreverseknodes(7);
		((((((li.Next).Next).Next).Next).Next).Next).Next = new linkedlistreverseknodes(8);
		(((((((li.Next).Next).Next).Next).Next).Next).Next).Next =  new linkedlistreverseknodes(9);
		((((((((li.Next).Next).Next).Next).Next).Next).Next).Next).Next = new linkedlistreverseknodes(10);
		

		linkedlistreversalknodes(li,4);
		
		
	}



}
