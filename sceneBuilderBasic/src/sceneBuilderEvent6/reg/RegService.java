package sceneBuilderEvent6.reg;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sceneBuilderEvent6.common.CommonService;
import sceneBuilderEvent6.login.LoginDTO;

public class RegService {
	
	public void regProc(Parent regForm) {
		
		TextField idField = (TextField)regForm.lookup("#idTxt");
		TextField nameField = (TextField)regForm.lookup("#nameTxt");
		PasswordField pwField = (PasswordField)regForm.lookup("#pwTxt");
		PasswordField confirmField = (PasswordField)regForm.lookup("#confirmTxt");
		
		String id = idField.getText();
		String name = nameField.getText();
		String pw = pwField.getText();
		String confirm = confirmField.getText();
		
		RadioButton manRadio = (RadioButton)regForm.lookup("#manRadio");
		RadioButton womanRadio = (RadioButton)regForm.lookup("#womanRadio");
		
		String gender = "";
		if(manRadio.isSelected())
			gender += "남";
		else if(womanRadio.isSelected())
			gender += "여";
		
		ComboBox<String> combo = (ComboBox<String>)regForm.lookup("#ageCombo");
		String age = combo.getValue();
	
		CheckBox musicCheck = (CheckBox)regForm.lookup("#musicCheck");
		CheckBox sportCheck = (CheckBox)regForm.lookup("#sportCheck");
		CheckBox movieCheck = (CheckBox)regForm.lookup("#movieCheck");
		
		String hobbys = "";
		if(musicCheck.isSelected()) {
			hobbys += "음악 ";
		}
		if(sportCheck.isSelected()) {
			hobbys += "스포츠 ";
		}
		if(movieCheck.isSelected()) {
			hobbys += "영화";
		}
		
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("비밀번호 확인 : " + confirm);
		System.out.println("성별 : " + gender);
		System.out.println("연령대 : " + age);
		System.out.println("취미 : " + hobbys);
		
		if(id.isEmpty() || pw.isEmpty() || name.isEmpty()) {
			CommonService.msg("필수 정보입니다.");
			return;
		}
		if(pw.equals(confirm)) {
			RegDAO regDao = new RegDAO();
			LoginDTO login = regDao.selectId(id);
			if(login == null) {
				RegDTO regDto = new RegDTO();
				regDto.setName(name);
				regDto.setId(id);
				regDto.setPw(pw);
				regDto.setGender(gender);
				regDto.setAge(age);
				regDto.setHobbys(hobbys);
				
				regDao.insert(regDto);
				CommonService.msg(id + " 계정을 등록했습니다.");
				CommonService.windowClose(regForm);
			}else {
				CommonService.msg(id + "는 등록된 계정입니다.");
			}
		}else {
			CommonService.msg("두 패스워드가 일치하지 않습니다.");
		}
	
	}
}








