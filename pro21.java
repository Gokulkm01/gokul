package guvi;

import java.util.Scanner;

public class pro21 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
	int s1=0;
	int s2=0;
	int c1=0;
	int c2=0;
	for(int i=0;i<n/2;i++){
		s1=s1+a[i];
		++c1;
		
	}
	for(int i=n/2;i<n;i++){
		s2=s2+a[i];
		++c2;
	
	}
	s1=s1/c1;
	s2=s2/c2;
	System.out.println(s1);
	System.out.println(s2);
	
	if (s1 == s1) {
		System.out.println(" Average is Equal");
	} else {
		System.out.println("Average is not equal");
	}
}
}
