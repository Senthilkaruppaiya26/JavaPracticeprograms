package samplepackage01;

public class LearnSwitchprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =32, b=15;
		int choice=130 ;
		
		switch(choice) {
		case 0:
			System.out.println("The addition of 2 nos is:" +(a+b));
			break;
		case 1: System.out.println("The subtraction of 2 nos is:" +(a-b));
		 break;
		case 2: System.out.println("The Product of 2 nos is:" +(a*b));
		 break;
		case 3: System.out.println("The product of 2 nos is:" +(a/b));
		 break;
		 default: System.out.println("The product of 2 nos is:" +(a%b));
		 break;
		}

	}

}
