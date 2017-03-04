package com.sz;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeServiceTest {
	
	private String palindrome = "1221";
	private String palindrome2 = "12121";
	private String palindrome3 = "";
	private String palindrome4 = " ";

	private String notPalindrome = "1211";
	private String notPalindrome2 = "12111";
	private String notPalindrome3 = null;
	
	private PalindromeService palindromeService = new PalindromeService(); 
	
	@Test
	public void test() {
		assertTrue(palindromeService.isPalindrome(palindrome));
		assertTrue(palindromeService.isPalindrome(palindrome2));
		assertTrue(palindromeService.isPalindrome(palindrome3));
		assertTrue(palindromeService.isPalindrome(palindrome4));
		
		assertFalse(palindromeService.isPalindrome(notPalindrome));
		assertFalse(palindromeService.isPalindrome(notPalindrome2));
		assertFalse(palindromeService.isPalindrome(notPalindrome3));
	}

}
