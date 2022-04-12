package containers;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneEx02 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ListView<String> lv = new ListView<>();
		for(int i=0;i<20;i++) {
			lv.getItems().add("아이템 "+i);
		}
		lv.setPrefSize(200, 100);
		lv.setLayoutX(90);
		lv.setLayoutY(50);
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(lv);
		
		Scene scene = new Scene(anchor, 900, 700);
		primaryStage.setTitle("AnchorPane Ex02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
