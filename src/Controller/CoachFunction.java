package Controller;

import IO.coach.CoachData;
import IO.coach.WriteCoachXml;

import java.util.List;

import static IO.coach.ReadCoachXml.readCoachXML;

public class CoachFunction {

    public static List getWholeCoach(){                    //return the whole coach info
        List<CoachData> coachList = readCoachXML();

        return coachList;
    }

    public void writeCoach(List<CoachData> coachList){
        WriteCoachXml wx = new WriteCoachXml();
        wx.writeXML(coachList);
    }

    public int maxCoachID(List<CoachData> coachList){
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

    public static boolean login(String Account, String Password){       //check the account and the password if match
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

    public void signUp(String Account, String Password){
        List<CoachData> coachList = getWholeCoach();

        CoachData coachData = new CoachData();

        coachData.setCoachAccount(Account);
        coachData.setCoachID(Integer.toString(maxCoachID(coachList)) + 1);
        coachData.setCoachName(null);
        coachData.setCoachPassword(Password);
        coachData.setCoachPhonenumber(null);
        coachData.setCoachProfile(null);
        coachData.setCoachSex(null);

        coachList.add(coachData);

        writeCoach(coachList);
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

}
