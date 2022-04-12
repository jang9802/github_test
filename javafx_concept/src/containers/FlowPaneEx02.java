package containers;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneEx02 extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) throws Exception {
		Button button1= new Button("버튼1");
		Button button2= new Button("버튼2");
		Button button3= new Button("버튼3");
		
		FlowPane flow =new FlowPane();
		flow.getChildren().add(button1);
		flow.getChildren().addAll(button2,button3);
		
		primaryStage.setScene(new Scene(flow,200,100));
		primaryStage.show();
	}
}
