package io.client;
/**
 * <p>
 *     This class is designed to handle data.
 * </p>
 *
 * @author Haoqian Yu
 * @version 3.0
 *
 */
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


	/**
	 * <p>
	 *     This function is designed to set ClientID.
	 * </p>
	 * @param ClientID
	 */
	public void setClientID(String ClientID)
	{
		this.ClientID = ClientID;
	}

	/**
	 * <p>
	 *     This function is designed to set name.
	 * </p>
	 * @param Name
	 */
	public void setName(String Name)
	{
		this.Name = Name;
	}

	/**
	 * <p>
	 *     This function is designed to set account.
	 * </p>
	 * @param Account
	 */
	public void setAccount(String Account)
	{
		this.Account = Account;
	}

	/**
	 * <p>
	 *     This function is designed to set password.
	 * </p>
	 * @param Password
	 */
	public void setPassword(String Password)
	{
		this.Password = Password;
	}

	/**
	 * <p>
	 *     This function is designed to set phonenumber.
	 * </p>
	 * @param Phonenumber
	 */
	public void setPhonenumber(String Phonenumber)
	{
		this.Phonenumber = Phonenumber;
	}

	/**
	 * <p>
	 *     This function is designed to set email.
	 * </p>
	 * @param Email
	 */
	public void setEmail(String Email)
	{
		this.Email = Email;
	}

	/**
	 * <p>
	 *     This function is designed to set sex.
	 * </p>
	 * @param Sex
	 */
	public void setSex(String Sex)
	{
		this.Sex = Sex;
	}

	/**
	 * <p>
	 *     This function is designed to set balance.
	 * </p>
	 * @param Balance
	 */
	public void setBalance(String Balance)
	{
		this.Balance = Balance;
	}

	/**
	 * <p>
	 *     This function is designed to set VIPlevel.
	 * </p>
	 * @param VIPlevel
	 */
	public void setVIPlevel(String VIPlevel)
	{
		this.VIPlevel = VIPlevel;
	}

	/**
	 * <p>
	 *     This function is designed to set target.
	 * </p>
	 * @param Target
	 */
	public void setTarget(String Target)
	{
		this.Target = Target;
	}

	/**
	 * <p>
	 *     This function is designed to set physical condition.
	 * </p>
	 * @param PhysicalCondition
	 */
	public void setPhysicalCondition(String PhysicalCondition)
	{
		this.PhysicalCondition = PhysicalCondition;
	}

	/**
	 * <p>
	 *     This function is designed to set file address.
	 * </p>
	 * @param FileAddress
	 */
	public void setFileAddress(String FileAddress)
	{
		this.FileAddress = FileAddress;
	}


	/**
	 * <p>
	 *     This function is designed to get CLientID.
	 * </p>
	 * @return CLientID
	 */
	public String getClientID()
	{
		return this.ClientID;
	}

	/**
	 * <p>
	 *     This function is designed to get Name.
	 * </p>
	 * @return Name
	 */
	public String getName()
	{
		return this.Name;
	}

	/**
	 * <p>
	 *     This function is designed to get account.
	 * </p>
	 * @return Account
	 */
	public String getAccount()
	{
		return this.Account;
	}

	/**
	 * <p>
	 *     This function is designed to get password.
	 * </p>
	 * @return Password
	 */
	public String getPassword()
	{
		return this.Password;
	}

	/**
	 * <p>
	 *     This function is designed to get phonenumber.
	 * </p>
	 * @return Phonenumber
	 */
	public String getPhonenumber()
	{
		return this.Phonenumber;
	}

	/**
	 * <p>
	 *     This function is designed to get email.
	 * </p>
	 * @return Email
	 */
	public String getEmail()
	{
		return this.Email;
	}

	/**
	 * <p>
	 *     This function is designed to get sex.
	 * </p>
	 * @return Sex
	 */
	public String getSex()
	{
		return this.Sex;
	}

	/**
	 * <p>
	 *     This function is designed to get Balance.
	 * </p>
	 * @return Balance
	 */
	public String getBalance()
	{
		return this.Balance;
	}

	/**
	 * <p>
	 *     This function is designed to VIP level.
	 * </p>
	 * @return VIPlevel
	 */
	public String getVIPlevel()
	{
		return this.VIPlevel;
	}

	/**
	 * <p>
	 *     This function is designed to get target.
	 * </p>
	 * @return Target
	 */
	public String getTarget()
	{
		return this.Target;
	}

	/**
	 * <p>
	 *     This function is designed to get Physical condition.
	 * </p>
	 * @return PhysicalCondition
	 */
	public String getPhysicalCondition()
	{
		return this.PhysicalCondition;
	}

	/**
	 * <p>
	 *     This function is designed to get address.
	 * </p>
	 * @return FileAddress
	 */
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