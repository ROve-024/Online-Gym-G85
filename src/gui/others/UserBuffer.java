package gui.others;
import controller.AdminFunction;
import controller.ClientFunction;
import controller.CoachFunction;
import io.admin.AdminData;
import io.client.ClientData;
import io.coach.CoachData;

import java.io.*;

public class UserBuffer {
    public static String getBuffer(){
        String line = "";
        try{
            File filename = new File("src/resources/buffer/userBuffer.txt");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return line;
    }
    public static void setBuffer(String ID){
        File file = new File("src/resources/buffer/userBuffer.txt");
        file.delete();
        try {
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(ID);
            out.flush();
            out.close();
        }
        catch (Exception e){
            System.out.println("Create File Error!");
        }
    }
    public static CoachData getCoachSession(){
        String ID = UserBuffer.getBuffer();
        CoachData coachData = CoachFunction.searchCoachByID(ID);
        return coachData;
    }
    public static AdminData getAdminSession(){
        String ID = UserBuffer.getBuffer();
        AdminData adminData = AdminFunction.searchAdminByID(ID);
        return adminData;
    }
    public static ClientData getClientSession(){
        String ID = UserBuffer.getBuffer();
        ClientData clientData = ClientFunction.searchClientByID(ID);
        return clientData;
    }
    public static String dataIsEmpty(String string){
        String result = "";
        if(!string.equals("Empty")){
            result = string;
        }
        return result;
    }
    public static String toEmpty(String string){
        String result = "Empty";
        if(!string.equals("")){
            result = string;
        }
        return result;
    }
}
