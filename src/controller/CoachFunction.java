package controller;

import io.coach.CoachData;
import io.coach.WriteCoachXml;

import java.util.List;

import static io.coach.ReadCoachXml.readCoachXML;
/**
 * <p>
 *     This class implements Coach functions
 * </p>
 *
 * @author Dayou Yang
 * @version 3.0
 *
 */
public class CoachFunction {
    /**
     * <p>
     *     This function is designed to return the data of Coach
     * </p>
     * @return List<CoachData>
     *
     */
    public static List<CoachData> getWholeCoach(){                    //return the whole coach info
        List<CoachData> coachList = readCoachXML();

        return coachList;
    }
    /**
     * <p>
     *     This function is designed to write data to XML.
     * </p>
     * @param coachList
     *
     */
    public static void writeCoach(List<CoachData> coachList){
        WriteCoachXml wx = new WriteCoachXml();
        wx.writeXML(coachList);
    }
    /**
     * <p>
     *     This function is designed to return the max CoachID.
     * </p>
     * @param coachList
     * @return maxCoachID
     */
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
    /**
     * <p>
     *     This function is designed to judge if there exist a same account.
     * </p>
     * @param Account
     * @return whether there exist same account.
     */
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
    /**
     * <p>
     *     This function is designed to search Coach by Name.
     * </p>
     * @param Name
     * @return CoachData
     */
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
    /**
     * <p>
     *     This function is designed to search Coach by CoachID.
     * </p>
     * @param ID
     * @return CoachData
     */
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
    /**
     * <p>
     *     This function is designed to update the information of Coach.
     * </p>
     * @param updateCoachData
     */
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
    /**
     * <p>
     *     This function is designed to delete Coach by CoachID.
     * </p>
     * @param ID
     */
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
    /**
     * <p>
     *     This function is designed to delete Coach by account.
     * </p>
     * @param Account
     */
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
    /**
     * <p>
     *     This function is designed to get ID by Account.
     * </p>
     * @param Account
     */
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