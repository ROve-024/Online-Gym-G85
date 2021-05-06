package Controller;

import IO.coach.CoachData;

import java.util.List;

import static IO.coach.ReadXml.readXML;

public class CoachFunction {

    public static boolean login(String Account, String Password){
        List<CoachData> coachList = readXML();
        boolean ifExist = false;
        CoachData coachData;

        for(int  i = 0 ; i<coachList.size();i++){
            coachData = coachList.get(i);
            if(coachData.getCoachAccount().equals(Account) && coachData.getCoachPassword().equals(Password)){
                ifExist = true;
            }
        }

        return ifExist;
    }



}
