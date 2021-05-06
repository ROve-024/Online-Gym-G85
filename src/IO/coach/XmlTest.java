package IO.coach;

import Controller.CoachFunction;

public class XmlTest {

	public static void main(String[] args) {
		//ReadXml rx = new ReadXml();
        //rx.readXML();
        
        //InsertXml ix = new InsertXml();
        //ix.insertXml();
        
        //ModifyXml mx = new ModifyXml();
        //mx.modifyXml();
        
        //DeleteXml dx = new DeleteXml();
        //dx.deleteXml();

		CoachFunction lx = new CoachFunction();
		System.out.println(lx.login("coach002","1234567"));
	}
	        
}