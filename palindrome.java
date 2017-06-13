package eg;

import java.util.Scanner;

public class palindrome {
public static void main(String args[]){
	int num;
	int num1;
	int temp;
	int revnum = 0;
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	temp=num;
	while(num>0){
		num1=num%10;
		revnum=revnum*10+num1;
		num=num/10;
	}
	if(temp==revnum){
		System.out.println("it is a palindrom");
	}
	else{
		System.out.println("it is not a palindrom");
	}
}
}
