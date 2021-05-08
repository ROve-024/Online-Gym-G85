/*
 * Created by JFormDesigner on Fri Apr 23 10:37:03 CST 2021
 */

package gui.admin;

import controller.ClientFunction;
import controller.CoachFunction;
import gui.other.ViewBuffer;
import gui.other.Warning;
import io.client.ClientData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class UserManageAllAdmin extends JFrame {
    public UserManageAllAdmin() {
        initComponents();
    }

    private void memberPrevButtonActionPerformed(ActionEvent e) {
        if(this.pageClient == 0){
            Warning.run("No previous page here.");
        }
        else{
            this.pageClient--;
            this.updateClient();
        }
    }
    private void memberNextButtonActionPerformed(ActionEvent e) {
        int remainItem = this.clientList.size() - 6 * (this.pageClient + 1);
        if(remainItem <= 0){
            Warning.run("No more page here.");
        }
        else{
            this.pageClient++;
            this.updateClient();
        }
    }

    private void coachPrevButtonActionPerformed(ActionEvent e) {
        if(this.pageCoach == 0){
            Warning.run("No previous page here.");
        }
        else{
            this.pageCoach--;
            this.updateCoach();
        }
    }

    private void coachNextButtonActionPerformed(ActionEvent e) {
        int remainItem = this.coachList.size() - 6 * (this.pageCoach + 1);
        if(remainItem <= 0){
            Warning.run("No more page here.");
        }
        else{
            this.pageCoach++;
            this.updateCoach();
        }
    }

    private void memberMoreButton1ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton2ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 1).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton3ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 2).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton4ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 3).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton5ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 4).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton6ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 5).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton7ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 6).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void memberMoreButton8ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.clientList.get(this.pageClient*8 + 7).getClientID());
        AdminViewMemberProfile.run();
        this.dispose();
    }

    private void coachMoreButton1ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton2ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 1).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton3ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 2).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton4ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 3).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton5ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 4).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton6ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 5).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton7ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 6).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }

    private void coachMoreButton8ActionPerformed(ActionEvent e) {
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.coachList.get(this.pageCoach*8 + 7).getID());
        AdminViewCoachProfile.run();
        this.dispose();
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        MembetTip = new JLabel();
        memberNextButton = new JButton();
        client1 = new JPanel();
        clientAvatar1 = new JLabel();
        clientName1 = new JLabel();
        clientGender1 = new JLabel();
        memberMoreButton1 = new JButton();
        decorationLine2 = new JLabel();
        coachTips = new JLabel();
        coach1 = new JPanel();
        coachAvatar1 = new JLabel();
        coachName1 = new JLabel();
        coachMoreButton1 = new JButton();
        coachGender1 = new JLabel();
        memberPrevButton = new JButton();
        coachPrevButton = new JButton();
        coachNextButton = new JButton();
        client2 = new JPanel();
        clientAvatar2 = new JLabel();
        clientName2 = new JLabel();
        clientGender2 = new JLabel();
        memberMoreButton2 = new JButton();
        client3 = new JPanel();
        clientAvatar3 = new JLabel();
        clientName3 = new JLabel();
        clientGender3 = new JLabel();
        memberMoreButton3 = new JButton();
        client4 = new JPanel();
        clientAvatar4 = new JLabel();
        clientName4 = new JLabel();
        clientGender4 = new JLabel();
        memberMoreButton4 = new JButton();
        client5 = new JPanel();
        clientAvatar5 = new JLabel();
        clientName5 = new JLabel();
        clientGender5 = new JLabel();
        memberMoreButton5 = new JButton();
        client6 = new JPanel();
        clientAvatar6 = new JLabel();
        clientName6 = new JLabel();
        clientGender6 = new JLabel();
        memberMoreButton6 = new JButton();
        client7 = new JPanel();
        clientAvatar7 = new JLabel();
        clientName7 = new JLabel();
        clientGender7 = new JLabel();
        memberMoreButton7 = new JButton();
        client8 = new JPanel();
        clientAvatar8 = new JLabel();
        clientName8 = new JLabel();
        clientGender8 = new JLabel();
        memberMoreButton8 = new JButton();
        coach2 = new JPanel();
        coachAvatar2 = new JLabel();
        coachName2 = new JLabel();
        coachMoreButton2 = new JButton();
        coachGender2 = new JLabel();
        coach3 = new JPanel();
        coachAvatar3 = new JLabel();
        coachName3 = new JLabel();
        coachMoreButton3 = new JButton();
        coachGender3 = new JLabel();
        coach4 = new JPanel();
        coachAvatar4 = new JLabel();
        coachName4 = new JLabel();
        coachMoreButton4 = new JButton();
        coachGender4 = new JLabel();
        coach5 = new JPanel();
        coachAvatar5 = new JLabel();
        coachName5 = new JLabel();
        coachMoreButton5 = new JButton();
        coachGender5 = new JLabel();
        coach6 = new JPanel();
        coachAvatar6 = new JLabel();
        coachName6 = new JLabel();
        coachMoreButton6 = new JButton();
        coachGender6 = new JLabel();
        coach7 = new JPanel();
        coachAvatar7 = new JLabel();
        coachName7 = new JLabel();
        coachMoreButton7 = new JButton();
        coachGender7 = new JLabel();
        coach8 = new JPanel();
        coachAvatar8 = new JLabel();
        coachName8 = new JLabel();
        coachMoreButton8 = new JButton();
        coachGender8 = new JLabel();

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
            title.setText("User Management");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- MembetTip ----
            MembetTip.setText("Member");
            MembetTip.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            MembetTip.setBackground(Color.white);
            body.add(MembetTip);
            MembetTip.setBounds(35, 120, 190, 42);

            //---- memberNextButton ----
            memberNextButton.setBackground(SystemColor.menu);
            memberNextButton.setBorder(null);
            memberNextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            memberNextButton.addActionListener(e -> memberNextButtonActionPerformed(e));
            body.add(memberNextButton);
            memberNextButton.setBounds(725, 120, 40, 40);

            //======== client1 ========
            {
                client1.setBackground(SystemColor.window);
                client1.setBorder(new LineBorder(Color.lightGray));
                client1.setLayout(null);

                //---- clientAvatar1 ----
                clientAvatar1.setBackground(Color.white);
                clientAvatar1.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar1.setHorizontalAlignment(SwingConstants.CENTER);
                client1.add(clientAvatar1);
                clientAvatar1.setBounds(10, 10, 75, 75);

                //---- clientName1 ----
                clientName1.setText("First Name");
                clientName1.setFont(clientName1.getFont().deriveFont(clientName1.getFont().getStyle() | Font.BOLD, clientName1.getFont().getSize() + 2f));
                clientName1.setBackground(SystemColor.menu);
                client1.add(clientName1);
                clientName1.setBounds(90, 10, 80, clientName1.getPreferredSize().height);

                //---- clientGender1 ----
                clientGender1.setText("Female");
                clientGender1.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender1.setBackground(SystemColor.menu);
                clientGender1.setForeground(Color.gray);
                client1.add(clientGender1);
                clientGender1.setBounds(90, 31, 45, 17);

                //---- memberMoreButton1 ----
                memberMoreButton1.setText("MORE");
                memberMoreButton1.setBackground(SystemColor.menu);
                memberMoreButton1.setBorderPainted(false);
                memberMoreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton1.addActionListener(e -> memberMoreButton1ActionPerformed(e));
                client1.add(memberMoreButton1);
                memberMoreButton1.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client1.getComponentCount(); i++) {
                        Rectangle bounds = client1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client1.setMinimumSize(preferredSize);
                    client1.setPreferredSize(preferredSize);
                }
            }
            body.add(client1);
            client1.setBounds(35, 165, 175, 100);

            //---- decorationLine2 ----
            decorationLine2.setBackground(Color.black);
            decorationLine2.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine2);
            decorationLine2.setBounds(35, 380, 730, 2);

            //---- coachTips ----
            coachTips.setText("Coach");
            coachTips.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachTips.setBackground(Color.white);
            body.add(coachTips);
            coachTips.setBounds(35, 385, 190, 42);

            //======== coach1 ========
            {
                coach1.setBackground(SystemColor.window);
                coach1.setBorder(new LineBorder(Color.lightGray));
                coach1.setLayout(null);

                //---- coachAvatar1 ----
                coachAvatar1.setBackground(Color.white);
                coachAvatar1.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar1.setHorizontalAlignment(SwingConstants.CENTER);
                coach1.add(coachAvatar1);
                coachAvatar1.setBounds(10, 10, 75, 75);

                //---- coachName1 ----
                coachName1.setText("First Name");
                coachName1.setFont(coachName1.getFont().deriveFont(coachName1.getFont().getStyle() | Font.BOLD, coachName1.getFont().getSize() + 2f));
                coachName1.setBackground(SystemColor.menu);
                coach1.add(coachName1);
                coachName1.setBounds(90, 10, 80, coachName1.getPreferredSize().height);

                //---- coachMoreButton1 ----
                coachMoreButton1.setText("MORE");
                coachMoreButton1.setBackground(SystemColor.menu);
                coachMoreButton1.setBorderPainted(false);
                coachMoreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton1.addActionListener(e -> coachMoreButton1ActionPerformed(e));
                coach1.add(coachMoreButton1);
                coachMoreButton1.setBounds(100, 60, 65, 25);

                //---- coachGender1 ----
                coachGender1.setText("Female");
                coachGender1.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender1.setBackground(SystemColor.menu);
                coachGender1.setForeground(Color.gray);
                coach1.add(coachGender1);
                coachGender1.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach1.getComponentCount(); i++) {
                        Rectangle bounds = coach1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach1.setMinimumSize(preferredSize);
                    coach1.setPreferredSize(preferredSize);
                }
            }
            body.add(coach1);
            coach1.setBounds(35, 430, 175, 100);

            //---- memberPrevButton ----
            memberPrevButton.setBackground(SystemColor.menu);
            memberPrevButton.setBorder(null);
            memberPrevButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            memberPrevButton.addActionListener(e -> memberPrevButtonActionPerformed(e));
            body.add(memberPrevButton);
            memberPrevButton.setBounds(680, 120, 40, 40);

            //---- coachPrevButton ----
            coachPrevButton.setBackground(SystemColor.menu);
            coachPrevButton.setBorder(null);
            coachPrevButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            coachPrevButton.addActionListener(e -> coachPrevButtonActionPerformed(e));
            body.add(coachPrevButton);
            coachPrevButton.setBounds(680, 385, 40, 40);

            //---- coachNextButton ----
            coachNextButton.setBackground(SystemColor.menu);
            coachNextButton.setBorder(null);
            coachNextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            coachNextButton.addActionListener(e -> coachNextButtonActionPerformed(e));
            body.add(coachNextButton);
            coachNextButton.setBounds(725, 385, 40, 40);

            //======== client2 ========
            {
                client2.setBackground(SystemColor.window);
                client2.setBorder(new LineBorder(Color.lightGray));
                client2.setLayout(null);

                //---- clientAvatar2 ----
                clientAvatar2.setBackground(Color.white);
                clientAvatar2.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar2.setHorizontalAlignment(SwingConstants.CENTER);
                client2.add(clientAvatar2);
                clientAvatar2.setBounds(10, 10, 75, 75);

                //---- clientName2 ----
                clientName2.setText("First Name");
                clientName2.setFont(clientName2.getFont().deriveFont(clientName2.getFont().getStyle() | Font.BOLD, clientName2.getFont().getSize() + 2f));
                clientName2.setBackground(SystemColor.menu);
                client2.add(clientName2);
                clientName2.setBounds(90, 10, 80, clientName2.getPreferredSize().height);

                //---- clientGender2 ----
                clientGender2.setText("Female");
                clientGender2.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender2.setBackground(SystemColor.menu);
                clientGender2.setForeground(Color.gray);
                client2.add(clientGender2);
                clientGender2.setBounds(90, 31, 45, 17);

                //---- memberMoreButton2 ----
                memberMoreButton2.setText("MORE");
                memberMoreButton2.setBackground(SystemColor.menu);
                memberMoreButton2.setBorderPainted(false);
                memberMoreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton2.addActionListener(e -> memberMoreButton2ActionPerformed(e));
                client2.add(memberMoreButton2);
                memberMoreButton2.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client2.getComponentCount(); i++) {
                        Rectangle bounds = client2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client2.setMinimumSize(preferredSize);
                    client2.setPreferredSize(preferredSize);
                }
            }
            body.add(client2);
            client2.setBounds(220, 165, 175, 100);

            //======== client3 ========
            {
                client3.setBackground(SystemColor.window);
                client3.setBorder(new LineBorder(Color.lightGray));
                client3.setLayout(null);

                //---- clientAvatar3 ----
                clientAvatar3.setBackground(Color.white);
                clientAvatar3.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar3.setHorizontalAlignment(SwingConstants.CENTER);
                client3.add(clientAvatar3);
                clientAvatar3.setBounds(10, 10, 75, 75);

                //---- clientName3 ----
                clientName3.setText("First Name");
                clientName3.setFont(clientName3.getFont().deriveFont(clientName3.getFont().getStyle() | Font.BOLD, clientName3.getFont().getSize() + 2f));
                clientName3.setBackground(SystemColor.menu);
                client3.add(clientName3);
                clientName3.setBounds(90, 10, 80, clientName3.getPreferredSize().height);

                //---- clientGender3 ----
                clientGender3.setText("Female");
                clientGender3.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender3.setBackground(SystemColor.menu);
                clientGender3.setForeground(Color.gray);
                client3.add(clientGender3);
                clientGender3.setBounds(90, 31, 45, 17);

                //---- memberMoreButton3 ----
                memberMoreButton3.setText("MORE");
                memberMoreButton3.setBackground(SystemColor.menu);
                memberMoreButton3.setBorderPainted(false);
                memberMoreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton3.addActionListener(e -> memberMoreButton3ActionPerformed(e));
                client3.add(memberMoreButton3);
                memberMoreButton3.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client3.getComponentCount(); i++) {
                        Rectangle bounds = client3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client3.setMinimumSize(preferredSize);
                    client3.setPreferredSize(preferredSize);
                }
            }
            body.add(client3);
            client3.setBounds(405, 165, 175, 100);

            //======== client4 ========
            {
                client4.setBackground(SystemColor.window);
                client4.setBorder(new LineBorder(Color.lightGray));
                client4.setLayout(null);

                //---- clientAvatar4 ----
                clientAvatar4.setBackground(Color.white);
                clientAvatar4.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar4.setHorizontalAlignment(SwingConstants.CENTER);
                client4.add(clientAvatar4);
                clientAvatar4.setBounds(10, 10, 75, 75);

                //---- clientName4 ----
                clientName4.setText("First Name");
                clientName4.setFont(clientName4.getFont().deriveFont(clientName4.getFont().getStyle() | Font.BOLD, clientName4.getFont().getSize() + 2f));
                clientName4.setBackground(SystemColor.menu);
                client4.add(clientName4);
                clientName4.setBounds(90, 10, 80, clientName4.getPreferredSize().height);

                //---- clientGender4 ----
                clientGender4.setText("Female");
                clientGender4.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender4.setBackground(SystemColor.menu);
                clientGender4.setForeground(Color.gray);
                client4.add(clientGender4);
                clientGender4.setBounds(90, 31, 45, 17);

                //---- memberMoreButton4 ----
                memberMoreButton4.setText("MORE");
                memberMoreButton4.setBackground(SystemColor.menu);
                memberMoreButton4.setBorderPainted(false);
                memberMoreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton4.addActionListener(e -> memberMoreButton4ActionPerformed(e));
                client4.add(memberMoreButton4);
                memberMoreButton4.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client4.getComponentCount(); i++) {
                        Rectangle bounds = client4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client4.setMinimumSize(preferredSize);
                    client4.setPreferredSize(preferredSize);
                }
            }
            body.add(client4);
            client4.setBounds(590, 165, 175, 100);

            //======== client5 ========
            {
                client5.setBackground(SystemColor.window);
                client5.setBorder(new LineBorder(Color.lightGray));
                client5.setLayout(null);

                //---- clientAvatar5 ----
                clientAvatar5.setBackground(Color.white);
                clientAvatar5.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar5.setHorizontalAlignment(SwingConstants.CENTER);
                client5.add(clientAvatar5);
                clientAvatar5.setBounds(10, 10, 75, 75);

                //---- clientName5 ----
                clientName5.setText("First Name");
                clientName5.setFont(clientName5.getFont().deriveFont(clientName5.getFont().getStyle() | Font.BOLD, clientName5.getFont().getSize() + 2f));
                clientName5.setBackground(SystemColor.menu);
                client5.add(clientName5);
                clientName5.setBounds(90, 10, 80, clientName5.getPreferredSize().height);

                //---- clientGender5 ----
                clientGender5.setText("Female");
                clientGender5.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender5.setBackground(SystemColor.menu);
                clientGender5.setForeground(Color.gray);
                client5.add(clientGender5);
                clientGender5.setBounds(90, 31, 45, 17);

                //---- memberMoreButton5 ----
                memberMoreButton5.setText("MORE");
                memberMoreButton5.setBackground(SystemColor.menu);
                memberMoreButton5.setBorderPainted(false);
                memberMoreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton5.addActionListener(e -> memberMoreButton5ActionPerformed(e));
                client5.add(memberMoreButton5);
                memberMoreButton5.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client5.getComponentCount(); i++) {
                        Rectangle bounds = client5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client5.setMinimumSize(preferredSize);
                    client5.setPreferredSize(preferredSize);
                }
            }
            body.add(client5);
            client5.setBounds(35, 275, 175, 100);

            //======== client6 ========
            {
                client6.setBackground(SystemColor.window);
                client6.setBorder(new LineBorder(Color.lightGray));
                client6.setLayout(null);

                //---- clientAvatar6 ----
                clientAvatar6.setBackground(Color.white);
                clientAvatar6.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar6.setHorizontalAlignment(SwingConstants.CENTER);
                client6.add(clientAvatar6);
                clientAvatar6.setBounds(10, 10, 75, 75);

                //---- clientName6 ----
                clientName6.setText("First Name");
                clientName6.setFont(clientName6.getFont().deriveFont(clientName6.getFont().getStyle() | Font.BOLD, clientName6.getFont().getSize() + 2f));
                clientName6.setBackground(SystemColor.menu);
                client6.add(clientName6);
                clientName6.setBounds(90, 10, 80, clientName6.getPreferredSize().height);

                //---- clientGender6 ----
                clientGender6.setText("Female");
                clientGender6.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender6.setBackground(SystemColor.menu);
                clientGender6.setForeground(Color.gray);
                client6.add(clientGender6);
                clientGender6.setBounds(90, 31, 45, 17);

                //---- memberMoreButton6 ----
                memberMoreButton6.setText("MORE");
                memberMoreButton6.setBackground(SystemColor.menu);
                memberMoreButton6.setBorderPainted(false);
                memberMoreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton6.addActionListener(e -> memberMoreButton6ActionPerformed(e));
                client6.add(memberMoreButton6);
                memberMoreButton6.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client6.getComponentCount(); i++) {
                        Rectangle bounds = client6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client6.setMinimumSize(preferredSize);
                    client6.setPreferredSize(preferredSize);
                }
            }
            body.add(client6);
            client6.setBounds(220, 275, 175, 100);

            //======== client7 ========
            {
                client7.setBackground(SystemColor.window);
                client7.setBorder(new LineBorder(Color.lightGray));
                client7.setLayout(null);

                //---- clientAvatar7 ----
                clientAvatar7.setBackground(Color.white);
                clientAvatar7.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar7.setHorizontalAlignment(SwingConstants.CENTER);
                client7.add(clientAvatar7);
                clientAvatar7.setBounds(10, 10, 75, 75);

                //---- clientName7 ----
                clientName7.setText("First Name");
                clientName7.setFont(clientName7.getFont().deriveFont(clientName7.getFont().getStyle() | Font.BOLD, clientName7.getFont().getSize() + 2f));
                clientName7.setBackground(SystemColor.menu);
                client7.add(clientName7);
                clientName7.setBounds(90, 10, 80, clientName7.getPreferredSize().height);

                //---- clientGender7 ----
                clientGender7.setText("Female");
                clientGender7.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender7.setBackground(SystemColor.menu);
                clientGender7.setForeground(Color.gray);
                client7.add(clientGender7);
                clientGender7.setBounds(90, 31, 45, 17);

                //---- memberMoreButton7 ----
                memberMoreButton7.setText("MORE");
                memberMoreButton7.setBackground(SystemColor.menu);
                memberMoreButton7.setBorderPainted(false);
                memberMoreButton7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton7.addActionListener(e -> memberMoreButton7ActionPerformed(e));
                client7.add(memberMoreButton7);
                memberMoreButton7.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client7.getComponentCount(); i++) {
                        Rectangle bounds = client7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client7.setMinimumSize(preferredSize);
                    client7.setPreferredSize(preferredSize);
                }
            }
            body.add(client7);
            client7.setBounds(405, 275, 175, 100);

            //======== client8 ========
            {
                client8.setBackground(SystemColor.window);
                client8.setBorder(new LineBorder(Color.lightGray));
                client8.setLayout(null);

                //---- clientAvatar8 ----
                clientAvatar8.setBackground(Color.white);
                clientAvatar8.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                clientAvatar8.setHorizontalAlignment(SwingConstants.CENTER);
                client8.add(clientAvatar8);
                clientAvatar8.setBounds(10, 10, 75, 75);

                //---- clientName8 ----
                clientName8.setText("First Name");
                clientName8.setFont(clientName8.getFont().deriveFont(clientName8.getFont().getStyle() | Font.BOLD, clientName8.getFont().getSize() + 2f));
                clientName8.setBackground(SystemColor.menu);
                client8.add(clientName8);
                clientName8.setBounds(90, 10, 80, clientName8.getPreferredSize().height);

                //---- clientGender8 ----
                clientGender8.setText("Female");
                clientGender8.setFont(new Font("Arial", Font.ITALIC, 12));
                clientGender8.setBackground(SystemColor.menu);
                clientGender8.setForeground(Color.gray);
                client8.add(clientGender8);
                clientGender8.setBounds(90, 31, 45, 17);

                //---- memberMoreButton8 ----
                memberMoreButton8.setText("MORE");
                memberMoreButton8.setBackground(SystemColor.menu);
                memberMoreButton8.setBorderPainted(false);
                memberMoreButton8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton8.addActionListener(e -> memberMoreButton8ActionPerformed(e));
                client8.add(memberMoreButton8);
                memberMoreButton8.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < client8.getComponentCount(); i++) {
                        Rectangle bounds = client8.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = client8.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    client8.setMinimumSize(preferredSize);
                    client8.setPreferredSize(preferredSize);
                }
            }
            body.add(client8);
            client8.setBounds(590, 275, 175, 100);

            //======== coach2 ========
            {
                coach2.setBackground(SystemColor.window);
                coach2.setBorder(new LineBorder(Color.lightGray));
                coach2.setLayout(null);

                //---- coachAvatar2 ----
                coachAvatar2.setBackground(Color.white);
                coachAvatar2.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar2.setHorizontalAlignment(SwingConstants.CENTER);
                coach2.add(coachAvatar2);
                coachAvatar2.setBounds(10, 10, 75, 75);

                //---- coachName2 ----
                coachName2.setText("First Name");
                coachName2.setFont(coachName2.getFont().deriveFont(coachName2.getFont().getStyle() | Font.BOLD, coachName2.getFont().getSize() + 2f));
                coachName2.setBackground(SystemColor.menu);
                coach2.add(coachName2);
                coachName2.setBounds(90, 10, 80, coachName2.getPreferredSize().height);

                //---- coachMoreButton2 ----
                coachMoreButton2.setText("MORE");
                coachMoreButton2.setBackground(SystemColor.menu);
                coachMoreButton2.setBorderPainted(false);
                coachMoreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton2.addActionListener(e -> coachMoreButton2ActionPerformed(e));
                coach2.add(coachMoreButton2);
                coachMoreButton2.setBounds(100, 60, 65, 25);

                //---- coachGender2 ----
                coachGender2.setText("Female");
                coachGender2.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender2.setBackground(SystemColor.menu);
                coachGender2.setForeground(Color.gray);
                coach2.add(coachGender2);
                coachGender2.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach2.getComponentCount(); i++) {
                        Rectangle bounds = coach2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach2.setMinimumSize(preferredSize);
                    coach2.setPreferredSize(preferredSize);
                }
            }
            body.add(coach2);
            coach2.setBounds(220, 430, 175, 100);

            //======== coach3 ========
            {
                coach3.setBackground(SystemColor.window);
                coach3.setBorder(new LineBorder(Color.lightGray));
                coach3.setLayout(null);

                //---- coachAvatar3 ----
                coachAvatar3.setBackground(Color.white);
                coachAvatar3.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar3.setHorizontalAlignment(SwingConstants.CENTER);
                coach3.add(coachAvatar3);
                coachAvatar3.setBounds(10, 10, 75, 75);

                //---- coachName3 ----
                coachName3.setText("First Name");
                coachName3.setFont(coachName3.getFont().deriveFont(coachName3.getFont().getStyle() | Font.BOLD, coachName3.getFont().getSize() + 2f));
                coachName3.setBackground(SystemColor.menu);
                coach3.add(coachName3);
                coachName3.setBounds(90, 10, 80, coachName3.getPreferredSize().height);

                //---- coachMoreButton3 ----
                coachMoreButton3.setText("MORE");
                coachMoreButton3.setBackground(SystemColor.menu);
                coachMoreButton3.setBorderPainted(false);
                coachMoreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton3.addActionListener(e -> coachMoreButton3ActionPerformed(e));
                coach3.add(coachMoreButton3);
                coachMoreButton3.setBounds(100, 60, 65, 25);

                //---- coachGender3 ----
                coachGender3.setText("Female");
                coachGender3.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender3.setBackground(SystemColor.menu);
                coachGender3.setForeground(Color.gray);
                coach3.add(coachGender3);
                coachGender3.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach3.getComponentCount(); i++) {
                        Rectangle bounds = coach3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach3.setMinimumSize(preferredSize);
                    coach3.setPreferredSize(preferredSize);
                }
            }
            body.add(coach3);
            coach3.setBounds(405, 430, 175, 100);

            //======== coach4 ========
            {
                coach4.setBackground(SystemColor.window);
                coach4.setBorder(new LineBorder(Color.lightGray));
                coach4.setLayout(null);

                //---- coachAvatar4 ----
                coachAvatar4.setBackground(Color.white);
                coachAvatar4.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar4.setHorizontalAlignment(SwingConstants.CENTER);
                coach4.add(coachAvatar4);
                coachAvatar4.setBounds(10, 10, 75, 75);

                //---- coachName4 ----
                coachName4.setText("First Name");
                coachName4.setFont(coachName4.getFont().deriveFont(coachName4.getFont().getStyle() | Font.BOLD, coachName4.getFont().getSize() + 2f));
                coachName4.setBackground(SystemColor.menu);
                coach4.add(coachName4);
                coachName4.setBounds(90, 10, 80, coachName4.getPreferredSize().height);

                //---- coachMoreButton4 ----
                coachMoreButton4.setText("MORE");
                coachMoreButton4.setBackground(SystemColor.menu);
                coachMoreButton4.setBorderPainted(false);
                coachMoreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton4.addActionListener(e -> coachMoreButton4ActionPerformed(e));
                coach4.add(coachMoreButton4);
                coachMoreButton4.setBounds(100, 60, 65, 25);

                //---- coachGender4 ----
                coachGender4.setText("Female");
                coachGender4.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender4.setBackground(SystemColor.menu);
                coachGender4.setForeground(Color.gray);
                coach4.add(coachGender4);
                coachGender4.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach4.getComponentCount(); i++) {
                        Rectangle bounds = coach4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach4.setMinimumSize(preferredSize);
                    coach4.setPreferredSize(preferredSize);
                }
            }
            body.add(coach4);
            coach4.setBounds(590, 430, 175, 100);

            //======== coach5 ========
            {
                coach5.setBackground(SystemColor.window);
                coach5.setBorder(new LineBorder(Color.lightGray));
                coach5.setLayout(null);

                //---- coachAvatar5 ----
                coachAvatar5.setBackground(Color.white);
                coachAvatar5.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar5.setHorizontalAlignment(SwingConstants.CENTER);
                coach5.add(coachAvatar5);
                coachAvatar5.setBounds(10, 10, 75, 75);

                //---- coachName5 ----
                coachName5.setText("First Name");
                coachName5.setFont(coachName5.getFont().deriveFont(coachName5.getFont().getStyle() | Font.BOLD, coachName5.getFont().getSize() + 2f));
                coachName5.setBackground(SystemColor.menu);
                coach5.add(coachName5);
                coachName5.setBounds(90, 10, 80, coachName5.getPreferredSize().height);

                //---- coachMoreButton5 ----
                coachMoreButton5.setText("MORE");
                coachMoreButton5.setBackground(SystemColor.menu);
                coachMoreButton5.setBorderPainted(false);
                coachMoreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton5.addActionListener(e -> coachMoreButton5ActionPerformed(e));
                coach5.add(coachMoreButton5);
                coachMoreButton5.setBounds(100, 60, 65, 25);

                //---- coachGender5 ----
                coachGender5.setText("Female");
                coachGender5.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender5.setBackground(SystemColor.menu);
                coachGender5.setForeground(Color.gray);
                coach5.add(coachGender5);
                coachGender5.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach5.getComponentCount(); i++) {
                        Rectangle bounds = coach5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach5.setMinimumSize(preferredSize);
                    coach5.setPreferredSize(preferredSize);
                }
            }
            body.add(coach5);
            coach5.setBounds(35, 540, 175, 100);

            //======== coach6 ========
            {
                coach6.setBackground(SystemColor.window);
                coach6.setBorder(new LineBorder(Color.lightGray));
                coach6.setLayout(null);

                //---- coachAvatar6 ----
                coachAvatar6.setBackground(Color.white);
                coachAvatar6.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar6.setHorizontalAlignment(SwingConstants.CENTER);
                coach6.add(coachAvatar6);
                coachAvatar6.setBounds(10, 10, 75, 75);

                //---- coachName6 ----
                coachName6.setText("First Name");
                coachName6.setFont(coachName6.getFont().deriveFont(coachName6.getFont().getStyle() | Font.BOLD, coachName6.getFont().getSize() + 2f));
                coachName6.setBackground(SystemColor.menu);
                coach6.add(coachName6);
                coachName6.setBounds(90, 10, 80, coachName6.getPreferredSize().height);

                //---- coachMoreButton6 ----
                coachMoreButton6.setText("MORE");
                coachMoreButton6.setBackground(SystemColor.menu);
                coachMoreButton6.setBorderPainted(false);
                coachMoreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton6.addActionListener(e -> coachMoreButton6ActionPerformed(e));
                coach6.add(coachMoreButton6);
                coachMoreButton6.setBounds(100, 60, 65, 25);

                //---- coachGender6 ----
                coachGender6.setText("Female");
                coachGender6.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender6.setBackground(SystemColor.menu);
                coachGender6.setForeground(Color.gray);
                coach6.add(coachGender6);
                coachGender6.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach6.getComponentCount(); i++) {
                        Rectangle bounds = coach6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach6.setMinimumSize(preferredSize);
                    coach6.setPreferredSize(preferredSize);
                }
            }
            body.add(coach6);
            coach6.setBounds(220, 540, 175, 100);

            //======== coach7 ========
            {
                coach7.setBackground(SystemColor.window);
                coach7.setBorder(new LineBorder(Color.lightGray));
                coach7.setLayout(null);

                //---- coachAvatar7 ----
                coachAvatar7.setBackground(Color.white);
                coachAvatar7.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar7.setHorizontalAlignment(SwingConstants.CENTER);
                coach7.add(coachAvatar7);
                coachAvatar7.setBounds(10, 10, 75, 75);

                //---- coachName7 ----
                coachName7.setText("First Name");
                coachName7.setFont(coachName7.getFont().deriveFont(coachName7.getFont().getStyle() | Font.BOLD, coachName7.getFont().getSize() + 2f));
                coachName7.setBackground(SystemColor.menu);
                coach7.add(coachName7);
                coachName7.setBounds(90, 10, 80, coachName7.getPreferredSize().height);

                //---- coachMoreButton7 ----
                coachMoreButton7.setText("MORE");
                coachMoreButton7.setBackground(SystemColor.menu);
                coachMoreButton7.setBorderPainted(false);
                coachMoreButton7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton7.addActionListener(e -> coachMoreButton7ActionPerformed(e));
                coach7.add(coachMoreButton7);
                coachMoreButton7.setBounds(100, 60, 65, 25);

                //---- coachGender7 ----
                coachGender7.setText("Female");
                coachGender7.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender7.setBackground(SystemColor.menu);
                coachGender7.setForeground(Color.gray);
                coach7.add(coachGender7);
                coachGender7.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach7.getComponentCount(); i++) {
                        Rectangle bounds = coach7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach7.setMinimumSize(preferredSize);
                    coach7.setPreferredSize(preferredSize);
                }
            }
            body.add(coach7);
            coach7.setBounds(405, 540, 175, 100);

            //======== coach8 ========
            {
                coach8.setBackground(SystemColor.window);
                coach8.setBorder(new LineBorder(Color.lightGray));
                coach8.setLayout(null);

                //---- coachAvatar8 ----
                coachAvatar8.setBackground(Color.white);
                coachAvatar8.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                coachAvatar8.setHorizontalAlignment(SwingConstants.CENTER);
                coach8.add(coachAvatar8);
                coachAvatar8.setBounds(10, 10, 75, 75);

                //---- coachName8 ----
                coachName8.setText("First Name");
                coachName8.setFont(coachName8.getFont().deriveFont(coachName8.getFont().getStyle() | Font.BOLD, coachName8.getFont().getSize() + 2f));
                coachName8.setBackground(SystemColor.menu);
                coach8.add(coachName8);
                coachName8.setBounds(90, 10, 80, coachName8.getPreferredSize().height);

                //---- coachMoreButton8 ----
                coachMoreButton8.setText("MORE");
                coachMoreButton8.setBackground(SystemColor.menu);
                coachMoreButton8.setBorderPainted(false);
                coachMoreButton8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton8.addActionListener(e -> coachMoreButton8ActionPerformed(e));
                coach8.add(coachMoreButton8);
                coachMoreButton8.setBounds(100, 60, 65, 25);

                //---- coachGender8 ----
                coachGender8.setText("Female");
                coachGender8.setFont(new Font("Arial", Font.ITALIC, 12));
                coachGender8.setBackground(SystemColor.menu);
                coachGender8.setForeground(Color.gray);
                coach8.add(coachGender8);
                coachGender8.setBounds(90, 31, 45, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coach8.getComponentCount(); i++) {
                        Rectangle bounds = coach8.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coach8.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coach8.setMinimumSize(preferredSize);
                    coach8.setPreferredSize(preferredSize);
                }
            }
            body.add(coach8);
            coach8.setBounds(590, 540, 175, 100);

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
    private JLabel MembetTip;
    private JButton memberNextButton;
    private JPanel client1;
    private JLabel clientAvatar1;
    private JLabel clientName1;
    private JLabel clientGender1;
    private JButton memberMoreButton1;
    private JLabel decorationLine2;
    private JLabel coachTips;
    private JPanel coach1;
    private JLabel coachAvatar1;
    private JLabel coachName1;
    private JButton coachMoreButton1;
    private JLabel coachGender1;
    private JButton memberPrevButton;
    private JButton coachPrevButton;
    private JButton coachNextButton;
    private JPanel client2;
    private JLabel clientAvatar2;
    private JLabel clientName2;
    private JLabel clientGender2;
    private JButton memberMoreButton2;
    private JPanel client3;
    private JLabel clientAvatar3;
    private JLabel clientName3;
    private JLabel clientGender3;
    private JButton memberMoreButton3;
    private JPanel client4;
    private JLabel clientAvatar4;
    private JLabel clientName4;
    private JLabel clientGender4;
    private JButton memberMoreButton4;
    private JPanel client5;
    private JLabel clientAvatar5;
    private JLabel clientName5;
    private JLabel clientGender5;
    private JButton memberMoreButton5;
    private JPanel client6;
    private JLabel clientAvatar6;
    private JLabel clientName6;
    private JLabel clientGender6;
    private JButton memberMoreButton6;
    private JPanel client7;
    private JLabel clientAvatar7;
    private JLabel clientName7;
    private JLabel clientGender7;
    private JButton memberMoreButton7;
    private JPanel client8;
    private JLabel clientAvatar8;
    private JLabel clientName8;
    private JLabel clientGender8;
    private JButton memberMoreButton8;
    private JPanel coach2;
    private JLabel coachAvatar2;
    private JLabel coachName2;
    private JButton coachMoreButton2;
    private JLabel coachGender2;
    private JPanel coach3;
    private JLabel coachAvatar3;
    private JLabel coachName3;
    private JButton coachMoreButton3;
    private JLabel coachGender3;
    private JPanel coach4;
    private JLabel coachAvatar4;
    private JLabel coachName4;
    private JButton coachMoreButton4;
    private JLabel coachGender4;
    private JPanel coach5;
    private JLabel coachAvatar5;
    private JLabel coachName5;
    private JButton coachMoreButton5;
    private JLabel coachGender5;
    private JPanel coach6;
    private JLabel coachAvatar6;
    private JLabel coachName6;
    private JButton coachMoreButton6;
    private JLabel coachGender6;
    private JPanel coach7;
    private JLabel coachAvatar7;
    private JLabel coachName7;
    private JButton coachMoreButton7;
    private JLabel coachGender7;
    private JPanel coach8;
    private JLabel coachAvatar8;
    private JLabel coachName8;
    private JButton coachMoreButton8;
    private JLabel coachGender8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        UserManageAllAdmin.run();
    }

    private int pageClient = 0;
    private int pageCoach = 0;
    private List<ClientData> clientList;
    private List<CoachData> coachList;
    private int clientRemainNumb = 0;
    private int coachRemainNumb = 0;

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserManageAllAdmin frame = new UserManageAllAdmin();
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
        this.clientList = ClientFunction.getWholeClient();
        this.coachList = CoachFunction.getWholeCoach();
        this.updateClient();
        this.updateCoach();
    }
    private void updateClient(){
        int i = 0;
        int remainPage = this.clientList.size() - this.pageClient * 8;
        ClientData[] clientData = new ClientData[8];

        switch (this.clientRemainNumb){
            case 0:
                break;
            case 1:
                this.clientName2.setOpaque(false);
                this.clientGender2.setOpaque(false);
                this.memberMoreButton2.setVisible(true);
            case 2:
                this.clientName3.setOpaque(false);
                this.clientGender3.setOpaque(false);
                this.memberMoreButton3.setVisible(true);
            case 3:
                this.clientName4.setOpaque(false);
                this.clientGender4.setOpaque(false);
                this.memberMoreButton4.setVisible(true);
            case 4:
                this.clientName5.setOpaque(false);
                this.clientGender5.setOpaque(false);
                this.memberMoreButton5.setVisible(true);
            case 5:
                this.clientName6.setOpaque(false);
                this.clientGender6.setOpaque(false);
                this.memberMoreButton6.setVisible(true);
            case 6:
                this.clientName7.setOpaque(false);
                this.clientGender7.setOpaque(false);
                this.memberMoreButton7.setVisible(true);
            case 7:
                this.clientName8.setOpaque(false);
                this.clientGender8.setOpaque(false);
                this.memberMoreButton8.setVisible(true);

        }

        if((remainPage / 8) > 0){
            for(i = 0; i < 8; i++){
                clientData[i] = this.clientList.get(i + this.pageClient*6);
            }
            this.clientName1.setText(clientData[0].getName());
            this.clientGender1.setText(clientData[0].getSex());

            this.clientName2.setText(clientData[1].getName());
            this.clientGender2.setText(clientData[1].getSex());

            this.clientName3.setText(clientData[2].getName());
            this.clientGender3.setText(clientData[2].getSex());

            this.clientName4.setText(clientData[3].getName());
            this.clientGender4.setText(clientData[3].getSex());

            this.clientName5.setText(clientData[4].getName());
            this.clientGender5.setText(clientData[4].getSex());

            this.clientName6.setText(clientData[5].getName());
            this.clientGender6.setText(clientData[5].getSex());

            this.clientName7.setText(clientData[6].getName());
            this.clientGender7.setText(clientData[6].getSex());

            this.clientName8.setText(clientData[7].getName());
            this.clientGender8.setText(clientData[7].getSex());

        }else{
            this.clientRemainNumb = this.clientList.size() % 8;
            for(i = 0; i < clientRemainNumb; i++){
                clientData[i] = this.clientList.get(i + this.pageClient * 8);
            }
            //Set text for the remaining client
            switch (clientRemainNumb){
                case 7:
                    this.clientName7.setText(clientData[6].getName());
                    this.clientGender7.setText(clientData[6].getSex());
                case 6:
                    this.clientName6.setText(clientData[5].getName());
                    this.clientGender6.setText(clientData[5].getSex());
                case 5:
                    this.clientName5.setText(clientData[4].getName());
                    this.clientGender5.setText(clientData[4].getSex());
                case 4:
                    this.clientName4.setText(clientData[3].getName());
                    this.clientGender4.setText(clientData[3].getSex());
                case 3:
                    this.clientName3.setText(clientData[2].getName());
                    this.clientGender3.setText(clientData[2].getSex());
                case 2:
                    this.clientName2.setText(clientData[1].getName());
                    this.clientGender2.setText(clientData[1].getSex());
                case 1:
                    this.clientName1.setText(clientData[0].getName());
                    this.clientGender1.setText(clientData[0].getSex());
            }
            //Set style for the remaining clients
            switch (clientRemainNumb){
                case 1:
                    this.clientName2.setText("");
                    this.clientName2.setBackground(new Color(230,230,230));
                    this.clientName2.setOpaque(true);
                    this.clientGender2.setText("");
                    this.clientGender2.setBackground(new Color(230,230,230));
                    this.clientGender2.setOpaque(true);
                    this.memberMoreButton2.setVisible(false);
                case 2:
                    this.clientName3.setText("");
                    this.clientName3.setBackground(new Color(230,230,230));
                    this.clientName3.setOpaque(true);
                    this.clientGender3.setText("");
                    this.clientGender3.setBackground(new Color(230,230,230));
                    this.clientGender3.setOpaque(true);
                    this.memberMoreButton3.setVisible(false);
                case 3:
                    this.clientName4.setText("");
                    this.clientName4.setBackground(new Color(230,230,230));
                    this.clientName4.setOpaque(true);
                    this.clientGender4.setText("");
                    this.clientGender4.setBackground(new Color(230,230,230));
                    this.clientGender4.setOpaque(true);
                    this.memberMoreButton4.setVisible(false);
                case 4:
                    this.clientName5.setText("");
                    this.clientName5.setBackground(new Color(230,230,230));
                    this.clientName5.setOpaque(true);
                    this.clientGender5.setText("");
                    this.clientGender5.setBackground(new Color(230,230,230));
                    this.clientGender5.setOpaque(true);
                    this.memberMoreButton5.setVisible(false);
                case 5:
                    this.clientName6.setText("");
                    this.clientName6.setBackground(new Color(230,230,230));
                    this.clientName6.setOpaque(true);
                    this.clientGender6.setText("");
                    this.clientGender6.setBackground(new Color(230,230,230));
                    this.clientGender6.setOpaque(true);
                    this.memberMoreButton6.setVisible(false);
                case 6:
                    this.clientName7.setText("");
                    this.clientName7.setBackground(new Color(230,230,230));
                    this.clientName7.setOpaque(true);
                    this.clientGender7.setText("");
                    this.clientGender7.setBackground(new Color(230,230,230));
                    this.clientGender7.setOpaque(true);
                    this.memberMoreButton7.setVisible(false);
                case 7:
                    this.clientName8.setText("");
                    this.clientName8.setBackground(new Color(230,230,230));
                    this.clientName8.setOpaque(true);
                    this.clientGender8.setText("");
                    this.clientGender8.setBackground(new Color(230,230,230));
                    this.clientGender8.setOpaque(true);
                    this.memberMoreButton8.setVisible(false);
            }
        }
    }

    private void updateCoach(){
        int i = 0;
        int remainPage = this.coachList.size() - this.pageCoach * 8;
        CoachData[] coachData = new CoachData[8];

        switch (this.clientRemainNumb){
            case 0:
                break;
            case 1:
                this.coachName2.setOpaque(false);
                this.coachGender2.setOpaque(false);
                this.coachMoreButton2.setVisible(true);
            case 2:
                this.coachName3.setOpaque(false);
                this.coachGender3.setOpaque(false);
                this.coachMoreButton3.setVisible(true);
            case 3:
                this.coachName4.setOpaque(false);
                this.coachGender4.setOpaque(false);
                this.coachMoreButton4.setVisible(true);
            case 4:
                this.coachName5.setOpaque(false);
                this.coachGender5.setOpaque(false);
                this.coachMoreButton5.setVisible(true);
            case 5:
                this.coachName6.setOpaque(false);
                this.coachGender6.setOpaque(false);
                this.coachMoreButton6.setVisible(true);
            case 6:
                this.coachName7.setOpaque(false);
                this.coachGender7.setOpaque(false);
                this.coachMoreButton7.setVisible(true);
            case 7:
                this.coachName8.setOpaque(false);
                this.coachGender8.setOpaque(false);
                this.coachMoreButton8.setVisible(true);

        }

        if((remainPage / 8) > 0){
            for(i = 0; i < 8; i++){
                coachData[i] = this.coachList.get(i + this.pageCoach*8);
            }
            this.coachName1.setText(coachData[0].getName());
            this.coachGender1.setText(coachData[0].getSex());

            this.coachName2.setText(coachData[1].getName());
            this.coachGender2.setText(coachData[1].getSex());

            this.coachName3.setText(coachData[2].getName());
            this.coachGender3.setText(coachData[2].getSex());

            this.coachName4.setText(coachData[3].getName());
            this.coachGender4.setText(coachData[3].getSex());

            this.coachName5.setText(coachData[4].getName());
            this.coachGender5.setText(coachData[4].getSex());

            this.coachName6.setText(coachData[5].getName());
            this.coachGender6.setText(coachData[5].getSex());

            this.coachName7.setText(coachData[6].getName());
            this.coachGender7.setText(coachData[6].getSex());

            this.coachName8.setText(coachData[7].getName());
            this.coachGender8.setText(coachData[7].getSex());

        }else{
            this.coachRemainNumb = this.coachList.size() % 8;
            for(i = 0; i < coachRemainNumb; i++){
                coachData[i] = this.coachList.get(i + this.pageCoach * 8);
            }
            //Set text for the remaining client
            switch (coachRemainNumb){
                case 7:
                    this.coachName7.setText(coachData[6].getName());
                    this.coachGender7.setText(coachData[6].getSex());
                case 6:
                    this.coachName6.setText(coachData[5].getName());
                    this.coachGender6.setText(coachData[5].getSex());
                case 5:
                    this.coachName5.setText(coachData[4].getName());
                    this.coachGender5.setText(coachData[4].getSex());
                case 4:
                    this.coachName4.setText(coachData[3].getName());
                    this.coachGender4.setText(coachData[3].getSex());
                case 3:
                    this.coachName3.setText(coachData[2].getName());
                    this.coachGender3.setText(coachData[2].getSex());
                case 2:
                    this.coachName2.setText(coachData[1].getName());
                    this.coachGender2.setText(coachData[1].getSex());
                case 1:
                    this.coachName1.setText(coachData[0].getName());
                    this.coachGender1.setText(coachData[0].getSex());
            }
            //Set style for the remaining clients
            switch (coachRemainNumb){
                case 1:
                    this.coachName2.setText("");
                    this.coachName2.setBackground(new Color(230,230,230));
                    this.coachName2.setOpaque(true);
                    this.coachGender2.setText("");
                    this.coachGender2.setBackground(new Color(230,230,230));
                    this.coachGender2.setOpaque(true);
                    this.coachMoreButton2.setVisible(false);
                case 2:
                    this.coachName3.setText("");
                    this.coachName3.setBackground(new Color(230,230,230));
                    this.coachName3.setOpaque(true);
                    this.coachGender3.setText("");
                    this.coachGender3.setBackground(new Color(230,230,230));
                    this.coachGender3.setOpaque(true);
                    this.coachMoreButton3.setVisible(false);
                case 3:
                    this.coachName4.setText("");
                    this.coachName4.setBackground(new Color(230,230,230));
                    this.coachName4.setOpaque(true);
                    this.coachGender4.setText("");
                    this.coachGender4.setBackground(new Color(230,230,230));
                    this.coachGender4.setOpaque(true);
                    this.coachMoreButton4.setVisible(false);
                case 4:
                    this.coachName5.setText("");
                    this.coachName5.setBackground(new Color(230,230,230));
                    this.coachName5.setOpaque(true);
                    this.coachGender5.setText("");
                    this.coachGender5.setBackground(new Color(230,230,230));
                    this.coachGender5.setOpaque(true);
                    this.coachMoreButton5.setVisible(false);
                case 5:
                    this.coachName6.setText("");
                    this.coachName6.setBackground(new Color(230,230,230));
                    this.coachName6.setOpaque(true);
                    this.coachGender6.setText("");
                    this.coachGender6.setBackground(new Color(230,230,230));
                    this.coachGender6.setOpaque(true);
                    this.coachMoreButton6.setVisible(false);
                case 6:
                    this.coachName7.setText("");
                    this.coachName7.setBackground(new Color(230,230,230));
                    this.coachName7.setOpaque(true);
                    this.coachGender7.setText("");
                    this.coachGender7.setBackground(new Color(230,230,230));
                    this.coachGender7.setOpaque(true);
                    this.coachMoreButton7.setVisible(false);
                case 7:
                    this.coachName8.setText("");
                    this.coachName8.setBackground(new Color(230,230,230));
                    this.coachName8.setOpaque(true);
                    this.coachGender8.setText("");
                    this.coachGender8.setBackground(new Color(230,230,230));
                    this.coachGender8.setOpaque(true);
                    this.coachMoreButton8.setVisible(false);
            }
        }
    }
}
