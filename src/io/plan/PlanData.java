package io.plan;

public class PlanData {
	/**
	 * <p>
	 *     This class is designed to handle data.
	 * </p>
	 *
	 * @author Xuan Wei
	 * @version 3.0
	 *
	 */
	private String PlanID = new String("Empty");
	private String ClientID = new String("Empty");
	private String CoachID = new String("Empty");
	private String ClassID = new String("Empty");
	private String StartTime = new String("Empty");
	private String Endtime = new String("Empty");

	/**
	 * <p>
	 *     This function is designed to set PlanID
	 * </p>
	 * @param PlanID
	 */
	public void setPlanID(String PlanID)
	{
		this.PlanID = PlanID;
	}

	/**
	 * <p>
	 *     This function is designed to set CLientID.
	 * </p>
	 * @param ClientID
	 */
	public void setClientID(String ClientID)
	{
		this.ClientID = ClientID;
	}

	/**
	 * <p>
	 *     This function is designed to set CoachID.
	 * </p>
	 * @param CoachID
	 */
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
	}

	/**
	 * <p>
	 *     This function is designed to set ClassID.
	 * </p>
	 * @param ClassID
	 */
	public void setClassID(String ClassID)
	{
		this.ClassID = ClassID;
	}

	/**
	 * <p>
	 *     This function is designed to set startTime.
	 * </p>
	 * @param StartTime
	 */
	public void setStartTime(String StartTime)
	{
		this.StartTime = StartTime;
	}

	/**
	 * <p>
	 *     This function is designed to set EndTime.
	 * </p>
	 * @param Endtime
	 */
	public void setEndTime(String Endtime)
	{
		this.Endtime = Endtime;
	}

	/**
	 * <p>
	 *     This function is designed to get PlanID
	 * </p>
	 * @return PlanID
	 */
	public String getPlanID()
	{
		return this.PlanID;
	}

	/**
	 * <p>
	 *     This function is designed to get ClientID
	 * </p>
	 * @return ClientID
	 */
	public String getClientID()
	{
		return this.ClientID;
	}

	/**
	 * <p>
	 *     This function is designed to get CoachID.
	 * </p>
	 * @return CoachID
	 */
	public String getCoachID()
	{
		return this.CoachID;
	}

	/**
	 * <p>
	 *     This function is designed to get CLassID.
	 * </p>
	 * @return ClassID
	 */
	public String getClassID()
	{
		return this.ClassID;
	}

	/**
	 * <p>
	 *     This function is designed to get start time.
	 * </p>
	 * @return StartTime
	 */
	public String getStartTime()
	{
		return this.StartTime;
	}

	/**
	 * <p>
	 *     This function is designed to get endtime.
	 * </p>
	 * @return EndTime
	 */
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