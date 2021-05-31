package controller;

import io.classes.ClassData;
import io.classes.WriteClassXml;
import io.coach.CoachData;

import java.util.ArrayList;
import java.util.List;

import static io.classes.ReadClassXml.readClassXML;
/**
 * <p>
 *     This class implements class functions
 * </p>
 *
 * @author Bingzhe Cui
 * @version 3.0
 *
 */
public class ClassFunction {
    /**
     * <p>
     *     This function is designed to return the data of class
     * </p>
     * @return List<ClassData>
     *
     */
    public static List<ClassData> getWholeClass(){                    //return the whole class info
        List<ClassData> classList = readClassXML();

        return classList;
    }
    /**
     * <p>
     *     This function is designed to write data to XML.
     * </p>
     * @param classList
     *
     */
    public static void writeClass(List<ClassData> classList){
        WriteClassXml wx = new WriteClassXml();
        wx.writeXML(classList);
    }
    /**
     * <p>
     *     This function is designed to return the max ClassID.
     * </p>
     * @param classList
     * @return maxClassID
     */
    public static int maxClassID(List<ClassData> classList){
        int maxID = 0;
        ClassData classData;

        for(int i=0;i<classList.size();i++){
            classData = classList.get(i);
            int temp = Integer.parseInt(classData.getClassID());
            if(maxID<=temp){
                maxID = temp;
            }
        }

        return maxID;
    }
    /**
     * <p>
     *     This function is designed to create a new class.
     * </p>
     * @param classData
     */
    public static void createNewClassInfo(ClassData classData){
        List<ClassData> classList = getWholeClass();
        int maxId = maxClassID(classList);

        classData.setClassID(Integer.toString(maxId+1));
        classList.add(classData);

        writeClass(classList);
    }
    /**
     * <p>
     *     This function is designed to delete class by ID.
     * </p>
     * @param ID
     */
    public static void deleteClassByID(String ID){
        List<ClassData> classList = getWholeClass();
        ClassData temp;

        for(int i=0;i<classList.size();i++){
            temp = classList.get(i);
            if(temp.getClassID().equals(ID)){
                classList.remove(i);
            }
        }

        writeClass(classList);
    }
    /**
     * <p>
     *     This function is designed to delete class by coachID.
     * </p>
     * @param coachID
     */
    public static void deleteClassByCoachID(String coachID){
        List<ClassData> classList = getWholeClass();
        List<ClassData> newClassList = new ArrayList<ClassData>();
        ClassData temp;

        for(int i=0;i<classList.size();i++){
            temp = classList.get(i);
            if(!temp.getCoachID().equals(coachID)){
                newClassList.add(temp);
            }
        }

        writeClass(newClassList);
    }
    /**
     * <p>
     *     This function is designed to search Class by classID.
     * </p>
     * @param ID
     * @return ClassData
     */
    public static ClassData searchClassByID(String ID){
        List<ClassData> classList = getWholeClass();
        ClassData classData = null;

        for(int i=0;i<classList.size();i++){
            ClassData temp = classList.get(i);
            if(temp.getClassID().equals(ID)){
                classData = temp;
            }
        }

        if(classData == null){
            classData = new ClassData();
        }

        return  classData;
    }
    /**
     * <p>
     *     This function is designed to search class by Name.
     * </p>
     * @param Name
     * @return ClassData
     */
    public static List<ClassData> searchClassByName(String Name){
        List<ClassData> classList = getWholeClass();

        for(int i=0;i<classList.size();){
            ClassData temp = classList.get(i);
            if(!temp.getName().equals(Name)){
                classList.remove(i);
            }
            else{
                i++;
            }
        }

        return  classList;
    }
    /**
     * <p>
     *     This function is designed to search class by Profile.
     * </p>
     * @param Profile
     * @return ClassData
     */
    public static List<ClassData> searchClassByProfile(String Profile){
        List<ClassData> classList = getWholeClass();

        for(int i=0;i<classList.size();){
            ClassData temp = classList.get(i);
            if(!temp.getCategory().equals(Profile)){
                classList.remove(i);
            }
            else{
                i++;
            }
        }

        return  classList;
    }
    /**
     * <p>
     *     This function is designed to search class by CoachName.
     * </p>
     * @param CoachName
     * @return ClassData
     */
    public static List<ClassData> searchClassByCoachName(String CoachName){
        List<ClassData> classList = getWholeClass();
        List<ClassData> result = new ArrayList<ClassData>();
        String coachID = null;

        CoachFunction coachFunction = new CoachFunction();
        List<CoachData> coachList = coachFunction.getWholeCoach();
        for(int j=0;j<coachList.size();j++){
            if(coachList.get(j).getName().equals(CoachName)){
                coachID = coachList.get(j).getID();
                for(int i=0;i<classList.size();i++){
                    ClassData temp = classList.get(i);
                    if(temp.getCoachID().equals(coachID)){
                        result.add(temp);
                    }
                }
            }
        }

        return  result;
    }
    /**
     * <p>
     *     This function is designed to update the information of class.
     * </p>
     * @param classData
     */
    public static void updateClassInfo(ClassData classData){
        List<ClassData> classList = getWholeClass();

        for(int i=0;i<classList.size();i++){
            if(classList.get(i).getClassID().equals(classData.getClassID())){
                classList.get(i).setName(classData.getName());
                classList.get(i).setCoachID(classData.getCoachID());
                //classList.get(i).setFee(classData.getFee());
                //classList.get(i).setIsLive(classData.getIsLive());
                classList.get(i).setCategory(classData.getCategory());
                classList.get(i).setVedioAddress(classData.getVedioAddress());
                classList.get(i).setDetail(classData.getDetail());
                classList.get(i).setVIPLevel(classData.getVIPLevel());
                classList.get(i).setFileAddress(classData.getFileAddress());
            }
        }

        writeClass(classList);
    }
}