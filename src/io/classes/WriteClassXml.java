package io.classes;

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

public class WriteClassXml {

        public void writeXML(List<ClassData> classList) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            ClassData classData;
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.newDocument();

                // 创建根节点
                Element classstore = document.createElement("DATA");

                // 创建子节点
                for(int i=0;i<classList.size();i++) {
                    classData = classList.get(i);

                    Element classes = document.createElement("ROW");

                    // 为class添加子节点
                    Element ClassID = document.createElement("ClassID");
                    ClassID.setTextContent(classData.getClassID());
                    classes.appendChild(ClassID);

                    Element Name = document.createElement("Name");
                    Name.setTextContent(classData.getName());
                    classes.appendChild(Name);

                    Element IsLive = document.createElement("IsLive");
                    IsLive.setTextContent(classData.getIsLive());
                    classes.appendChild(IsLive);

                    Element Fee = document.createElement("Fee");
                    Fee.setTextContent(classData.getFee());
                    classes.appendChild(Fee);

                    Element CoachID = document.createElement("CoachID");
                    CoachID.setTextContent(classData.getCoachID());
                    classes.appendChild(CoachID);

                    Element VedioAddress = document.createElement("VedioAddress");
                    VedioAddress.setTextContent(classData.getVedioAddress());
                    classes.appendChild(VedioAddress);

                    Element Profile = document.createElement("Profile");
                    Profile.setTextContent(classData.getProfile());
                    classes.appendChild(Profile);


                    // 为根节点添加子节点
                    classstore.appendChild(classes);
                }

                // 将根节点添加到Document下
                document.appendChild(classstore);

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
                File  xmlFile = new File("src/resources/XMLs/Class.xml");
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
