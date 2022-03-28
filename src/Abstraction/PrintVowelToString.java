package Abstraction;

public class PrintVowelToString {
	public static void main(String[] args) {
		String s="testyantra";
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o' || ch[i]=='u')
			{
				count++;
				
			}
		}
		System.out.println("number of vowel"+count);
		
	}

}
