package samplepackage01;

public class Learnsimplewhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=785456, n1=0;
		while (n>0) {
			n1=n1+n%10;
			n=n/10;
			}
		System.out.println("sum of the digits:" +n1);
		}

}
