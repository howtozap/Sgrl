package Abstraction;
import java.util.LinkedHashSet;

public class FindTheduplicatesOfGivenString {
	public static void main(String[] args) {
		String p="Prashant";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<p.length();i++)
		{
			//System.out.println(p.charAt(i));
			set.add(p.charAt(i));
			//System.out.println(set);
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<p.length();i++)
			{
				if(ch==p.charAt(i)) {
					count++;
				}
				
			}
			System.out.println(ch+"="+count);
		}
		
	}

}
