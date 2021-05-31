package gui.login;

import javax.swing.border.*;

import controller.AdminFunction;
import controller.ClientFunction;
import controller.CoachFunction;
import controller.CheckFunction;
import gui.others.UserBuffer;
import gui.others.Warning;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 16:12:35 CST 2021
 */


/**
 * <p>
 *     This class is used for sign up.
 * </p>
 * @author Anna
 */
public class SignUp extends JFrame {
    public SignUp() {
        initComponents();
    }

    /**
     * <p>
     *     This function is used to set new user information.
     * </p>
     */
    private void signUpButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        CheckFunction checkFunction = new CheckFunction();
        String account = this.account.getText();
        String password = new String(this.password.getPassword());
        String rePassword = new String(this.rePassword.getPassword());
        if(checkFunction.checkPassword(password)) {
            if(userButton.isSelected()){
                if(ClientFunction.ifExistSameAccount(account))
                {
                    Warning.run("The account entered already exists");
                }
                else if(!password.equals(rePassword)){
                    Warning.run("The password did not match the re-typed password");
                }
                else{
                    String ID = ClientFunction.signUpSubmit(account,password);
                    UserBuffer.setBuffer(ID);
                    Login.run();
                    this.dispose();
                }
            }
            else if(coachButton.isSelected()){
                if(CoachFunction.ifExistSameAccount(account))
                {
                    Warning.run("The account entered already exists");
                }
                else if(!password.equals(rePassword)){
                    Warning.run("The password did not match the re-typed password");
                }
                else{
                    String ID = CoachFunction.signUpSubmit(account,password);
                    UserBuffer.setBuffer(ID);
                    Login.run();
                    this.dispose();
                }
            }
            else if(adminButton.isSelected()){
                if(AdminFunction.ifExistSameAccount(account))
                {
                    Warning.run("The account entered already exists");
                }
                else if(!password.equals(rePassword)){
                    Warning.run("The password did not match the re-typed password");
                }
                else{
                    String ID = AdminFunction.signUpSubmit(account,password);
                    UserBuffer.setBuffer(ID);
                    Login.run();
                    this.dispose();
                }
            }
        }
        else {
            Warning.run("The password is too simple, please re-enter.");
        }
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        signUPIcon = new JLabel();
        signUpButton = new JButton();
        userButton = new JRadioButton();
        adminButton = new JRadioButton();
        coachButton = new JRadioButton();
        account = new JTextField();
        rePassword = new JPasswordField();
        password = new JPasswordField();
        policy = new JButton();
        agree = new JCheckBox();
        accountTip = new JLabel();
        passwordTip = new JLabel();
        confirmTip = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setLayout(null);

            //---- signUPIcon ----
            signUPIcon.setText("SIGN UP");
            signUPIcon.setBackground(Color.white);
            signUPIcon.setHorizontalAlignment(SwingConstants.CENTER);
            signUPIcon.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            body.add(signUPIcon);
            signUPIcon.setBounds(100, 0, 200, 60);

            //---- signUpButton ----
            signUpButton.setText("SIGN UP");
            signUpButton.setBackground(new Color(217, 0, 27));
            signUpButton.setForeground(Color.white);
            signUpButton.setBorderPainted(false);
            signUpButton.addActionListener(e -> signUpButtonActionPerformed(e));
            body.add(signUpButton);
            signUpButton.setBounds(50, 410, 300, 50);

            //---- userButton ----
            userButton.setText("User");
            userButton.setBackground(Color.white);
            userButton.setSelected(true);
            userButton.setForeground(Color.gray);
            body.add(userButton);
            userButton.setBounds(new Rectangle(new Point(55, 305), userButton.getPreferredSize()));

            //---- adminButton ----
            adminButton.setText("Admin");
            adminButton.setBackground(Color.white);
            adminButton.setForeground(Color.gray);
            adminButton.setEnabled(false);
            body.add(adminButton);
            adminButton.setBounds(280, 305, 70, 21);

            //---- coachButton ----
            coachButton.setText("Coach");
            coachButton.setBackground(Color.white);
            coachButton.setForeground(Color.gray);
            body.add(coachButton);
            coachButton.setBounds(165, 305, 70, 21);

            //---- account ----
            account.setBackground(new Color(242, 242, 242));
            account.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            account.setBorder(new EmptyBorder(5, 10, 5, 0));
            body.add(account);
            account.setBounds(50, 85, 300, 50);

            //---- rePassword ----
            rePassword.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
            rePassword.setBackground(new Color(242, 242, 242));
            rePassword.setBorder(new EmptyBorder(5, 10, 5, 0));
            body.add(rePassword);
            rePassword.setBounds(50, 245, 300, 50);

            //---- password ----
            password.setBackground(new Color(242, 242, 242));
            password.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            password.setBorder(new EmptyBorder(5, 10, 5, 0));
            body.add(password);
            password.setBounds(50, 165, 300, 50);

            //---- policy ----
            policy.setText("Terms & Conditions");
            policy.setBackground(Color.white);
            policy.setBorderPainted(false);
            policy.setForeground(new Color(22, 155, 213));
            policy.setHorizontalAlignment(SwingConstants.LEFT);
            body.add(policy);
            policy.setBounds(212, 330, 157, 50);

            //---- agree ----
            agree.setText("I have read and agree to ");
            agree.setBackground(Color.white);
            body.add(agree);
            agree.setBounds(50, 330, 170, 50);

            //---- accountTip ----
            accountTip.setText("ACCOUNT");
            accountTip.setBackground(Color.white);
            accountTip.setFont(new Font("Arial", Font.PLAIN, 12));
            accountTip.setForeground(Color.gray);
            body.add(accountTip);
            accountTip.setBounds(50, 65, 100, accountTip.getPreferredSize().height);

            //---- passwordTip ----
            passwordTip.setText("PASSWORD");
            passwordTip.setBackground(Color.white);
            passwordTip.setFont(new Font("Arial", Font.PLAIN, 12));
            passwordTip.setForeground(Color.gray);
            body.add(passwordTip);
            passwordTip.setBounds(50, 145, 100, 14);

            //---- confirmTip ----
            confirmTip.setText("CONFIRM");
            confirmTip.setBackground(Color.white);
            confirmTip.setFont(new Font("Arial", Font.PLAIN, 12));
            confirmTip.setForeground(Color.gray);
            body.add(confirmTip);
            confirmTip.setBounds(50, 225, 100, 14);

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
        body.setBounds(0, 0, 400, 645);

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
    private JPanel body;
    private JLabel signUPIcon;
    private JButton signUpButton;
    private JRadioButton userButton;
    private JRadioButton adminButton;
    private JRadioButton coachButton;
    private JTextField account;
    private JPasswordField rePassword;
    private JPasswordField password;
    private JButton policy;
    private JCheckBox agree;
    private JLabel accountTip;
    private JLabel passwordTip;
    private JLabel confirmTip;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        SignUp.run();
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
                    SignUp frame = new SignUp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
