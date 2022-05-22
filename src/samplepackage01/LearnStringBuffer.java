package samplepackage01;

public class LearnStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Testing");
		
		System.out.println(sb.append(" Web Application"));
		
		System.out.println(sb.insert(12, "Windows "));
		
		System.out.println(sb.replace(12, 19," " ));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.capacity());

	}

}
