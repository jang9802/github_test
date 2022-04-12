package basic;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Toolkit tk= Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		Label label=new Label("Quiz");
		label.setFont(new Font(20.0));
		
		Scene scene =new Scene(label,1000,700);
		primaryStage.setTitle("welcome");
		primaryStage.setX((screenSize.width)/2-500);
		primaryStage.setY((screenSize.height)/2-350);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
