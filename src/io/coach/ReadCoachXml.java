package io.coach;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;import org.w3c.dom.Element;
import org.w3c.dom.Node;import org.w3c.dom.NodeList;
/**
 * <p>
 *     This class is designed to read admin Xml.
 * </p>
 *
 * @author Bingzhe Cui
 * @version 3.0
 *
 */
public class ReadCoachXml {
	/**
	 * <p>
	 *     This function is designed to read coach XML.
	 * </p>
	 * @return CoachData
	 */
	public static List<CoachData> readCoachXML() {
		
		File  xmlFile = new File("src/resources/XMLs/Coach.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
		DocumentBuilder builder;

		//now XML is loaded as Document in memory, lets convert it to Object List
		List<CoachData> empList = new ArrayList<CoachData>();
		try {
			builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("ROW");   //Read the contains in the node ROW
						
			for(int  i = 0 ; i<nList.getLength();i++){
				empList.add(getCoachData(nList.item(i)));
			}
			 //lets print Employee list information
            //for (CoachData emp : empList) {
            //    System.out.println(emp.toString());
            //}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return empList;
	}
	/**
	 * <p>
	 *     This function is designed to get coach data.
	 * </p>
	 * @param node
	 * @return CoachData
	 */
	private static CoachData getCoachData(Node node) 
	{
		//XMLReaderDOM domReader = new XMLReaderDOM();
		CoachData emp = new CoachData();
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
			Element element = (Element) node;
			emp.setCoachID(getTagValue("CoachID", element));
            emp.setName(getTagValue("Name", element));
            emp.setAccount(getTagValue("Account", element));
            emp.setPassword(getTagValue("Password", element));
            emp.setPhonenumber(getTagValue("Phonenumber", element));
			emp.setEmail(getTagValue("Email", element));
            emp.setSex(getTagValue("Sex", element));
            emp.setProfile(getTagValue("Profile", element));
			emp.setFileAddress(getTagValue("FileAddress", element));
		}
		
		return emp;
	}
	/**
	 * <p>
	 *     This function is designed to get tag value.
	 * </p>
	 * @param tag
	 * @param element
	 * @return TagValue
	 */
	private static String getTagValue(String tag, Element element) {

        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();

    }
}
