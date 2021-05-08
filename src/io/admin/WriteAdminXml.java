package io.admin;

import io.client.ClientData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class WriteAdminXml {
    public void writeXML(List<AdminData> adminList) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        AdminData adminData;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            // 创建根节点
            Element adminStore = document.createElement("DATA");

            // 创建子节点
            for(int i=0;i<adminList.size();i++) {
                adminData = adminList.get(i);

                Element admin = document.createElement("ROW");

                // 为client添加子节点
                Element AdminID = document.createElement("AdminID");
                AdminID.setTextContent(adminData.getAdminIO());
                admin.appendChild(AdminID);

                Element Account = document.createElement("Account");
                Account.setTextContent(adminData.getAccount());
                admin.appendChild(Account);

                Element Password = document.createElement("Password");
                Password.setTextContent(adminData.getPassword());
                admin.appendChild(Password);

                adminStore.appendChild(admin);
            }

            // 将根节点添加到Document下
            document.appendChild(adminStore);

            /*
             * 下面开始实现： 生成XML文件
             */

            // 创建TransformerFactory对象
            TransformerFactory tff = TransformerFactory.newInstance();

            // 创建Transformer对象
            Transformer tf = tff.newTransformer();

            // 设置输出数据时换行
            tf.setOutputProperty(OutputKeys.INDENT, "yes");

            // 使用Transformer的transform()方法将DOM树转换成XML
            File xmlFile = new File("src/resources/XMLs/Admin.xml");
            tf.transform(new DOMSource(document), new StreamResult(xmlFile));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
