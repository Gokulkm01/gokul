package best;

public class primeint {
public static void main(String args[]){
	int i;
	for( i=1;i<99;i++){
		boolean isprime=true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				isprime=false;
				break;
			}
		}
		if(isprime){
			System.out.print(" "+i);
			}
	}
	
}
	
}
