package controller;

import io.client.ClientData;
import io.client.WriteClientXml;

import java.util.List;

import static io.client.ReadClientXml.readClientXML;

public class ClientFunction {
	
    public static List getWholeClient(){                    //return the whole client info
        List<ClientData> clientList = readClientXML();

        return clientList;
    }

    public static void writeClient(List<ClientData> clientList){
        WriteClientXml wx = new WriteClientXml();
        wx.writeXML(clientList);
    }
    public static int maxClientID(List<ClientData> clientList){
        int maxId = 0;

        for(int i=0;i<clientList.size();i++) {
            ClientData clientData;
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
        clientData.setSex("Empty");
        clientData.setBalance("Empty");
        clientData.setVIPlevel("Empty");
        clientData.setEmail("Empty");
        clientList.add(clientData);

        writeClient(clientList);

        return newID;
    }
    public static ClientData searchClientByName(String Name){
        List<ClientData> clientList = getWholeClient();
        ClientData clientData = null;

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getName().equals(Name)){
                clientData = temp;
                break;
            }
        }

        return clientData;
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
    public static void updateClientInfo(ClientData clientData){
        List<ClientData> clientList = getWholeClient();

        for(int i=0;i<clientList.size();i++) {
            ClientData temp;
            temp = clientList.get(i);
            if(temp.getAccount().equals(clientData.getAccount())){
            	clientList.get(i).setName(clientData.getName());
            	clientList.get(i).setPassword(clientData.getPassword());
            	clientList.get(i).setPhonenumber(clientData.getPhonenumber());
                clientList.get(i).setEmail(clientData.getEmail());
            	clientList.get(i).setSex(clientData.getSex());
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
