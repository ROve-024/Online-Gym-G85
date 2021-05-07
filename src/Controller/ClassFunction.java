package Controller;

import IO.Class.ClassData;
import IO.Class.WriteClassXml;

import java.util.List;

import static IO.Class.ReadClassXml.readClassXML;

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
