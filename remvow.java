package guvi;

import java.util.Scanner;

public class remvow {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String m=scan.next();
		String reverse=new StringBuffer(m).reverse().toString();
        String str=reverse.replaceAll("[aeiouAEIOU]","");
        System.out.println(reverse);
        System.out.println(str);
		}
}
