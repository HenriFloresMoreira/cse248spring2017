package built_in_Observable;

import java.util.Observable;
import java.util.Observer;

public class GpaObserver implements Observer{
	private String name;
	private double gpa;
	
	private static int observerIdTracker = 0;
	private int observerId;
	
	private Student student;
	
	public GpaObserver(Student student) {
		this.student = student;
		this.observerId = ++ observerIdTracker;
		System.out.println("New Observer: " + this.observerId);
		this.student.addObserver(this);
	}
	
	@Override
	public void update(Observable student, Object arg) {
		System.out.println(((Student)student).getName() + ": " + 
						((Student)student).getGpa());
		System.out.println((arg));
	}

}
