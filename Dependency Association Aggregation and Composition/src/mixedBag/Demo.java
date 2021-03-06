package mixedBag;

public class Demo {
	/*
	 * An association almost always implies that one object has the 
	 * other object as a field/property/attribute (terminology 
	 * differs). A dependency typically (but not always) implies 
	 * that an object accepts another object as a method parameter, 
	 * instantiates, or uses another object. A dependency is very 
	 * much implied by an association.
	 */

	public static void main(String[] args) {
		Instructor i1 = new Instructor("Adam", Rank.PROFESSOR);
		Instructor i2 = new Instructor("Eve", Rank.INSTRUCTOR);
		Course c1 = new Course("CSE118", "Intro to Java", 3, "C+", i1);
		Course c2 = new Course("CSE148", "Object Oriented Programming", 4, "A", i2);
		Courses courses = new Courses();
		courses.add(c1);
		courses.add(c2);
		courses.add(c1);
//		courses.remove("CSE168");
//		courses.remove("CSE148");
		
//		System.out.printf("GPA is %5.2f\n",  courses.getGPA());
		System.out.println(courses.toString());
	}

}
