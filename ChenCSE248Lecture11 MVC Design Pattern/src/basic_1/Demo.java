package basic_1;

public class Demo {

	public static void main(String[] args) {
		Student model = new Student("Dave", "1111");
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();
		controller.setStudentId("2222");
		controller.updateView();
		
	}

}
