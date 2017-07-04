package guvi;

import java.util.Scanner;

public class coprime {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int temp=0;
		for(int i=2;i<=num1&&i<=num2;i++){
			if(num1%i==0&&num2%i==0){
				System.out.println("not a co prime");
				break;
			}
			else {
				System.out.println("co prime");
			}
			
		}
}
}