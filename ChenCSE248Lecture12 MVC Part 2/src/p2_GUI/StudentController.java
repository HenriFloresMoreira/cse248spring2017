package p2_GUI;

public class StudentController {
	private Student model;
	private GUIView view;
	
	public StudentController(Student model, GUIView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public String[] getStudentDetails() {
		return view.getStudentDetails();
	}
	
	public void setStudentDetails(String[] info) {
		model.setName(info[0]);
		model.setIdNum(info[1]);
	}
	
	public void setStudentIdNum(String id) {
		model.setIdNum(id);
	}
	
	public String getStudentIdNum() {
		return model.getIdNum();
	}
	
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getIdNum());
	}
	
}
