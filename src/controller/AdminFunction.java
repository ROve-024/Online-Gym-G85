package controller;

import io.admin.AdminData;
import io.admin.ReadAdminXml;
import io.admin.WriteAdminXml;
import io.coach.CoachData;

import java.util.List;


public class AdminFunction {
    public static List getWholeAdmin(){                    //return the whole coach info
        List<AdminData> adminList = ReadAdminXml.readAmdinXML();

        return adminList;
    }

    public static void writeCoach(List<AdminData> coachList){
        WriteAdminXml wx = new WriteAdminXml();
        wx.writeXML(coachList);
    }

    public static int maxCoachID(List<AdminData> coachList){
        int maxId = 0;
        AdminData adminData;

        for(int i=0;i<coachList.size();i++) {
            adminData = coachList.get(i);
            int temp = Integer.parseInt(adminData.getAdminIO());
            if(maxId<=temp){
                maxId = temp;
            }
        }

        return maxId;
    }

    public static boolean loginMatch(String Account, String Password){       //check the account and the password if match
        List<AdminData> coachList = getWholeAdmin();

        boolean ifMatch = false;
        AdminData coachData;

        for(int  i = 0 ; i<coachList.size();i++){
            coachData = coachList.get(i);
            if(coachData.getAccount().equals(Account) && coachData.getPassword().equals(Password)){
                ifMatch = true;
            }
        }

        return ifMatch;
    }

    public static boolean ifExistSameAccount(String Account){
        List<AdminData> coachList = getWholeAdmin();
        boolean ifExist = false;

        for(int  i = 0 ; i<coachList.size();i++){
            AdminData temp = coachList.get(i);
            if(temp.getAccount().equals(Account)){
                ifExist = true;
            }
        }

        return ifExist;
    }

    public static String signUpSubmit(String Account, String Password){
        List<AdminData> coachList = getWholeAdmin();
        AdminData coachData = new AdminData();
        String newID = Integer.toString(maxCoachID(coachList)+1);
        coachData.setAccount(Account);
        coachData.setPassword(Password);
        coachList.add(coachData);
        writeCoach(coachList);
        return newID;
    }

    public static String getIDByAccount(String Account){
        List<AdminData> adminList = getWholeAdmin();
        AdminData adminData = null;

        for(int i=0;i<adminList.size();i++) {
            AdminData temp;
            temp = adminList.get(i);
            if(temp.getAccount().equals(Account)){
                adminData = temp;
            }
        }
        return adminData.getAdminIO();
    }
}
