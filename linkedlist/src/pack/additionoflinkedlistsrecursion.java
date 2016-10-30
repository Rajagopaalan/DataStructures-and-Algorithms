package pack;

public class additionoflinkedlistsrecursion {
	
	additionoflinkedlistsrecursion next;
	 int data;

		public additionoflinkedlistsrecursion(int i) {
			// TODO Auto-generated constructor stub
			data=i;
			next=null;
		}
	
		public void add(additionoflinkedlistsrecursion a,additionoflinkedlistsrecursion b){
			
			
		}
	
	public static void main(String args[]){
		additionoflinkedlistsrecursion n = new additionoflinkedlistsrecursion(1);
		n.next=new additionoflinkedlistsrecursion(2);
		(n.next).next=new additionoflinkedlistsrecursion(3);
		((n.next).next).next=new additionoflinkedlistsrecursion(5);
		(((n.next).next).next).next=new additionoflinkedlistsrecursion(6);
		//((((n.next).next).next).next).next = null;
		((((n.next).next).next).next).next=new additionoflinkedlistsrecursion(7);
		(((((n.next).next).next).next).next).next = new additionoflinkedlistsrecursion(8);
		((((((n.next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(9);
		(((((((n.next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(2);
		((((((((n.next).next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(3);
		(((((((((n.next).next).next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(1);
		
		
		additionoflinkedlistsrecursion m = new additionoflinkedlistsrecursion(2);
		m.next=new additionoflinkedlistsrecursion(3);
(m.next).next=new additionoflinkedlistsrecursion(5);
	((m.next).next).next=new additionoflinkedlistsrecursion(4);
	(((m.next).next).next).next=new additionoflinkedlistsrecursion(6);
	//((((n.next).next).next).next).next = null;
	((((m.next).next).next).next).next=new additionoflinkedlistsrecursion(7);
	(((((m.next).next).next).next).next).next = new additionoflinkedlistsrecursion(8);
	((((((m.next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(9);
	(((((((m.next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(2);
	((((((((m.next).next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(4);
	(((((((((m.next).next).next).next).next).next).next).next).next).next = new additionoflinkedlistsrecursion(9);
					
//	add(n,m);
		
	}

}
