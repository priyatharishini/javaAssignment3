package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String text="babu";
char[] charArray = text.toCharArray();
	Set<Character> si=new HashSet<Character>();
	for(Character ch:charArray)
	if(!si.add(ch))
	{
		si.remove(ch);
	}
	 for (Character Char : si) 
	 {
         System.out.print(Char + " ");
	}
	}
}
