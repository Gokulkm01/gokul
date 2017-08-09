package trycode;

import java.util.Scanner;

public class boxsquare {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int s=scan.nextInt();
	for(int i=0;i<s;i++){
		for(int j=0;j<s;j++){
			if(i==0){
				System.out.print('*');
			}
			else if(j==0){
				System.out.print('*');
			}
			else if(j==(s-1)){
				System.out.print('*');
			}else if(i==(s-1)){
				System.out.print('*');
			}			
			else{
				System.out.print(' ');
			}
		}
		System.out.println();
	}
}
}
