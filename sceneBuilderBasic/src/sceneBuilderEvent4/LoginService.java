package sceneBuilderEvent4;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginService {
	
	public void loginProc(String id, String pw) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
	
	public void cancelProc(TextField id, PasswordField pw) {
		id.clear(); pw.clear();
		id.requestFocus();
	}
	
	public void regProc() throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("regForm.fxml"));
		
		Parent regForm = loader.load();
		
		ComboBox<String> combo = (ComboBox<String>)regForm.lookup("#ageCombo");
		combo.getItems().addAll("10대", "20대", "30대", "40대");
		
		Scene scene = new Scene(regForm);
		Stage stage = new Stage();
		stage.setTitle("regForm");
		stage.setScene(scene);
		stage.show();
	}
}
