package sceneBuilderEvent3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginService {
	
	
	public void loginProc(String id,String pw){
		System.out.println("아이디 :" + id);
		System.out.println("비밀번호 :" + pw);
	}
	public void cancelProc(TextField id,PasswordField pw){
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
