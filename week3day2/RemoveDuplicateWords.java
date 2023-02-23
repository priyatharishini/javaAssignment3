package week3day2;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateWords 
{

	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String>se=new HashSet<String>();
		StringBuilder result=new StringBuilder();
		for(String word:split)
		{
			if(word.equals("java"))
			{
				se.add(word);
			}
			else
			{
			
				result.append(word).append(" ");
		}
		}
		result.append(String.join(" ", se));
		System.out.println(result.toString());
	
	}
	}


