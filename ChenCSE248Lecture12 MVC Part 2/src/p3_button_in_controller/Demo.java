package p3_button_in_controller;

import javafx.application.Application;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Student model = new Student("Adam", "111");
		GUIView view = new GUIView(primaryStage);
		StudentController controller = new StudentController(model, view);
	}

}
