package programs;

import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int A,B, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("First Swapping Number");
		A=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Second Swapping Number");
		B=sc1.nextInt();
		temp=A;
		A = B;
		B = temp;
		System.out.println("Swapping Number :" +A+ " " +B);
		sc.close();
		sc1.close();
	}*/

		/*int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("First Swapping Number");
		a=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Second Swapping Number");
		b=sc1.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Swapping Number :" +a+ " " +b);
		sc.close();
		sc1.close();*/
		
		String a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Couple First Name");
		a=sc.next();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Couple Second Name");
		b=sc1.next();
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("Swapping :" +a+ " Weds " +b);
		sc.close();
		sc1.close();
}
}