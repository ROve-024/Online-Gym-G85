/*
 * Created by JFormDesigner on Mon May 31 15:49:43 CST 2021
 */

package gui.member;

import controller.ClientFunction;
import controller.CoachFunction;
import gui.coach.ChangeCoachAvatar;
import gui.coach.ProfileCoach;
import gui.others.UserBuffer;
import io.client.ClientData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class ChangeMemberAvatar extends JFrame {
    public ChangeMemberAvatar() {
        initComponents();
    }

    private void submitButtonActionPerformed(ActionEvent e) {
        ClientData clientData = UserBuffer.getClientSession();
        clientData.setFileAddress(this.avatarName.getText());
        ClientFunction.updateClientInfo(clientData);
        this.dispose();
        ProfileMember.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        label1 = new JLabel();
        Tips1 = new JLabel();
        Tips2 = new JLabel();
        avatarName = new JTextField();
        Tips3 = new JLabel();
        Tips4 = new JLabel();
        submitButton = new JButton();

        //======== this ========
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
            title.setText("Modify Avatar");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(25, 45, 405, title.getPreferredSize().height);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/resources/images/others/files small.png")));
            body.add(label1);
            label1.setBounds(320, 255, 450, 300);

            //---- Tips1 ----
            Tips1.setText("You can only select pictures that are already in this folder.");
            Tips1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            Tips1.setForeground(Color.darkGray);
            body.add(Tips1);
            Tips1.setBounds(30, 210, 585, 35);

            //---- Tips2 ----
            Tips2.setText("(Pictures added by yourself will not work)");
            Tips2.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 14));
            Tips2.setForeground(Color.gray);
            body.add(Tips2);
            Tips2.setBounds(30, 245, 315, 35);

            //---- avatarName ----
            avatarName.setForeground(Color.darkGray);
            avatarName.setBackground(new Color(235, 235, 235));
            avatarName.setBorder(new EmptyBorder(5, 10, 5, 0));
            body.add(avatarName);
            avatarName.setBounds(30, 360, 265, avatarName.getPreferredSize().height);

            //---- Tips3 ----
            Tips3.setText("Tips:  Avatar (2).jpg");
            Tips3.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 12));
            Tips3.setForeground(Color.gray);
            body.add(Tips3);
            Tips3.setBounds(30, 395, 200, 25);

            //---- Tips4 ----
            Tips4.setText("Full name of the picture:");
            Tips4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            Tips4.setForeground(Color.darkGray);
            body.add(Tips4);
            Tips4.setBounds(30, 325, 230, 35);

            //---- submitButton ----
            submitButton.setText("FINISH");
            submitButton.setBackground(SystemColor.menu);
            submitButton.setBorder(null);
            submitButton.setForeground(Color.darkGray);
            submitButton.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
            submitButton.addActionListener(e -> submitButtonActionPerformed(e));
            body.add(submitButton);
            submitButton.setBounds(30, 500, 120, 50);

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
    private JLabel label1;
    private JLabel Tips1;
    private JLabel Tips2;
    private JTextField avatarName;
    private JLabel Tips3;
    private JLabel Tips4;
    private JButton submitButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        ChangeMemberAvatar.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChangeMemberAvatar frame = new ChangeMemberAvatar();
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
    public void init(){
        ClientData clientData = UserBuffer.getClientSession();
        this.avatarName.setText(clientData.getFileAddress());
    }
}
