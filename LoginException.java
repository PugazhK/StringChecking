package exceptions;

public class LoginException {
	
	private String username;
	private String password;
	
	public LoginException(String name, String password) throws PasswordException
	{
		this.username = name;
		this.password = password;
		
		validatePassword(password);
		
	}
	
	private void validatePassword(String password) throws PasswordException {
		
		if(password.length() < 8) {
			throw new PasswordException("Password should be minimum 8 characters");
		}
		
	}

	public static void main(String[] args) throws PasswordException {
		
		LoginException le = new LoginException("Kandavelu", "Dec2022");
		

	}
	
	

}
