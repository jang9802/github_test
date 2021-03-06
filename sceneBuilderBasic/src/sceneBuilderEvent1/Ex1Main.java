
package sceneBuilderEvent1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ex1.fxml"));
		
		Parent form = loader.load();
		Scene scene = new Scene(form);
		
		primaryStage.setTitle("Ex1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

