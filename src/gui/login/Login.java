package gui.login;

import javax.swing.border.*;

import controller.AdminFunction;
import controller.ClientFunction;
import gui.admin.NavigatorAdmin;
import gui.others.UserBuffer;
import gui.coach.NavigatorCoach;
import gui.member.NavigatorMember;
import controller.CoachFunction;
import gui.others.Warning;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 16:14:44 CST 2021
 */


/**
 * <p>
 *     This class is used for login.
 * </p>
 * @author Anna
 */
public class Login extends JFrame {

    public Login() {
        initComponents();
    }

    /**
     * <p>
     *     This function is used to log in.
     * </p>
     * @param e
     */
    private void loginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        UserBuffer.setBuffer("");
        boolean judge;
        String account = this.username.getText();
        String password = new String(this.password.getPassword());
//      System.out.println(account+": "+password);
        if(this.userButton.isSelected()){
            if(ClientFunction.loginMatch(account, password)){
                String ID = ClientFunction.getIDByAccount(account);
                UserBuffer.setBuffer(ID);
                NavigatorMember.run();
                this.dispose();
            }
            else{
                Warning.run("Wrong account or password, please try again.");
            }
        }
        else if(this.coachButton.isSelected()){
            if(CoachFunction.loginMatch(account, password)){
                String ID = CoachFunction.getIDByAccount(account);
                UserBuffer.setBuffer(ID);
                NavigatorCoach.run();
                this.dispose();
            }
            else{
                Warning.run("Wrong account or password, please try again.");
            }
        }
        else if(this.adminButton.isSelected()){
            if(AdminFunction.loginMatch(account, password)){
                String ID = AdminFunction.getIDByAccount(account);
                UserBuffer.setBuffer(ID);
                NavigatorAdmin.run();
                this.dispose();
            }
            else{
                Warning.run("Wrong account or password, please try again.");
            }

        }

    }

    /**
     * <p>
     *     This function is used to sign up.
     * </p>
     * @param e
     */
    private void signUpButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        SignUp.run();
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
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
        accountTip = new JLabel();
        PasswordTip = new JLabel();

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
            userButton.setForeground(Color.gray);
            loginBody.add(userButton);
            userButton.setBounds(new Rectangle(new Point(50, 225), userButton.getPreferredSize()));

            //---- adminButton ----
            adminButton.setText("Admin");
            adminButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            adminButton.setForeground(Color.gray);
            loginBody.add(adminButton);
            adminButton.setBounds(275, 225, 75, 21);

            //---- coachButton ----
            coachButton.setText("Coach");
            coachButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            coachButton.setForeground(Color.gray);
            loginBody.add(coachButton);
            coachButton.setBounds(160, 225, 70, 21);

            //---- username ----
            username.setBackground(new Color(242, 242, 242));
            username.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            username.setBorder(new EmptyBorder(5, 10, 5, 10));
            loginBody.add(username);
            username.setBounds(50, 85, 300, 50);

            //---- password ----
            password.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
            password.setBackground(new Color(242, 242, 242));
            password.setBorder(new EmptyBorder(5, 10, 5, 0));
            loginBody.add(password);
            password.setBounds(50, 165, 300, 50);

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

            //---- accountTip ----
            accountTip.setText("ACCOUNT");
            accountTip.setBackground(Color.white);
            accountTip.setFont(new Font("Arial", Font.PLAIN, 12));
            accountTip.setForeground(Color.gray);
            loginBody.add(accountTip);
            accountTip.setBounds(50, 65, 100, accountTip.getPreferredSize().height);

            //---- PasswordTip ----
            PasswordTip.setText("PASSWORD");
            PasswordTip.setBackground(Color.white);
            PasswordTip.setFont(new Font("Arial", Font.PLAIN, 12));
            PasswordTip.setForeground(Color.gray);
            loginBody.add(PasswordTip);
            PasswordTip.setBounds(50, 145, 100, 17);

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
        loginBody.setBounds(0, 0, 400, 645);

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
    private JLabel accountTip;
    private JLabel PasswordTip;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        Login.run();
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
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
