package Abstraction;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicate {
	public static void main(String[] args) {
		String s="go to to theatre";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)//str[i]=go to to theatre
		{
			set.add(str[i]);//set=go to theatre
		}
		for(String word: set)//word=go to theatre
		{
			int count=0;
			for(int i=0;i<str.length;i++)//str[i]=go to to theatre
			{
			  if(word.equals(str[i]))//str[i]=go to theatre
			  {
				  count++;
			  }
			}
			System.out.println(word+"="+count);
		}
		
	}

}
