package epl.epl.matches.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import epl.epl.matches.Model.LoginCredentials;

@Service
public class LoginService {
	
	List<LoginCredentials> logincr =new ArrayList<>();


	public void addCredentials(LoginCredentials login){
		logincr.add(login);
	}
	
//	public Boolean checkCredentials(LoginCredentials login) {
//		if(logincr.stream().filter(p -> p.getUsername().equals(login.getUsername()) && p.getPassword().equals(login.getPassword()))) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public Boolean checkCredentials(LoginCredentials login) {	
		 boolean result = false;
		for(LoginCredentials log: logincr) {
			String uname=login.getUsername();
			String pword = login.getPassword();
			if((log.getPassword().equals(pword)) && (log.getUsername().equals(uname))) {
				result= true;
			}else {
				result= false;
			}
		}
		return result;
	}
}


//public List<LoginCredentials> checkCredentials(LoginCredentials login) {	
//	for(LoginCredentials log: logincr) {
//		String uname=login.getUsername();
//		String pword = login.getPassword();
//		if((log.getPassword().equals(pword)) && (log.getUsername().equals(uname))) {
//			logincr.add(true);
//			return logincr;
//		}
//	}
//	return null;
//  }
//}
