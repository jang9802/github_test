package events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label imageLabel = new Label("Search", new ImageView("/img/search.png"));
		Label rotateLabel = new Label("Values");
		Label textLabel = new Label("A label that nees to be warraped");
		
		imageLabel.setFont(new Font("Arial", 28));
		imageLabel.setTextFill(Color.BLUEVIOLET);
		
		rotateLabel.setFont(new Font("맑은 고딕", 24));
	
		textLabel.setWrapText(true);
		textLabel.setPrefWidth(100);
		

		imageLabel.setOnMouseEntered(event->{
			imageLabel.setScaleX(1.5);
			imageLabel.setScaleY(1.5);
		} );
		
		imageLabel.setOnMouseExited(event->{
			imageLabel.setScaleX(1);
			imageLabel.setScaleY(1);
		});
		
		rotateLabel.setOnMouseEntered(event->{
			rotateLabel.setScaleX(1.5);
			rotateLabel.setScaleY(1.5);
			rotateLabel.setRotate(270);
		} );
		
		rotateLabel.setOnMouseExited(event->{
			rotateLabel.setScaleX(1);
			rotateLabel.setScaleY(1);
			rotateLabel.setRotate(0);
		});
		
		textLabel.setOnMouseEntered(event->{
			textLabel.setScaleX(1.5);
			textLabel.setScaleY(1.5);
		} );
		
		textLabel.setOnMouseExited(event->{
			textLabel.setScaleX(1);
			textLabel.setScaleY(1);
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(imageLabel, rotateLabel, textLabel);
		box.setSpacing(40);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Quiz1");
		primaryStage.setScene(new Scene(box, 500, 300));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}