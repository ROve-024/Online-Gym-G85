/*
 * Created by JFormDesigner on Sat May 08 21:25:56 CST 2021
 */

package gui.admin;

import java.awt.event.*;

import controller.ClassFunction;
import controller.CoachFunction;
import controller.PlanFunction;
import gui.other.UserBuffer;
import gui.other.ViewBuffer;
import io.coach.CoachData;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class AdminViewCoachProfile extends JFrame {
    public AdminViewCoachProfile() {
        initComponents();
    }

    private void deleteButtonActionPerformed(ActionEvent e) {
        CoachFunction.DeleteCoachByID(ViewBuffer.getBuffer());
        ClassFunction.deleteClassByCoachID(ViewBuffer.getBuffer());
        PlanFunction.deletePlanByCoachID(ViewBuffer.getBuffer());
        this.dispose();
        UserManageAllAdmin.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        avatar = new JLabel();
        nameTip = new JLabel();
        emailTip = new JLabel();
        phoneNumberTip = new JLabel();
        genderTip = new JLabel();
        name = new JLabel();
        email = new JLabel();
        phoneNumber = new JLabel();
        gender = new JLabel();
        decorationLine2 = new JPanel();
        decorationLine3 = new JPanel();
        decorationLine4 = new JPanel();
        decorationLine5 = new JPanel();
        decorationLine6 = new JPanel();
        decorationLine7 = new JPanel();
        decorationLine8 = new JPanel();
        decorationLine9 = new JPanel();
        decorationLine10 = new JPanel();
        decorationLine11 = new JPanel();
        deleteButton = new JButton();
        gym = new JLabel();
        uid = new JLabel();

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
            title.setText("My Profile ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- avatar ----
            avatar.setBackground(SystemColor.textHighlight);
            avatar.setHorizontalAlignment(SwingConstants.CENTER);
            avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar150/Acatar (28).jpg")));
            body.add(avatar);
            avatar.setBounds(295, 145, 150, 150);

            //---- nameTip ----
            nameTip.setText("Name");
            nameTip.setHorizontalAlignment(SwingConstants.RIGHT);
            nameTip.setBackground(Color.white);
            nameTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            nameTip.setForeground(Color.gray);
            body.add(nameTip);
            nameTip.setBounds(175, 340, 175, nameTip.getPreferredSize().height);

            //---- emailTip ----
            emailTip.setText("Email");
            emailTip.setHorizontalAlignment(SwingConstants.RIGHT);
            emailTip.setBackground(Color.white);
            emailTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            emailTip.setForeground(Color.gray);
            body.add(emailTip);
            emailTip.setBounds(175, 400, 175, 23);

            //---- phoneNumberTip ----
            phoneNumberTip.setText("Phone Number");
            phoneNumberTip.setHorizontalAlignment(SwingConstants.RIGHT);
            phoneNumberTip.setBackground(Color.white);
            phoneNumberTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            phoneNumberTip.setForeground(Color.gray);
            body.add(phoneNumberTip);
            phoneNumberTip.setBounds(175, 460, 175, 23);

            //---- genderTip ----
            genderTip.setText("Gender");
            genderTip.setHorizontalAlignment(SwingConstants.RIGHT);
            genderTip.setBackground(Color.white);
            genderTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            genderTip.setForeground(Color.gray);
            body.add(genderTip);
            genderTip.setBounds(175, 520, 175, 23);

            //---- name ----
            name.setText("Your Name");
            name.setHorizontalAlignment(SwingConstants.LEFT);
            name.setBackground(Color.white);
            name.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            name.setForeground(Color.gray);
            body.add(name);
            name.setBounds(390, 340, 175, 23);

            //---- email ----
            email.setText("username@example.com");
            email.setHorizontalAlignment(SwingConstants.LEFT);
            email.setBackground(Color.white);
            email.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            email.setForeground(Color.gray);
            body.add(email);
            email.setBounds(390, 400, 255, 23);

            //---- phoneNumber ----
            phoneNumber.setText("+86 123 4567 8910");
            phoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
            phoneNumber.setBackground(Color.white);
            phoneNumber.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            phoneNumber.setForeground(Color.gray);
            body.add(phoneNumber);
            phoneNumber.setBounds(390, 460, 255, 23);

            //---- gender ----
            gender.setText("Female");
            gender.setHorizontalAlignment(SwingConstants.LEFT);
            gender.setBackground(Color.white);
            gender.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            gender.setForeground(Color.gray);
            body.add(gender);
            gender.setBounds(390, 520, 255, 23);

            //======== decorationLine2 ========
            {
                decorationLine2.setBackground(new Color(220, 220, 220));
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
            decorationLine2.setBounds(35, 380, 315, 2);

            //======== decorationLine3 ========
            {
                decorationLine3.setBackground(new Color(220, 220, 220));
                decorationLine3.setBorder(null);
                decorationLine3.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine3.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine3.setMinimumSize(preferredSize);
                    decorationLine3.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine3);
            decorationLine3.setBounds(35, 440, 315, 2);

            //======== decorationLine4 ========
            {
                decorationLine4.setBackground(new Color(220, 220, 220));
                decorationLine4.setBorder(null);
                decorationLine4.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine4.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine4.setMinimumSize(preferredSize);
                    decorationLine4.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine4);
            decorationLine4.setBounds(35, 500, 315, 2);

            //======== decorationLine5 ========
            {
                decorationLine5.setBackground(new Color(220, 220, 220));
                decorationLine5.setBorder(null);
                decorationLine5.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine5.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine5.setMinimumSize(preferredSize);
                    decorationLine5.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine5);
            decorationLine5.setBounds(35, 557, 315, 2);

            //======== decorationLine6 ========
            {
                decorationLine6.setBackground(new Color(220, 220, 220));
                decorationLine6.setBorder(null);
                decorationLine6.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine6.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine6.setMinimumSize(preferredSize);
                    decorationLine6.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine6);
            decorationLine6.setBounds(35, 325, 315, 2);

            //======== decorationLine7 ========
            {
                decorationLine7.setBackground(new Color(220, 220, 220));
                decorationLine7.setBorder(null);
                decorationLine7.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine7.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine7.setMinimumSize(preferredSize);
                    decorationLine7.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine7);
            decorationLine7.setBounds(390, 325, 375, 2);

            //======== decorationLine8 ========
            {
                decorationLine8.setBackground(new Color(220, 220, 220));
                decorationLine8.setBorder(null);
                decorationLine8.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine8.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine8.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine8.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine8.setMinimumSize(preferredSize);
                    decorationLine8.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine8);
            decorationLine8.setBounds(390, 380, 375, 2);

            //======== decorationLine9 ========
            {
                decorationLine9.setBackground(new Color(220, 220, 220));
                decorationLine9.setBorder(null);
                decorationLine9.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine9.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine9.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine9.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine9.setMinimumSize(preferredSize);
                    decorationLine9.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine9);
            decorationLine9.setBounds(390, 440, 375, 2);

            //======== decorationLine10 ========
            {
                decorationLine10.setBackground(new Color(220, 220, 220));
                decorationLine10.setBorder(null);
                decorationLine10.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine10.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine10.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine10.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine10.setMinimumSize(preferredSize);
                    decorationLine10.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine10);
            decorationLine10.setBounds(390, 500, 375, 2);

            //======== decorationLine11 ========
            {
                decorationLine11.setBackground(new Color(220, 220, 220));
                decorationLine11.setBorder(null);
                decorationLine11.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < decorationLine11.getComponentCount(); i++) {
                        Rectangle bounds = decorationLine11.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = decorationLine11.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    decorationLine11.setMinimumSize(preferredSize);
                    decorationLine11.setPreferredSize(preferredSize);
                }
            }
            body.add(decorationLine11);
            decorationLine11.setBounds(390, 557, 375, 2);

            //---- deleteButton ----
            deleteButton.setBorderPainted(false);
            deleteButton.setBackground(new Color(240, 128, 128));
            deleteButton.setText("DELETE");
            deleteButton.setForeground(Color.white);
            deleteButton.addActionListener(e -> deleteButtonActionPerformed(e));
            body.add(deleteButton);
            deleteButton.setBounds(35, 590, 90, 40);

            //---- gym ----
            gym.setText("GYM: Muscle King ");
            gym.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            gym.setForeground(Color.gray);
            gym.setHorizontalAlignment(SwingConstants.RIGHT);
            body.add(gym);
            gym.setBounds(600, 93, 170, 24);

            //---- uid ----
            uid.setText("UID:88888888 ");
            uid.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            uid.setForeground(Color.gray);
            uid.setHorizontalAlignment(SwingConstants.RIGHT);
            body.add(uid);
            uid.setBounds(470, 93, 130, 24);

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
    private JLabel avatar;
    private JLabel nameTip;
    private JLabel emailTip;
    private JLabel phoneNumberTip;
    private JLabel genderTip;
    private JLabel name;
    private JLabel email;
    private JLabel phoneNumber;
    private JLabel gender;
    private JPanel decorationLine2;
    private JPanel decorationLine3;
    private JPanel decorationLine4;
    private JPanel decorationLine5;
    private JPanel decorationLine6;
    private JPanel decorationLine7;
    private JPanel decorationLine8;
    private JPanel decorationLine9;
    private JPanel decorationLine10;
    private JPanel decorationLine11;
    private JButton deleteButton;
    private JLabel gym;
    private JLabel uid;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        AdminViewCoachProfile.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminViewCoachProfile frame = new AdminViewCoachProfile();
                    frame.init();
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

    private void init(){
        String ID = ViewBuffer.getBuffer();
        CoachData coachData = CoachFunction.searchCoachByID(ID);
        this.uid.setText(ViewBuffer.dataIsEmpty("UID: "+ ID));
        this.gym.setText(ViewBuffer.dataIsEmpty("GYM: "));
        this.name.setText(ViewBuffer.dataIsEmpty(coachData.getName()));
        this.email.setText(ViewBuffer.dataIsEmpty(coachData.getEmail()));
        this.phoneNumber.setText(ViewBuffer.dataIsEmpty(coachData.getPhonenumber()));
        this.gender.setText(ViewBuffer.dataIsEmpty(coachData.getSex()));
        try{
            this.avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar150/" + coachData.getFileAddress())));
        }catch (NullPointerException miss){
            this.avatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar150/404.jpg")));
        }

    }
}
