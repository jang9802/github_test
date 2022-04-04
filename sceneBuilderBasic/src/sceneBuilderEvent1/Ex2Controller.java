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
import javafx.scene.control.Alert.AlertType;

public class Ex2Controller implements Initializable{
	
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
		if(emptyCheck()) 
			return;
		
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
	
	public boolean emptyCheck() {
		String id = Id.getText();
		String pw = Pw.getText();	
		Alert alert=new Alert(AlertType.INFORMATION);
		if(id.isEmpty()) {
			alert.setContentText("아이디를 입력하세요");
			alert.show();
			Id.requestFocus();
			return true;
		}
		if(pw.isEmpty()) {
			alert.setContentText("비밀 번호를 입력하세요");
			alert.show();
			Pw.requestFocus();
			return true;
		}
		return false;
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
		//	Id.clear();
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
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Id.textProperty());
		Id.textProperty().addListener( (attribute,before,after)->{
//			System.out.println(attribute);
//			System.out.println(before);
//			System.out.println(after);
			IdLengthCheck();
		});
		
		Pw.textProperty().addListener( (attribute,before,after)->{
			System.out.println(attribute);
			PwLengthCheck();
		});
		
		loginButton.setOnAction(event->{
			buttonClick();
		});

}
}
