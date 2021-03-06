package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Ex4Controller implements Initializable{
	// FXML 파일에 작성한 fx:id와 멤버변수명은 일치하게 구성하면 객체의 참조값을 자동으로 찾아서 입력해줌.
	
	@FXML private TextField centerId;
	@FXML private TextField rightId;
	@FXML private PasswordField centerPw;
	@FXML private PasswordField rightPw;
	@FXML private Button rightButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Ex4.fxml 파일을 로드하면 메소드 호출");
		rightButton.setOnAction(event->{
			String id = rightId.getText();
			String pw = rightPw.getText();	
			if(id.isEmpty()||pw.isEmpty()) {
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setContentText("입력하세요");
				alert.show();
				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				return;
			}
			centerId.setText(id);
			centerPw.setText(pw);
		});
	}
	
	
}
