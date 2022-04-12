package containers;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1= new Label("아이디");
		Label label2= new Label("비밀번호");
		
		TextField id= new TextField();
		PasswordField pw= new PasswordField();
		GridPane grid =new GridPane();
		
		GridPane.setConstraints(label1,0,0);
		GridPane.setConstraints(label2,0,1);
		GridPane.setConstraints(id,1,0);
		GridPane.setConstraints(pw,1,1);
		grid.setHgap(40);
		grid.setVgap(20);
		grid.setPadding(new Insets(50,0,0,20));
		
		FlowPane flow= new FlowPane();
		flow.getChildren().add(new Button("Merge col(0) row(2)"));
		flow.setPrefSize(250, 20);
		flow.setStyle("-fx-background-color:yellow");
		flow.setAlignment(Pos.CENTER);
		
		grid.add(flow, 0, 2, 2, 1);
		
		grid.getChildren().addAll(label1,label2,id,pw);
		primaryStage.setTitle("GridPane");
		primaryStage.setScene(new Scene(grid,300,200));
		primaryStage.show();
		
		
	}

}
