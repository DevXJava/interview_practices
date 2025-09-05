package com.interview.java.lang;

public class CharacterExample {

	public static void main(String[] args) {
		
		char ch = 'A';
		boolean isLetter = Character.isLetter(ch);
		
		char chdigi = '5';
		boolean isDigit = Character.isDigit(chdigi);
		System.out.println(" isDigit : "+isDigit);
		
		char chWhite = ' ';
		boolean isWhitespc = Character.isWhitespace(chWhite);
		
		char chLower = 'b' ;
		char chUpper = Character.toUpperCase(chLower);
		
		char chConvertLower = Character.toLowerCase(ch);
		
		boolean isUpperCase = Character.isUpperCase(ch);
		
		boolean isLowerCase = Character.isLowerCase(chLower);
		
		//Converting Object to Primary Data type .
		Character charObject = 'A';
		char chPrimary = charObject.charValue();
		
		//Compare two character
		char ch1 = 'A';
		char ch2 = 'B';
		int compare = Character.compare(ch1, ch2);
		
		//Primary char to String Object 
		String string = Character.toString(ch1);
		
		char chSpc = '_';
		boolean isJavaIdentifierStart = Character.isJavaIdentifierStart(chSpc);
		System.out.println(chSpc+ " is : "+isJavaIdentifierStart);
		
		char chDig = '1';
		boolean isJavaIdentifierPart = Character.isJavaIdentifierPart(chDig);
		
		
		
		
		
		
		
		

	}

}
