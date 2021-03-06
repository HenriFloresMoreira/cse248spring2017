package mixedBag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Courses {
	private int i = 10;
	private Collection<Course> courseSet = new TreeSet<Course>();//composition
	// courseSet is created when the .class file is loaded into JVM

//	public Courses() {  // courseSet created when the Courses constructor is called
//		courseSet = new TreeSet<Course>();
//	}
	
		
	public double getGPA() {
		double credits = 0;
		double creditValue = 0;
		Iterator it = courseSet.iterator();
		for (int i = 0; i < courseSet.size(); i++) {
			Course c = (Course) it.next();

			double creditsC = c.getCredits();
			switch (c.getLetterGrade()) {
			case "A":
				creditValue += 4.0 * creditsC;
				break;
			case "B+":
				creditValue += 3.5 * creditsC;
				break;
			case "B":
				creditValue += 3.0 * creditsC;
				break;
			case "C+":
				creditValue += 2.5 * creditsC;
				break;
			case "C":
				creditValue += 2.0 * creditsC;
				break;
			case "D+":
				creditValue += 1.5 * creditsC;
				break;
			case "D":
				creditValue += 1.0 * creditsC;
				break;
			case "F":
				creditValue += 0.0;
				break;
			}
			credits += creditsC;
		}
		return creditValue / credits;
	}

	public void add(Course course) { // aggregation
		courseSet.add(course);
	}

	public boolean remove(String courseNum) {
		for (Course c : courseSet) {
			if (c.getCourseNum().equals(courseNum)) {
				courseSet.remove(c);
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return courseSet.toString();
	}

}
