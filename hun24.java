package guvi;

import java.util.Scanner;

public class hun24 {
public static void main(String arg[]){
	int a[]=new int[]{2,6,11,15,7};
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]+a[j]==n&&i!=j){
				System.out.println(a[i]+" "+a[j]);
				count=1;
			}
		}
	}
		 if(count==0)	{
				System.out.println("no");
				
			}
		
	}
}

