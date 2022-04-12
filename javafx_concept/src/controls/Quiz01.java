package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border=new BorderPane();
		HBox h= new HBox();
		HBox h1= new HBox();
		HBox h2= new HBox();
		HBox h3= new HBox();
		HBox h4= new HBox();
		VBox v= new VBox();
		VBox v3= new VBox();
		VBox v4= new VBox();
		// 위
		ArrayList<Label> labels = new ArrayList<Label>();
		labels.add(new Label("홈"));
		labels.add(new Label("사회"));
		labels.add(new Label("경제"));
		labels.add(new Label("국제"));
		labels.add(new Label("문화"));
		FlowPane flowTop=new FlowPane();
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setPadding(new Insets(20));
		flowTop.setHgap(20);
		flowTop.getChildren().addAll(labels);
		border.setTop(flowTop);
		//왼쪽
		ArrayList<Label> list1 = new ArrayList<>();
		list1.add(new Label("카테고리"));
		list1.add(new Label("노트북/PC"));
		list1.add(new Label("자동차용품"));
		list1.add(new Label("휴대폰"));
		list1.add(new Label("캠핑/낚시"));
		v.getChildren().addAll(list1);
		v.setSpacing(20);
		v.setPadding(new Insets(20));
		border.setLeft(v);
		//가운데
		Label id=new Label("ID");
		Label pw=new Label("PW");
		TextField text1 = new TextField();
		text1.setMaxSize(100, 20);
		PasswordField text2 = new PasswordField();
		text2.setMaxSize(100, 20);
		h.getChildren().addAll(id, text1);
		h.setSpacing(15);
		h1.getChildren().addAll(pw, text2);
		h1.setSpacing(10);
		
		RadioButton woman = new RadioButton("여");
		RadioButton man = new RadioButton("남");
		ToggleGroup gender = new ToggleGroup();
		woman.setToggleGroup(gender);
		man.setToggleGroup(gender);
		h2.getChildren().addAll(man,woman);
		CheckBox game = new CheckBox("게임");
		CheckBox study = new CheckBox("공부");
		h3.getChildren().addAll(game,study);
		TextArea area = new TextArea();
		area.setMaxSize(200, 40);
		Label mg= new Label("하고싶은말");
		HBox box2 = new HBox();
		box2.getChildren().addAll(area);
		border.setBottom(box2);
		v4.setSpacing(20);
		v4.setPadding(new Insets(20));
		v4.getChildren().addAll(h,h1,h2,h3,mg,box2);
		border.setCenter(v4);
		
		
		
		//오른쪽
		TextField text3 = new TextField();
		text3.setMaxSize(100, 20);
		PasswordField text4 = new PasswordField();
		text4.setMaxSize(100, 20);
		
		v3.getChildren().addAll(text3, text4);
		v3.setSpacing(20);
		Button button=new Button("로그인");
		button.setPrefSize(70, 80);
		h4.getChildren().addAll(v3,button);
		h4.setPadding(new Insets(20,20,20,0));
		h4.setSpacing(10);
		border.setRight(h4);
		
		//아래
		
		
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(new Scene(border, 550,350));
		primaryStage.show();
		
		
	}

}
