package gui.member;

import javax.swing.border.*;
import controller.CheckFunction;
import controller.CoachFunction;
import controller.PlanFunction;
import gui.others.LessonBuffer;
import gui.others.PlanBuffer;
import gui.others.UserBuffer;
import gui.others.Warning;
import io.classes.ClassData;
import io.coach.CoachData;
import io.plan.PlanData;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 21:58:01 CST 2021
 */


/**
 * <p>
 *     This class is used to book offline courses.
 * </p>
 * @author Anna
 */
public class Book extends JFrame {
    public Book() {
        initComponents();
    }

    /**
     * <p>
     *     This function is used to set a new plan
     * </p>
     * @param e
     */
    private void finishButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        CheckFunction checkFunction = new CheckFunction();
        ClassData classData = LessonBuffer.getLessonBuffer();
        PlanData planData = new PlanData();
        PlanFunction.createNewPlanInfo(planData);
        List<PlanData> list;
        list = PlanFunction.getWholePlan();
        if(checkFunction.checkDate(this.startTime.getText())&&checkFunction.checkDate(this.endTime.getText())){
            PlanBuffer.setBuffer(String.valueOf(PlanFunction.maxPlanID(list)));
            planData.setClassID(LessonBuffer.getBuffer());
            planData.setCoachID(classData.getCoachID());
            planData.setClientID(UserBuffer.getBuffer());
            planData.setStartTime(PlanBuffer.toEmpty(this.startTime.getText()));
            planData.setEndTime(PlanBuffer.toEmpty(this.endTime.getText()));
            PlanFunction.updatePlanInfo(planData);
            this.dispose();
            PlanHomeMember.run();
        }
        else {
            Warning.run("Please enter the correct date format.");
        }
    }

    /**
     * <p>
     *     This function is used to abort a reservation.
     * </p>
     * @param e
     */
    private void backButtonActionPerformed(ActionEvent e) {
        this.dispose();
        LessonDetailMember.run();
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        finishButton = new JButton();
        startTime = new JTextField();
        endTime = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        title = new JLabel();
        decorationLine = new JLabel();
        backButton = new JButton();
        label3 = new JLabel();
        lessonTitle = new JLabel();
        coachName = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setLayout(null);

            //---- finishButton ----
            finishButton.setText("FINISH");
            finishButton.setBackground(new Color(217, 0, 27));
            finishButton.setForeground(Color.white);
            finishButton.setBorderPainted(false);
            finishButton.addActionListener(e -> finishButtonActionPerformed(e));
            body.add(finishButton);
            finishButton.setBounds(30, 505, 150, 50);

            //---- startTime ----
            startTime.setBackground(new Color(242, 242, 242));
            startTime.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            startTime.setBorder(new EmptyBorder(5, 10, 5, 0));
            startTime.setForeground(Color.darkGray);
            body.add(startTime);
            startTime.setBounds(30, 330, 290, 40);

            //---- endTime ----
            endTime.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            endTime.setBackground(new Color(242, 242, 242));
            endTime.setBorder(new EmptyBorder(5, 10, 5, 0));
            endTime.setForeground(Color.darkGray);
            body.add(endTime);
            endTime.setBounds(30, 405, 290, 40);

            //---- label1 ----
            label1.setText("Start Time: ");
            label1.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 16));
            label1.setForeground(Color.gray);
            body.add(label1);
            label1.setBounds(30, 300, 285, 35);

            //---- label2 ----
            label2.setText("End Time");
            label2.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 16));
            label2.setForeground(Color.gray);
            body.add(label2);
            label2.setBounds(30, 375, 130, 35);

            //---- title ----
            title.setText("Lesson Book");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- decorationLine ----
            decorationLine.setBackground(Color.black);
            decorationLine.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine);
            decorationLine.setBounds(35, 115, 730, decorationLine.getPreferredSize().height);

            //---- backButton ----
            backButton.setBorderPainted(false);
            backButton.setBackground(SystemColor.menu);
            backButton.setIcon(null);
            backButton.setText("BACK");
            backButton.addActionListener(e -> backButtonActionPerformed(e));
            body.add(backButton);
            backButton.setBounds(675, 45, 100, 40);

            //---- label3 ----
            label3.setIcon(new ImageIcon(getClass().getResource("/resources/images/originalPic/book small.png")));
            body.add(label3);
            label3.setBounds(345, 190, 440, 361);

            //---- lessonTitle ----
            lessonTitle.setText("Lesson Title");
            lessonTitle.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
            body.add(lessonTitle);
            lessonTitle.setBounds(35, 200, 250, lessonTitle.getPreferredSize().height);

            //---- coachName ----
            coachName.setText("Coach Name");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 18));
            coachName.setForeground(Color.darkGray);
            body.add(coachName);
            coachName.setBounds(35, 235, 250, 32);

            //---- label4 ----
            label4.setText("yyyy-mm-dd hh:mm:ss");
            label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            label4.setForeground(Color.lightGray);
            body.add(label4);
            label4.setBounds(30, 440, 285, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < body.getComponentCount(); i++) {
                    Rectangle bounds = body.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = body.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                body.setMinimumSize(preferredSize);
                body.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(body);
        body.setBounds(0, 0, 800, 655);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel body;
    private JButton finishButton;
    private JTextField startTime;
    private JTextField endTime;
    private JLabel label1;
    private JLabel label2;
    private JLabel title;
    private JLabel decorationLine;
    private JButton backButton;
    private JLabel label3;
    private JLabel lessonTitle;
    private JLabel coachName;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        Book.run();
    }

    /**
     * <p>
     *     This function provides the ability to run.
     * </p>
     */
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Book frame = new Book();
                    frame.init();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * <p>
     *     This function initializes the contents of the GUI.
     * </p>
     */
    public void init(){
        ClassData classData = LessonBuffer.getLessonBuffer();
        CoachData coachData = CoachFunction.searchCoachByID(classData.getCoachID());
        this.lessonTitle.setText(classData.getName());
        this.coachName.setText(coachData.getName());
    }
}
