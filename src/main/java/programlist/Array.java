package programlist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
	
	 //public static int count = 0; 
	public static void main(String[] args) {
	  
	 
	 /* * Integer[] arr= {2, 2, 1, 1, 3, 3, 2, 2, 2, 2, 1 ,1}; //test array
	 * List<Integer> resultList =Arrays.asList(arr); List<Integer> maxOccurence =
	 * new ArrayList<Integer>(); Set<Integer> set = new HashSet<Integer>();
	 * 
	 * for (Integer integer : resultList) { set.add(integer); } for (Integer integer
	 * : set) { int freq = Collections.frequency(resultList, integer);
	 * maxOccurence.add(freq);
	 * System.out.println("Element : "+integer+"  Occurences= "+freq); }
	 * System.out.println(Collections.max(maxOccurence)); }
	 */
		int[] arr = { 2, 1, 1, 3, 3,3,3,3,3, 2, 2, 2, 3,3,3,3, 1, 1 };
		int index = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
		    int r = runsTo(arr, i);
		    int c = r - i + 1;
		    if (c > count) {
		        index = i;
		        count = c;
		        i += count - 1;
		    }
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("Starting from %d get %d%n", index, count);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, index, index + count)));

}
	private static int runsTo(int[] vals, int index) {
	    for (int i = index; i < vals.length - 1; i++) {
	        if (vals[i] != vals[i + 1]) {
	            return i;
	        }
	    }
	    return vals.length;
	}
}	


