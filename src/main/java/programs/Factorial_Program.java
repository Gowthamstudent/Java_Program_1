package programs;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Factorial Number");
		n=sc.nextInt();
		/*for (i=1;i<n;i++) {
			fact=fact*i;
			System.out.println(fact);
		}*/
		i=1;
		while(i<n) {
			fact=fact*i;
			System.out.println(fact);
			i++;
		}
		sc.close();
//Fibbonaci series:	
		/*int n,i, f1=0, f2=1,f3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		System.out.println("Fibbonaci series ;"+" " +f1);
		System.out.println("Fibbonaci series ;"+" " +f2);
		for(i=2;i<n;i++) {
			f3=f1+f2;
			System.out.println("Fibbonaci series ;"+" " +f3);
			f1=f2;
			f2=f3;
		}
		sc.close();*/
		}
	}
