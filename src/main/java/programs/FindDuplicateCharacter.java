package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void Duplicate(String str){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] character = str.toCharArray();
		for (char c : character) {
			if(!map.containsKey(c)) {
				map.put(c,1);}
			else {
				map.put(c, map.get(c)+1);
			}
		Set<Map.Entry<Character,Integer>> entry = map.entrySet();
	for(Map.Entry<Character, Integer> a :entry) {
		if(a.getValue()>1)
			//if(a.getValue()<=1)
		{
			System.out.printf("%S: %d %n",a.getKey(),a.getValue());
		}
	}
	
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "Sandeep";
 Duplicate(str);
 
	}

}
