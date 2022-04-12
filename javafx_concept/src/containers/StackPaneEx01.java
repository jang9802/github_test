package containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneEx01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(100, 100, Color.WHITE);
		Label label = new Label("사각형 안에 텍스트");

		StackPane stack = new StackPane();
		stack.getChildren().addAll(rec, label);

		primaryStage.setTitle("StackPane Ex");
		primaryStage.setScene(new Scene(stack, 300, 200));
		primaryStage.show();
	}

}
