package io.classes;
/**
 * <p>
 *     This class is designed to handle data.
 * </p>
 *
 * @author Dayou Yang
 * @version 3.0
 *
 */
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


	/**
	 * <p>
	 *     This function is designed to set class ID.
	 * </p>
	 * @param ClassID
	 */
	public void setClassID(String ClassID)
	{
		this.ClassID = ClassID;
	}

	/**
	 * <p>
	 *     This function is designed to set name.
	 * </p>
	 * @param Name
	 */
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

	/**
	 * <p>
	 *     This function is designed to coach ID.
	 * </p>
	 * @param CoachID
	 */
	public void setCoachID(String CoachID)
	{
		this.CoachID = CoachID;
	}

	/**
	 * <p>
	 *     This function is designed to vedio address.
	 * </p>
	 * @param VedioAddress
	 */
	public void setVedioAddress(String VedioAddress)
	{
		this.VedioAddress = VedioAddress;
	}

	/**
	 * <p>
	 *     This function is designed to set category.
	 * </p>
	 * @param Category
	 */
	public void setCategory(String Category)
	{
		this.Category = Category;
	}

	/**
	 * <p>
	 *     This function is designed to set detail.
	 * </p>
	 * @param Detail
	 */
	public void setDetail(String Detail)
	{
		this.Detail = Detail;
	}

	/**
	 * <p>
	 *     This function is designed to set vip level.
	 * </p>
	 * @param VIPLevel
	 */
	public void setVIPLevel(String VIPLevel)
	{
		this.VIPLevel = VIPLevel;
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
	 *     This function is designed to get class id.
	 * </p>
	 * @return ClassID
	 */
	public String getClassID()
	{
		return this.ClassID;
	}


	/**
	 * <p>
	 *     This function is designed to get name.
	 * </p>
	 * @return Name
	 */
	public String getName(){
		return this.Name;
	}

	/**
	 * <p>
	 *     This function is designed to get coach id.
	 * </p>
	 * @return coachID
	 */
	public String getCoachID()
	{
		return this.CoachID;
	}

	/**
	 * <p>
	 *     This function is designed to get video address.
	 * </p>
	 * @return Videoaddress
	 */
	public String getVedioAddress()
	{
		return this.VedioAddress;
	}

	/**
	 * <p>
	 *     This function is designed to get category
	 * </p>
	 * @return Category
	 */
	public String getCategory()
	{
		return this.Category;
	}

	/**
	 * <p>
	 *     This function is designed to get detail.
	 * </p>
	 * @return detail
	 */
	public String getDetail()
	{
		return this.Detail;
	}

	/**
	 * <p>
	 *     This function is designed to get VIP level.
	 * </p>
	 * @return VIPLevel
	 */
	public String getVIPLevel()
	{
		return this.VIPLevel;
	}

	/**
	 * <p>
	 *     This function is designed to get file address.
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