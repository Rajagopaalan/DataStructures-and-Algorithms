package pack;

import java.util.Arrays;
import java.util.HashMap;

public class linkedlistjucntion {
	int data;
	linkedlistjucntion Next;
	int size=0;

	
	public linkedlistjucntion(int i){
		 data=i;
	    Next=null;
	    size++ ;
		
	}
	public static void findcommon(linkedlistjucntion li,linkedlistjucntion lin){
		HashMap<linkedlistjucntion,Integer> hash = new HashMap<linkedlistjucntion,Integer> ();
		
		
	
		
		linkedlistjucntion lihash =null;
		linkedlistjucntion licheck=null;
		linkedlistjucntion lijucntion =null;
		linkedlistjucntion listart=li;
		linkedlistjucntion linstart=lin;
		
		if(li.size < lin.size){
		lihash=li;
		licheck=lin;
		
		}
		else{lihash=lin;
		licheck=li;
		}
	
	while(lihash!=null){
		hash.put(lihash, lihash.data);
		lihash=lihash.Next;
	}
		
	while(licheck!=null){
		if(hash.get(licheck)!=null){
			lijucntion=licheck ;
			break;
		}
		licheck=licheck.Next;
	}
	System.out.println(lijucntion.data);


	
	
	}
	public static void main(String args[]){
		
		linkedlistjucntion li = new linkedlistjucntion(5) ;
		li.Next=new  linkedlistjucntion(8);
		(li.Next).Next=new  linkedlistjucntion(9);
		((li.Next).Next).Next=new  linkedlistjucntion(10);
		(((li.Next).Next).Next).Next=new  linkedlistjucntion(11);
		((((li.Next).Next).Next).Next).Next = 	new  linkedlistjucntion(13);
	//	linkedlistjucntion temp=(((li.Next).Next).Next).Next;
//		(((((li.Next).Next).Next).Next).Next).Next =null; 
		
		linkedlistjucntion lin = new linkedlistjucntion(6) ;
		lin.Next=new  linkedlistjucntion(7);
		(lin.Next).Next=new  linkedlistjucntion(12);
		((lin.Next).Next).Next=new  linkedlistjucntion(14);
		(((lin.Next).Next).Next).Next=new  linkedlistjucntion(15);
		((((lin.Next).Next).Next).Next).Next =null;
		linkedlistjucntion temp= ((lin.Next).Next).Next ;
		//((((lin.Next).Next).Next).Next).Next = 	temp;
		(((((li.Next).Next).Next).Next).Next).Next=  temp;
		findcommon(li,lin);
	}

}
