package containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackpaneEx02 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label= new Label("스마일 이미지");
		BorderPane border=new BorderPane();
		border.setBottom(label);
		
		ImageView iv=new ImageView("/img/smileReRe.png");
		StackPane stack= new StackPane();
		stack.getChildren().addAll(iv,border);
		
		primaryStage.setTitle("StackPane Ex");
		primaryStage.setScene(new Scene(stack,300,200));
		primaryStage.show();
	}
	

}
