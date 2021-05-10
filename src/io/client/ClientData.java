package io.client;

public class ClientData {
	
	private String ClientID = new String("Empty");
	private String Name = new String("Empty");
	private String Account = new String("Empty");
	private String Password = new String("Empty");
	private String Phonenumber = new String("Empty");
	private String Email = new String("Empty");
	private String Sex = new String("Empty");
	private String Balance = new String("Empty");
	private String VIPlevel = new String("Empty");
	private String Target = new String("Empty");
	private String PhysicalCondition = new String("Empty");
	private String FileAddress = new String("Empty");

	
	public void setClientID(String ClientID)
	{
		this.ClientID = ClientID;
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

	public void setBalance(String Balance)
	{
		this.Balance = Balance;
	}

	public void setVIPlevel(String VIPlevel)
	{
		this.VIPlevel = VIPlevel;
	}

	public void setTarget(String Target)
	{
		this.Target = Target;
	}

	public void setPhysicalCondition(String PhysicalCondition)
	{
		this.PhysicalCondition = PhysicalCondition;
	}

	public void setFileAddress(String FileAddress)
	{
		this.FileAddress = FileAddress;
	}


	public String getClientID()
	{
		return this.ClientID;
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

	public String getBalance()
	{
		return this.Balance;
	}

	public String getVIPlevel()
	{
		return this.VIPlevel;
	}

	public String getTarget()
	{
		return this.Target;
	}

	public String getPhysicalCondition()
	{
		return this.PhysicalCondition;
	}

	public String getFileAddress()
	{
		return this.FileAddress;
	}
	
	public String toString() 
	{   
		
		return
				"----------------------------\n" +
				"ClientID: " + ClientID + "\n" +
				"Name: " + Name + "\n" +
				"Account: " + Account + "\n" +
				"Password: " + Password + "\n" +
				"Phonenumber: " + Phonenumber + "\n" +
				"Email" + Email + "\n" +
				"Sex: " + Sex + "\n" +
				"Balance: " + Balance + "\n" +
				"VIPlevel: " + VIPlevel + "\n" +
				"Target: " + Target + "\n" +
				"PhysicalCondition: " + PhysicalCondition + "\n" +
				"FileAddress: " + FileAddress + "\n" +
				"----------------------------\n";

	}
	
}