package sceneBuilderEvent3;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginService2 {
	
	
	public void loginProc(Parent root){
		TextField id= (TextField)root.lookup("#id");
		PasswordField pw= (PasswordField)root.lookup("#pw");
		System.out.println("아이디 :" + id.getText());
		System.out.println("비밀번호 :" + pw.getText());
	}
	public void cancelProc(Parent root){
		TextField id= (TextField)root.lookup("#id");
		PasswordField pw= (PasswordField)root.lookup("#pw");
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
