package p1;

public class Demo implements Java8Interface1, Java8Interface2{

	public static void main(String[] args) {
//		ConcreteClass cc1 = new ConcreteClass();
//		cc1.hi();
//		cc1.fly();
		
		Demo d1 = new Demo();
		d1.hi();
		
	}

//	@Override
//	public void hi() {
//		Java8Interface2.super.hi();
//	}
	@Override
	public void hi() {
		System.out.println("My own hi");
	}

}
