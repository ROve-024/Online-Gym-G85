package controller;

import IO.client.ClientData;
import IO.client.WriteClientXml;

import java.util.List;

import static IO.client.ReadClientXml.readClientXML;

public class ClientFunction {
    public static List getWholeClient(){                    //return the whole client info
        List<ClientData> clientList = readClientXML();

        return clientList;
    }

    public void writeClient(List<ClientData> clientList){
        WriteClientXml wx = new WriteClientXml();
        wx.writeXML(clientList);
    }
}
