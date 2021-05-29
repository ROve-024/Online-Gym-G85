package controller;

import java.util.ArrayList;
import java.util.List;

import io.classes.ClassData;
import io.plan.PlanData;
import io.plan.WritePlanXml;
import io.plan.ReadPlanXml;

import static io.plan.ReadPlanXml.readPlanXML;

public class PlanFunction {


    public static List getWholePlan(){
        List<PlanData> planList = readPlanXML();

        return planList;
    }

    public static void writePlan(List<PlanData> planList){
        WritePlanXml PlanWriter = new WritePlanXml();
        PlanWriter.writeXML(planList);
    }

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

    public static void createNewPlanInfo(PlanData planData){
        List<PlanData> planList = getWholePlan();
        int maxId = maxPlanID(planList);

        planData.setPlanID(Integer.toString(maxId+1));
        planList.add(planData);

        writePlan(planList);
    }

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

    public static List searchPlanByClientID(String ClientID){

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

    public static List searchPlanByCoachID(String CoachID){

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