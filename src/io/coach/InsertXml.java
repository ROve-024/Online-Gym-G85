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
import org.w3c.dom.NodeList;

public class InsertXml {
	
	public void insertXml() {

		Element  Coach = null;
		Element  Row = null;
		Element  CoachID = null;
		Element  Name = null;
		Element  Account = null;
		Element  Password = null;
		Element  Phonenumber = null;
		Element  Sex = null;
		Element  Profile = null;

				
		try {
			File  xmlFile = new File("src/resources/XMLs/Coach.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  //Step1
			DocumentBuilder builder = factory.newDocumentBuilder();   //Step2
			Document doc = builder.parse(xmlFile);  //Step3
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("DATA");
			Coach = (Element)nList.item(0);
			//add
			Row = doc.createElement("ROW");
			 
			CoachID = doc.createElement("CoachID");	            
			CoachID.appendChild(doc.createTextNode("3"));	            
			Row.appendChild(CoachID);
			 
			Name = doc.createElement("Name");	            
			Name.appendChild(doc.createTextNode("c"));	            
			Row.appendChild(Name);
			 
			Account = doc.createElement("Account");	            
			Account.appendChild(doc.createTextNode("coach003"));	            
			Row.appendChild(Account);
			 
			Password = doc.createElement("Password");	            
			Password.appendChild(doc.createTextNode("111"));	            
			Row.appendChild(Password);
			 
			Phonenumber = doc.createElement("Phonenumber");	            
			Phonenumber.appendChild(doc.createTextNode("1006010066"));	            
			Row.appendChild(Phonenumber);
			 
			Sex = doc.createElement("Sex");	            
			Sex.appendChild(doc.createTextNode("male"));	            
			Row.appendChild(Sex);
			 
			Profile = doc.createElement("Profile");	            
			Profile.appendChild(doc.createTextNode("medium"));	            
			Row.appendChild(Profile);
			 			 
			Coach.appendChild(Row);      //add son to root node			
			 
			
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
