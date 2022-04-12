package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxEx extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();

		p1.setPrefHeight(80);
		p2.setPrefHeight(80);
		p3.setPrefHeight(80);

		p1.setMaxWidth(120);
		p2.setMaxWidth(120);
		p3.setMaxWidth(120);

		p1.setStyle("-fx-background-color: green");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");

		VBox box = new VBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10);
		box.setPadding(new Insets(10));
		primaryStage.setTitle("VBoxEx");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
	}
}