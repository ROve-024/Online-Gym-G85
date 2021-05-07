package io.classes;

public class ClassData {
	
	private String ClassID;
	private String Name;
	private String IsLive;
	private String Fee;
	private String CoachID;
	private String VedioAddress;
	private String Profile;

	
	public void setClassID(String ClassID)
	{
		this.ClassID = ClassID;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setIsLive(String IsLive)
	{
		this.IsLive = IsLive;
	}
	
	public void setFee(String Fee)
	{
		this.Fee = Fee;
	}
	
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
	}
	
	public void setVedioAddress(String VedioAddress)
	{
		this.VedioAddress = VedioAddress;
	}
	
	public void setProfile(String Profile)
	{
		this.Profile = Profile;
	}


	public String getClassID()
	{
		return this.ClassID;
	}

	public String getName(){
		return this.Name;
	}

	public String getIsLive()
	{
		return this.IsLive;
	}

	public String getFee()
	{
		return this.Fee;
	}

	public String getCoachID()
	{
		return this.CoachID;
	}

	public String getVedioAddress()
	{
		return this.VedioAddress;
	}

	public String getProfile()
	{
		return this.Profile;
	}
	
	public String toString() 
	{   
		
		return
				"----------------------------\n" +
				"ClassID: " + ClassID + "\n" +
				"Name:" + Name + "\n" +
				"IsLive: " + IsLive + "\n" +
				"Fee: " + Fee + "\n" +
				"CoachID: " + CoachID + "\n" +
				"VedioAddress: " + VedioAddress + "\n" +
				"Profile: " + Profile + "\n" +
				"----------------------------\n";

	}
	
}