import java.util.*;

class reverse {
	public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int m;
	     while(n>0)
	     {
	         m=n%10;
	          n=n/10;
	         System.out.println(m); 
	     }

	}
}
	
