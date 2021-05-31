package controller;

import java.util.ArrayList;
import java.util.List;

import io.classes.ClassData;
import io.plan.PlanData;
import io.plan.WritePlanXml;
import io.plan.ReadPlanXml;

import static io.plan.ReadPlanXml.readPlanXML;
/**
 * <p>
 *     This class implements Plan functions
 * </p>
 *
 * @author Xuan Wei
 * @version 3.0
 *
 */
public class PlanFunction {

    /**
     * <p>
     *     This function is designed to return the data of plan
     * </p>
     * @return List<PlanData>
     *
     */
    public static List<PlanData> getWholePlan(){
        List<PlanData> planList = readPlanXML();

        return planList;
    }
    /**
     * <p>
     *     This function is designed to write data to XML.
     * </p>
     * @param planList
     *
     */
    public static void writePlan(List<PlanData> planList){
        WritePlanXml PlanWriter = new WritePlanXml();
        PlanWriter.writeXML(planList);
    }
    /**
     * <p>
     *     This function is designed to return the max PlanID.
     * </p>
     * @param planList
     * @return maxPlanID
     */
    public static int maxPlanID(List<PlanData> planList){
        int maxID = 0;
        PlanData planData;

        for(int i=0;i<planList.size();i++){
            planData = planList.get(i);
            int temp = Integer.parseInt(planData.getPlanID());
            if(maxID<=temp){
                maxID = temp;
            }
        }

        return maxID;
    }

    /**
     * <p>
     *     This function is designed to create a new plan.
     * </p>
     * @param planData
     */
    public static void createNewPlanInfo(PlanData planData){
        List<PlanData> planList = getWholePlan();
        int maxId = maxPlanID(planList);

        planData.setPlanID(Integer.toString(maxId+1));
        planList.add(planData);

        writePlan(planList);
    }

    /**
     * <p>
     *     This function is designed to search Plan by PLanID.
     * </p>
     * @param PlanID
     * @return PlanData
     */
    public static PlanData searchPlanByPlanID(String PlanID){
        List<PlanData> PlanList = getWholePlan();
        PlanData PlanData = null;

        for(int i=0;i<PlanList.size();i++) {
            PlanData temp;
            temp = PlanList.get(i);
            if(temp.getPlanID().equals(PlanID)){
                PlanData = temp;
            }
        }

        return PlanData;
    }
    /**
     * <p>
     *     This function is designed to search Plan by ClientID.
     * </p>
     * @param ClientID
     * @return PlanData
     */
    public static List<PlanData> searchPlanByClientID(String ClientID){

        List<PlanData> PlanList = getWholePlan();

        for(int i=0;i<PlanList.size();) {
            PlanData temp;
            temp = PlanList.get(i);
            if(!temp.getClientID().equals(ClientID)){
                PlanList.remove(i);
            }
            else{
                i++;
            }
        }

        return PlanList;
    }
    /**
     * <p>
     *     This function is designed to search Plan by CoachID.
     * </p>
     * @param CoachID
     * @return PlanData
     */
    public static List<PlanData> searchPlanByCoachID(String CoachID){

        List<PlanData> PlanList = getWholePlan();

        for(int i=0;i<PlanList.size();) {
            PlanData temp;
            temp = PlanList.get(i);
            if(!temp.getCoachID().equals(CoachID)){
                PlanList.remove(i);
            }
            else{
                i++;
            }

        }
        return PlanList;
    }

    /**
     * <p>
     *     This function is designed to delete plan by planID.
     * </p>
     * @param PlanID
     */
    public static void DeletePlanByPlanID(String PlanID){
        List<PlanData> PlanList = getWholePlan();

        for(int i=0;i<PlanList.size();i++) {
            PlanData temp;
            temp = PlanList.get(i);
            if(temp.getPlanID().equals(PlanID)) {
                PlanList.remove(i);
            }
        }
        writePlan(PlanList);
    }
    /**
     * <p>
     *     This function is designed to delete plan by CoachID.
     * </p>
     * @param coachID
     */
    public static void deletePlanByCoachID(String coachID){
        List<PlanData> planList = getWholePlan();
        List<PlanData> newPlanList = new ArrayList<PlanData>();
        PlanData temp;

        for(int i=0;i<planList.size();i++){
            temp = planList.get(i);
            if(!temp.getCoachID().equals(coachID)){
                newPlanList.add(temp);
            }
        }

        writePlan(newPlanList);
    }
    /**
     * <p>
     *     This function is designed to delete plan by ClientID.
     * </p>
     * @param clientID
     */
    public static void deletePlanByClientID(String clientID){
        List<PlanData> planList = getWholePlan();
        List<PlanData> newPlanList = new ArrayList<PlanData>();
        PlanData temp;

        for(int i=0;i<planList.size();i++){
            temp = planList.get(i);
            if(!temp.getClientID().equals(clientID)){
                newPlanList.add(temp);
            }
        }

        writePlan(newPlanList);
    }
    /**
     * <p>
     *     This function is designed to delete plan by ClassID.
     * </p>
     * @param classID
     */
    public static void deletePlanByClassID(String classID){
        List<PlanData> planList = getWholePlan();
        List<PlanData> newPlanList = new ArrayList<PlanData>();
        PlanData temp;

        for(int i=0;i<planList.size();i++){
            temp = planList.get(i);
            if(!temp.getClassID().equals(classID)){
                newPlanList.add(temp);
            }
        }

        writePlan(newPlanList);
    }

    /**
     * <p>
     *     This function is designed to update the information of plan.
     * </p>
     * @param planData
     */
    public static void updatePlanInfo(PlanData planData){
        List<PlanData> planList = getWholePlan();

        for(int i=0;i<planList.size();i++){
            if(planList.get(i).getPlanID().equals(planData.getPlanID())){
                planList.get(i).setClientID(planData.getClientID());
                planList.get(i).setCoachID(planData.getCoachID());
                planList.get(i).setClassID(planData.getClassID());
                planList.get(i).setStartTime(planData.getStartTime());
                planList.get(i).setEndTime(planData.getEndTime());
            }
        }

        writePlan(planList);
    }
}