package controller;

import io.client.ClientData;
import io.client.WriteClientXml;
import io.coach.CoachData;

import java.util.List;

import static io.client.ReadClientXml.readClientXML;
/**
 * <p>
 *     This class implements Client functions
 * </p>
 *
 * @author Haoqian Yu
 * @version 3.0
 *
 */
public class ClientFunction {
    /**
     * <p>
     *     This function is designed to return the data of Client
     * </p>
     * @return List<ClientData>
     *
     */
    public static List<ClientData> getWholeClient(){                    //return the whole client info
        List<ClientData> clientList = readClientXML();

        return clientList;
    }
    /**
     * <p>
     *     This function is designed to write data to XML.
     * </p>
     * @param clientList
     *
     */
    public static void writeClient(List<ClientData> clientList){
        WriteClientXml wx = new WriteClientXml();
        wx.writeXML(clientList);
    }
    /**
     * <p>
     *     This function is designed to return the max ClientID.
     * </p>
     * @param clientList
     * @return maxClientID
     */
    public static int maxClientID(List<ClientData> clientList){
        int maxId = 0;
        ClientData clientData;

        for(int i=0;i<clientList.size();i++) {
            clientData = clientList.get(i);
            int temp = Integer.parseInt(clientData.getClientID());
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
        List<ClientData> clientList = getWholeClient();

        boolean ifMatch = false;
        ClientData clientData;

        for(int  i = 0 ; i<clientList.size();i++){
            clientData = clientList.get(i);
            if(clientData.getAccount().equals(Account) && clientData.getPassword().equals(Password)){
                ifMatch = true;
                break;
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
        List<ClientData> clientList = getWholeClient();
        boolean ifExist = false;

        for(int  i = 0 ; i<clientList.size();i++){
            ClientData temp = clientList.get(i);
            if(temp.getAccount().equals(Account)){
                ifExist = true;
                break;
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
        List<ClientData> clientList = getWholeClient();

        ClientData clientData = new ClientData();

        String newID = Integer.toString(maxClientID(clientList)+1);

        clientData.setAccount(Account);
        clientData.setClientID(newID);
        clientData.setName("Empty");
        clientData.setPassword(Password);
        clientData.setPhonenumber("Empty");
        clientData.setEmail("Empty");
        clientData.setSex("Empty");
        clientData.setBalance("Empty");
        clientData.setVIPlevel("Empty");
        clientData.setTarget("Empty");
        clientData.setPhysicalCondition("Empty");
        clientData.setFileAddress("Empty");

        clientList.add(clientData);

        writeClient(clientList);

        return newID;
    }

    /**
     * <p>
     *     This function is designed to search Client by Name.
     * </p>
     * @param Name
     * @return ClientData
     */
    public static List<ClientData> searchClientByName(String Name){
        List<ClientData> clientList = getWholeClient();

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(!temp.getName().equals(Name)){
                clientList.remove(i);
            }
            else
            {
                i++;
            }
        }

        return clientList;
    }

    /**
     * <p>
     *     This function is designed to search Client by ClientID.
     * </p>
     * @param ID
     * @return ClientData
     */
    public static ClientData searchClientByID(String ID){
        List<ClientData> clientList = getWholeClient();
        ClientData clientData = null;

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getClientID().equals(ID)){
                clientData = temp;
                break;
            }
        }
        return clientData;
    }

    /**
     * <p>
     *     This function is designed to update the information of Client.
     * </p>
     * @param updateClientData
     */
    public static void updateClientInfo(ClientData updateClientData){
        List<ClientData> clientList = getWholeClient();

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getAccount().equals(updateClientData.getAccount())){
                clientList.get(i).setName(updateClientData.getName());
                clientList.get(i).setPassword(updateClientData.getPassword());
                clientList.get(i).setPhonenumber(updateClientData.getPhonenumber());
                clientList.get(i).setSex(updateClientData.getSex());
                clientList.get(i).setEmail(updateClientData.getEmail());
                clientList.get(i).setBalance(updateClientData.getBalance());
                clientList.get(i).setVIPlevel(updateClientData.getVIPlevel());
                clientList.get(i).setTarget(updateClientData.getTarget());
                clientList.get(i).setPhysicalCondition(updateClientData.getPhysicalCondition());
                clientList.get(i).setFileAddress(updateClientData.getFileAddress());
                break;
            }
        }

        writeClient(clientList);
    }
    /**
     * <p>
     *     This function is designed to delete Client by ClientID.
     * </p>
     * @param ID
     */
    public static void DeleteClientByID(String ID){
        List<ClientData> clientList = getWholeClient();

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getClientID().equals(ID)) {
                clientList.remove(i);
                break;
            }
        }
        writeClient(clientList);
    }
    /**
     * <p>
     *     This function is designed to delete Client by account.
     * </p>
     * @param Account
     */
    public static void DeleteClientByAccount(String Account){
        List<ClientData> clientList = getWholeClient();

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getAccount().equals(Account)) {
                clientList.remove(i);
                break;
            }
        }
        writeClient(clientList);
    }
    /**
     * <p>
     *     This function is designed to get ID by Account.
     * </p>
     * @param Account
     */
    public static String getIDByAccount(String Account){
        List<ClientData> clientList = getWholeClient();
        ClientData clientData = null;

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getAccount().equals(Account)){
                clientData = temp;
                break;
            }
        }
        return clientData.getClientID();
    }
}