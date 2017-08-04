package guvi;


import java.util.Scanner;


public class pro53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String panagram=scan.nextLine();
int n=panagram.length();
char c[]=new char[26];
int g=0;
for(int i=97;i<123;i++){
	c[g]=(char)i;
	g++;
}
int count=0;
for(int i=0;i<c.length;i++){
	if(panagram.contains(String.valueOf(c[i]))){
	count++;	//System.out.println("panagram");
		break;
	}
}
if(count==0){
	System.out.println("not panagram");
}
	else{
		System.out.println(" a panagram");
		
	}
	
	}
}
	


//A quick brown fox jumps over the lazy dog