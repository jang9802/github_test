package sceneBuilderEvent6.main;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MainService {
	private Controller controller;
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	//로그인 성공시 메뉴열기 
	public void menuOpen() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneBuilderEvent6/main/Menu.fxml"));
		Parent menu;
		try {
			menu= loader.load();
			Scene scene=new Scene(menu);
			Stage stage = new Stage();
			stage.setTitle("menu");
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//회원가입창 열기
	public void regOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneBuilderEvent6/reg/regForm.fxml"));
		
		Parent regForm;
		try {
			regForm = loader.load();
			
			controller.setRegForm(regForm);
			controller.setRegController(loader.getController());
			controller.getRegController().setRegForm(regForm);
			
			ComboBox<String> combo = (ComboBox<String>)regForm.lookup("#ageCombo");
			combo.getItems().addAll("10대", "20대", "30대", "40대");
			
			Scene scene = new Scene(regForm);
		
			Stage stage = new Stage();
			stage.setTitle("regForm");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}