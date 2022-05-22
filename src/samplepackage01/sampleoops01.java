package samplepackage01;

public class sampleoops01 {

	String mobilename = "Realme";
	public String getName() 
	{
		return mobilename;
		
	}
	public int mobprice() 
	{
		int price = 98765;
		return price;
		
	}
	boolean usagecondition=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sampleoops01 obj01 = new sampleoops01();
		String name = obj01.getName();
        System.out.println(name);
        System.out.println(obj01.mobprice());
        System.out.println(obj01.usagecondition);
	}

}
