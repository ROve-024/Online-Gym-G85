package gui.member;

import gui.loginSignUp.Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Apr 09 12:20:21 CST 2021
 */


/**
 * @author Anna
 */
public class NavigatorMember extends JFrame {
    public NavigatorMember() {
        initComponents();
    }

    private void myLessonActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorMember.run();
        LessonHomeMember.run();
    }

    private void myPlanActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorMember.run();
        PlanHomeMember.run();

    }

    private void myProfileActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorMember.run();
        ProfileMember.run();
    }

    private void switchAccoutActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        Login.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        label1 = new JLabel();
        username = new JLabel();
        welcomeMsg = new JLabel();
        decorationLine1 = new JLabel();
        menu = new JPanel();
        myLessonMenu = new JPanel();
        myLesson = new JButton();
        myPlanMenu = new JPanel();
        myPlan = new JButton();
        myProfileMenu = new JPanel();
        myProfile = new JButton();
        switchAccout = new JButton();
        label2 = new JButton();
        label3 = new JButton();
        label4 = new JButton();

        //======== this ========
        setBackground(Color.white);
        setTitle("Gym Group85 v0.2");
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setBorder(null);
            body.setLayout(null);

            //---- label1 ----
            label1.setText("avatar");
            label1.setBackground(Color.black);
            label1.setForeground(Color.white);
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (6).jpg")));
            body.add(label1);
            label1.setBounds(15, 20, 90, 75);

            //---- username ----
            username.setText("Username");
            username.setBackground(Color.white);
            username.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
            body.add(username);
            username.setBounds(new Rectangle(new Point(100, 30), username.getPreferredSize()));

            //---- welcomeMsg ----
            welcomeMsg.setText("Welcome, .....");
            body.add(welcomeMsg);
            welcomeMsg.setBounds(new Rectangle(new Point(103, 60), welcomeMsg.getPreferredSize()));

            //---- decorationLine1 ----
            decorationLine1.setBackground(Color.black);
            decorationLine1.setText("     ");
            decorationLine1.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine1);
            decorationLine1.setBounds(25, 115, 300, 2);

            //======== menu ========
            {
                menu.setLayout(new GridLayout(0, 1));

                //======== myLessonMenu ========
                {
                    myLessonMenu.setBackground(Color.white);
                    myLessonMenu.setLayout(new GridLayout());

                    //---- myLesson ----
                    myLesson.setText("ALL Lesson");
                    myLesson.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    myLesson.setBackground(Color.white);
                    myLesson.setBorderPainted(false);
                    myLesson.setHorizontalAlignment(SwingConstants.LEFT);
                    myLesson.addActionListener(e -> myLessonActionPerformed(e));
                    myLessonMenu.add(myLesson);
                }
                menu.add(myLessonMenu);

                //======== myPlanMenu ========
                {
                    myPlanMenu.setBackground(Color.white);
                    myPlanMenu.setLayout(new GridLayout());

                    //---- myPlan ----
                    myPlan.setText("My Plan");
                    myPlan.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    myPlan.setBackground(Color.white);
                    myPlan.setBorderPainted(false);
                    myPlan.setHorizontalAlignment(SwingConstants.LEFT);
                    myPlan.addActionListener(e -> myPlanActionPerformed(e));
                    myPlanMenu.add(myPlan);
                }
                menu.add(myPlanMenu);

                //======== myProfileMenu ========
                {
                    myProfileMenu.setBackground(Color.white);
                    myProfileMenu.setLayout(new GridLayout());

                    //---- myProfile ----
                    myProfile.setText("My Profile");
                    myProfile.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    myProfile.setBackground(Color.white);
                    myProfile.setBorderPainted(false);
                    myProfile.setHorizontalAlignment(SwingConstants.LEFT);
                    myProfile.addActionListener(e -> myProfileActionPerformed(e));
                    myProfileMenu.add(myProfile);
                }
                menu.add(myProfileMenu);
            }
            body.add(menu);
            menu.setBounds(50, 135, 280, 200);

            //---- switchAccout ----
            switchAccout.setText("Switch Account");
            switchAccout.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            switchAccout.setBackground(Color.white);
            switchAccout.setBorderPainted(false);
            switchAccout.addActionListener(e -> switchAccoutActionPerformed(e));
            body.add(switchAccout);
            switchAccout.setBounds(-5, 595, 175, 60);

            //---- label2 ----
            label2.setBackground(Color.white);
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setBorderPainted(false);
            label2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/video.png")));
            body.add(label2);
            label2.setBounds(20, 157, 25, 25);

            //---- label3 ----
            label3.setBackground(Color.white);
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setBorderPainted(false);
            label3.setIcon(new ImageIcon(getClass().getResource("/resources/icons/plan.png")));
            body.add(label3);
            label3.setBounds(20, 222, 25, 25);

            //---- label4 ----
            label4.setBackground(Color.white);
            label4.setForeground(Color.white);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setBorderPainted(false);
            label4.setIcon(new ImageIcon(getClass().getResource("/resources/icons/people.png")));
            body.add(label4);
            label4.setBounds(20, 287, 25, 25);

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
        body.setBounds(0, 0, 350, 655);

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
    private JLabel label1;
    private JLabel username;
    private JLabel welcomeMsg;
    private JLabel decorationLine1;
    private JPanel menu;
    private JPanel myLessonMenu;
    private JButton myLesson;
    private JPanel myPlanMenu;
    private JButton myPlan;
    private JPanel myProfileMenu;
    private JButton myProfile;
    private JButton switchAccout;
    private JButton label2;
    private JButton label3;
    private JButton label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        NavigatorMember.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NavigatorMember frame = new NavigatorMember();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-1100/2,screenSize.height/2-700/2);
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
