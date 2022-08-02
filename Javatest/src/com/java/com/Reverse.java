package com.java.com;

public class Reverse {
	public static void main(String[] args) {
		
	String s= "AnIsHraja";
	String sml = "";
	String big="";
	
	for (int i =0; i <=s.length()-1; i++) {
		
		char ch = s.charAt(i);
		
		if(ch>='A'&& ch<='Z' ) {
			big=big+ch;
			
		}
		else {
			
			sml=sml+ch;
		}
		
		
	}
	
	System.out.println(big);
	System.out.println(sml);
	}
}
