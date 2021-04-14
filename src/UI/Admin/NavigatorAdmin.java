package UI.Admin;

import UI.Other.Login;

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
        UserManageAll.run();
    }

    private void lessonManageActionPerformed(ActionEvent e) {
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorAdmin.run();
        ALLLesson.run();
    }

    private void VenuesManageActionPerformed(ActionEvent e) {
        // TODO add your code here
        java.awt.Window[] win = java.awt.Window.getWindows();
        int i=0;
        while (i<win.length) {
            win[i].dispose();
            i++;
        }
        NavigatorAdmin.run();
    }

    private void switchAccountActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        Login.run();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        label1 = new JButton();
        username = new JLabel();
        welcomeMsg = new JLabel();
        decorationLine1 = new JLabel();
        menu = new JPanel();
        userManageMenu = new JPanel();
        userManage = new JButton();
        lessonManageMenu = new JPanel();
        lessonManage = new JButton();
        VenuesManageMenu = new JPanel();
        VenuesManage = new JButton();
        label2 = new JButton();
        label3 = new JButton();
        label4 = new JButton();
        switchAccount = new JButton();

        //======== this ========
        setBackground(Color.white);
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
            label1.setBorderPainted(false);
            body.add(label1);
            label1.setBounds(20, 20, 75, 75);

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

                    //---- VenuesManage ----
                    VenuesManage.setText("Venues Management");
                    VenuesManage.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                    VenuesManage.setBackground(Color.white);
                    VenuesManage.setBorderPainted(false);
                    VenuesManage.setHorizontalAlignment(SwingConstants.LEFT);
                    VenuesManage.addActionListener(e -> VenuesManageActionPerformed(e));
                    VenuesManageMenu.add(VenuesManage);
                }
                menu.add(VenuesManageMenu);
            }
            body.add(menu);
            menu.setBounds(50, 135, 280, 200);

            //---- label2 ----
            label2.setText("Icon");
            label2.setBackground(Color.black);
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setBorderPainted(false);
            body.add(label2);
            label2.setBounds(20, 157, 25, 25);

            //---- label3 ----
            label3.setText("Icon");
            label3.setBackground(Color.black);
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setBorderPainted(false);
            body.add(label3);
            label3.setBounds(20, 222, 25, 25);

            //---- label4 ----
            label4.setText("Icon");
            label4.setBackground(Color.black);
            label4.setForeground(Color.white);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setBorderPainted(false);
            body.add(label4);
            label4.setBounds(20, 290, 25, 25);

            //---- switchAccount ----
            switchAccount.setText("Switch Account");
            switchAccount.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            switchAccount.setBackground(Color.white);
            switchAccount.setBorderPainted(false);
            switchAccount.addActionListener(e -> switchAccountActionPerformed(e));
            body.add(switchAccount);
            switchAccount.setBounds(-5, 595, 175, 60);

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
    private JButton label1;
    private JLabel username;
    private JLabel welcomeMsg;
    private JLabel decorationLine1;
    private JPanel menu;
    private JPanel userManageMenu;
    private JButton userManage;
    private JPanel lessonManageMenu;
    private JButton lessonManage;
    private JPanel VenuesManageMenu;
    private JButton VenuesManage;
    private JButton label2;
    private JButton label3;
    private JButton label4;
    private JButton switchAccount;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        NavigatorAdmin.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NavigatorAdmin frame = new NavigatorAdmin();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-1100/2,screenSize.height/2-700/2);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
