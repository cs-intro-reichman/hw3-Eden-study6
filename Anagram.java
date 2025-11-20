/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		// Replace the following statement with your code
		boolean isang = false;
		
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
		if(str1.length() != str2.length())
		{return isang;}
   		 if (str1.length() == 0) {
        return true;
   		 }
		char[] arr2 = str2.toCharArray();
		
		for (int i = 0; i < str1.length(); i++)
		{int a =0;
		while(a < str1.length() && str1.charAt(i) != arr2[a])
		{a++;}
		if ((a)==str1.length())
		{return false;}
		arr2[a] = '*';   // או '\0', או כל תו מיוחד
		isang = true;
		}
		return isang;}
	
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
    String newstr = str.replace(" ", "").toLowerCase();
    String final1 = "";
    for (int i = 0; i < newstr.length(); i++) {
        if (Character.isLetter(newstr.charAt(i))) {
            final1 += newstr.charAt(i);   // רק זה משתנה
        }
    }
    return final1;
}

	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
		if(str.length()<=1)
		{return str;}
		
    char[] arr = str.toCharArray();
String rand = "";
    // ערבוב רנדומלי (Fisher–Yates)
    for (int i = arr.length - 1; i > 0; i--) {
        int j = (int)(Math.random() * (i + 1)); // אינדקס רנדומלי בין 0 ל-i
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	for (int k =0 ; k<arr.length; k++)
	{
		rand += arr[k];
	}
		return new String(arr);
	}
}
