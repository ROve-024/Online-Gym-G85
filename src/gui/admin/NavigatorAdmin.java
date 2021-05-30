package gui.admin;

import gui.login.Login;
import gui.other.UserBuffer;
import io.admin.AdminData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 13:25:02 CST 2021
 */


/**
 * @author Anna
 */
public class NavigatorAdmin extends JFrame {
    public NavigatorAdmin() {
        initComponents();
    }

    private void userManageActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorAdmin.run();
        UserManageAllAdmin.run();
    }

    private void lessonManageActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorAdmin.run();
        ALLLessonAdmin.run();
    }

    private void switchAccountActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        Login.run();
    }

    private void planButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorAdmin.run();
        PlanHomeAdmin.run();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        avatar = new JLabel();
        username = new JLabel();
        welcomeMsg = new JLabel();
        decorationLine1 = new JLabel();
        menu = new JPanel();
        userManageMenu = new JPanel();
        userManage = new JButton();
        lessonManageMenu = new JPanel();
        lessonManage = new JButton();
        VenuesManageMenu = new JPanel();
        planManage = new JButton();
        switchAccount = new JButton();
        label2 = new JButton();
        label3 = new JButton();
        button2 = new JButton();

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

            //---- avatar ----
            avatar.setText("avatar");
            avatar.setBackground(Color.black);
            avatar.setForeground(Color.white);
            avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (7).jpg")));
            avatar.setHorizontalAlignment(SwingConstants.CENTER);
            body.add(avatar);
            avatar.setBounds(15, 20, 85, 75);

            //---- username ----
            username.setText("Username");
            username.setBackground(Color.white);
            username.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
            body.add(username);
            username.setBounds(new Rectangle(new Point(100, 30), username.getPreferredSize()));

            //---- welcomeMsg ----
            welcomeMsg.setText("Welcome, .....");
            body.add(welcomeMsg);
            welcomeMsg.setBounds(103, 60, 217, welcomeMsg.getPreferredSize().height);

            //---- decorationLine1 ----
            decorationLine1.setBackground(Color.black);
            decorationLine1.setText("     ");
            decorationLine1.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine1);
            decorationLine1.setBounds(25, 115, 300, 2);

            //======== menu ========
            {
                menu.setLayout(new GridLayout(0, 1));

                //======== userManageMenu ========
                {
                    userManageMenu.setBackground(Color.white);
                    userManageMenu.setLayout(new GridLayout());

                    //---- userManage ----
                    userManage.setText("User Management");
                    userManage.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    userManage.setBackground(Color.white);
                    userManage.setBorderPainted(false);
                    userManage.setHorizontalAlignment(SwingConstants.LEFT);
                    userManage.addActionListener(e -> userManageActionPerformed(e));
                    userManageMenu.add(userManage);
                }
                menu.add(userManageMenu);

                //======== lessonManageMenu ========
                {
                    lessonManageMenu.setBackground(Color.white);
                    lessonManageMenu.setLayout(new GridLayout());

                    //---- lessonManage ----
                    lessonManage.setText("Lesson Management ");
                    lessonManage.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    lessonManage.setBackground(Color.white);
                    lessonManage.setBorderPainted(false);
                    lessonManage.setHorizontalAlignment(SwingConstants.LEFT);
                    lessonManage.addActionListener(e -> lessonManageActionPerformed(e));
                    lessonManageMenu.add(lessonManage);
                }
                menu.add(lessonManageMenu);

                //======== VenuesManageMenu ========
                {
                    VenuesManageMenu.setBackground(Color.white);
                    VenuesManageMenu.setLayout(new GridLayout());

                    //---- planManage ----
                    planManage.setText("Plan Management");
                    planManage.setBackground(Color.white);
                    planManage.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    planManage.setHorizontalAlignment(SwingConstants.LEFT);
                    planManage.setBorderPainted(false);
                    planManage.addActionListener(e -> planButtonActionPerformed(e));
                    VenuesManageMenu.add(planManage);
                }
                menu.add(VenuesManageMenu);
            }
            body.add(menu);
            menu.setBounds(50, 135, 280, 200);

            //---- switchAccount ----
            switchAccount.setText("Switch Account");
            switchAccount.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            switchAccount.setBackground(Color.white);
            switchAccount.setBorderPainted(false);
            switchAccount.addActionListener(e -> switchAccountActionPerformed(e));
            body.add(switchAccount);
            switchAccount.setBounds(-5, 595, 175, 60);

            //---- label2 ----
            label2.setBackground(Color.white);
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setBorderPainted(false);
            label2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/people.png")));
            body.add(label2);
            label2.setBounds(25, 157, 25, 25);

            //---- label3 ----
            label3.setBackground(Color.white);
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setBorderPainted(false);
            label3.setIcon(new ImageIcon(getClass().getResource("/resources/icons/video.png")));
            body.add(label3);
            label3.setBounds(25, 222, 25, 25);

            //---- button2 ----
            button2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/plan.png")));
            button2.setBackground(Color.white);
            button2.setForeground(Color.white);
            body.add(button2);
            button2.setBounds(25, 290, 25, 25);

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
    private JLabel avatar;
    private JLabel username;
    private JLabel welcomeMsg;
    private JLabel decorationLine1;
    private JPanel menu;
    private JPanel userManageMenu;
    private JButton userManage;
    private JPanel lessonManageMenu;
    private JButton lessonManage;
    private JPanel VenuesManageMenu;
    private JButton planManage;
    private JButton switchAccount;
    private JButton label2;
    private JButton label3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        NavigatorAdmin.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NavigatorAdmin frame = new NavigatorAdmin();
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
    private void init(){
        AdminData adminData = UserBuffer.getAdminSession();
        this.username.setText(adminData.getAccount());
        this.welcomeMsg.setText("Welcome, admin.");
        try{
            this.avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/admin.png" )));
        }catch (NullPointerException miss){
            this.avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/404.jpg")));
        }
    }
}
