package Abstraction;

import java.util.LinkedHashSet;

public class LocationOfCharacter {
	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			/*
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"="+(i+1));
					break;
				}
				*/
			//if we want to print in reverse order
			for(int j=s.length()-1;j>=0;j--)
			{
				System.out.println(ch+"="(j+1));
				
			
				
			}
			
			
		}
		
	}

}
