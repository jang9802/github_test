package sceneBuilderEvent6.main;

import javafx.scene.Parent;
import sceneBuilderEvent6.login.LoginController;
import sceneBuilderEvent6.reg.RegController;

public class Controller {
	private MainService mainService;
	private Parent regForm;
	private RegController regController;
	private LoginController loginController;
	private Parent menu;
	
	
	public void setMenu(Parent menu) {
		this.menu = menu;
	}

	public Controller() {
		mainService = new MainService();
		mainService.setController(this);
	}
	
	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
		this.loginController.setController(this);
	}
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}
	
	public void setRegController(RegController regController) {
		this.regController = regController;
	}
	
	public RegController getRegController() {
		return regController;
	}
	

	public void open(String division) {
		if("Menu".equals(division)) {
			mainService.menuOpen();
		}else if("Register".equals(division)) {
			mainService.regOpen();
		}
	}



}