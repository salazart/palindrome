package com.sz;

/**
 * Class PalindromeService determines type of input text and return that the text is palindrome. 
 * The service divides the input string, finds half of is, reverses second part of text and compares first and second parts.
 * @author Sasha
 *
 */
public class PalindromeService {
	public boolean isPalindrome(String text){
		if(text == null)
			return false;
		
		if((text.length() & 1) == 0){
			String firstPart = text.substring(0, text.length() / 2);
			String secondPart = text.substring(text.length() / 2);
			
			String reverseSecondPart = getReversePart(secondPart);
			return firstPart.equals(reverseSecondPart);
		} else {
			String firstPart = text.substring(0, text.length() / 2);
			String secondPart = text.substring(text.length() / 2 + 1);
			
			String reverseSecondPart = getReversePart(secondPart);
			return firstPart.equals(reverseSecondPart);
		}
	}

	private String getReversePart(String text) {
		StringBuffer buffer = new StringBuffer(text);
		return buffer.reverse().toString();
	}
}
