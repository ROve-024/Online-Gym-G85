package gui.others;


import controller.ClassFunction;
import io.classes.ClassData;

import java.io.*;

/**
 *<p>
 *     This class is used to operate on LessonBuffer
 *</p>
 */
public class LessonBuffer {
    /**
     * <p>
     *     This method is used to get the current value of the Buffer.
     * </p>
     */
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

    /**
     * <p>
     *     This method is used to set the value of the Buffer.
     * </p>
     * @param ID
     */
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

    /**
     * <p>
     *     This method is used to get the current LessonData
     * </p>
     * @return ClassData
     */
    public static ClassData getLessonBuffer(){
        String ID = LessonBuffer.getBuffer();
        ClassData classData = ClassFunction.searchClassByID(ID);
        return classData;
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
