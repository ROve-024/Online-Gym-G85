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

    public void writeClient(List<ClientData> clientList){
        WriteClientXml wx = new WriteClientXml();
        wx.writeXML(clientList);
    }
}
