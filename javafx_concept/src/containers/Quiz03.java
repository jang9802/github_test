package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz03 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public Pane getPane(String color, int width, int height) {
		Pane p = new Pane();
		p.setPrefSize(width, height);
		p.setStyle("-fx-background-color: "+color);
		return p;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		VBox box1 = new VBox();
		box1.getChildren().add(getPane("red", 250, 50));
		box1.getChildren().add(getPane("orange", 250, 50));
		box1.setSpacing(10);
		
		VBox box2 = new VBox();
		box2.getChildren().add(getPane("black", 100, 110));
		
		HBox h = new HBox();
		h.getChildren().addAll(box1, box2);
		h.setSpacing(10);
		h.setPadding(new Insets(20));
		primaryStage.setTitle("Quiz3");
		primaryStage.setScene(new Scene(h, 400, 200));
		primaryStage.show();
		
		
	}
}
