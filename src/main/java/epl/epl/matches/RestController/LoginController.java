package epl.epl.matches.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import epl.epl.matches.Model.LoginCredentials;
import epl.epl.matches.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public Boolean checkCredentials1(@RequestBody LoginCredentials login ) {
		 return  loginservice.checkCredentials(login);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/login/addlogincredentials")
	public String addCredentials(@RequestBody LoginCredentials login ) {
		loginservice.addCredentials(login);
		 return "succes Login" ;
	}


}
