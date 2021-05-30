package controller;

import io.client.ClientData;
import io.client.WriteClientXml;
import io.coach.CoachData;

import java.util.List;

import static io.client.ReadClientXml.readClientXML;

public class ClientFunction {
    public static List<ClientData> getWholeClient(){                    //return the whole client info
        List<ClientData> clientList = readClientXML();

        return clientList;
    }

    public static void writeClient(List<ClientData> clientList){
        WriteClientXml wx = new WriteClientXml();
        wx.writeXML(clientList);
    }

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
    //implemented in signUpSubmit
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
    ////////////////////////
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