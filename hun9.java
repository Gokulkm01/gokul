package guvi;

import java.util.Scanner;

public class hun9 {
public static void main(String args[]){

	int a[]=new int[]{1,-2,2};
	int n=a.length;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]+a[j]==0||a[i]+a[j]==1||a[i]+a[j]==-1){
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
}
}
