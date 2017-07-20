package guvi;

public class hun68 {
public static void main(String args[]){
	int a[]=new int[]{2,3,4,2,3};
	int len=a.length;
	int val[]=new int[len];
	for(int i=0,j=1;i<len&&j<len;i++,j++){
		val[i]=a[i]-a[j];
		val[i]=Math.abs(val[i]);
		//System.out.println(val[i]+" = "+a[i]+" - "+a[j]);
	}
	int max=val[0];
	for(int i=0;i<len;i++){
		if(val[i]>max){
			max=val[i];
		//	System.out.println(max+" is the maximum number");
			System.out.println(i+" is the Index");
		}
	}
}
}
