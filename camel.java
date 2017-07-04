package guvi;

import java.util.Scanner;

public class camel {
public static void main(String args[]){
	String str;
	Scanner Scan=new Scanner(System.in);
	str=Scan.next();
	char ch;
	int temp;
	for(int i=0;i<str.length();i++){
		ch=str.charAt(i);
		if(str.charAt(0)>='A'&&str.charAt(0)<='Z'){
		          System.out.println("it is a camel case");
		          break;
		}
		else
			System.out.println("it is not a camel case");
		break;
	}
}
}
