package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
	
	/*public static String removeDuplicate(String str) {
		Set<Character> st = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for (int i=0;i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!st.contains(c)) {
				st.add(c);
				sf.append(c);
			}	}
		return sf.toString();	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter word");
		Scanner N = new Scanner(System.in);
		String str=N.next();
		System.out.println(removeDuplicate(str));
		N.close();}} */
	
	/*public static  Set<String> duplicate(String str) {
		
		Set <String> duplicate = new HashSet <>();
  		String[] word = str.split("%s+");
		Set <String> st = new HashSet <>();
		
		for (String w: word) {
			if(!st.add(w)) {
				duplicate.add(w);
				
			}
		}
		return  duplicate;
		
	}
public static void main (String[] args) {
	System.out.println("Enter the string");
	Scanner n = new Scanner(System.in);
	String str = n.next();
	System.out.println(duplicate(str));
	n.close();
}
}*/
	
//	public static void DuplicateWord(String str) {
//	
//		Map<String, String> map = new HashMap<>();{
//		String[] seprateword = str.split(" ");
//		for (String word : seprateword) {
//			if(!map.containsKey(word)) {
//				int count = Integer.parseInt(map.get(word));
//				map.put(word,String.valueOf(count +1));
//			}
//			else {
//				map.put(word, "1");
//			}	}
//		System.out.println(map);
//		}}
//	
//	public static void main (String[] args) {
//		String str ="the greek put in to the world in to ambanai";
//		DuplicateWord(str);
//	}
//	}
	
	public static void main(String[] args) {
		//RemoveDuplicate countWordTest = new RemoveDuplicate();
		  // countWordTest.countWords("find spring tutorial, java tutorial how to java articles spring articles and may more");
		   String input ="find spring tutorial, java tutorial how to java articles spring articles and may more" ;
		   countWords(input);
	}
		   public static void countWords(String input) {
		     Map <String, String> map = new HashMap <String, String> ();
		    if (input != null) {
		        String[] separatedWords = input.split(" ");
		        for (String str: separatedWords) {
		            if (map.containsKey(str)) {
		             int count = Integer.parseInt(map.get(str));
		              map.put(str, String.valueOf(count + 1));
		              } else {
		              map.put(str, "1");
		                }
		            }
		        }
		 
		        System.out.println("Count :- " + map);
		    }
		 
		}

