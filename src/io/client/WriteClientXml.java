package io.client;

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

public class WriteClientXml {

        public void writeXML(List<ClientData> clientList) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            ClientData clientData;
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.newDocument();

                // 创建根节点
                Element clientstore = document.createElement("DATA");

                // 创建子节点
                for(int i=0;i<clientList.size();i++) {
                    clientData = clientList.get(i);

                    Element client = document.createElement("ROW");

                    // 为client添加子节点
                    Element ClientID = document.createElement("ClientID");
                    ClientID.setTextContent(clientData.getClientID());
                    client.appendChild(ClientID);

                    Element Name = document.createElement("Name");
                    Name.setTextContent(clientData.getName());
                    client.appendChild(Name);

                    Element Account = document.createElement("Account");
                    Account.setTextContent(clientData.getAccount());
                    client.appendChild(Account);

                    Element Password = document.createElement("Password");
                    Password.setTextContent(clientData.getPassword());
                    client.appendChild(Password);

                    Element Phonenumber = document.createElement("Phonenumber");
                    Phonenumber.setTextContent(clientData.getPhonenumber());
                    client.appendChild(Phonenumber);

                    Element Email = document.createElement("Email");
                    Email.setTextContent(clientData.getEmail());
                    client.appendChild(Email);

                    Element Sex = document.createElement("Sex");
                    Sex.setTextContent(clientData.getSex());
                    client.appendChild(Sex);

                    Element Balance = document.createElement("Balance");
                    Balance.setTextContent(clientData.getBalance());
                    client.appendChild(Balance);

                    Element VIPlevel = document.createElement("VIPlevel");
                    VIPlevel.setTextContent(clientData.getVIPlevel());
                    client.appendChild(VIPlevel);


                    // 为根节点添加子节点
                    clientstore.appendChild(client);
                }

                // 将根节点添加到Document下
                document.appendChild(clientstore);

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
                File  xmlFile = new File("src/resources/XMLs/Client.xml");
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
