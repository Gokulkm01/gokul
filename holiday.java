package eg;

import java.util.Scanner;

public class holiday {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String day=scan.nextLine();
	if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")){
		System.out.println("workingday");
	}
	else{
		System.out.println("holiday");
	}
}

}
