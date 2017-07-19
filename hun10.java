package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class hun10 {
public static void main(String[] args){ 
int []a=new int[]{1,2,3,4,5};
int []b=new int[]{3,4,5};
String s1[]=new String[10];
String s2[]=new String[10];
String op="";
for(int i=0;i<a.length;i++){
	String a1=String.valueOf(a[i]);
	op=op+a1;
	
}	
String op1="";
for(int i=0;i<b.length;i++){
	String a1=String.valueOf(b[i]);
    op1=op1+a1;
	
}
	if(op.contains(op1)){
		System.out.println("it is a subset");
	}
	else{
        System.out.println("it is not a subset");
	}
}
}


