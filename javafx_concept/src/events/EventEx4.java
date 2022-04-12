package events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventEx4 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button();
		button1.setText("클릭");
		button1.setPrefSize(50, 50);

		Button button2 = new Button();
		ImageView image = new ImageView("/img/smilerere.png");
		image.setFitHeight(40);
		image.setFitWidth(40);
		button2.setGraphic(image);
		button1.setStyle("-fx-padding: 10 10 10 10");
		button2.setStyle("-fx-padding: 10 10 10 10");

		button1.setOnMousePressed(event -> {
			button1.setStyle("-fx-padding: 15 10 10 10");
		});
		button1.setOnMouseReleased(event -> {
			button1.setStyle("-fx-padding: 10 10 10 10");
		});
		button2.setOnMousePressed(event -> {
			button2.setStyle("-fx-padding: 15 10 10 10");
		});
		button2.setOnMouseReleased(event -> {
			button2.setStyle("-fx-padding: 10 10 10 10");
		});
	
		HBox box = new HBox();
		box.getChildren().addAll(button1, button2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(40);

		primaryStage.setTitle("EventEx4");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}

