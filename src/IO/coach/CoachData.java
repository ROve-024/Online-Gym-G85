package IO.coach;

public class CoachData {
	
	private String CoachID;
	private String Name;
	private String Account;
	private String Password;
	private String Phonenumber;
	private String Sex;
	private String Profile;
	
	public void setCoachID(String CoachID) 
	{
		this.CoachID = CoachID;
	}
	
	public void setCoachName(String Name) 
	{
		this.Name = Name;
	}
	
	public void setCoachAccount(String Account) 
	{
		this.Account = Account;
	}
	
	public void setCoachPassword(String Password) 
	{
		this.Password = Password;
	}
	
	public void setCoachPhonenumber(String Phonenumber) 
	{
		this.Phonenumber = Phonenumber;
	}
	
	public void setCoachSex(String Sex) 
	{
		this.Sex = Sex;
	}
	
	public void setCoachProfile(String Profile) 
	{
		this.Profile = Profile;
	}

	public String getCoachID()
	{
		return CoachID;
	}

	public String getCoachName()
	{
		return this.Name;
	}

	public String getCoachAccount()
	{
		return this.Account;
	}

	public String getCoachPassword()
	{
		return this.Password;
	}

	public String getCoachPhonenumber()
	{
		return this.Phonenumber;
	}

	public String getCoachSex()
	{
		return this.Sex;
	}

	public String getCoachProfile()
	{
		return this.Profile;
	}
	
	public String toString() 
	{   
		
		return "----------------------------\n" + "CoachID: " + CoachID + "\n" + "Name: " + Name + "\n" + "Account: " + Account + "\n" + "Password: " + Password + "\n" + "Phonenumber: " + Phonenumber + "\n" + "Sex: " + Sex + "\n" + "Profilee: " + Profile + "\n" + "----------------------------\n";

	}
	
}