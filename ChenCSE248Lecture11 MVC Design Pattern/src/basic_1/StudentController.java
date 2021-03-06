package basic_1;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name){
		//check name to make sure it is what you want
		model.setName(name);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public void setStudentId(String idNum) {
		model.setIdNum(idNum);
	}
	
	public String getStudentId(){
		return model.getIdNum();
	}
	
	public void updateView() {
		view.printStudent(model.getName(), model.getIdNum());
	}
}
