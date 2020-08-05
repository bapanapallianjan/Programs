package com.streams;

public class TestingDesnict {
	
	public static void main(String[] args) {

	    String s = "aayanna";
	    String[] parts = s.split(" ");
	    int wordcount = parts.length;
	   // System.out.println("The number of words is::::::::::" + wordcount);

	    countUniqueCharacters(s);
	}

	public static int countUniqueCharacters(String s) {
	    String lowerCase = s.toLowerCase();
	    char characters[] = lowerCase.toCharArray();
	    int countOfUniqueChars = s.length();
	    for (int i = 0; i < characters.length; i++) {
	        if (i != lowerCase.indexOf(characters[i])) {
	            countOfUniqueChars--;
	        }
	    }
	    
	    System.out.println("Nmber "+countOfUniqueChars);
	    return countOfUniqueChars;
	
	
}
}
