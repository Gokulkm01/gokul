package guvi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class hun12 {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	 a[i]=scan.nextInt();
	Arrays.sort(a);
	int r[]=new int[a.length];
	for(int i=0;i<a.length;i++){
		r[i]=a[a.length-i-1];
		
	}
	//System.out.println(a[i]);
	System.out.println("Enter the pos:");
	int pos=scan.nextInt();
	System.out.println("Values in that pos is:");
	System.out.println(r[pos]);
	
}
}
