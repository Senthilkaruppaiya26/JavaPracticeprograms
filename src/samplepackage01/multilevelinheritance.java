package samplepackage01;

public class multilevelinheritance extends singleinheritance02
{
	public void method3()
	{
		System.out.println("this is a parent class");
		
	}

	public static void main(String[] args) {
		multilevelinheritance obj01 = new multilevelinheritance();
		obj01.method01();
		obj01.method02();
		obj01.method3();
		
		// TODO Auto-generated method stub

	}

}
