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

    public static void writeCoach(List<AdminData> adminList){
        WriteAdminXml wx = new WriteAdminXml();
        wx.writeXML(adminList);
    }

    public static int maxAdminID(List<AdminData> adminList){
        int maxId = 0;
        AdminData adminData;

        for(int i=0;i<adminList.size();i++) {
            adminData = adminList.get(i);
            int temp = Integer.parseInt(adminData.getAdminIO());
            if(maxId<=temp){
                maxId = temp;
            }
        }

        return maxId;
    }

    public static boolean loginMatch(String Account, String Password){       //check the account and the password if match
        List<AdminData> adminList = getWholeAdmin();

        boolean ifMatch = false;
        AdminData coachData;

        for(int  i = 0 ; i<adminList.size();i++){
            coachData = adminList.get(i);
            if(coachData.getAccount().equals(Account) && coachData.getPassword().equals(Password)){
                ifMatch = true;
            }
        }

        return ifMatch;
    }

    public static boolean ifExistSameAccount(String Account){
        List<AdminData> adminList = getWholeAdmin();
        boolean ifExist = false;

        for(int  i = 0 ; i<adminList.size();i++){
            AdminData temp = adminList.get(i);
            if(temp.getAccount().equals(Account)){
                ifExist = true;
            }
        }

        return ifExist;
    }

    public static String signUpSubmit(String Account, String Password){
        List<AdminData> adminList = getWholeAdmin();
        AdminData adminData = new AdminData();
        String newID = Integer.toString(maxAdminID(adminList)+1);
        adminData.setAdminID(newID);
        adminData.setAccount(Account);
        adminData.setPassword(Password);
        adminList.add(adminData);
        writeCoach(adminList);
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

    public static AdminData searchAdminByID(String ID){
        List<AdminData> adminList = getWholeAdmin();
        AdminData adminData = null;

        for(int i=0;i<adminList.size();i++) {
            AdminData temp;
            temp = adminList.get(i);
            if(temp.getAdminIO().equals(ID)){
                adminData = temp;
            }
        }
        return adminData;
    }
}
