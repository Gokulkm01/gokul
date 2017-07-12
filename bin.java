package trycode;
import java.util.*;
public class bin {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String[] b1=Integer.toBinaryString(a[i]).concat("0").split("1");
				String[] b2=Integer.toBinaryString(a[j]).concat("0").split("1");
				if(b2.length>b1.length){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(b1.length==b2.length){
					if(a[j]>a[i]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
