package io.coach;
/**
 * <p>
 *     This class is designed to handle data.
 * </p>
 *
 * @author Bingzhe Cui
 * @version 3.0
 *
 */
public class CoachData {
	
	private String CoachID = new String("Empty");
	private String Name = new String("Empty");
	private String Account = new String("Empty");
	private String Password = new String("Empty");
	private String Phonenumber = new String("Empty");
	private String Email = new String("Empty");
	private String Sex = new String("Empty");
	private String Profile = new String("Empty");
	private String FileAddress = new String("Empty");

	/**
	 * <p>
	 *     This function is designed to set coach id.
	 * </p>
	 * @param CoachID
	 */
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
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
	 *     This function is designed to set phone number.
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
	 *     This function is designed to set profile.
	 * </p>
	 * @param Profile
	 */
	public void setProfile(String Profile)
	{
		this.Profile = Profile;
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
	 *     This function is designed to get ID.
	 * </p>
	 * @return ID
	 */
	public String getID()
	{
		return CoachID;
	}

	/**
	 * <p>
	 *     This function is designed to get name.
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
	 * @return account
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
	 * @return sex
	 */
	public String getSex()
	{
		return this.Sex;
	}

	/**
	 * <p>
	 *     This function is designed to get profile.
	 * </p>
	 * @return profile
	 */
	public String getProfile()
	{
		return this.Profile;
	}

	/**
	 * <p>
	 *     This function is designed to get FileAddress.
	 * </p>
	 * @return FileAddress
	 */
	public String getFileAddress()
	{
		return this.FileAddress;
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
				"FileAddress" + FileAddress + "\n" +
				"----------------------------\n";

	}
	
}