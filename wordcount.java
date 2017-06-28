package eg;

import java.util.Scanner;

public class wordcount{
	public static void main(String[] args){
		String  string;
		int wordc=1;
		Scanner scan=new Scanner(System.in);
		string=scan.nextLine();
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==' '){
				wordc++;
			}
		}
		System.out.println(wordc);
	}
}
