package week3day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
if(text1.length()==text2.length())
{
	char[] char1 = text1.toCharArray();
char[] char2 = text2.toCharArray();
Arrays.sort(char1);
Arrays.sort(char2);
boolean equals = Arrays.equals(char1, char2);
if(equals)
{
	System.out.println("both the strings are same anagram");
}
else
{
	System.out.println("both the strings are not same anagram");
}
}
else
{
	System.out.println("both the strings have different ");
}
}
	}


