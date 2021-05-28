package io.plan;

public class PlanData {
	
	private String PlanID = new String("Empty");
	private String ClientID = new String("Empty");
	private String CoachID = new String("Empty");
	private String ClassID = new String("Empty");
	private String StartTime = new String("Empty");
	private String Endtime = new String("Empty");
	
	public void setPlanID(String PlanID)
	{
		this.PlanID = PlanID;
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
	
	public void setEndTime(String Endtime)
	{
		this.Endtime = Endtime;
	}

	public String getPlanID()
	{
		return this.PlanID;
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

	public String getEndTime()
	{
		return this.Endtime;
	}
	
	public String toString() 
	{   
		
		return
				"----------------------------\n" +
				"PlanID: " + PlanID + "\n" +
				"ClientID: " + ClientID + "\n" +
				"CoachID: " + CoachID + "\n" +
				"ClassID: " + ClassID + "\n" +
				"StartTime: " + StartTime + "\n" +
				"Endtime: " + Endtime + "\n" +
				"----------------------------\n";

	}
	
}