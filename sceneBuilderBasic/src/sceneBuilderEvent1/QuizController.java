package sceneBuilderEvent1;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Alert.AlertType;

public class QuizController implements Initializable{
	
	public class MyDB{
		private HashMap<String,String>table;
		
		public MyDB() {
			table = new HashMap<>();
			table.put("if","if1234");
			table.put("else","else1234");
			table.put("while","while1234");
			table.put("for","for1234");
			table.put("admin","admin1234");
		}
		
	}
	public void buttonClick() {
		loginCheck();
		
	}
	public void IdLengthCheck () {
		if(Id.getLength()>8) {
			String tmp= Id.getText();
			tmp=tmp.substring(0, 8);
			Id.setText(tmp);
		}
	}
	
	public void PwLengthCheck() {
		if(Pw.getLength()>10) {
			String tmp= Pw.getText();
			tmp=tmp.substring(0, 10);
			Pw.setText(tmp);
		}
	}
	public void emptyCheck() {
		String id = Id.getText();
		String pw = Pw.getText();	
		if(id.isEmpty()||pw.isEmpty()) {
			loginButton.setDisable(true);
		}else
			loginButton.setDisable(false);
		
	}
	
	
	public void loginCheck() {
		MyDB db=new MyDB();
		String id = Id.getText();
		String pw = Pw.getText();	
		Alert alert=new Alert(AlertType.INFORMATION);
		if(db.table.containsKey(id)) {
			if(db.table.get(id).equals(pw)) {
				alert.setContentText("로그인 성공");
				alert.show();
				return;
			}
			else {
				alert.setContentText("비밀번호를 확인하세요");
				alert.show();
				Pw.requestFocus();
				Pw.clear();
				return;
			}
			
		}else if(db.table.containsKey(id)==false) {
			alert.setContentText("존재하지 않는 회원입니다.");
			alert.show();
			Id.requestFocus();
			Id.clear();
			Pw.clear();
			return;
		}
	}
	
	public void message(String content) {
		Alert alert=new Alert(AlertType.INFORMATION);
		alert.setContentText(content);
		alert.show();
	}
	
	@FXML private TextField Id;
	@FXML private PasswordField Pw;
	@FXML private Button loginButton;
	@FXML private GridPane grid;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(location);
		System.out.println(resources);
		loginButton.setDisable(true);
		
		Id.textProperty().addListener( (attribute,before,after)->{
			emptyCheck();
		});
		Pw.textProperty().addListener( (attribute,before,after)->{
			emptyCheck();
		});
		grid.setOnKeyPressed(event->{
			if(loginButton.isDisable() == false && event.getCode() == KeyCode.ENTER) {
				loginCheck();
			}
		});
		
		loginButton.setOnAction(event->{
			buttonClick();
		});

}
}
