package program_oops; //Method OverLoading

class polyA{
	void show(int a,int b) {
		System.out.println(a+b);
	}
}
 class polyB extends animal{
	 void show(double a, double b) {
		 System.out.println(a+b);
	 }
 }



public class polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         polyB A =new polyB();
         A.show(12,12);
         A.show(12.1, 12.2);
         A.sounds();
	}

}
