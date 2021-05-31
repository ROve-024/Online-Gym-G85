package gui.others;

import controller.ClientFunction;
import controller.CoachFunction;
import io.client.ClientData;
import io.coach.CoachData;

import java.io.*;

/**
 *<p>
 *     This class is used to operate on ViewBuffer
 *</p>
 */
public class ViewBuffer {
    /**
     * <p>
     *     This method is used to get the current value of the Buffer.
     * </p>
     */
    public static String getBuffer(){
        String line = "";
        try{
            File filename = new File("src/resources/buffer/viewBuffer.txt");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return line;
    }

    /**
     * <p>
     *     This method is used to set the value of the Buffer.
     * </p>
     * @param ID
     */
    public static void setBuffer(String ID){
        File file = new File("src/resources/buffer/viewBuffer.txt");
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

    /**
     * <p>
     *     This method is used to get the current CoachData
     * </p>
     * @return CoachData
     */
    public static CoachData getViewCoachBuffer(){
        String ID = LessonBuffer.getBuffer();
        CoachData coachData = CoachFunction.searchCoachByID(ID);
        return coachData;
    }

    /**
     * <p>
     *     This method is used to get the current ClientData
     * </p>
     * @return ClientData
     */
    public static ClientData getViewClientBuffer(){
        String ID = LessonBuffer.getBuffer();
        ClientData clientData = ClientFunction.searchClientByID(ID);
        return clientData;
    }

    /**
     * <p>
     *     This method sets the value of the string..
     * </p>
     * @param string
     * @return String
     */
    public static String dataIsEmpty(String string){
        String result = "";
        if(!string.equals("Empty")){
            result = string;
        }
        return result;
    }

    /**
     * <p>
     *     This method sets the value of the string..
     * </p>
     * @param string
     * @return String
     */
    public static String toEmpty(String string){
        String result = "Empty";
        if(!string.equals("")){
            result = string;
        }
        return result;
    }
}