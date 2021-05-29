package gui.coach;

import controller.ClassFunction;
import controller.ClientFunction;
import controller.CoachFunction;
import controller.PlanFunction;
import gui.member.ViewMemberProfile;
import gui.other.*;
import io.classes.ClassData;
import io.client.ClientData;
import io.coach.CoachData;
import io.plan.PlanData;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 22:25:44 CST 2021
 */


/**
 * @author Anna
 */
public class PlanHomeCoach extends JFrame {
    public PlanHomeCoach() {
        initComponents();
    }

    private void profileButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void previousButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(this.page == 0){
            Warning.run("No previous page here.");
        }
        else{
            this.page--;
            this.update();
        }
    }

    private void nextButtonActionPerformed(ActionEvent e) {
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

    private void profileButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6 + 1).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void profileButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6 + 2).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void profileButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6 + 3).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void profileButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6 + 4).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void profileButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.list.get(this.page*6 + 5).getClientID());
        ViewMemberProfile.run();
        this.dispose();
    }

    private void deleteButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void deleteButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 1).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void deleteButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 2).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void deleteButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 3).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void deleteButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 4).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void deleteButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanBuffer.setBuffer("");
        PlanBuffer.setBuffer(this.list.get(this.page*6 + 5).getPlanID());
        String planID = PlanBuffer.getBuffer();
        PlanFunction.DeletePlanByPlanID(planID);
        this.dispose();
        PlanHomeCoach.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        planDetail = new JPanel();
        lessonName1 = new JLabel();
        memberName1 = new JLabel();
        startTime1 = new JLabel();
        deleteButton1 = new JButton();
        profileButton1 = new JButton();
        endTime1 = new JLabel();
        decorationLine2 = new JPanel();
        planDetail2 = new JPanel();
        lessonName2 = new JLabel();
        memberName2 = new JLabel();
        startTime2 = new JLabel();
        deleteButton2 = new JButton();
        profileButton2 = new JButton();
        endTime2 = new JLabel();
        planDetail3 = new JPanel();
        lessonName3 = new JLabel();
        memberName3 = new JLabel();
        startTime3 = new JLabel();
        deleteButton3 = new JButton();
        profileButton3 = new JButton();
        endTime3 = new JLabel();
        planDetail4 = new JPanel();
        lessonName4 = new JLabel();
        memberName4 = new JLabel();
        startTime4 = new JLabel();
        deleteButton4 = new JButton();
        profileButton4 = new JButton();
        endTime4 = new JLabel();
        planDetail5 = new JPanel();
        lessonName5 = new JLabel();
        memberName5 = new JLabel();
        startTime5 = new JLabel();
        deleteButton5 = new JButton();
        profileButton5 = new JButton();
        endTime5 = new JLabel();
        planDetail6 = new JPanel();
        lessonName6 = new JLabel();
        memberName6 = new JLabel();
        startTime6 = new JLabel();
        deleteButton6 = new JButton();
        profileButton6 = new JButton();
        endTime6 = new JLabel();
        previousButton = new JButton();
        nextButton = new JButton();

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

                //---- memberName1 ----
                memberName1.setText("Member Name");
                memberName1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName1.setForeground(Color.gray);
                planDetail.add(memberName1);
                memberName1.setBounds(10, 40, 150, memberName1.getPreferredSize().height);

                //---- startTime1 ----
                startTime1.setText("2021-04-8 12:00");
                startTime1.setForeground(Color.gray);
                planDetail.add(startTime1);
                startTime1.setBounds(170, 45, 140, startTime1.getPreferredSize().height);

                //---- deleteButton1 ----
                deleteButton1.setText("DELETE");
                deleteButton1.setBorderPainted(false);
                deleteButton1.setBackground(new Color(217, 0, 27));
                deleteButton1.setForeground(Color.white);
                deleteButton1.addActionListener(e -> deleteButton1ActionPerformed(e));
                planDetail.add(deleteButton1);
                deleteButton1.setBounds(610, 15, 100, 40);

                //---- profileButton1 ----
                profileButton1.setText("PROFILE");
                profileButton1.setBorderPainted(false);
                profileButton1.setBackground(Color.white);
                profileButton1.addActionListener(e -> profileButton1ActionPerformed(e));
                planDetail.add(profileButton1);
                profileButton1.setBounds(495, 15, 100, 40);

                //---- endTime1 ----
                endTime1.setText("endTime1");
                endTime1.setForeground(Color.gray);
                planDetail.add(endTime1);
                endTime1.setBounds(315, 45, 145, endTime1.getPreferredSize().height);

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

                //---- memberName2 ----
                memberName2.setText("Member Name");
                memberName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName2.setForeground(Color.gray);
                planDetail2.add(memberName2);
                memberName2.setBounds(10, 40, 150, memberName2.getPreferredSize().height);

                //---- startTime2 ----
                startTime2.setText("2021-04-8 12:00");
                startTime2.setForeground(Color.gray);
                planDetail2.add(startTime2);
                startTime2.setBounds(170, 45, 140, startTime2.getPreferredSize().height);

                //---- deleteButton2 ----
                deleteButton2.setText("DELETE");
                deleteButton2.setBorderPainted(false);
                deleteButton2.setBackground(new Color(217, 0, 27));
                deleteButton2.setForeground(Color.white);
                deleteButton2.addActionListener(e -> deleteButton2ActionPerformed(e));
                planDetail2.add(deleteButton2);
                deleteButton2.setBounds(610, 15, 100, 40);

                //---- profileButton2 ----
                profileButton2.setText("PROFILE");
                profileButton2.setBorderPainted(false);
                profileButton2.setBackground(Color.white);
                profileButton2.addActionListener(e -> profileButton2ActionPerformed(e));
                planDetail2.add(profileButton2);
                profileButton2.setBounds(495, 15, 100, 40);

                //---- endTime2 ----
                endTime2.setText("endTime2");
                endTime2.setForeground(Color.gray);
                planDetail2.add(endTime2);
                endTime2.setBounds(315, 45, 145, endTime2.getPreferredSize().height);

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

                //---- memberName3 ----
                memberName3.setText("Member Name");
                memberName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName3.setForeground(Color.gray);
                planDetail3.add(memberName3);
                memberName3.setBounds(10, 40, 150, memberName3.getPreferredSize().height);

                //---- startTime3 ----
                startTime3.setText("2021-04-8 12:00");
                startTime3.setForeground(Color.gray);
                planDetail3.add(startTime3);
                startTime3.setBounds(170, 45, 140, startTime3.getPreferredSize().height);

                //---- deleteButton3 ----
                deleteButton3.setText("DELETE");
                deleteButton3.setBorderPainted(false);
                deleteButton3.setBackground(new Color(217, 0, 27));
                deleteButton3.setForeground(Color.white);
                deleteButton3.addActionListener(e -> deleteButton3ActionPerformed(e));
                planDetail3.add(deleteButton3);
                deleteButton3.setBounds(610, 15, 100, 40);

                //---- profileButton3 ----
                profileButton3.setText("PROFILE");
                profileButton3.setBorderPainted(false);
                profileButton3.setBackground(Color.white);
                profileButton3.addActionListener(e -> profileButton3ActionPerformed(e));
                planDetail3.add(profileButton3);
                profileButton3.setBounds(495, 15, 100, 40);

                //---- endTime3 ----
                endTime3.setText("endTime3");
                endTime3.setForeground(Color.gray);
                planDetail3.add(endTime3);
                endTime3.setBounds(315, 45, 135, endTime3.getPreferredSize().height);

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

                //---- memberName4 ----
                memberName4.setText("Member Name");
                memberName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName4.setForeground(Color.gray);
                planDetail4.add(memberName4);
                memberName4.setBounds(10, 40, 150, memberName4.getPreferredSize().height);

                //---- startTime4 ----
                startTime4.setText("2021-04-8 12:00");
                startTime4.setForeground(Color.gray);
                planDetail4.add(startTime4);
                startTime4.setBounds(170, 45, 140, startTime4.getPreferredSize().height);

                //---- deleteButton4 ----
                deleteButton4.setText("DELETE");
                deleteButton4.setBorderPainted(false);
                deleteButton4.setBackground(new Color(217, 0, 27));
                deleteButton4.setForeground(Color.white);
                deleteButton4.addActionListener(e -> deleteButton4ActionPerformed(e));
                planDetail4.add(deleteButton4);
                deleteButton4.setBounds(610, 15, 100, 40);

                //---- profileButton4 ----
                profileButton4.setText("PROFILE");
                profileButton4.setBorderPainted(false);
                profileButton4.setBackground(Color.white);
                profileButton4.addActionListener(e -> profileButton4ActionPerformed(e));
                planDetail4.add(profileButton4);
                profileButton4.setBounds(495, 15, 100, 40);

                //---- endTime4 ----
                endTime4.setText("endTime4");
                endTime4.setForeground(Color.gray);
                planDetail4.add(endTime4);
                endTime4.setBounds(315, 45, 150, endTime4.getPreferredSize().height);

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

                //---- memberName5 ----
                memberName5.setText("Member Name");
                memberName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName5.setForeground(Color.gray);
                planDetail5.add(memberName5);
                memberName5.setBounds(10, 40, 150, memberName5.getPreferredSize().height);

                //---- startTime5 ----
                startTime5.setText("2021-04-8 12:00");
                startTime5.setForeground(Color.gray);
                planDetail5.add(startTime5);
                startTime5.setBounds(170, 45, 140, startTime5.getPreferredSize().height);

                //---- deleteButton5 ----
                deleteButton5.setText("DELETE");
                deleteButton5.setBorderPainted(false);
                deleteButton5.setBackground(new Color(217, 0, 27));
                deleteButton5.setForeground(Color.white);
                deleteButton5.addActionListener(e -> deleteButton5ActionPerformed(e));
                planDetail5.add(deleteButton5);
                deleteButton5.setBounds(610, 15, 100, 40);

                //---- profileButton5 ----
                profileButton5.setText("PROFILE");
                profileButton5.setBorderPainted(false);
                profileButton5.setBackground(Color.white);
                profileButton5.addActionListener(e -> profileButton5ActionPerformed(e));
                planDetail5.add(profileButton5);
                profileButton5.setBounds(495, 15, 100, 40);

                //---- endTime5 ----
                endTime5.setText("endTime5");
                endTime5.setForeground(Color.gray);
                planDetail5.add(endTime5);
                endTime5.setBounds(315, 45, 155, endTime5.getPreferredSize().height);

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

                //---- memberName6 ----
                memberName6.setText("Member Name");
                memberName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                memberName6.setForeground(Color.gray);
                planDetail6.add(memberName6);
                memberName6.setBounds(10, 40, 150, memberName6.getPreferredSize().height);

                //---- startTime6 ----
                startTime6.setText("2021-04-8 12:00");
                startTime6.setForeground(Color.gray);
                planDetail6.add(startTime6);
                startTime6.setBounds(170, 45, 140, startTime6.getPreferredSize().height);

                //---- deleteButton6 ----
                deleteButton6.setText("DELETE");
                deleteButton6.setBorderPainted(false);
                deleteButton6.setBackground(new Color(217, 0, 27));
                deleteButton6.setForeground(Color.white);
                deleteButton6.addActionListener(e -> deleteButton6ActionPerformed(e));
                planDetail6.add(deleteButton6);
                deleteButton6.setBounds(610, 15, 100, 40);

                //---- profileButton6 ----
                profileButton6.setText("PROFILE");
                profileButton6.setBorderPainted(false);
                profileButton6.setBackground(Color.white);
                profileButton6.addActionListener(e -> profileButton6ActionPerformed(e));
                planDetail6.add(profileButton6);
                profileButton6.setBounds(495, 15, 100, 40);

                //---- endTime6 ----
                endTime6.setText("endTime6");
                endTime6.setForeground(Color.gray);
                planDetail6.add(endTime6);
                endTime6.setBounds(315, 45, 150, endTime6.getPreferredSize().height);

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

            //---- previousButton ----
            previousButton.setBorderPainted(false);
            previousButton.setBackground(SystemColor.menu);
            previousButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            previousButton.addActionListener(e -> previousButtonActionPerformed(e));
            body.add(previousButton);
            previousButton.setBounds(680, 590, 40, 40);

            //---- nextButton ----
            nextButton.setBorderPainted(false);
            nextButton.setBackground(SystemColor.menu);
            nextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            nextButton.addActionListener(e -> nextButtonActionPerformed(e));
            body.add(nextButton);
            nextButton.setBounds(725, 590, 40, 40);

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
    private JLabel memberName1;
    private JLabel startTime1;
    private JButton deleteButton1;
    private JButton profileButton1;
    private JLabel endTime1;
    private JPanel decorationLine2;
    private JPanel planDetail2;
    private JLabel lessonName2;
    private JLabel memberName2;
    private JLabel startTime2;
    private JButton deleteButton2;
    private JButton profileButton2;
    private JLabel endTime2;
    private JPanel planDetail3;
    private JLabel lessonName3;
    private JLabel memberName3;
    private JLabel startTime3;
    private JButton deleteButton3;
    private JButton profileButton3;
    private JLabel endTime3;
    private JPanel planDetail4;
    private JLabel lessonName4;
    private JLabel memberName4;
    private JLabel startTime4;
    private JButton deleteButton4;
    private JButton profileButton4;
    private JLabel endTime4;
    private JPanel planDetail5;
    private JLabel lessonName5;
    private JLabel memberName5;
    private JLabel startTime5;
    private JButton deleteButton5;
    private JButton profileButton5;
    private JLabel endTime5;
    private JPanel planDetail6;
    private JLabel lessonName6;
    private JLabel memberName6;
    private JLabel startTime6;
    private JButton deleteButton6;
    private JButton profileButton6;
    private JLabel endTime6;
    private JButton previousButton;
    private JButton nextButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        PlanHomeCoach.run();
    }

    private int page = 0;
    private List<PlanData> list;
    private int planRemainNumb = 0;
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PlanHomeCoach frame = new PlanHomeCoach();
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
        CoachData coachData = UserBuffer.getCoachSession();
        list = PlanFunction.searchPlanByCoachID(coachData.getID());
        this.update();
    }

    private void update() {
        int i = 0;
        int remainPage = this.list.size() - this.page * 6;
        ClientData clientDataTemp;
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
                this.memberName2.setOpaque(false);
                this.profileButton2.setVisible(true);
                this.deleteButton2.setVisible(true);
            case 2:
                this.lessonName3.setOpaque(false);
                this.startTime3.setOpaque(false);
                this.endTime3.setOpaque(false);
                this.memberName3.setOpaque(false);
                this.profileButton3.setVisible(true);
                this.deleteButton3.setVisible(true);
            case 3:
                this.lessonName4.setOpaque(false);
                this.startTime4.setOpaque(false);
                this.endTime4.setOpaque(false);
                this.memberName4.setOpaque(false);
                this.profileButton4.setVisible(true);
                this.deleteButton4.setVisible(true);
            case 4:
                this.lessonName5.setOpaque(false);
                this.startTime5.setOpaque(false);
                this.endTime5.setOpaque(false);
                this.memberName5.setOpaque(false);
                this.profileButton5.setVisible(true);
                this.deleteButton5.setVisible(true);
            case 5:
                this.lessonName6.setOpaque(false);
                this.startTime6.setOpaque(false);
                this.endTime6.setOpaque(false);
                this.memberName6.setOpaque(false);
                this.profileButton6.setVisible(true);
                this.deleteButton6.setVisible(true);
        }

        if((remainPage / 6) > 0){
            for(i = 0; i < 6; i++){
                planData[i] = this.list.get(i + this.page*6);
            }
            clientDataTemp = ClientFunction.searchClientByID(planData[0].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[0].getClassID());
            this.lessonName1.setText(classDataTemp.getName());
            this.memberName1.setText(clientDataTemp.getName());
            this.startTime1.setText(planData[0].getStartTime());
            this.endTime1.setText(planData[0].getEndTime());

            clientDataTemp = ClientFunction.searchClientByID(planData[1].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[1].getClassID());
            this.lessonName2.setText(classDataTemp.getName());
            this.memberName2.setText(clientDataTemp.getName());
            this.startTime2.setText(planData[1].getStartTime());
            this.endTime2.setText(planData[1].getEndTime());

            clientDataTemp = ClientFunction.searchClientByID(planData[2].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[2].getClassID());
            this.lessonName3.setText(classDataTemp.getName());
            this.memberName3.setText(clientDataTemp.getName());
            this.startTime3.setText(planData[2].getStartTime());
            this.endTime3.setText(planData[2].getEndTime());

            clientDataTemp = ClientFunction.searchClientByID(planData[3].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[3].getClassID());
            this.lessonName4.setText(classDataTemp.getName());
            this.memberName4.setText(clientDataTemp.getName());
            this.startTime4.setText(planData[3].getStartTime());
            this.endTime4.setText(planData[3].getEndTime());

            clientDataTemp = ClientFunction.searchClientByID(planData[4].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[4].getClassID());
            this.lessonName5.setText(classDataTemp.getName());
            this.memberName5.setText(clientDataTemp.getName());
            this.startTime5.setText(planData[4].getStartTime());
            this.endTime5.setText(planData[4].getEndTime());

            clientDataTemp = ClientFunction.searchClientByID(planData[5].getClientID());
            classDataTemp = ClassFunction.searchClassByID(planData[5].getClassID());
            this.lessonName6.setText(classDataTemp.getName());
            this.memberName6.setText(clientDataTemp.getName());
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
                    clientDataTemp = ClientFunction.searchClientByID(planData[4].getClientID());
                    classDataTemp = ClassFunction.searchClassByID(planData[4].getClassID());
                    this.lessonName5.setText(classDataTemp.getName());
                    this.memberName5.setText(clientDataTemp.getName());
                    this.startTime5.setText(planData[4].getStartTime());
                    this.endTime5.setText(planData[4].getEndTime());
                case 4:
                    clientDataTemp = ClientFunction.searchClientByID(planData[3].getClientID());
                    classDataTemp = ClassFunction.searchClassByID(planData[3].getClassID());
                    this.lessonName4.setText(classDataTemp.getName());
                    this.memberName4.setText(clientDataTemp.getName());
                    this.startTime4.setText(planData[3].getStartTime());
                    this.endTime4.setText(planData[3].getEndTime());
                case 3:
                    clientDataTemp = ClientFunction.searchClientByID(planData[2].getClientID());
                    classDataTemp = ClassFunction.searchClassByID(planData[2].getClassID());
                    this.lessonName3.setText(classDataTemp.getName());
                    this.memberName3.setText(clientDataTemp.getName());
                    this.startTime3.setText(planData[2].getStartTime());
                    this.endTime3.setText(planData[2].getEndTime());
                case 2:
                    clientDataTemp = ClientFunction.searchClientByID(planData[1].getClientID());
                    classDataTemp = ClassFunction.searchClassByID(planData[1].getClassID());
                    this.lessonName2.setText(classDataTemp.getName());
                    this.memberName2.setText(clientDataTemp.getName());
                    this.startTime2.setText(planData[1].getStartTime());
                    this.endTime2.setText(planData[1].getEndTime());
                case 1:
                    clientDataTemp = ClientFunction.searchClientByID(planData[0].getClientID());
                    classDataTemp = ClassFunction.searchClassByID(planData[0].getClassID());
                    this.lessonName1.setText(classDataTemp.getName());
                    this.memberName1.setText(clientDataTemp.getName());
                    this.startTime1.setText(planData[0].getStartTime());
                    this.endTime1.setText(planData[0].getEndTime());
            }
        }
    }
}
