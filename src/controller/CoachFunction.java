package controller;

import io.coach.CoachData;
import io.coach.WriteCoachXml;

import java.util.List;

import static io.coach.ReadCoachXml.readCoachXML;

public class CoachFunction {

    public static List<CoachData> getWholeCoach(){                    //return the whole coach info
        List<CoachData> coachList = readCoachXML();

        return coachList;
    }

    public static void writeCoach(List<CoachData> coachList){
        WriteCoachXml wx = new WriteCoachXml();
        wx.writeXML(coachList);
    }

    public static int maxCoachID(List<CoachData> coachList){
        int maxId = 0;
        CoachData coachData;

        for(int i=0;i<coachList.size();i++) {
            coachData = coachList.get(i);
            int temp = Integer.parseInt(coachData.getID());
            if(maxId<=temp){
                maxId = temp;
            }
        }

        return maxId;
    }

    public static boolean loginMatch(String Account, String Password){       //check the account and the password if match
        List<CoachData> coachList = getWholeCoach();

        boolean ifMatch = false;
        CoachData coachData;

        for(int  i = 0 ; i<coachList.size();i++){
            coachData = coachList.get(i);
            if(coachData.getAccount().equals(Account) && coachData.getPassword().equals(Password)){
                ifMatch = true;
            }
        }

        return ifMatch;
    }

    public static boolean ifExistSameAccount(String Account){
        List<CoachData> coachList = getWholeCoach();
        boolean ifExist = false;

        for(int  i = 0 ; i<coachList.size();i++){
            CoachData temp = coachList.get(i);
            if(temp.getAccount().equals(Account)){
                ifExist = true;
            }
        }

        return ifExist;
    }

    public static String signUpSubmit(String Account, String Password){
        List<CoachData> coachList = getWholeCoach();

        CoachData coachData = new CoachData();

        String newID = Integer.toString(maxCoachID(coachList)+1);

        coachData.setAccount(Account);
        coachData.setCoachID(newID);
        coachData.setName("Empty");
        coachData.setPassword(Password);
        coachData.setPhonenumber("Empty");
        coachData.setEmail("Empty");
        coachData.setProfile("Empty");
        coachData.setFileAddress("Empty");
        coachData.setSex("Empty");

        coachList.add(coachData);

        writeCoach(coachList);

        return newID;
    }

    public static List<CoachData> searchCoachByName(String Name){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();) {
            CoachData temp;
            temp = coachList.get(i);
            if(!temp.getName().equals(Name)){
                coachList.remove(i);
                System.out.println(coachList.size());
            }

            else {
                i++;
            }
        }

        return coachList;
    }

    public static CoachData searchCoachByID(String ID){
        List<CoachData> coachList = getWholeCoach();
        CoachData coachData = null;

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getID().equals(ID)){
                coachData = temp;
            }
        }
        return coachData;
    }

    public static void updateCoachInfo(CoachData updateCoachData){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getAccount().equals(updateCoachData.getAccount())){
                coachList.get(i).setName(updateCoachData.getName());
                coachList.get(i).setPassword(updateCoachData.getPassword());
                coachList.get(i).setPhonenumber(updateCoachData.getPhonenumber());
                coachList.get(i).setEmail(updateCoachData.getEmail());
                coachList.get(i).setProfile(updateCoachData.getProfile());
                coachList.get(i).setFileAddress(updateCoachData.getFileAddress());
                coachList.get(i).setSex(updateCoachData.getSex());
            }
        }

        writeCoach(coachList);
    }

    public static void DeleteCoachByID(String ID){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getID().equals(ID)) {
                ClassFunction classFunction = new ClassFunction();
                classFunction.deleteClassByCoachID(coachList.get(i).getID());
                coachList.remove(i);
            }
        }
        writeCoach(coachList);
    }

    public static void DeleteCoachByAccount(String Account){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getAccount().equals(Account)) {
                ClassFunction classFunction = new ClassFunction();
                classFunction.deleteClassByCoachID(coachList.get(i).getID());
                coachList.remove(i);
            }
        }
        writeCoach(coachList);
    }

    public static String getIDByAccount(String Account){
        List<CoachData> coachList = getWholeCoach();
        CoachData coachData = null;

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getAccount().equals(Account)){
                coachData = temp;
            }
        }
        return coachData.getID();
    }
}