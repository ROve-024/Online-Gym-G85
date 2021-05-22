package io.plan;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadPlanXml {
	
	public static List readPlanXML() {
		
		File  xmlFile = new File("src/resources/XMLs/Plan.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
		DocumentBuilder builder;

		//now XML is loaded as Document in memory, lets convert it to Object List
		List<PlanData> empList = new ArrayList<PlanData>();
		try {
			builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("ROW");   //Read the contains in the node ROW
						
			for(int  i = 0 ; i<nList.getLength();i++){
				empList.add(getPlanData(nList.item(i)));
			}
			 //lets print Employee list information
            //for (PlanData emp : empList) {
            //    System.out.println(emp.toString());
            //}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return empList;
	}
	
	private static PlanData getPlanData(Node node)
	{
		//XMLReaderDOM domReader = new XMLReaderDOM();
		PlanData emp = new PlanData();
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
			Element element = (Element) node;
			emp.setPlanID(getTagValue("PlanID", element));
            emp.setClientID(getTagValue("ClientID", element));
            emp.setCoachID(getTagValue("CoachID", element));
            emp.setClassID(getTagValue("ClassID", element));
            emp.setStartTime(getTagValue("StartTime", element));
            emp.setEndtime(getTagValue("Endtime", element));
		}
		
		return emp;
	}
	
	private static String getTagValue(String tag, Element element) {

        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();

    }
}
