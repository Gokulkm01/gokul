package guvi;

public class hun72 {
public static void main(String args[]){
	String str="This is an example for this program";
	String split[]=str.split(" ");
	String rev[]=new String[str.length()];
	for(int i=0;i<str.length();i++){
	//	System.out.println(split[i]);
	
		if(i%2==0){
			//rev[i]=split[split - i-1];
			String s=new StringBuffer(split[i]).reverse().toString();
			System.out.print(s+" ");
		}
		else{
			System.out.print(split[i]+" ");
		}
	}
}
}
