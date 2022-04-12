package containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz02 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		Pane p4 = new Pane();
		Pane p5 = new Pane();
		Pane p6 = new Pane();

		p1.setPrefSize(120,100);
		p2.setPrefSize(120,100);
		p3.setPrefSize(120,100);
		p4.setPrefSize(120,100);
		p5.setPrefSize(120,100);
		p6.setPrefSize(120,100);

		p1.setStyle("-fx-background-color: blue");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		p4.setStyle("-fx-background-color: blue");
		p5.setStyle("-fx-background-color: red");
		p6.setStyle("-fx-background-color: black");

		HBox box1 = new HBox();
		HBox box2 = new HBox();
		VBox box3 = new VBox();
		box1.getChildren().addAll(p1, p2, p3);
		box1.setSpacing(10);
		box2.getChildren().addAll(p4, p5, p6);
		box2.setSpacing(10);
		box3.getChildren().addAll(box1,box2);
		box3.setSpacing(10);
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(new Scene(box3, 400, 200));
		primaryStage.show();
	}

}
