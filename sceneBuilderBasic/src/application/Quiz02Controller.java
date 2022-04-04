package application;

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

public class Quiz02Controller implements Initializable{
	
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

	
	@FXML private TextField Id;
	@FXML private PasswordField Pw;
	@FXML private Button loginButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MyDB db=new MyDB();
		loginButton.setOnAction(event->{
			String id = Id.getText();
			String pw = Pw.getText();	
			Alert alert=new Alert(AlertType.INFORMATION);
			if(id.isEmpty()) {
				alert.setContentText("아이디를 입력하세요");
				alert.show();
				Id.requestFocus();
				return;
			}else if(pw.isEmpty()) {
				alert.setContentText("비밀 번호를 입력하세요");
				alert.show();
				Pw.requestFocus();
				return;
			}else if(db.table.containsKey(id)) {
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
			return;
			
			
			
		});

}
}
