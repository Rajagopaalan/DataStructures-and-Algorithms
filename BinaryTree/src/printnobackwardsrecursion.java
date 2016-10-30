
public class printnobackwardsrecursion {
	public static void print(int x){
		if(x==0){return ;}
		else{
			
			print(x-1);
			System.out.println(x);
		}
		
	}
	
	public static void main(String args[]){
		print(5);
		
	}
}
