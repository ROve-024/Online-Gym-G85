package controller;

import io.classes.ClassData;
import io.classes.WriteClassXml;
import io.coach.CoachData;

import java.util.ArrayList;
import java.util.List;

import static io.classes.ReadClassXml.readClassXML;

public class ClassFunction {
    public static List getWholeClass(){                    //return the whole class info
        List<ClassData> classList = readClassXML();

        return classList;
    }

    public static void writeClass(List<ClassData> classList){
        WriteClassXml wx = new WriteClassXml();
        wx.writeXML(classList);
    }

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

    public static void createNewClassInfo(ClassData classData){
        List<ClassData> classList = getWholeClass();
        int maxId = maxClassID(classList);

        classData.setClassID(Integer.toString(maxId+1));
        classList.add(classData);

        writeClass(classList);
    }

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

    public static ClassData searchClassByName(String Name){
        List<ClassData> classList = getWholeClass();
        ClassData classData = null;

        for(int i=0;i<classList.size();i++){
            ClassData temp = classList.get(i);
            if(temp.getName().equals(Name)){
                classData = temp;
            }
        }

        return  classData;
    }

    public static List searchClassByProfile(String Profile){
        List<ClassData> classList = getWholeClass();

        for(int i=0;i<classList.size();i++){
            ClassData temp = classList.get(i);
            if(!temp.getProfile().equals(Profile)){
                classList.remove(i);
            }
        }

        return  classList;
    }

    public static List searchClassByCoachName(String CoachName){
        List<ClassData> classList = getWholeClass();
        String coachID = null;

        CoachFunction coachFunction = new CoachFunction();
        List<CoachData> coachList = coachFunction.getWholeCoach();
        for(int j=0;j<coachList.size();j++){
            if(coachList.get(j).getName().equals(CoachName)){
                coachID = coachList.get(j).getID();
            }
        }



        for(int i=0;i<classList.size();i++){
            ClassData temp = classList.get(i);
            if(!temp.getCoachID().equals(coachID)){
                classList.remove(i);
            }
        }

        return  classList;
    }

    public static void updateClassInfo(ClassData classData){
        List<ClassData> classList = getWholeClass();

        for(int i=0;i<classList.size();i++){
            if(classList.get(i).getClassID().equals(classData.getClassID())){
                classList.get(i).setName(classData.getName());
                classList.get(i).setCoachID(classData.getCoachID());
                classList.get(i).setFee(classData.getFee());
                classList.get(i).setIsLive(classData.getIsLive());
                classList.get(i).setProfile(classData.getProfile());
                classList.get(i).setVedioAddress(classData.getVedioAddress());
            }
        }

        writeClass(classList);
    }
}
