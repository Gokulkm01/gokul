package guvi;

public class hun6 {
public static void main(String args[]){
	int a[]=new int[]{3,2,4,2,4,5,9,7};
	int count=0;
	int val[]=new int[a.length];
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]&&(i!=j)){
				val[count]=a[i];
				count++;
				
			}
		}
	}
	System.out.println(val[0]);	
}
}
