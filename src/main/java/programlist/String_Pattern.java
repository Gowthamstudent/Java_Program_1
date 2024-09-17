package programlist;

public class String_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k ;
		  for( i=0; i<=5; i++) { for( j=0; j<=i; j++) { System.out.print("*"); }
		  System.out.println(" "); }
		  
		  for( i=0; i<=5; i++) { for( j=5; j>=i; j--) { System.out.print("*"); }
		  System.out.println(" "); }
		 
		for(i=0; i<=5; i++) {
			for(j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(i=0; i<=5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(k=4; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(i=0; i<=5; i++) {
			for(j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		
		for(i=0; i<=5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(k=4; k>=i; k--) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		 
	}

}
