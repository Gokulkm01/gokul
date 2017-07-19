package guvi;

public class hun45 {
public static void main(String args[]){
	String[] str=new String[]{"AG","AE","GR","F","AG","AE","GR"};
	int count=0;
	for(int i=0;i<str.length;i++){
		count=0;
		for(int j=i+1;j<str.length;j++){
			if(str[i]==str[j]&&i!=j){
				count++;
			}
		}
		if(count==0){
			System.out.println(str[i]);
			break;
		}
	}

	}
}

