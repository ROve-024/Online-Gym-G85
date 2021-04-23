package GUI.Other;

import GUI.Admin.NavigatorAdmin;
import GUI.Coach.NavigatorCoach;
import GUI.Member.NavigatorMember;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 16:14:44 CST 2021
 */


/**
 * @author Anna
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        if(this.userButton.isSelected()){
            NavigatorMember.run();
        }
        else if(this.coachButton.isSelected()){
            NavigatorCoach.run();
        }
        else if(this.adminButton.isSelected()){
            NavigatorAdmin.run();
        }

    }

    private void signUpButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        SignUp.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        loginBody = new JPanel();
        loginIcon = new JLabel();
        loginButton = new JButton();
        userButton = new JRadioButton();
        adminButton = new JRadioButton();
        coachButton = new JRadioButton();
        username = new JTextField();
        password = new JPasswordField();
        signUpTip = new JPanel();
        signUpMsg = new JLabel();
        signUpButton = new JButton();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== loginBody ========
        {
            loginBody.setBackground(Color.white);
            loginBody.setLayout(null);

            //---- loginIcon ----
            loginIcon.setText("LOGIN");
            loginIcon.setBackground(Color.white);
            loginIcon.setHorizontalAlignment(SwingConstants.CENTER);
            loginIcon.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            loginBody.add(loginIcon);
            loginIcon.setBounds(140, 0, 120, 60);

            //---- loginButton ----
            loginButton.setText("LOGIN");
            loginButton.setBackground(new Color(217, 0, 27));
            loginButton.setForeground(Color.white);
            loginButton.setBorderPainted(false);
            loginButton.addActionListener(e -> loginButtonActionPerformed(e));
            loginBody.add(loginButton);
            loginButton.setBounds(50, 310, 300, 50);

            //---- userButton ----
            userButton.setText("User");
            userButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            userButton.setSelected(true);
            loginBody.add(userButton);
            userButton.setBounds(new Rectangle(new Point(55, 95), userButton.getPreferredSize()));

            //---- adminButton ----
            adminButton.setText("Admin");
            adminButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            loginBody.add(adminButton);
            adminButton.setBounds(280, 95, 75, 21);

            //---- coachButton ----
            coachButton.setText("Coach");
            coachButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            loginBody.add(coachButton);
            coachButton.setBounds(165, 95, 70, 21);

            //---- username ----
            username.setBackground(new Color(242, 242, 242));
            username.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            loginBody.add(username);
            username.setBounds(50, 130, 300, 50);

            //---- password ----
            password.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
            password.setBackground(new Color(242, 242, 242));
            loginBody.add(password);
            password.setBounds(50, 190, 300, 50);

            //======== signUpTip ========
            {
                signUpTip.setBackground(Color.white);
                signUpTip.setLayout(new GridLayout());

                //---- signUpMsg ----
                signUpMsg.setText("Not a member?");
                signUpMsg.setBackground(Color.white);
                signUpMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                signUpMsg.setHorizontalAlignment(SwingConstants.RIGHT);
                signUpTip.add(signUpMsg);

                //---- signUpButton ----
                signUpButton.setText("Sign up now");
                signUpButton.setForeground(new Color(22, 155, 213));
                signUpButton.setBackground(Color.white);
                signUpButton.setBorderPainted(false);
                signUpButton.setHorizontalAlignment(SwingConstants.LEFT);
                signUpButton.addActionListener(e -> signUpButtonActionPerformed(e));
                signUpTip.add(signUpButton);
            }
            loginBody.add(signUpTip);
            signUpTip.setBounds(92, 570, 215, 50);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < loginBody.getComponentCount(); i++) {
                    Rectangle bounds = loginBody.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = loginBody.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                loginBody.setMinimumSize(preferredSize);
                loginBody.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(loginBody);
        loginBody.setBounds(0, 0, 400, 675);

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

        //---- UserType ----
        var UserType = new ButtonGroup();
        UserType.add(userButton);
        UserType.add(adminButton);
        UserType.add(coachButton);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel loginBody;
    private JLabel loginIcon;
    private JButton loginButton;
    private JRadioButton userButton;
    private JRadioButton adminButton;
    private JRadioButton coachButton;
    private JTextField username;
    private JPasswordField password;
    private JPanel signUpTip;
    private JLabel signUpMsg;
    private JButton signUpButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        Login.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
