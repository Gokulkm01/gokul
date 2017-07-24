package guvi;

import java.util.Scanner;

public class hun44 {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
	if(a>=1 && a<=9999 && b>=1 && b<=9999 && c>=0 && c<=9 && d>=0 && d<=9){
	for(int i=a,j=a;i<=b;i++,j++){
		if(i%10==c||i%10==d){
			System.out.println(i+" ");
			
		}
	}
	}
	
}
}
