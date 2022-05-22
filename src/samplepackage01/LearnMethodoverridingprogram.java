package samplepackage01;

public class LearnMethodoverridingprogram  extends singleinheritanceclass01 {
	
	@Override
	public void method01() {
		System.out.println("This is derived/overridden class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethodoverridingprogram obj01 = new LearnMethodoverridingprogram();
		obj01.method01();

	}

}
