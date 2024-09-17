package program_oops;
class animal{
void sounds()
{
	System.out.println("azees");
}
}
class dog extends animal{
	void bark() {
		System.out.println("Jamal");
	}
}
class cat extends dog{
	void meow() {
		System.out.println("Great");
	}
}
public class Oops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //dog A =new dog();
		cat A =new cat();
		animal B =new animal();
		B.sounds();
            A.meow();
        	A.bark();
        	A.sounds();
	}
}

