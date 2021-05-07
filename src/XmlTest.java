import Controller.ClassFunction;
import Controller.ClientFunction;
import Controller.CoachFunction;
import IO.Class.ClassData;
import IO.client.ClientData;
import IO.coach.CoachData;

import java.util.List;


public class XmlTest {
        public static void main(String[] args) {
            CoachFunction lx = new CoachFunction();
            System.out.println(lx.getWholeCoach());
            List<CoachData> coachData;

            coachData = lx.getWholeCoach();

            System.out.println("________________________________________________________________________________");
            lx.writeCoach(coachData);
            System.out.println(lx.getWholeCoach());

            System.out.println("...............................................................................");

            ClassFunction cx = new ClassFunction();
            System.out.println(cx.getWholeClass());
            List<ClassData> classData;

            classData = cx.getWholeClass();

            System.out.println("________________________________________________________________________________");
            cx.writeClass(classData);
            System.out.println(cx.getWholeClass());

            System.out.println("...............................................................................");

            ClientFunction sx = new ClientFunction();
            System.out.println(sx.getWholeClient());
            List<ClientData> clientData;

            clientData = sx.getWholeClient();

            System.out.println("________________________________________________________________________________");
            sx.writeClient(clientData);
            System.out.println(sx.getWholeClient());
        }
}
