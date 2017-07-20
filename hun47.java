package guvi;

public class hun47 {
public static void main(String args[]){
	String str="my brother is taller than me@1233334.i am always a short man,but smarter than him";
	String str1 = null;
	for(int i=0;i<str.length();i++){
		if(str.contains(" ")){
			str1=str.replaceAll("\\s","");
		}
	}
	int count=0;
	String count1="";
	System.out.println("After removing the space: "+str1);
	System.out.println("length: "+str1.length());
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==('e')){
	    count++;		
		}
	}
	System.out.println("Count the variable e "+count);
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=(int)45&&str.charAt(i)<=(int)60){
	    count1+=str.charAt(i);
		}
	}
	System.out.println("Number of Integers: "+count1);
	String same[]=str.split(" ");
	int c=0;
	int c1=0;
	for(int i=0;i<same.length;i++){
		for(int j=0;j<same.length;j++){
			if(i!=j){
		if(same[i].equals(same[j])){
			c1++;
		}
			}
	}
	}
	  System.out.println("Number of Doubles: " +c1);
	  for(int i=0;i<same.length;i++){
		  c++;
	  }
	  System.out.println("Number of Words" +c);
	  String split[]=str.split("\\.");
	  int sp=0;
	  for(int i=0;i<split.length;i++){
		//  System.out.println(split[i]);
		  sp++;
	  }
	  System.out.println("Number of sentences: " +sp);
			  
		 
	  
	}
}

