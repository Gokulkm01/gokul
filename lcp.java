package guvi;

import java.util.Scanner;

public class lcp {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	String str1=scan.nextLine();
	int len=str.length();
	if(len>str1.length()){
		len=str1.length();
	}
	StringBuffer value=new StringBuffer();
	for(int i=0;i<len;i++){
		if(str.charAt(i)==str1.charAt(i)){
		value.append(str.charAt(i));	
		}
	}
	System.out.println(value);
}
}
