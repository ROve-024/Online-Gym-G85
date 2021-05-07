package io.coach;

public class CoachData {
	
	private String CoachID;
	private String Name;
	private String Account;
	private String Password;
	private String Phonenumber;
	private String Email;
	private String Sex;
	private String Profile;
	
	public void setCoachID(String CoachID) 
	{
		this.CoachID = CoachID;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setAccount(String Account)
	{
		this.Account = Account;
	}
	
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
	
	public void setPhonenumber(String Phonenumber)
	{
		this.Phonenumber = Phonenumber;
	}

	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public void setSex(String Sex)
	{
		this.Sex = Sex;
	}
	
	public void setProfile(String Profile)
	{
		this.Profile = Profile;
	}

	public String getID()
	{
		return CoachID;
	}

	public String getName()
	{
		return this.Name;
	}

	public String getAccount()
	{
		return this.Account;
	}

	public String getPassword()
	{
		return this.Password;
	}

	public String getPhonenumber()
	{
		return this.Phonenumber;
	}

	public String getEmail()
	{
		return this.Email;
	}

	public String getSex()
	{
		return this.Sex;
	}

	public String getProfile()
	{
		return this.Profile;
	}
	
	public String toString() 
	{   
		
		return "----------------------------\n" +
				"CoachID: " + CoachID + "\n" +
				"Name: " + Name + "\n" +
				"Account: " + Account + "\n" +
				"Password: " + Password + "\n" +
				"Phonenumber: " + Phonenumber + "\n" +
				"Sex: " + Sex + "\n" +
				"Profilee: " + Profile + "\n" +
				"----------------------------\n";

	}
	
}