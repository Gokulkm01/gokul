package guvi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class hun5 {
public static void main(String args[]){
	String str="12258";
	String s=str.toLowerCase();
	for(int i=0;i<s.length();i++){
		int a=s.charAt(i);
		a=a+16;
		char a1=(char)a;
		String s1=Character.toString(a1);
		System.out.print(s1.toLowerCase());
	}
}
}
