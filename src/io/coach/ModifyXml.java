package io.coach;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ModifyXml {
	
	public void modifyXml() {
		
		//Scanner sc = new Scanner(System.in);
        String str = "Password";
		//String id = /DATA/ROW[@CoachID='id'];
		
		File  xmlFile = new File("src/resources/XMLs/Coach.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder;
		
		try {
			builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();
									
			NodeList nList = doc.getElementsByTagName("ROW");
			Element emp = null;
	        //loop for each employee
	        for(int i=0; i<nList.getLength();i++){
	            emp = (Element) nList.item(i);
	            Node password = emp.getElementsByTagName(str).item(0).getFirstChild();
	            String coachid = emp.getElementsByTagName("CoachID").item(0).getFirstChild().getNodeValue();
	            if(coachid.equalsIgnoreCase("1")) {
	            	System.out.print("1111");
	            	password.setNodeValue("654321");
	            }
	        }
			 
			TransformerFactory factoryOut = TransformerFactory.newInstance();
			Transformer former = factoryOut.newTransformer();
			former.setOutputProperty(OutputKeys.INDENT, "yes");
			former.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,"yes");
			former.transform(new DOMSource(doc), new StreamResult(new File("src/resources/XMLs/Coach.xml")));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
	
	
