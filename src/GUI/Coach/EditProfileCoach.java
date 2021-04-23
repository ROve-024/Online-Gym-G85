/*
 * Created by JFormDesigner on Fri Apr 09 14:50:26 CST 2021
 */

package GUI.Coach;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class EditProfileCoach extends JFrame {
    public EditProfileCoach() {
        initComponents();
    }

    private void finishButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        ProfileCoach.run();
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        finishButton = new JButton();
        decorationLine2 = new JPanel();
        nameContainer = new JPanel();
        nameTip = new JLabel();
        name = new JTextField();
        emailContainer = new JPanel();
        emailTip = new JLabel();
        email = new JTextField();
        phoneNumberContainer = new JPanel();
        phoneNumberTip = new JLabel();
        phoneNumber = new JTextField();
        currentPasswordContainer = new JPanel();
        currentPasswordTip = new JLabel();
        currentPassword = new JPasswordField();
        newPasswordContainer = new JPanel();
        newPasswordTip = new JLabel();
        newPassword = new JPasswordField();
        confirmPasswordContainer = new JPanel();
        confirmPasswordTip = new JLabel();
        confirmPassword = new JPasswordField();

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
            title.setText("Edit Profile ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- finishButton ----
            finishButton.setBorderPainted(false);
            finishButton.setBackground(new Color(240, 240, 240));
            finishButton.setText("FINISH");
            finishButton.setForeground(Color.white);
            finishButton.addActionListener(e -> finishButtonActionPerformed(e));
            body.add(finishButton);
            finishButton.setBounds(50, 575, 90, 40);

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
            decorationLine2.setBounds(35, 125, 4, 480);

            //======== nameContainer ========
            {
                nameContainer.setLayout(null);

                //---- nameTip ----
                nameTip.setText("Name");
                nameTip.setBackground(Color.white);
                nameTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                nameContainer.add(nameTip);
                nameTip.setBounds(10, 15, 135, nameTip.getPreferredSize().height);

                //---- name ----
                name.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                name.setBorder(null);
                name.setMargin(new Insets(2, 10, 2, 6));
                nameContainer.add(name);
                name.setBounds(185, 14, 500, name.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < nameContainer.getComponentCount(); i++) {
                        Rectangle bounds = nameContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = nameContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    nameContainer.setMinimumSize(preferredSize);
                    nameContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(nameContainer);
            nameContainer.setBounds(50, 125, 700, 60);

            //======== emailContainer ========
            {
                emailContainer.setLayout(null);

                //---- emailTip ----
                emailTip.setText("Email");
                emailTip.setBackground(Color.white);
                emailTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                emailContainer.add(emailTip);
                emailTip.setBounds(10, 15, 135, emailTip.getPreferredSize().height);

                //---- email ----
                email.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                email.setBorder(null);
                email.setMargin(new Insets(2, 10, 2, 6));
                emailContainer.add(email);
                email.setBounds(185, 14, 500, email.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < emailContainer.getComponentCount(); i++) {
                        Rectangle bounds = emailContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = emailContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    emailContainer.setMinimumSize(preferredSize);
                    emailContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(emailContainer);
            emailContainer.setBounds(50, 200, 700, 60);

            //======== phoneNumberContainer ========
            {
                phoneNumberContainer.setLayout(null);

                //---- phoneNumberTip ----
                phoneNumberTip.setText("Phone Number");
                phoneNumberTip.setBackground(Color.white);
                phoneNumberTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                phoneNumberContainer.add(phoneNumberTip);
                phoneNumberTip.setBounds(10, 15, 160, phoneNumberTip.getPreferredSize().height);

                //---- phoneNumber ----
                phoneNumber.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                phoneNumber.setBorder(null);
                phoneNumber.setMargin(new Insets(2, 10, 2, 6));
                phoneNumberContainer.add(phoneNumber);
                phoneNumber.setBounds(185, 14, 500, phoneNumber.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < phoneNumberContainer.getComponentCount(); i++) {
                        Rectangle bounds = phoneNumberContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = phoneNumberContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    phoneNumberContainer.setMinimumSize(preferredSize);
                    phoneNumberContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(phoneNumberContainer);
            phoneNumberContainer.setBounds(50, 275, 700, 60);

            //======== currentPasswordContainer ========
            {
                currentPasswordContainer.setLayout(null);

                //---- currentPasswordTip ----
                currentPasswordTip.setText("Current Password");
                currentPasswordTip.setBackground(Color.white);
                currentPasswordTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                currentPasswordContainer.add(currentPasswordTip);
                currentPasswordTip.setBounds(10, 15, 185, currentPasswordTip.getPreferredSize().height);

                //---- currentPassword ----
                currentPassword.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                currentPassword.setBorder(null);
                currentPassword.setMargin(new Insets(2, 10, 2, 6));
                currentPasswordContainer.add(currentPassword);
                currentPassword.setBounds(185, 14, 500, currentPassword.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < currentPasswordContainer.getComponentCount(); i++) {
                        Rectangle bounds = currentPasswordContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = currentPasswordContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    currentPasswordContainer.setMinimumSize(preferredSize);
                    currentPasswordContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(currentPasswordContainer);
            currentPasswordContainer.setBounds(50, 350, 700, 60);

            //======== newPasswordContainer ========
            {
                newPasswordContainer.setLayout(null);

                //---- newPasswordTip ----
                newPasswordTip.setText("New Password");
                newPasswordTip.setBackground(Color.white);
                newPasswordTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                newPasswordContainer.add(newPasswordTip);
                newPasswordTip.setBounds(10, 15, 185, newPasswordTip.getPreferredSize().height);

                //---- newPassword ----
                newPassword.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                newPassword.setBorder(null);
                newPassword.setMargin(new Insets(2, 10, 2, 6));
                newPasswordContainer.add(newPassword);
                newPassword.setBounds(185, 14, 500, newPassword.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < newPasswordContainer.getComponentCount(); i++) {
                        Rectangle bounds = newPasswordContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = newPasswordContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    newPasswordContainer.setMinimumSize(preferredSize);
                    newPasswordContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(newPasswordContainer);
            newPasswordContainer.setBounds(50, 425, 700, 60);

            //======== confirmPasswordContainer ========
            {
                confirmPasswordContainer.setLayout(null);

                //---- confirmPasswordTip ----
                confirmPasswordTip.setText("Confim Password");
                confirmPasswordTip.setBackground(Color.white);
                confirmPasswordTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                confirmPasswordContainer.add(confirmPasswordTip);
                confirmPasswordTip.setBounds(10, 15, 185, confirmPasswordTip.getPreferredSize().height);

                //---- confirmPassword ----
                confirmPassword.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
                confirmPassword.setBorder(null);
                confirmPassword.setMargin(new Insets(2, 10, 2, 6));
                confirmPasswordContainer.add(confirmPassword);
                confirmPassword.setBounds(185, 14, 500, confirmPassword.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < confirmPasswordContainer.getComponentCount(); i++) {
                        Rectangle bounds = confirmPasswordContainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = confirmPasswordContainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    confirmPasswordContainer.setMinimumSize(preferredSize);
                    confirmPasswordContainer.setPreferredSize(preferredSize);
                }
            }
            body.add(confirmPasswordContainer);
            confirmPasswordContainer.setBounds(50, 500, 700, 60);

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
        body.setBounds(0, 0, 800, 655);

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
    private JButton finishButton;
    private JPanel decorationLine2;
    private JPanel nameContainer;
    private JLabel nameTip;
    private JTextField name;
    private JPanel emailContainer;
    private JLabel emailTip;
    private JTextField email;
    private JPanel phoneNumberContainer;
    private JLabel phoneNumberTip;
    private JTextField phoneNumber;
    private JPanel currentPasswordContainer;
    private JLabel currentPasswordTip;
    private JPasswordField currentPassword;
    private JPanel newPasswordContainer;
    private JLabel newPasswordTip;
    private JPasswordField newPassword;
    private JPanel confirmPasswordContainer;
    private JLabel confirmPasswordTip;
    private JPasswordField confirmPassword;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        EditProfileCoach.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EditProfileCoach frame = new EditProfileCoach();
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
}
