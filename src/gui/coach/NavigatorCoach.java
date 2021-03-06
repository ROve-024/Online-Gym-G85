package gui.coach;

import io.coach.CoachData;
import gui.others.UserBuffer;
import gui.login.Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Apr 09 12:06:39 CST 2021
 */


/**
 * <p>
 *     This class is the initial interface of the coach.
 * </p>
 * @author Anna
 */
public class NavigatorCoach extends JFrame {
    public NavigatorCoach() {
        initComponents();
    }

    /**
     * <p>
     *     This function is used to enter the coach's course interface.
     * </p>
     * @param e
     */
    private void myLessonActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorCoach.run();
        MyLessonCoach.run();
    }

    /**
     * <p>
     *     This function is used to enter the coach's plan interface.
     * </p>
     * @param e
     */
    private void myPlanActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorCoach.run();
        PlanHomeCoach.run();
    }

    /**
     * <p>
     *     This function is used to enter the coach's profile interface.
     * </p>
     * @param e
     */
    private void myProfileActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorCoach.run();
        ProfileCoach.run();
    }

    /**
     * <p>
     *     Return to the login screen.
     * </p>
     * @param e
     */
    private void switchAccoutActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        Login.run();
    }

    private void avatarButtonActionPerformed(ActionEvent e) {
        ChangeCoachAvatar.run();
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        avatarButton = new JButton();
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
        label2 = new JButton();
        label3 = new JButton();
        label4 = new JButton();
        switchAccout = new JButton();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        setTitle("Gym Group85 v0.2");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setBorder(null);
            body.setLayout(null);

            //---- avatarButton ----
            avatarButton.setBackground(Color.white);
            avatarButton.setForeground(Color.white);
            avatarButton.setIcon(null);
            avatarButton.setHorizontalAlignment(SwingConstants.CENTER);
            avatarButton.setBorder(null);
            avatarButton.addActionListener(e -> avatarButtonActionPerformed(e));
            body.add(avatarButton);
            avatarButton.setBounds(15, 20, 74, 75);

            //---- username ----
            username.setText("Username");
            username.setBackground(Color.white);
            username.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
            body.add(username);
            username.setBounds(new Rectangle(new Point(100, 30), username.getPreferredSize()));

            //---- welcomeMsg ----
            welcomeMsg.setText("Welcome, .....");
            welcomeMsg.setForeground(Color.gray);
            body.add(welcomeMsg);
            welcomeMsg.setBounds(103, 60, 207, welcomeMsg.getPreferredSize().height);

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
                    myLesson.setText("My Lesson");
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

            //---- label2 ----
            label2.setBackground(Color.white);
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setBorderPainted(false);
            label2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/videoIcon.png")));
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
            label4.setBounds(20, 290, 25, 25);

            //---- switchAccout ----
            switchAccout.setText("Switch Account");
            switchAccout.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            switchAccout.setBackground(Color.white);
            switchAccout.setBorderPainted(false);
            switchAccout.addActionListener(e -> switchAccoutActionPerformed(e));
            body.add(switchAccout);
            switchAccout.setBounds(-5, 595, 175, 60);

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
    private JButton avatarButton;
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
    private JButton label2;
    private JButton label3;
    private JButton label4;
    private JButton switchAccout;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        NavigatorCoach.run();
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
                    NavigatorCoach frame = new NavigatorCoach();
                    frame.init();
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

    /**
     * <p>
     *     This function initializes the contents of the GUI.
     * </p>
     */
    private void init(){
        CoachData coachData = UserBuffer.getCoachSession();
        this.username.setText(coachData.getName());
        this.welcomeMsg.setText("Welcome, coach.");
        try{
            this.avatarButton.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/" + coachData.getFileAddress())));
        }catch (NullPointerException miss){
            this.avatarButton.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/404.jpg")));
        }
    }
}
