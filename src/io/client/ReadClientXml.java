package io.client;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadClientXml {
	
	public static List<ClientData> readClientXML() {
		
		File  xmlFile = new File("src/resources/XMLs/Client.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
		DocumentBuilder builder;

		//now XML is loaded as Document in memory, lets convert it to Object List
		List<ClientData> empList = new ArrayList<ClientData>();
		try {
			builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("ROW");   //Read the contains in the node ROW
						
			for(int  i = 0 ; i<nList.getLength();i++){
				empList.add(getClientData(nList.item(i)));
			}
			 //lets print Employee list information
            //for (ClientData emp : empList) {
            //    System.out.println(emp.toString());
            //}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return empList;
	}
	
	private static ClientData getClientData(Node node)
	{
		//XMLReaderDOM domReader = new XMLReaderDOM();
		ClientData emp = new ClientData();
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
			Element element = (Element) node;
			emp.setClientID(getTagValue("ClientID", element));
            emp.setName(getTagValue("Name", element));
            emp.setAccount(getTagValue("Account", element));
            emp.setPassword(getTagValue("Password", element));
            emp.setPhonenumber(getTagValue("Phonenumber", element));
			emp.setEmail(getTagValue("Email", element));
            emp.setSex(getTagValue("Sex", element));
			emp.setBalance(getTagValue("Balance", element));
			emp.setVIPlevel(getTagValue("VIPlevel", element));
			emp.setTarget(getTagValue("Target", element));
			emp.setPhysicalCondition(getTagValue("PhysicalCondition", element));
			emp.setFileAddress(getTagValue("FileAddress", element));
		}
		
		return emp;
	}
	
	private static String getTagValue(String tag, Element element) {

        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();

    }
}
