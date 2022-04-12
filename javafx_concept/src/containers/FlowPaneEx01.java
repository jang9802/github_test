package containers;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneEx01 extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) throws Exception {
		FlowPane flow =new FlowPane();
		ArrayList<Button>buttons= new ArrayList<Button>();
		for(int i=0;i<15;i++) {
			buttons.add(new Button("버튼 "+i));
			flow.getChildren().add(buttons.get(i));
		}
		flow.setHgap(30);
		flow.setVgap(30);
		
		primaryStage.setScene(new Scene(flow,400,200));
		primaryStage.show();
	}
}
