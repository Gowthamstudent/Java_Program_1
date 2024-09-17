package program_oops;

public class Swaptwowithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Gowtham";
		String b="Leelavathy";
		String c =null;
		
		System.out.println("A Value is:" +a + " B Value is:" +b);
		
		a= a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("A Value is:" +a + " B Value is:" +b);
		c =a.concat(b);
		System.out.println(c);

	}

}
