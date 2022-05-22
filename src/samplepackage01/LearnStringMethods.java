package samplepackage01;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Testing";
		System.out.println(str.length());
		
		String str1="  Automation Testing  ";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		char [] chararray01 =str.toCharArray();
		
		for (int i=0;i<=chararray01.length-1;i++) {
			System.out.println(chararray01[i]);
			
		}
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str1.contains(str));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.charAt(5));
		
		
		String Str2 =" Testing is simple. But Automation testing requires coding knowledge.";
		
		String[] split01 = Str2.split(" ");
		
		for (int i=0;i<=split01.length-1;i++) {
			System.out.println(split01[i]);
		}
		
		
		String Str3 =str.replace("T","t");
		System.out.println(Str3);
	}

}
