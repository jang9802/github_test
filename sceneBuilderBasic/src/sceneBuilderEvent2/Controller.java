package sceneBuilderEvent2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable {
	@FXML TextField id;
	@FXML PasswordField pw;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void loginProc(){
		System.out.println("아이디 :" + id.getText());
		System.out.println("비밀번호 :" + pw.getText());
	}
	public void cancelProc(){
		id.clear();
		pw.clear();
		id.requestFocus();
	}
	public void regProc(){
		Alert alert =new Alert (AlertType.INFORMATION);
		alert.setContentText("회원가입 페이지로 이동합니다");
		alert.show();
	}

}
