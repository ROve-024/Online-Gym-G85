package gui.member;

import java.awt.event.*;
import controller.ClassFunction;
import controller.ClientFunction;
import controller.CoachFunction;
import controller.PlanFunction;
import gui.coach.PlanHomeCoach;
import gui.other.PlanBuffer;
import gui.other.UserBuffer;
import gui.other.Warning;
import io.classes.ClassData;
import io.client.ClientData;
import io.coach.CoachData;
import io.plan.PlanData;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 22:22:46 CST 2021
 */


/**
 * @author Anna
 */
public class PlanHomeMember extends JFrame {
    public PlanHomeMember() {
        initComponents();
    }

    private void deleteButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void deleteButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 1).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void deleteButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 2).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void deleteButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 3).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void deleteButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 4).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void deleteButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 5).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeMember.run();
    }

    private void nextPageButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        int remainItem = this.list.size() - 6 * (this.page + 1);

        if(remainItem <= 0){
            Warning.run("No more page here.");
        }
        else{
            this.page++;
            this.update();
        }
    }

    private void prePageButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(this.page == 0){
            Warning.run("No previous page here.");
        }
        else{
            this.page--;
            this.update();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        planDetail = new JPanel();
        lessonName1 = new JLabel();
        coachName1 = new JLabel();
        startTime1 = new JLabel();
        deleteButton1 = new JButton();
        endTime1 = new JLabel();
        decorationLine2 = new JPanel();
        planDetail2 = new JPanel();
        lessonName2 = new JLabel();
        coachName2 = new JLabel();
        startTime2 = new JLabel();
        deleteButton2 = new JButton();
        endTime2 = new JLabel();
        planDetail3 = new JPanel();
        lessonName3 = new JLabel();
        coachName3 = new JLabel();
        startTime3 = new JLabel();
        deleteButton3 = new JButton();
        endTime3 = new JLabel();
        planDetail4 = new JPanel();
        lessonName4 = new JLabel();
        coachName4 = new JLabel();
        startTime4 = new JLabel();
        deleteButton4 = new JButton();
        endTime4 = new JLabel();
        planDetail5 = new JPanel();
        lessonName5 = new JLabel();
        coachName5 = new JLabel();
        startTime5 = new JLabel();
        deleteButton5 = new JButton();
        endTime5 = new JLabel();
        planDetail6 = new JPanel();
        lessonName6 = new JLabel();
        coachName6 = new JLabel();
        startTime6 = new JLabel();
        deleteButton6 = new JButton();
        endTime6 = new JLabel();
        nextPageButton = new JButton();
        prePageButton = new JButton();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setBorder(null);
            body.setLayout(null);

            //---- decorationLine ----
            decorationLine.setBackground(Color.black);
            decorationLine.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine);
            decorationLine.setBounds(35, 115, 730, decorationLine.getPreferredSize().height);

            //---- title ----
            title.setText("My Plan");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(25, 45, 240, title.getPreferredSize().height);

            //======== planDetail ========
            {
                planDetail.setLayout(null);

                //---- lessonName1 ----
                lessonName1.setText("Lesson Name");
                lessonName1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName1.setBackground(Color.white);
                planDetail.add(lessonName1);
                lessonName1.setBounds(10, 0, 190, 42);

                //---- coachName1 ----
                coachName1.setText("Coach Name");
                coachName1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName1.setForeground(Color.gray);
                planDetail.add(coachName1);
                coachName1.setBounds(new Rectangle(new Point(10, 40), coachName1.getPreferredSize()));

                //---- startTime1 ----
                startTime1.setText("2021-04-8 12:00");
                startTime1.setForeground(Color.gray);
                planDetail.add(startTime1);
                startTime1.setBounds(170, 45, 150, startTime1.getPreferredSize().height);

                //---- deleteButton1 ----
                deleteButton1.setText("DELETE");
                deleteButton1.setBorderPainted(false);
                deleteButton1.setBackground(new Color(217, 0, 27));
                deleteButton1.setForeground(Color.white);
                deleteButton1.addActionListener(e -> deleteButton1ActionPerformed(e));
                planDetail.add(deleteButton1);
                deleteButton1.setBounds(610, 15, 100, 40);

                //---- endTime1 ----
                endTime1.setText("endTime1");
                endTime1.setForeground(Color.gray);
                planDetail.add(endTime1);
                endTime1.setBounds(340, 45, 150, endTime1.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail.getComponentCount(); i++) {
                        Rectangle bounds = planDetail.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail.setMinimumSize(preferredSize);
                    planDetail.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail);
            planDetail.setBounds(45, 135, 720, 70);

            //======== decorationLine2 ========
            {
                decorationLine2.setBackground(Color.lightGray);
                decorationLine2.setBorder(null);
                decorationLine2.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine2.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine2.setMinimumSize(preferredSize);
                    decorationLine2.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine2);
            decorationLine2.setBounds(35, 135, 4, 470);

            //======== planDetail2 ========
            {
                planDetail2.setLayout(null);

                //---- lessonName2 ----
                lessonName2.setText("Lesson Name");
                lessonName2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName2.setBackground(Color.white);
                planDetail2.add(lessonName2);
                lessonName2.setBounds(10, 0, 190, 42);

                //---- coachName2 ----
                coachName2.setText("Coach Name");
                coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName2.setForeground(Color.gray);
                planDetail2.add(coachName2);
                coachName2.setBounds(new Rectangle(new Point(10, 40), coachName2.getPreferredSize()));

                //---- startTime2 ----
                startTime2.setText("2021-04-8 12:00");
                startTime2.setForeground(Color.gray);
                planDetail2.add(startTime2);
                startTime2.setBounds(170, 45, 150, startTime2.getPreferredSize().height);

                //---- deleteButton2 ----
                deleteButton2.setText("DELETE");
                deleteButton2.setBorderPainted(false);
                deleteButton2.setBackground(new Color(217, 0, 27));
                deleteButton2.setForeground(Color.white);
                deleteButton2.addActionListener(e -> deleteButton2ActionPerformed(e));
                planDetail2.add(deleteButton2);
                deleteButton2.setBounds(610, 15, 100, 40);

                //---- endTime2 ----
                endTime2.setText("endTime2");
                endTime2.setForeground(Color.gray);
                planDetail2.add(endTime2);
                endTime2.setBounds(340, 45, 150, endTime2.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail2.getComponentCount(); i++) {
                        Rectangle bounds = planDetail2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail2.setMinimumSize(preferredSize);
                    planDetail2.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail2);
            planDetail2.setBounds(45, 210, 720, 70);

            //======== planDetail3 ========
            {
                planDetail3.setLayout(null);

                //---- lessonName3 ----
                lessonName3.setText("Lesson Name");
                lessonName3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName3.setBackground(Color.white);
                planDetail3.add(lessonName3);
                lessonName3.setBounds(10, 0, 190, 42);

                //---- coachName3 ----
                coachName3.setText("Coach Name");
                coachName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName3.setForeground(Color.gray);
                planDetail3.add(coachName3);
                coachName3.setBounds(new Rectangle(new Point(10, 40), coachName3.getPreferredSize()));

                //---- startTime3 ----
                startTime3.setText("2021-04-8 12:00");
                startTime3.setForeground(Color.gray);
                planDetail3.add(startTime3);
                startTime3.setBounds(170, 45, 150, startTime3.getPreferredSize().height);

                //---- deleteButton3 ----
                deleteButton3.setText("DELETE");
                deleteButton3.setBorderPainted(false);
                deleteButton3.setBackground(new Color(217, 0, 27));
                deleteButton3.setForeground(Color.white);
                deleteButton3.addActionListener(e -> deleteButton3ActionPerformed(e));
                planDetail3.add(deleteButton3);
                deleteButton3.setBounds(610, 15, 100, 40);

                //---- endTime3 ----
                endTime3.setText("endTime3");
                endTime3.setForeground(Color.gray);
                planDetail3.add(endTime3);
                endTime3.setBounds(340, 45, 150, endTime3.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail3.getComponentCount(); i++) {
                        Rectangle bounds = planDetail3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail3.setMinimumSize(preferredSize);
                    planDetail3.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail3);
            planDetail3.setBounds(45, 285, 720, 70);

            //======== planDetail4 ========
            {
                planDetail4.setLayout(null);

                //---- lessonName4 ----
                lessonName4.setText("Lesson Name");
                lessonName4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName4.setBackground(Color.white);
                planDetail4.add(lessonName4);
                lessonName4.setBounds(10, 0, 190, 42);

                //---- coachName4 ----
                coachName4.setText("Coach Name");
                coachName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName4.setForeground(Color.gray);
                planDetail4.add(coachName4);
                coachName4.setBounds(new Rectangle(new Point(10, 40), coachName4.getPreferredSize()));

                //---- startTime4 ----
                startTime4.setText("2021-04-8 12:00");
                startTime4.setForeground(Color.gray);
                planDetail4.add(startTime4);
                startTime4.setBounds(170, 45, 150, startTime4.getPreferredSize().height);

                //---- deleteButton4 ----
                deleteButton4.setText("DELETE");
                deleteButton4.setBorderPainted(false);
                deleteButton4.setBackground(new Color(217, 0, 27));
                deleteButton4.setForeground(Color.white);
                deleteButton4.addActionListener(e -> deleteButton4ActionPerformed(e));
                planDetail4.add(deleteButton4);
                deleteButton4.setBounds(610, 15, 100, 40);

                //---- endTime4 ----
                endTime4.setText("endTime4");
                endTime4.setForeground(Color.gray);
                planDetail4.add(endTime4);
                endTime4.setBounds(340, 45, 150, endTime4.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail4.getComponentCount(); i++) {
                        Rectangle bounds = planDetail4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail4.setMinimumSize(preferredSize);
                    planDetail4.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail4);
            planDetail4.setBounds(45, 360, 720, 70);

            //======== planDetail5 ========
            {
                planDetail5.setLayout(null);

                //---- lessonName5 ----
                lessonName5.setText("Lesson Name");
                lessonName5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName5.setBackground(Color.white);
                planDetail5.add(lessonName5);
                lessonName5.setBounds(10, 0, 190, 42);

                //---- coachName5 ----
                coachName5.setText("Coach Name");
                coachName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName5.setForeground(Color.gray);
                planDetail5.add(coachName5);
                coachName5.setBounds(new Rectangle(new Point(10, 40), coachName5.getPreferredSize()));

                //---- startTime5 ----
                startTime5.setText("2021-04-8 12:00");
                startTime5.setForeground(Color.gray);
                planDetail5.add(startTime5);
                startTime5.setBounds(170, 45, 150, startTime5.getPreferredSize().height);

                //---- deleteButton5 ----
                deleteButton5.setText("DELETE");
                deleteButton5.setBorderPainted(false);
                deleteButton5.setBackground(new Color(217, 0, 27));
                deleteButton5.setForeground(Color.white);
                deleteButton5.addActionListener(e -> deleteButton5ActionPerformed(e));
                planDetail5.add(deleteButton5);
                deleteButton5.setBounds(610, 15, 100, 40);

                //---- endTime5 ----
                endTime5.setText("endTime5");
                endTime5.setForeground(Color.gray);
                planDetail5.add(endTime5);
                endTime5.setBounds(340, 45, 150, endTime5.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail5.getComponentCount(); i++) {
                        Rectangle bounds = planDetail5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail5.setMinimumSize(preferredSize);
                    planDetail5.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail5);
            planDetail5.setBounds(45, 435, 720, 70);

            //======== planDetail6 ========
            {
                planDetail6.setLayout(null);

                //---- lessonName6 ----
                lessonName6.setText("Lesson Name");
                lessonName6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
                lessonName6.setBackground(Color.white);
                planDetail6.add(lessonName6);
                lessonName6.setBounds(10, 0, 190, 42);

                //---- coachName6 ----
                coachName6.setText("Coach Name");
                coachName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName6.setForeground(Color.gray);
                planDetail6.add(coachName6);
                coachName6.setBounds(new Rectangle(new Point(10, 40), coachName6.getPreferredSize()));

                //---- startTime6 ----
                startTime6.setText("2021-04-8 12:00");
                startTime6.setForeground(Color.gray);
                planDetail6.add(startTime6);
                startTime6.setBounds(170, 45, 150, startTime6.getPreferredSize().height);

                //---- deleteButton6 ----
                deleteButton6.setText("DELETE");
                deleteButton6.setBorderPainted(false);
                deleteButton6.setBackground(new Color(217, 0, 27));
                deleteButton6.setForeground(Color.white);
                deleteButton6.addActionListener(e -> deleteButton6ActionPerformed(e));
                planDetail6.add(deleteButton6);
                deleteButton6.setBounds(610, 15, 100, 40);

                //---- endTime6 ----
                endTime6.setText("endTime6");
                endTime6.setForeground(Color.gray);
                planDetail6.add(endTime6);
                endTime6.setBounds(340, 45, 150, endTime6.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < planDetail6.getComponentCount(); i++) {
                        Rectangle bounds = planDetail6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = planDetail6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    planDetail6.setMinimumSize(preferredSize);
                    planDetail6.setPreferredSize(preferredSize);
                }
            }
            body.add(planDetail6);
            planDetail6.setBounds(45, 510, 720, 70);

            //---- nextPageButton ----
            nextPageButton.setBorderPainted(false);
            nextPageButton.setBackground(Color.darkGray);
            nextPageButton.setText("NEXT");
            nextPageButton.setForeground(Color.white);
            nextPageButton.addActionListener(e -> nextPageButtonActionPerformed(e));
            body.add(nextPageButton);
            nextPageButton.setBounds(655, 595, 100, 40);

            //---- prePageButton ----
            prePageButton.setText("PRE");
            prePageButton.setForeground(Color.white);
            prePageButton.addActionListener(e -> prePageButtonActionPerformed(e));
            body.add(prePageButton);
            prePageButton.setBounds(55, 595, 100, 40);

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
        body.setBounds(-10, 0, 800, 655);

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
    private JLabel decorationLine;
    private JLabel title;
    private JPanel planDetail;
    private JLabel lessonName1;
    private JLabel coachName1;
    private JLabel startTime1;
    private JButton deleteButton1;
    private JLabel endTime1;
    private JPanel decorationLine2;
    private JPanel planDetail2;
    private JLabel lessonName2;
    private JLabel coachName2;
    private JLabel startTime2;
    private JButton deleteButton2;
    private JLabel endTime2;
    private JPanel planDetail3;
    private JLabel lessonName3;
    private JLabel coachName3;
    private JLabel startTime3;
    private JButton deleteButton3;
    private JLabel endTime3;
    private JPanel planDetail4;
    private JLabel lessonName4;
    private JLabel coachName4;
    private JLabel startTime4;
    private JButton deleteButton4;
    private JLabel endTime4;
    private JPanel planDetail5;
    private JLabel lessonName5;
    private JLabel coachName5;
    private JLabel startTime5;
    private JButton deleteButton5;
    private JLabel endTime5;
    private JPanel planDetail6;
    private JLabel lessonName6;
    private JLabel coachName6;
    private JLabel startTime6;
    private JButton deleteButton6;
    private JLabel endTime6;
    private JButton nextPageButton;
    private JButton prePageButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        PlanHomeMember.run();
    }

    private int page = 0;
    private List<PlanData> list;
    private int planRemainNumb = 0;
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PlanHomeMember frame = new PlanHomeMember();
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
    private void init() {
        ClientData clientData = UserBuffer.getClientSession();
        list = PlanFunction.searchPlanByClientID(clientData.getClientID());
        this.update();
    }

    private void update() {
        int i = 0;
        int remainPage = this.list.size() - this.page * 6;
        CoachData coachDataTemp;
        ClassData classDataTemp;
        PlanData[] planData = new PlanData[6];
        ClassData tempClassData = new ClassData();

        switch (this.planRemainNumb){
            case 0:
                break;
            case 1:
                this.lessonName2.setOpaque(false);
                this.startTime2.setOpaque(false);
                this.endTime2.setOpaque(false);
                this.coachName2.setOpaque(false);
                this.deleteButton2.setVisible(true);
            case 2:
                this.lessonName3.setOpaque(false);
                this.startTime3.setOpaque(false);
                this.endTime3.setOpaque(false);
                this.coachName3.setOpaque(false);
                this.deleteButton3.setVisible(true);
            case 3:
                this.lessonName4.setOpaque(false);
                this.startTime4.setOpaque(false);
                this.endTime4.setOpaque(false);
                this.coachName4.setOpaque(false);
                this.deleteButton4.setVisible(true);
            case 4:
                this.lessonName5.setOpaque(false);
                this.startTime5.setOpaque(false);
                this.endTime5.setOpaque(false);
                this.coachName5.setOpaque(false);
                this.deleteButton5.setVisible(true);
            case 5:
                this.lessonName6.setOpaque(false);
                this.startTime6.setOpaque(false);
                this.endTime6.setOpaque(false);
                this.coachName6.setOpaque(false);
                this.deleteButton6.setVisible(true);
        }

        if((remainPage / 6) > 0){
            for(i = 0; i < 6; i++){
                planData[i] = this.list.get(i + this.page*6);
            }
            coachDataTemp = CoachFunction.searchCoachByID(planData[0].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[0].getClassID());
            this.lessonName1.setText(classDataTemp.getName());
            this.coachName1.setText(coachDataTemp.getName());
            this.startTime1.setText(planData[0].getStartTime());
            this.endTime1.setText(planData[0].getEndTime());

            coachDataTemp = CoachFunction.searchCoachByID(planData[1].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[1].getClassID());
            this.lessonName2.setText(classDataTemp.getName());
            this.coachName2.setText(coachDataTemp.getName());
            this.startTime2.setText(planData[1].getStartTime());
            this.endTime2.setText(planData[1].getEndTime());

            coachDataTemp = CoachFunction.searchCoachByID(planData[2].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[2].getClassID());
            this.lessonName3.setText(classDataTemp.getName());
            this.coachName3.setText(coachDataTemp.getName());
            this.startTime3.setText(planData[2].getStartTime());
            this.endTime3.setText(planData[2].getEndTime());

            coachDataTemp = CoachFunction.searchCoachByID(planData[3].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[3].getClassID());
            this.lessonName4.setText(classDataTemp.getName());
            this.coachName4.setText(coachDataTemp.getName());
            this.startTime4.setText(planData[3].getStartTime());
            this.endTime4.setText(planData[3].getEndTime());

            coachDataTemp = CoachFunction.searchCoachByID(planData[4].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[4].getClassID());
            this.lessonName5.setText(classDataTemp.getName());
            this.coachName5.setText(coachDataTemp.getName());
            this.startTime5.setText(planData[4].getStartTime());
            this.endTime5.setText(planData[4].getEndTime());

            coachDataTemp = CoachFunction.searchCoachByID(planData[5].getCoachID());
            classDataTemp = ClassFunction.searchClassByID(planData[5].getClassID());
            this.lessonName6.setText(classDataTemp.getName());
            this.coachName6.setText(coachDataTemp.getName());
            this.startTime6.setText(planData[5].getStartTime());
            this.endTime6.setText(planData[5].getEndTime());
        } else {
            this.planRemainNumb = this.list.size() % 6;
            for (i = 0; i < planRemainNumb; i++) {
                planData[i] = this.list.get(i + this.page * 6);
            }
            //Set text for the remaining lessons
            switch (planRemainNumb) {
                case 5:
                    coachDataTemp = CoachFunction.searchCoachByID(planData[4].getCoachID());
                    classDataTemp = ClassFunction.searchClassByID(planData[4].getClassID());
                    this.lessonName5.setText(classDataTemp.getName());
                    this.coachName5.setText(coachDataTemp.getName());
                    this.startTime5.setText(planData[4].getStartTime());
                    this.endTime5.setText(planData[4].getEndTime());
                case 4:
                    coachDataTemp = CoachFunction.searchCoachByID(planData[3].getCoachID());
                    classDataTemp = ClassFunction.searchClassByID(planData[3].getClassID());
                    this.lessonName4.setText(classDataTemp.getName());
                    this.coachName4.setText(coachDataTemp.getName());
                    this.startTime4.setText(planData[3].getStartTime());
                    this.endTime4.setText(planData[3].getEndTime());
                case 3:
                    coachDataTemp = CoachFunction.searchCoachByID(planData[2].getCoachID());
                    classDataTemp = ClassFunction.searchClassByID(planData[2].getClassID());
                    this.lessonName3.setText(classDataTemp.getName());
                    this.coachName3.setText(coachDataTemp.getName());
                    this.startTime3.setText(planData[2].getStartTime());
                    this.endTime3.setText(planData[2].getEndTime());
                case 2:
                    coachDataTemp = CoachFunction.searchCoachByID(planData[1].getCoachID());
                    classDataTemp = ClassFunction.searchClassByID(planData[1].getClassID());
                    this.lessonName2.setText(classDataTemp.getName());
                    this.coachName2.setText(coachDataTemp.getName());
                    this.startTime2.setText(planData[1].getStartTime());
                    this.endTime2.setText(planData[1].getEndTime());
                case 1:
                    coachDataTemp = CoachFunction.searchCoachByID(planData[0].getCoachID());
                    classDataTemp = ClassFunction.searchClassByID(planData[0].getClassID());
                    this.lessonName1.setText(classDataTemp.getName());
                    this.coachName1.setText(coachDataTemp.getName());
                    this.startTime1.setText(planData[0].getStartTime());
                    this.endTime1.setText(planData[0].getEndTime());
            }

            //Set style for the remaining plans
            switch (planRemainNumb) {
                case 1:
                    this.lessonName2.setText("");
                    this.lessonName2.setBackground(new Color(240, 240, 240));
                    this.lessonName2.setOpaque(true);
                    this.coachName2.setText("");
                    this.coachName2.setBackground(new Color(240, 240, 240));
                    this.coachName2.setOpaque(true);
                    this.startTime2.setText("");
                    this.startTime2.setBackground(new Color(240, 240, 240));
                    this.startTime2.setOpaque(true);
                    this.endTime2.setText("");
                    this.endTime2.setBackground(new Color(240, 240, 240));
                    this.endTime2.setOpaque(true);
                    this.deleteButton2.setVisible(false);
                case 2:
                    this.lessonName3.setText("");
                    this.lessonName3.setBackground(new Color(240, 240, 240));
                    this.lessonName3.setOpaque(true);
                    this.coachName3.setText("");
                    this.coachName3.setBackground(new Color(240, 240, 240));
                    this.coachName3.setOpaque(true);
                    this.startTime3.setText("");
                    this.startTime3.setBackground(new Color(240, 240, 240));
                    this.startTime3.setOpaque(true);
                    this.endTime3.setText("");
                    this.endTime3.setBackground(new Color(240, 240, 240));
                    this.endTime3.setOpaque(true);
                    this.deleteButton3.setVisible(false);
                case 3:
                    this.lessonName4.setText("");
                    this.lessonName4.setBackground(new Color(240, 240, 240));
                    this.lessonName4.setOpaque(true);
                    this.coachName4.setText("");
                    this.coachName4.setBackground(new Color(240, 240, 240));
                    this.coachName4.setOpaque(true);
                    this.startTime4.setText("");
                    this.startTime4.setBackground(new Color(240, 240, 240));
                    this.startTime4.setOpaque(true);
                    this.endTime4.setText("");
                    this.endTime4.setBackground(new Color(240, 240, 240));
                    this.endTime4.setOpaque(true);
                    this.deleteButton4.setVisible(false);
                case 4:
                    this.lessonName5.setText("");
                    this.lessonName5.setBackground(new Color(240, 240, 240));
                    this.lessonName5.setOpaque(true);
                    this.coachName5.setText("");
                    this.coachName5.setBackground(new Color(240, 240, 240));
                    this.coachName5.setOpaque(true);
                    this.startTime5.setText("");
                    this.startTime5.setBackground(new Color(240, 240, 240));
                    this.startTime5.setOpaque(true);
                    this.endTime5.setText("");
                    this.endTime5.setBackground(new Color(240, 240, 240));
                    this.endTime5.setOpaque(true);
                    this.deleteButton5.setVisible(false);
                case 5:
                    this.lessonName6.setText("");
                    this.lessonName6.setBackground(new Color(240, 240, 240));
                    this.lessonName6.setOpaque(true);
                    this.coachName6.setText("");
                    this.coachName6.setBackground(new Color(240, 240, 240));
                    this.coachName6.setOpaque(true);
                    this.startTime6.setText("");
                    this.startTime6.setBackground(new Color(240, 240, 240));
                    this.startTime6.setOpaque(true);
                    this.endTime6.setText("");
                    this.endTime6.setBackground(new Color(240, 240, 240));
                    this.endTime6.setOpaque(true);
                    this.deleteButton6.setVisible(false);
            }
        }
    }
}
