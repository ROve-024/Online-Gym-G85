package gui.other;
import controller.CoachFunction;
import io.coach.CoachData;

import java.io.*;

public class Buffer {
    public static String getBuffer(){
        String line = "";
        try{
            File filename = new File("src/resources/buffer/buffer.txt");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return line;
    }
    public static void setBuffer(String ID){
        File file = new File("src/resources/buffer/buffer.txt");
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
    public static CoachData getSession(){
        String ID = Buffer.getBuffer();
        CoachData coachData = CoachFunction.searchCoachByID(ID);
        return coachData;
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
