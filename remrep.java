package guvi;

import java.util.Scanner;

public class remrep {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count<2)
			{
				System.out.print(str.charAt(i));
			}
			count=0;
		}
	}
		//System.out.println(str);
	}


	

