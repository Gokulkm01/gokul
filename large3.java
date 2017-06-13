package eg;

import java.util.Scanner;

public class large3 {
public static void main(String args[]){
	int num;
	int array[]=new int[]{5,8,2};
	int largenum=array[0];		
	for(int i=0;i<array.length;i++){
		if(array[i]>largenum){
			largenum=array[i];
		}
	}
	
	System.out.println(""+largenum);
}
}
