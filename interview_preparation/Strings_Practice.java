package interview_preparation;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Strings_Practice {
/*
  // 1)Write a java program reverse a string
   
	public static void main(String[] args) {
		String s1="hello world";
		String reverse="";
		s1=s1.replace(" ","");
		System.out.println(s1);// output: helloworld
		//for loop is for iterating from the end of the string to the begenning of the string and adding the
		//character of original string s1 to the reverse.
		for (int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
			
		}
		System.out.println("reverse string is: "+reverse);
		
	}
*/
	
	
	/*
	// 2)Write a java program to check string is palindrome or not?
	public static void main(String[]args) {
		String s1="nurses run";
		String reverse="";
		s1=s1.replace(" ","");
		System.out.println("Original string is: "+s1);
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("reverse string is: "+reverse);
		//if original string s1 is equal to reversed string reverse then the strings are palindrome
		if(s1.equals(reverse)) {
			System.out.println("strings are palindrome");
		}
		else {
			System.out.println("strings are not palindrome");
		}
	}
	*/
	
	/*
	// 3)write a java program print duplicate characters from string?
	
	public static void main(String[]args) {
		String s1="helloworld";
		for(int i=0;i<=s1.length()-1;i++) {
		//checking the first charcater with all the other characters in the string
			for(int j=i+1;j<=s1.length()-1;j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					System.out.println(s1.charAt(i));
				}
			}
		}
	}
	*/
	
	/*
	// 4)write a java program to check two string are anagram of each other?
	//anagram means  2 string are of same length and same letters
	public static void main(String []args) {
		String s1="Bad Credit";
		String s2="Debit Card";
		//remove extra space in between and convert the strings to lower case
		s1=s1.replace(" ","").toLowerCase();
		s2=s2.replace(" ","").toLowerCase();
		int size1=s1.length();
		int size2=s2.length();
		char[]letters1=s1.toCharArray();
		char[]letters2=s2.toCharArray();
		//sort both the charcater arrays letters1 and letters2
		Arrays.sort(letters1);
		Arrays.sort(letters2);
		if(Arrays.equals(letters1, letters2)&& size1==size2) {
			System.out.println("Both strings "+s1+" and "+s2+" are anagram of each other.");
		}
		else {
			System.out.println("Both strings "+s1+" and "+s2+" are not anagram of each other.");	
		}
	}
	*/
	
	/*
	// 6)write a java program to count  each character,the number of times it is repeated in a given string? ( using Hashmap)
	// 6)How to Print count of duplicate characters in a string ( using Hashmap)
	public static void main(String[]args) {
		String s="hello world";
		s.replace(" ","");
		// Converting given string to char array
		char[]letters=s.toCharArray();
		// Creating a HashMap containing char as a key and occurrences as  a value
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		 // checking each char of s
		for(Character c:letters) {
			// If char is present in hashMap hm, incrementing it's count by 1
		if(hm.containsKey(c)) {
			hm.put(c,hm.get(c)+1);
		}
		else {
			// If char is not present in hashMap hm,putting this char to hashMap hm with 1 as it's value
			hm.put(c,1);
		}
		}
        // Printing the hashMap hm
		for(Map.Entry<Character,Integer> m:hm.entrySet()) {
	
			System.out.println(m.getKey()+" "+m.getValue());
		}
		}
	
	*/
	
	
	// 5)write a java program to remove duplicate character from the given string? 
	
	public static void main(String[]args) {
		String s1="programming";
		char[]letters=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=letters.length-1;i++) {
			boolean repeated =false;
		
			for(int j=i+1;j<=letters.length-1;j++) {
				if(letters[i]==letters[j]) {
					repeated=true;
					break;
				}
			}
			if(repeated==false) {
				sb.append(letters[i]);
			}
		}
		System.out.println(sb);
		
	}
}

	

