package program_oops;

abstract class A1 {
	void call() {
		System.out.println("Azees");
	}
	abstract void Move();
	abstract void hove();
	abstract void cat();
}
  abstract class A2 extends A1{
	   void Move() {
		 System.out.println("Abirami"); 
	  }
	  abstract void dog(); 
  }
   class A3 extends A2{
	 void hove() {
		 System.out.println("Abi");
	 }
	 void dog() {
		 System.out.println("bark");
	 }
	void cat() {
		System.out.println("meow");
	}
 }

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A2 Ll =new A3();
        Ll.call();
        Ll.cat();
        Ll.Move();
        Ll.hove();
        Ll.dog();
        
	}

}
