package io.client;

public class ClientData {
	
	private String ClientID;
	private String Name;
	private String Account;
	private String Password;
	private String Phonenumber;
	private String Email;
	private String Sex;
	private String Balance;
	private String VIPlevel;

	
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
				"----------------------------\n";

	}
	
}