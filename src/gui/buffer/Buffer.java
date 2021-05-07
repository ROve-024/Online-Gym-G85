package gui.buffer;
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
        System.out.println(line);
        return line;
    }
    public static void setBuffer(String ID){
        File file = new File("src/resources/buffer/buffer.txt");
        file.delete();
        try {
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(ID); // \r\n为换行
            out.flush(); // 把缓存区内容压入文件
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

    public static void main(String[] args) {
        Buffer.getBuffer();
        Buffer.setBuffer("1231231231321321321");
        Buffer.getBuffer();
    }
}
