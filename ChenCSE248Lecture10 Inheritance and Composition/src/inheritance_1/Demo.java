package inheritance_1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Mallard Duck: ");
		MallardDuck duck1 = new MallardDuck();
		duck1.swim();
		duck1.quack();
		duck1.fly();
		duck1.display();
		System.out.println("\nRedhead Duck: ");
		RedheadDuck duck2 = new RedheadDuck();
		duck2.swim();
		duck2.quack();
		duck2.fly();
		duck2.display();
		System.out.println("\nRubber Duckie: ");
		RubberDuckie duck3 = new RubberDuckie();
		duck3.swim();
		duck3.quack();
		duck3.fly();
		duck3.display();
		System.out.println("\nDecoy Duck: ");
		DecoyDuck duck4 = new DecoyDuck();
		duck4.swim();
		duck4.quack();
		duck4.fly();
		duck4.display();
	}

}
