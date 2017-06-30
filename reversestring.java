package guvi;

import java.util.Scanner;

public class reversestring {
	
	    public static void main(String args[]){
	    	Scanner scan=new Scanner(System.in);
	    	String str1=scan.nextLine();
	    String str[] = str1.split(" ");
	    String temp="";
	        for(int i = str.length-1; i>= 0 ;i--){
	            temp += str[i]+" ";
	        }
	        System.out.println(temp);
	    }
}