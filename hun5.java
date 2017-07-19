package guvi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class hun5 {
public static void main(String args[]){
	String str="abc";
	String s=str.toLowerCase();
	for(int i=0;i<s.length();i++){
		int a=(int)s.charAt(i);
		a=a-96;
		String s1=Integer.toString(a);
		System.out.print(a);
	}
/*	Scanner sc=new Scanner(System.in);
    String a=sc.next();
	String b=a.toLowerCase();
	String s1="";
	 for(int i=0;i<b.length();i++)
	    {
		    int a1=(int)b.charAt(i);
		    a1=a1-96;
		    String s=Integer.toString(a1);
		    s1=s1+s;
}System.out.println(s1);*/
}
}
