package samplepackage01;

public class LearnsimpleDowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=765436, n1=0;
		do{
		 n1=n1+n%10;
		 n=n/10;
		}while (n>0);
	System.out.println("sum of the digits:" +n1);
	}

}
