package org.jerson.trial.actions;

import org.apache.commons.lang3.StringUtils;
import org.jerson.trial.model.User;
import org.jerson.trial.services.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private User user = new User();	
	
	public void validate() {
		
		if(StringUtils.isEmpty(user.getLoginid())) {
			
			//add
			
			addFieldError("loginid","Login ID cannot be blank");
			
		}
		
		if(StringUtils.isEmpty(user.getPassword())) {
			
			//
			
			addFieldError("password","Password cannot be empty");
		}
		
	}
	
	public String execute(){
		
		LoginService loginService = new LoginService();
		if(loginService.verifyLogin(getUser())) {
			
			System.out.println("Logined to the system");
			
			return SUCCESS;
		}
		
		return LOGIN;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
