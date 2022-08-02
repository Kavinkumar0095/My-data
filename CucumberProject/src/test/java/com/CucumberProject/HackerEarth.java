package com.CucumberProject;

public class HackerEarth {
	
	static String strVal;
	
	public static void main(String[] args) {
		
		HackerEarth h1 = new HackerEarth();
		strVal = h1.getString("Program");
		System.out.println(" "+strVal);
		
		
	}
	
	public static  String getString(String str) {

		StringBuffer buffer = new StringBuffer(str.length());
		
		for (int i = str.length()-1; i >0; i--) {
			
			
			buffer.append(str.charAt(i));
			
		}
		
		return buffer.toString();
	}
	
	
	

}
