package guvi;

import java.util.Scanner;

public class hun70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=scan.nextInt();
      }
    int sum=0;
    for(int i=0;i<n;i++){
    	sum+=a[i];
    	
    }
    System.out.println(sum);
    int t=scan.nextInt();
    String s1=String.valueOf(sum);
    String s2=String.valueOf(t);
    if(s2.contains(s1)){
     System.out.println("true");
    }else{
    	 System.out.println("false");
    }
	}

}
