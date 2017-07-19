package guvi;

public class hun4 {
public static void main(String args[]){
	int a[]=new int[]{1,2,6,9,9,6,3,2,1};
	int count=0;
	for(int i=0;i<a.length;i++){
		count=0;
		for(int j=0;j<a.length;j++){
			if(i!=j){
			if(a[i]==a[j]){
				count++;
				}
			}
		}
		if(count==0){
				System.out.println(a[i]);			
		}
		}
	//System.out.println(count);
}
}
