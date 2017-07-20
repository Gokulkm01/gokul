package guvi;

import java.util.Scanner;

public class hun62 {
public static void main(String args[]){
	  Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	      a[i]=scan.nextInt();
	      }
	    int sell=scan.nextInt();
	    int max=a[0];
	    int min=a[a.length-1];
	    for(int i=0;i<a.length;i++){
	    	if(a[i]>max){
	    		max=a[i];
	    	}
	    }
	    int maxBen=max-sell;
	    System.out.println(maxBen);
}
}
