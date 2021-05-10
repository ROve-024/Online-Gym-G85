package io.plan;

public class PlanData {
	
	private String OrderID = new String("Empty");
	private String ClientID = new String("Empty");
	private String CoachID = new String("Empty");
	private String ClassID = new String("Empty");
	private String StartTime = new String("Empty");
	private String Endtime = new String("Empty");
	
	public void setOrderID(String OrderID)
	{
		this.OrderID = OrderID;
	}
	
	public void setClientID(String ClientID)
	{
		this.ClientID = ClientID;
	}
	
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
	}
	
	public void setClassID(String ClassID)
	{
		this.ClassID = ClassID;
	}
	
	public void setStartTime(String StartTime)
	{
		this.StartTime = StartTime;
	}
	
	public void setEndtime(String Endtime)
	{
		this.Endtime = Endtime;
	}

	public String getOrderID()
	{
		return this.OrderID;
	}

	public String getClientID()
	{
		return this.ClientID;
	}

	public String getCoachID()
	{
		return this.CoachID;
	}

	public String getClassID()
	{
		return this.ClassID;
	}

	public String getStartTime()
	{
		return this.StartTime;
	}

	public String getEndtime()
	{
		return this.Endtime;
	}
	
	public String toString() 
	{   
		
		return
				"----------------------------\n" +
				"OrderID: " + OrderID + "\n" +
				"ClientID: " + ClientID + "\n" +
				"CoachID: " + CoachID + "\n" +
				"ClassID: " + ClassID + "\n" +
				"StartTime: " + StartTime + "\n" +
				"Endtime: " + Endtime + "\n" +
				"----------------------------\n";

	}
	
}