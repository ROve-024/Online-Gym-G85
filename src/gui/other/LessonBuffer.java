package gui.other;
import controller.CoachFunction;
import io.coach.CoachData;

import java.io.*;

public class LessonBuffer {
    public static String getBuffer(){
        String line = "";
        try{
            File filename = new File("src/resources/buffer/lessonBuffer.txt");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return line;
    }
    public static void setBuffer(String ID){
        File file = new File("src/resources/buffer/lessonBuffer.txt");
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
}
