package controller;

import IO.coach.CoachData;
import IO.coach.WriteCoachXml;

import java.util.List;

import static IO.coach.ReadCoachXml.readCoachXML;

public class CoachFunction {

    public static List getWholeCoach(){                    //return the whole coach info
        List<CoachData> coachList = readCoachXML();

        return coachList;
    }

    public static void writeCoach(List<CoachData> coachList){
        WriteCoachXml wx = new WriteCoachXml();
        wx.writeXML(coachList);
    }

    public static int maxCoachID(List<CoachData> coachList){
        int maxId = 0;

        for(int i=0;i<coachList.size();i++) {
            CoachData coachData;
            coachData = coachList.get(i);
            int temp = Integer.parseInt(coachData.getCoachID());
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
            if(coachData.getCoachAccount().equals(Account) && coachData.getCoachPassword().equals(Password)){
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
            if(temp.getCoachAccount().equals(Account)){
                ifExist = true;
            }
        }

        return ifExist;
    }

    public static String signUpSubmit(String Account, String Password){
        List<CoachData> coachList = getWholeCoach();

        CoachData coachData = new CoachData();

        String newID = Integer.toString(maxCoachID(coachList)+1);

        coachData.setCoachAccount(Account);
        coachData.setCoachID(newID);
        coachData.setCoachName("Empty");
        coachData.setCoachPassword(Password);
        coachData.setCoachPhonenumber("Empty");
        coachData.setCoachProfile("Empty");
        coachData.setCoachSex("Empty");

        coachList.add(coachData);

        writeCoach(coachList);

        return newID;
    }

    public static CoachData searchCoachByName(String Name){
        List<CoachData> coachList = getWholeCoach();
        CoachData coachData = null;

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getCoachName().equals(Name)){
                coachData = temp;
            }
        }

        return coachData;
    }

    public static CoachData searchCoachByID(String ID){
        List<CoachData> coachList = getWholeCoach();
        CoachData coachData = null;

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getCoachID().equals(ID)){
                coachData = temp;
            }
        }
        return coachData;
    }

    public static void updateCoachInfo(String Account, String Name, String Password, String Phonenumber, String Profile, String Sex){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getCoachAccount().equals(Account)){
                coachList.get(i).setCoachName(Name);
                coachList.get(i).setCoachPassword(Password);
                coachList.get(i).setCoachPhonenumber(Phonenumber);
                coachList.get(i).setCoachProfile(Profile);
                coachList.get(i).setCoachSex(Sex);
            }
        }

        writeCoach(coachList);
    }

    public static void DeleteCoachByID(String ID){
        List<CoachData> coachList = getWholeCoach();

        for(int i=0;i<coachList.size();i++) {
            CoachData temp;
            temp = coachList.get(i);
            if(temp.getCoachID().equals(ID)) {
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
            if(temp.getCoachAccount().equals(Account)) {
                coachList.remove(i);
            }
        }
        writeCoach(coachList);
    }
}
