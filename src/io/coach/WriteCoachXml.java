package io.coach;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteCoachXml {

        public void writeXML(List<CoachData> coachList) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            CoachData coachData;
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.newDocument();

                // 创建根节点
                Element coachstore = document.createElement("DATA");

                // 创建子节点
                for(int i=0;i<coachList.size();i++) {
                    coachData = coachList.get(i);

                    Element coach = document.createElement("ROW");

                    // 为coach添加子节点
                    Element CoachID = document.createElement("CoachID");
                    CoachID.setTextContent(coachData.getID());
                    coach.appendChild(CoachID);

                    Element Name = document.createElement("Name");
                    Name.setTextContent(coachData.getName());
                    coach.appendChild(Name);

                    Element Account = document.createElement("Account");
                    Account.setTextContent(coachData.getAccount());
                    coach.appendChild(Account);

                    Element Password = document.createElement("Password");
                    Password.setTextContent(coachData.getPassword());
                    coach.appendChild(Password);

                    Element Phonenumber = document.createElement("Phonenumber");
                    Phonenumber.setTextContent(coachData.getPhonenumber());
                    coach.appendChild(Phonenumber);

                    Element Email = document.createElement("Email");
                    Email.setTextContent(coachData.getEmail());
                    coach.appendChild(Email);

                    Element Sex = document.createElement("Sex");
                    Sex.setTextContent(coachData.getSex());
                    coach.appendChild(Sex);

                    Element Profile = document.createElement("Profile");
                    Profile.setTextContent(coachData.getProfile());
                    coach.appendChild(Profile);

                    Element FileAddress = document.createElement("FileAddress");
                    FileAddress.setTextContent(coachData.getFileAddress());
                    coach.appendChild(FileAddress);

                    // 为根节点添加子节点
                    coachstore.appendChild(coach);
                }

                // 将根节点添加到Document下
                document.appendChild(coachstore);

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
                File  xmlFile = new File("src/resources/XMLs/Coach.xml");
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
