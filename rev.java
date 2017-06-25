package eg;

import java.util.Scanner;

public class rev {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	 int num=scan.nextInt();
	 int rev=0;
	 int rem=0;
	 while(num!=0){
	 {
		 rev=(rev*10)+(num%10);
		 num=num/10;
	 }
	 }
	System.out.println(rev);
}


}
