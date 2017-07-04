package guvi;

import java.util.Scanner;

public class emailvalid {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String mail=scan.next();
	if(mail.contains("@")&&mail.contains(".")&&(mail.indexOf("@")==mail.lastIndexOf("@"))&&(mail.indexOf(".")==mail.lastIndexOf("."))&&(mail.indexOf(".")-mail.indexOf("@")-1>4)&&mail.indexOf("@")>3&&mail.endsWith(".com"))
     System.out.println("valid");		
	
	else
		System.out.println("not valid");
	
}
}
