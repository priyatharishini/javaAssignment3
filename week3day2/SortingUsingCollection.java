package week3day2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length = company.length;
		System.out.println("the length of the string "+length);
		Arrays.sort(company);
	for(int i=length-1;i>=0;i--)
	{
		System.out.print(company[i]+",");
	}
	}
	

}
