package samplepackage01;

public class learnmethodoverriding extends singleinheritanceclass01 {
	@Override
	public void method01() {
		System.out.println("this is derived / overridden class");
	}
	
	public static void main(String[] args) {
		learnmethodoverriding obj01 = new learnmethodoverriding();
		obj01.method01();
		
		// TODO Auto-generated method stub

	}

}
