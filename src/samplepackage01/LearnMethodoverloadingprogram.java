package samplepackage01;

public class LearnMethodoverloadingprogram {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	public int methodadd(int a ,int b ,int c) {
		int d;
		d=a+b+c;
		return d;
		
	}
	public String methodadd(String a , String b) {
	String c = a.concat(b);
	return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethodoverloadingprogram over = new LearnMethodoverloadingprogram();
		System.out.println(over.methodadd("selenium", "Testing"));
		System.out.println(over.methodadd(45, 67, 23));
	}
}
	
	

	


