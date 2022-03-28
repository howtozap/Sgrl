package javaPrograme;

public class Rev {

		public static void main(String[] args)
		{
			String s1="Dream";
		String s2=" ";
		for (int i=s1.length();i<0;i--)
		{
			s2=s2+s1.charAt(i);
			s2=s2.trim();
		}
		
			System.out.println("Original string"+s1);
			System.out.println("Reverse of string"+s2);
			
	}
	}


