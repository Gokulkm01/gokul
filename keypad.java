package guvi;

import java.util.Scanner;

public class keypad {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String num=scan.next();
	if(num.equals("2")){
		System.out.println("ABC");
	}
	if(num.equals("3")){
		System.out.println("DEF");
	}
	if(num.equals("4")){
		System.out.println("GHI");
	}
	if(num.equals("5")){
		System.out.println("JKL");
	}
	if(num.equals("6")){
		System.out.println("MNO");
	}
	if(num.equals("7")){
		System.out.println("PQRS");
	}
	if(num.equals("8")){
		System.out.println("TUV");
	}
	if(num.equals("9")){
		System.out.println("WXYZ");
	}
	if(num.equals("1")||num.equals("0")||num.equals("#")||num.equals("*")){
		System.out.println("No Equvalent key Found");
	}
}
}
