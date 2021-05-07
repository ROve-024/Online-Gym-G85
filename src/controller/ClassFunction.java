package controller;

import io.classes.ClassData;
import io.classes.WriteClassXml;

import java.util.List;

import static io.classes.ReadClassXml.readClassXML;

public class ClassFunction {
    public static List getWholeClass(){                    //return the whole class info
        List<ClassData> classList = readClassXML();

        return classList;
    }

    public void writeClass(List<ClassData> classList){
        WriteClassXml wx = new WriteClassXml();
        wx.writeXML(classList);
    }
}
