package programs;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n,sum=0;
		int i;
		int val = 30;
		boolean flag = false;
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter number sum");
		 * n = sc.nextInt(); for(int i=1; i<n; i++) { sum=sum+i;
		 * System.out.println(sum); } sc.close();
		 * 
		 //It Prime number or Not
		 * for(i=2;i<val/2;i++) { if(val%i==0) { flag=true; break;
		 * 
		 * } } if(flag) { System.out.println("It's not prime Number"); } else {
		 * System.out.println("It's  prime Number"); }
		 */
		int Year =2012;
		boolean leap = false;
		if(Year%4==0) 
			{
				if(Year%100==0)
				{
					if(Year%400==0)
					
						leap =true;
					else 
							leap= false;
				}
					else
						leap =true;
				}
				else
					leap = false;
			
		if(leap) {
			System.out.println("it leap year");
		}
		else {
			System.out.println("it not leap year");
		}
	
	}
}
