package io.classes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadClassXml {
	
	public static List readClassXML() {
		
		File  xmlFile = new File("src/resources/XMLs/Class.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
		DocumentBuilder builder;

		//now XML is loaded as Document in memory, lets convert it to Object List
		List<ClassData> empList = new ArrayList<ClassData>();
		try {
			builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("ROW");   //Read the contains in the node ROW
						
			for(int  i = 0 ; i<nList.getLength();i++){
				empList.add(getClassData(nList.item(i)));
			}
			 //lets print Employee list information
            //for (ClassData emp : empList) {
            //    System.out.println(emp.toString());
            //}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return empList;
	}
	
	private static ClassData getClassData(Node node)
	{
		//XMLReaderDOM domReader = new XMLReaderDOM();
		ClassData emp = new ClassData();
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
			Element element = (Element) node;
			emp.setClassID(getTagValue("ClassID", element));
			emp.setName(getTagValue("Name", element));
            emp.setIsLive(getTagValue("IsLive", element));
            emp.setFee(getTagValue("Fee", element));
            emp.setCoachID(getTagValue("CoachID", element));
            emp.setVedioAddress(getTagValue("VedioAddress", element));
            emp.setProfile(getTagValue("Profile", element));
		}
		
		return emp;
	}
	
	private static String getTagValue(String tag, Element element) {

        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();

    }
}
