package io.order;

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

public class WriteOrderXml {

        public void writeXML(List<OrderData> orderList) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            OrderData orderData;
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.newDocument();

                // 创建根节点
                Element orderstore = document.createElement("DATA");

                // 创建子节点
                for(int i=0;i<orderList.size();i++) {
                    orderData = orderList.get(i);

                    Element order = document.createElement("ROW");

                    // 为order添加子节点
                    Element OrderID = document.createElement("OrderID");
                    OrderID.setTextContent(orderData.getOrderID());
                    order.appendChild(OrderID);

                    Element ClientID = document.createElement("ClientID");
                    ClientID.setTextContent(orderData.getClientID());
                    order.appendChild(ClientID);

                    Element CoachID = document.createElement("CoachID");
                    CoachID.setTextContent(orderData.getCoachID());
                    order.appendChild(CoachID);

                    Element ClassID = document.createElement("ClassID");
                    ClassID.setTextContent(orderData.getClassID());
                    order.appendChild(ClassID);

                    Element StartTime = document.createElement("StartTime");
                    StartTime.setTextContent(orderData.getStartTime());
                    order.appendChild(StartTime);

                    Element Endtime = document.createElement("Endtime");
                    Endtime.setTextContent(orderData.getEndtime());
                    order.appendChild(Endtime);


                    // 为根节点添加子节点
                    orderstore.appendChild(order);
                }

                // 将根节点添加到Document下
                document.appendChild(orderstore);

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
                File  xmlFile = new File("src/resources/XMLs/Order.xml");
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
