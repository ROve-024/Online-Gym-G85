package GUI.Coach;

import GUI.Member.ViewMemberProfile;

import java.awt.*;
import java.awt.event.*;
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
        this.dispose();
        ViewMemberProfile.run();
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
        profileButton1 = new JButton();
        decorationLine2 = new JPanel();
        planDetail2 = new JPanel();
        lessonName2 = new JLabel();
        coachName2 = new JLabel();
        startTime2 = new JLabel();
        deleteButton2 = new JButton();
        profileButton2 = new JButton();
        planDetail3 = new JPanel();
        lessonName3 = new JLabel();
        coachName3 = new JLabel();
        startTime3 = new JLabel();
        deleteButton3 = new JButton();
        profileButton3 = new JButton();
        planDetail4 = new JPanel();
        lessonName4 = new JLabel();
        coachName4 = new JLabel();
        startTime4 = new JLabel();
        deleteButton4 = new JButton();
        profileButton4 = new JButton();
        planDetail5 = new JPanel();
        lessonName5 = new JLabel();
        coachName5 = new JLabel();
        startTime5 = new JLabel();
        deleteButton5 = new JButton();
        profileButton5 = new JButton();
        planDetail6 = new JPanel();
        lessonName6 = new JLabel();
        coachName6 = new JLabel();
        startTime6 = new JLabel();
        deleteButton6 = new JButton();
        profileButton6 = new JButton();
        nextPageButton = new JButton();

        //======== this ========
        setBackground(Color.white);
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
                coachName1.setText("Member Name");
                coachName1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName1.setForeground(Color.gray);
                planDetail.add(coachName1);
                coachName1.setBounds(10, 40, 150, coachName1.getPreferredSize().height);

                //---- startTime1 ----
                startTime1.setText("2021-04-8 12:00");
                startTime1.setForeground(Color.gray);
                planDetail.add(startTime1);
                startTime1.setBounds(new Rectangle(new Point(170, 45), startTime1.getPreferredSize()));

                //---- deleteButton1 ----
                deleteButton1.setText("DELETE");
                deleteButton1.setBorderPainted(false);
                deleteButton1.setBackground(new Color(217, 0, 27));
                deleteButton1.setForeground(Color.white);
                planDetail.add(deleteButton1);
                deleteButton1.setBounds(610, 15, 100, 40);

                //---- profileButton1 ----
                profileButton1.setText("PROFILE");
                profileButton1.setBorderPainted(false);
                profileButton1.setBackground(Color.white);
                profileButton1.addActionListener(e -> profileButton1ActionPerformed(e));
                planDetail.add(profileButton1);
                profileButton1.setBounds(495, 15, 100, 40);

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
                coachName2.setText("Member Name");
                coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName2.setForeground(Color.gray);
                planDetail2.add(coachName2);
                coachName2.setBounds(10, 40, 150, coachName2.getPreferredSize().height);

                //---- startTime2 ----
                startTime2.setText("2021-04-8 12:00");
                startTime2.setForeground(Color.gray);
                planDetail2.add(startTime2);
                startTime2.setBounds(new Rectangle(new Point(170, 45), startTime2.getPreferredSize()));

                //---- deleteButton2 ----
                deleteButton2.setText("DELETE");
                deleteButton2.setBorderPainted(false);
                deleteButton2.setBackground(new Color(217, 0, 27));
                deleteButton2.setForeground(Color.white);
                planDetail2.add(deleteButton2);
                deleteButton2.setBounds(610, 15, 100, 40);

                //---- profileButton2 ----
                profileButton2.setText("PROFILE");
                profileButton2.setBorderPainted(false);
                profileButton2.setBackground(Color.white);
                planDetail2.add(profileButton2);
                profileButton2.setBounds(495, 15, 100, 40);

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
                coachName3.setText("Member Name");
                coachName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName3.setForeground(Color.gray);
                planDetail3.add(coachName3);
                coachName3.setBounds(10, 40, 150, coachName3.getPreferredSize().height);

                //---- startTime3 ----
                startTime3.setText("2021-04-8 12:00");
                startTime3.setForeground(Color.gray);
                planDetail3.add(startTime3);
                startTime3.setBounds(new Rectangle(new Point(170, 45), startTime3.getPreferredSize()));

                //---- deleteButton3 ----
                deleteButton3.setText("DELETE");
                deleteButton3.setBorderPainted(false);
                deleteButton3.setBackground(new Color(217, 0, 27));
                deleteButton3.setForeground(Color.white);
                planDetail3.add(deleteButton3);
                deleteButton3.setBounds(610, 15, 100, 40);

                //---- profileButton3 ----
                profileButton3.setText("PROFILE");
                profileButton3.setBorderPainted(false);
                profileButton3.setBackground(Color.white);
                planDetail3.add(profileButton3);
                profileButton3.setBounds(495, 15, 100, 40);

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
                coachName4.setText("Member Name");
                coachName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName4.setForeground(Color.gray);
                planDetail4.add(coachName4);
                coachName4.setBounds(10, 40, 150, coachName4.getPreferredSize().height);

                //---- startTime4 ----
                startTime4.setText("2021-04-8 12:00");
                startTime4.setForeground(Color.gray);
                planDetail4.add(startTime4);
                startTime4.setBounds(new Rectangle(new Point(170, 45), startTime4.getPreferredSize()));

                //---- deleteButton4 ----
                deleteButton4.setText("DELETE");
                deleteButton4.setBorderPainted(false);
                deleteButton4.setBackground(new Color(217, 0, 27));
                deleteButton4.setForeground(Color.white);
                planDetail4.add(deleteButton4);
                deleteButton4.setBounds(610, 15, 100, 40);

                //---- profileButton4 ----
                profileButton4.setText("PROFILE");
                profileButton4.setBorderPainted(false);
                profileButton4.setBackground(Color.white);
                planDetail4.add(profileButton4);
                profileButton4.setBounds(495, 15, 100, 40);

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
                coachName5.setText("Member Name");
                coachName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName5.setForeground(Color.gray);
                planDetail5.add(coachName5);
                coachName5.setBounds(10, 40, 150, coachName5.getPreferredSize().height);

                //---- startTime5 ----
                startTime5.setText("2021-04-8 12:00");
                startTime5.setForeground(Color.gray);
                planDetail5.add(startTime5);
                startTime5.setBounds(new Rectangle(new Point(170, 45), startTime5.getPreferredSize()));

                //---- deleteButton5 ----
                deleteButton5.setText("DELETE");
                deleteButton5.setBorderPainted(false);
                deleteButton5.setBackground(new Color(217, 0, 27));
                deleteButton5.setForeground(Color.white);
                planDetail5.add(deleteButton5);
                deleteButton5.setBounds(610, 15, 100, 40);

                //---- profileButton5 ----
                profileButton5.setText("PROFILE");
                profileButton5.setBorderPainted(false);
                profileButton5.setBackground(Color.white);
                planDetail5.add(profileButton5);
                profileButton5.setBounds(495, 15, 100, 40);

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
                coachName6.setText("Member Name");
                coachName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                coachName6.setForeground(Color.gray);
                planDetail6.add(coachName6);
                coachName6.setBounds(10, 40, 150, coachName6.getPreferredSize().height);

                //---- startTime6 ----
                startTime6.setText("2021-04-8 12:00");
                startTime6.setForeground(Color.gray);
                planDetail6.add(startTime6);
                startTime6.setBounds(new Rectangle(new Point(170, 45), startTime6.getPreferredSize()));

                //---- deleteButton6 ----
                deleteButton6.setText("DELETE");
                deleteButton6.setBorderPainted(false);
                deleteButton6.setBackground(new Color(217, 0, 27));
                deleteButton6.setForeground(Color.white);
                planDetail6.add(deleteButton6);
                deleteButton6.setBounds(610, 15, 100, 40);

                //---- profileButton6 ----
                profileButton6.setText("PROFILE");
                profileButton6.setBorderPainted(false);
                profileButton6.setBackground(Color.white);
                planDetail6.add(profileButton6);
                profileButton6.setBounds(495, 15, 100, 40);

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
            nextPageButton.setBackground(SystemColor.textHighlight);
            nextPageButton.setText("NEXT");
            nextPageButton.setForeground(Color.white);
            body.add(nextPageButton);
            nextPageButton.setBounds(655, 595, 100, 40);

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
    private JButton profileButton1;
    private JPanel decorationLine2;
    private JPanel planDetail2;
    private JLabel lessonName2;
    private JLabel coachName2;
    private JLabel startTime2;
    private JButton deleteButton2;
    private JButton profileButton2;
    private JPanel planDetail3;
    private JLabel lessonName3;
    private JLabel coachName3;
    private JLabel startTime3;
    private JButton deleteButton3;
    private JButton profileButton3;
    private JPanel planDetail4;
    private JLabel lessonName4;
    private JLabel coachName4;
    private JLabel startTime4;
    private JButton deleteButton4;
    private JButton profileButton4;
    private JPanel planDetail5;
    private JLabel lessonName5;
    private JLabel coachName5;
    private JLabel startTime5;
    private JButton deleteButton5;
    private JButton profileButton5;
    private JPanel planDetail6;
    private JLabel lessonName6;
    private JLabel coachName6;
    private JLabel startTime6;
    private JButton deleteButton6;
    private JButton profileButton6;
    private JButton nextPageButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        PlanHomeCoach.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PlanHomeCoach frame = new PlanHomeCoach();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
