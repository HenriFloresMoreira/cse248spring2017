package p1;

public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void getStudentInfo() {
		String[] info = view.getStudentDetails();
		model.setName(info[0]);
		model.setIdNum(info[1]);
	}

	public String getName() {
		return model.getName();
	}

	public String getIdNumber() {
		return model.getIdNum();
	}

	public void setStudentInfo(String n, String id) {
		model.setName(n);
		model.setIdNum(id);
	}

	public void updateView() {
		view.printStudentDetails(getName(), getIdNumber());
	}
}
