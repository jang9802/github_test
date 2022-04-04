package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//class.application.Ex1
		System.out.println(getClass());		

		System.out.println(getClass().getResource("Ex1.fxml"));		
		//생성자에 넣어준 fxml파일 실행준비
		FXMLLoader loader= new FXMLLoader(getClass().getResource("Ex1.fxml"));
		// Ex1.fxml 메모리에 로드(인스턴스 (객체)생성)
		Parent form=loader.load();
		Scene scene=new Scene(form);
		
		primaryStage.setTitle("Ex1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
