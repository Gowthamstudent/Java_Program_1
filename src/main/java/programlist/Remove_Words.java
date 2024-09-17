package programlist;

public class Remove_Words {
	
	
	public static String removeWord(String string1, String word) {
		if (string1.contains(word)) { 
			  
            // To cover the case 
            // if the word is at the 
            // beginning of the string 
            // or anywhere in the middle 
            String tempWord = word + " "; 
            string1 = string1.replaceAll(tempWord, ""); 
            tempWord = " " + word; 
            string1 = string1.replaceAll(tempWord, ""); 
        } 
       
        // Return the resultant string 
        return string1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Geeks for Geeks."; 
        String word = "for"; 

        System.out.println("String: " + string1 
                + "\nWord: " + word 
                + "\nResult String: "
                + removeWord(string1, word)); 

        String s="000000000004645765777275225626654250000000000000000000000000";      
        String removeString="";

        for(int i =0;i<s.length();i++){
          if(s.charAt(i)=='0')
            removeString=removeString+"0";
          else 
            break;
        }

        System.out.println("original string - "+s);

        System.out.println("after removing 0's -"+s.replaceAll(removeString,""));

        


	}

}
