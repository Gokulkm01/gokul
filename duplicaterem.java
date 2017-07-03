package guvi;

public class duplicaterem {
public static void main(String args[]){
	String str="malayalam";
	StringBuffer str1=new StringBuffer(str);
	for(int i=0;i<str1.length();i++){
		for(int j=i+1;j<str1.length();j++){
			if(str1.charAt(i)==str1.charAt(j)){
				str1.deleteCharAt(j);
			}
		}
	}
	System.out.println(str1);
}

}
