package programlist;

public class Vowelsremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vowelsremove re = new Vowelsremove();
		//re.removevowel("AELeelavathy");
		Vowelsremove.countvowel("Daiitaleelavathy");
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ ",");}
	}

	public String removevowel(String s) {
		String s1 =" ";
		s1=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s1);
		return s1;
	}
	
	public static String countvowel(String s) {
		int vcount = 0;
		int ccount = 0;
		String str=s.toLowerCase();
		//Set<String> sd = new HashSet<String>();
		
		//int leng = str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||
					str.charAt(i)=='u') {
				System.out.print(str.charAt(i)+",");
				
				vcount++;
				/*
				 * sd.add(str); for (String set : sd) { System.out.println(set); }
				 */
				
			}
			
			  if(str.charAt(i)>= 'a' || str.charAt(i)<='z') {
			  //System.out.print(str.charAt(i)+","); 
				  ccount++; }
			 
			}
		System.out.println("Number of Vowels: " +vcount);
		System.out.println("Number of constant: " +ccount);
		return s;
		
		
	}
		

}

