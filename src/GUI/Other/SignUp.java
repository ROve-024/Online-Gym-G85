package GUI.Other;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 16:12:35 CST 2021
 */


/**
 * @author Anna
 */
public class SignUp extends JFrame {
    public SignUp() {
        initComponents();
    }

    private void signUpButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        Login.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        signUPIcon = new JLabel();
        signUpButton = new JButton();
        userButton = new JRadioButton();
        adminButton = new JRadioButton();
        coachButton = new JRadioButton();
        username = new JTextField();
        password = new JPasswordField();
        email = new JTextField();
        policy = new JButton();
        agree = new JCheckBox();

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
            userButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            userButton.setSelected(true);
            body.add(userButton);
            userButton.setBounds(new Rectangle(new Point(55, 95), userButton.getPreferredSize()));

            //---- adminButton ----
            adminButton.setText("Admin");
            adminButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            body.add(adminButton);
            adminButton.setBounds(280, 95, 70, 21);

            //---- coachButton ----
            coachButton.setText("Coach");
            coachButton.setBackground(UIManager.getColor("Button.darcula.disabledText.shadow"));
            body.add(coachButton);
            coachButton.setBounds(165, 95, 70, 21);

            //---- username ----
            username.setBackground(new Color(242, 242, 242));
            username.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(username);
            username.setBounds(50, 130, 300, 50);

            //---- password ----
            password.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
            password.setBackground(new Color(242, 242, 242));
            body.add(password);
            password.setBounds(50, 250, 300, 50);

            //---- email ----
            email.setBackground(new Color(242, 242, 242));
            email.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(email);
            email.setBounds(50, 190, 300, 50);

            //---- policy ----
            policy.setText("Terms & Conditions");
            policy.setBackground(Color.white);
            policy.setBorderPainted(false);
            policy.setForeground(new Color(22, 155, 213));
            policy.setHorizontalAlignment(SwingConstants.LEFT);
            body.add(policy);
            policy.setBounds(213, 300, 157, 50);

            //---- agree ----
            agree.setText("I have read and agree to ");
            agree.setBackground(Color.white);
            body.add(agree);
            agree.setBounds(50, 300, 170, 50);

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
        body.setBounds(0, 0, 400, 675);

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
    private JTextField username;
    private JPasswordField password;
    private JTextField email;
    private JButton policy;
    private JCheckBox agree;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        SignUp.run();
    }

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
