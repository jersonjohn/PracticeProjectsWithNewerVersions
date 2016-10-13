package org.jerson.trial.services;

import org.jerson.trial.model.User;

public class LoginService {
	
	public Boolean verifyLogin(User user) {
		
		if(user.getLoginid().equals("demo") && user.getPassword().equals("demo")) {
		
			return true;
		
		}
		
		return false;
	}

}
