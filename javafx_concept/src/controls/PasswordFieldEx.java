package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordFieldEx extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		PasswordField text1 = new PasswordField();
		PasswordField text2 = new PasswordField();
		text1.setMaxSize(180, 60);
		text2.setMaxSize(180, 60);

		VBox box = new VBox();
		box.getChildren().addAll(text1, text2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		primaryStage.setTitle("PasswordFieldEx");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
