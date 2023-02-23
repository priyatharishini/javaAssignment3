package week3day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{
public static void main(String[] args) 
	{
		String str = "PayPal India";
		char[] charArray = str.toLowerCase().toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        Set<Character> dupCharSet = new HashSet<Character>();
        for (Character c : charArray)
        {
            if (!charSet.add(c)) 
            {
                dupCharSet.add(c);
      System.out.println(dupCharSet);
            }
        }
        
        charSet.removeAll(dupCharSet);
        for (Character c : charSet) 
        {
            if (c!=' ') 
            {
                System.out.print(c);
            }
        }
    }
}