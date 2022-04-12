package events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	public void imageSize(ImageView image) {
		image.setFitHeight(45);
		image.setFitWidth(45);
	}
	
	public void style(ToggleButton button) {
		button.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		button.setOnMousePressed(event -> {
			button.setStyle("-fx-background-color: transparent; -fx-padding: 6 4 4 6;");
		});
		button.setOnMouseReleased(event -> {
			button.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ImageView iv1 = new ImageView("/img/warrior.png");
		imageSize(iv1);
		ToggleButton tb1 = new ToggleButton();
		tb1.setGraphic(iv1);

		ImageView iv2 = new ImageView("/img/magi.png");
		imageSize(iv2);
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(iv2);

		ImageView iv3 = new ImageView("/img/rogue.png");
		imageSize(iv3);
		ToggleButton tb3 = new ToggleButton();
		tb3.setGraphic(iv3);

		HBox jobBox = new HBox();
		jobBox.getChildren().addAll(tb1, tb2, tb3);
		jobBox.setSpacing(-8);

		ImageView iv4 = new ImageView("/img/warrior.png");
		imageSize(iv4);
		ToggleButton tb4 = new ToggleButton();
		tb4.setGraphic(iv4);

		HBox hairBox = new HBox();
		hairBox.getChildren().addAll(tb4);

		ImageView iv5 = new ImageView("/img/warrior.png");
		imageSize(iv5);
		ToggleButton tb5 = new ToggleButton();
		tb5.setGraphic(iv5);

		HBox motionBox = new HBox();
		motionBox.getChildren().addAll(tb5);

		style(tb1);
		style(tb2);
		style(tb3);
		style(tb4);
		style(tb5);

		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		Pane p4 = new Pane();
		p1.setPrefHeight(27);
		p2.setPrefHeight(32);
		p3.setPrefHeight(25);
		p4.setPrefHeight(30);
		VBox vBox = new VBox();
		vBox.getChildren().add(p1);
		vBox.getChildren().add(jobBox);
		vBox.getChildren().add(p2);
		vBox.getChildren().add(hairBox);
		vBox.getChildren().add(p3);
		vBox.getChildren().add(motionBox);
		vBox.getChildren().add(p4);

		Pane topPane = new Pane();
		topPane.setPrefHeight(50);
		Pane leftPane = new Pane();
		leftPane.setPrefWidth(15);

		BorderPane leftborder = new BorderPane();
		leftborder.setTop(topPane);
		leftborder.setLeft(leftPane);
		leftborder.setCenter(vBox);

		BorderPane border = new BorderPane();
		border.setLeft(leftborder);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(new ImageView("img/l2char.png"), border);
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(stack));
		primaryStage.show();
	}

}
