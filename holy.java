package guvi;

import java.util.Scanner;

public class holy {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String day=scan.nextLine();
		if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

	}


