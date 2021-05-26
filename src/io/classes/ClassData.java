package io.classes;

public class ClassData {
	
	private String ClassID = new String("Empty");
	private String Name = new String("Empty");
	//private String IsLive = new String("Empty");
	//private String Fee = new String("Empty");
	private String CoachID = new String("Empty");
	private String VedioAddress = new String("Empty");
	private String Category = new String("Empty");
	private String Detail = new String("Empty");
	private String VIPLevel = new String("Empty");
	private String FileAddress = new String("Empty");

	
	public void setClassID(String ClassID)
	{
		this.ClassID = ClassID;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	//public void setIsLive(String IsLive)
	//{
		//this.IsLive = IsLive;
	//}
	
	//public void setFee(String Fee)
	//{
		//this.Fee = Fee;
	//}
	
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
	}
	
	public void setVedioAddress(String VedioAddress)
	{
		this.VedioAddress = VedioAddress;
	}
	
	public void setCategory(String Category)
	{
		this.Category = Category;
	}

	public void setDetail(String Detail)
	{
		this.Detail = Detail;
	}

	public void setVIPLevel(String VIPLevel)
	{
		this.VIPLevel = VIPLevel;
	}

	public void setFileAddress(String FileAddress)
	{
		this.FileAddress = FileAddress;
	}


	public String getClassID()
	{
		return this.ClassID;
	}

	public String getName(){
		return this.Name;
	}
/*
	public String getIsLive()
	{
		return this.IsLive;
	}

	public String getFee()
	{
		return this.Fee;
	}
*/
	public String getCoachID()
	{
		return this.CoachID;
	}

	public String getVedioAddress()
	{
		return this.VedioAddress;
	}

	public String getCategory()
	{
		return this.Category;
	}

	public String getDetail()
	{
		return this.Detail;
	}

	public String getVIPLevel()
	{
		return this.VIPLevel;
	}

	public String getFileAddress()
	{
		return this.FileAddress;
	}
	
	public String toString() 
	{   
		
		return
				"----------------------------\n" +
				"ClassID: " + ClassID + "\n" +
				"Name:" + Name + "\n" +
				//"IsLive: " + IsLive + "\n" +
				//"Fee: " + Fee + "\n" +
				"CoachID: " + CoachID + "\n" +
				"VedioAddress: " + VedioAddress + "\n" +
				"Category: " + Category + "\n" +
				"Detail: " + Detail + "\n" +
				"VIPLevel: " + VIPLevel + "\n" +
				"FileAddress: " + FileAddress + "\n" +
				"----------------------------\n";

	}
	
}