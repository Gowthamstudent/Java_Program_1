package programlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();
		a.add("Gowtham");
		a.add("Azees");
		a.add("Mohanavel");
		a.add("abirami");
		a.add("Azees");
		a.add("Jamal");
		a.add("Jamal");
		
//		Iterator<String> ia = a.iterator();
//		while(ia.hasNext()) {
//		String list= ia.next();
//			System.out.println(list);
//		}
		/*for(String list:a) {
			System.out.println(list);
		}*/
		
		Set<String> li = new HashSet<String>();
//		if(li.addAll(a)==false) {
//			System.out.println(a);
//		}
			 for(String A:a) {
				 if(li.add(A)==false)
				 System.out.println(li);
			 }
	}

}
