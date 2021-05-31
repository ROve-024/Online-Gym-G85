package io.plan;

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
/**
 * <p>
 *     This class is designed to write Plan Xml.
 * </p>
 *
 * @author Xuan Wei
 * @version 3.0
 *
 */
public class WritePlanXml {
    /**
     * <p>
     *     This function is designed to write XMl.
     * </p>
     * @param planList
     */
        public void writeXML(List<PlanData> planList) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            PlanData planData;
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.newDocument();

                // 创建根节点
                Element planstore = document.createElement("DATA");

                // 创建子节点
                for(int i=0;i<planList.size();i++) {
                    planData = planList.get(i);

                    Element plan = document.createElement("ROW");

                    // 为plan添加子节点
                    Element PlanID = document.createElement("PlanID");
                    PlanID.setTextContent(planData.getPlanID());
                    plan.appendChild(PlanID);

                    Element ClientID = document.createElement("ClientID");
                    ClientID.setTextContent(planData.getClientID());
                    plan.appendChild(ClientID);

                    Element CoachID = document.createElement("CoachID");
                    CoachID.setTextContent(planData.getCoachID());
                    plan.appendChild(CoachID);

                    Element ClassID = document.createElement("ClassID");
                    ClassID.setTextContent(planData.getClassID());
                    plan.appendChild(ClassID);

                    Element StartTime = document.createElement("StartTime");
                    StartTime.setTextContent(planData.getStartTime());
                    plan.appendChild(StartTime);

                    Element Endtime = document.createElement("Endtime");
                    Endtime.setTextContent(planData.getEndTime());
                    plan.appendChild(Endtime);


                    // 为根节点添加子节点
                    planstore.appendChild(plan);
                }

                // 将根节点添加到Document下
                document.appendChild(planstore);

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
                File  xmlFile = new File("src/resources/XMLs/Plan.xml");
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
