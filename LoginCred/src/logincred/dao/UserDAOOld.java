package logincred.dao;

public class UserDAOOld {

	public boolean isValid(String id, String password)//temporarily hard-coding, assume id, password:niit as valid credentials
	{
		if(id.equals("niit") && password.equals("niit"))
			return true;
		else
			return false;
		
	}
}
