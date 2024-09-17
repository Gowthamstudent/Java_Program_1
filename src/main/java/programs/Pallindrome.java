package programs;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		String A="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pallindrome Number");
		n = sc.nextLine();
		int lenth = n.length();
		for (int i=lenth-1; i>=0; i--) {
			A= A + n.charAt(i);
		}
			if(n.equalsIgnoreCase(A)) {
				System.out.println("it is Pallindorme");
				System.out.println(A);
				}
			else {
				System.out.println("it is not Pallindorme");
				System.out.println(A);
			}
		sc.close();
	}

}
