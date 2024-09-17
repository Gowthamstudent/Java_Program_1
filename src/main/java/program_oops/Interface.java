package program_oops;
interface bank {
	//void insest();
	 void intrest(float a);
	 
}
 class pnb implements bank {
	 public void intrest( float a) {
		 System.out.println(a);
		 System.out.println("Leela");
	 }
 }
 class sbi implements bank{
	 public void intrest(float a) {
		System.out.println(a); 
		System.out.println("Leelavathy");
	 }
 }
public class Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     bank A =new pnb();
     A.intrest(18.7f);
	}

}
