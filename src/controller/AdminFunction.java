package controller;

import io.admin.AdminData;
import io.admin.ReadAdminXml;
import io.admin.WriteAdminXml;
import io.coach.CoachData;

import java.util.List;

/**
 * <p>
 *     This class implements admin functions
 * </p>
 *
 * @author ChuangchaoLi
 * @version 3.0
 *
 */
public class AdminFunction {
    /**
     * <p>
     *     This function is designed to return the data of admin
     * </p>
     * @return List<AdminData>
     *
     */
    public static List<AdminData> getWholeAdmin(){                    //return the whole coach info
        List<AdminData> adminList = ReadAdminXml.readAmdinXML();

        return adminList;
    }

    /**
     * <p>
     *     This function is designed to write data to XML.
     * </p>
     * @param adminList
     *
     */
    public static void writeCoach(List<AdminData> adminList){
        WriteAdminXml wx = new WriteAdminXml();
        wx.writeXML(adminList);
    }

    /**
     * <p>
     *     This function is designed to return the max adminID.
     * </p>
     * @param adminList
     * @return maxAdminID
     */
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

    /**
     * <p>
     *     This function is designed to judge whether the login is matched.
     * </p>
     * @param Account
     * @param Password
     * @return whether the login is matched
     *
     */
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

    /**
     * <p>
     *     This function is designed to judge if there exist a same account.
     * </p>
     * @param Account
     * @return whether there exist same account.
     */
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

    /**
     * <p>
     *     This function is designed to get a submit of sign up.
     *
     * </p>
     * @param Account
     * @param Password
     * @return a newID
     */
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

    /**
     * <p>
     *     This function is designed to return an ID by account.
     * </p>
     * @param Account
     * @return AdminID
     */
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


    /**
     * <p>
     *     This function is designed to search Admin by ID.
     * </p>
     * @param ID
     * @return AdminData
     */
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
