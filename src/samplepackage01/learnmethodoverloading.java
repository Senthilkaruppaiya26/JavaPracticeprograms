package samplepackage01;

public class learnmethodoverloading {
	public int methodadd(int a, int b, int c)
	{
		int d;
		d=a+b+c;
		return d;
	}
public String methodadd(String a, String b)
{
	String c= a.concat(b);
	return c;
	}
	public static void main(String[] args) {
		learnmethodoverloading over = new learnmethodoverloading();
		System.out.println(over.methodadd("Selenium", "Testing"));
		System.out.println(over.methodadd(45, 67, 89));
		// TODO Auto-generated method stub

	}

}
