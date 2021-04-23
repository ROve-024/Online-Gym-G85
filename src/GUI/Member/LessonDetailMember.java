/*
 * Created by JFormDesigner on Fri Apr 23 10:41:24 CST 2021
 */

package GUI.Member;

import GUI.Coach.ViewCoachProfile;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class LessonDetailMember extends JFrame {
    public LessonDetailMember() {
        initComponents();
    }

    private void joinButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        LessonVideo.run();
    }

    private void bookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        Book.run();
    }

    private void coachDetailButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        ViewCoachProfile.run();
    }

    private void homeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        LessonHomeMember.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        lessonPicture = new JLabel();
        lessonName = new JLabel();
        lessionMsg = new JTextPane();
        joinButton = new JButton();
        bookButton = new JButton();
        coachAvatar = new JLabel();
        coachName = new JLabel();
        coachMsg = new JTextPane();
        coachDetailButton = new JButton();
        homeButton = new JButton();

        //======== this ========
        setBackground(Color.white);
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
            title.setText("Detail of Lesson ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- lessonPicture ----
            lessonPicture.setText("Lesson Picture");
            lessonPicture.setBorder(LineBorder.createBlackLineBorder());
            lessonPicture.setHorizontalAlignment(SwingConstants.CENTER);
            body.add(lessonPicture);
            lessonPicture.setBounds(30, 165, 300, 251);

            //---- lessonName ----
            lessonName.setText("Lesson Name");
            lessonName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 32));
            lessonName.setBackground(Color.white);
            body.add(lessonName);
            lessonName.setBounds(350, 165, 267, 42);

            //---- lessionMsg ----
            lessionMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessionMsg.setBackground(Color.white);
            lessionMsg.setBorder(null);
            lessionMsg.setCaretColor(Color.white);
            lessionMsg.setDisabledTextColor(Color.white);
            lessionMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessionMsg.setEditable(false);
            body.add(lessionMsg);
            lessionMsg.setBounds(350, 215, 398, 138);

            //---- joinButton ----
            joinButton.setText("JOIN NOW");
            joinButton.setBackground(SystemColor.menu);
            joinButton.setBorder(null);
            joinButton.addActionListener(e -> joinButtonActionPerformed(e));
            body.add(joinButton);
            joinButton.setBounds(350, 365, 100, 50);

            //---- bookButton ----
            bookButton.setText("BOOK(vip)");
            bookButton.setBackground(new Color(217, 0, 27));
            bookButton.setBorder(null);
            bookButton.setForeground(Color.white);
            bookButton.addActionListener(e -> bookButtonActionPerformed(e));
            body.add(bookButton);
            bookButton.setBounds(450, 365, 100, 50);

            //---- coachAvatar ----
            coachAvatar.setText("Coach");
            coachAvatar.setBorder(LineBorder.createBlackLineBorder());
            coachAvatar.setHorizontalAlignment(SwingConstants.CENTER);
            body.add(coachAvatar);
            coachAvatar.setBounds(30, 485, 75, 75);

            //---- coachName ----
            coachName.setText("Coach Name");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName.setBackground(Color.white);
            body.add(coachName);
            coachName.setBounds(115, 485, 190, 42);

            //---- coachMsg ----
            coachMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo.");
            coachMsg.setBackground(Color.white);
            coachMsg.setBorder(null);
            coachMsg.setCaretColor(Color.white);
            coachMsg.setDisabledTextColor(Color.white);
            coachMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            coachMsg.setEditable(false);
            body.add(coachMsg);
            coachMsg.setBounds(115, 520, 530, 45);

            //---- coachDetailButton ----
            coachDetailButton.setText("DETAIL");
            coachDetailButton.setBackground(SystemColor.menu);
            coachDetailButton.setBorder(null);
            coachDetailButton.addActionListener(e -> coachDetailButtonActionPerformed(e));
            body.add(coachDetailButton);
            coachDetailButton.setBounds(650, 505, 100, 50);

            //---- homeButton ----
            homeButton.setText("HOME");
            homeButton.setBackground(SystemColor.menu);
            homeButton.setBorder(null);
            homeButton.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton);
            homeButton.setBounds(665, 45, 100, 50);

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
    private JLabel lessonPicture;
    private JLabel lessonName;
    private JTextPane lessionMsg;
    private JButton joinButton;
    private JButton bookButton;
    private JLabel coachAvatar;
    private JLabel coachName;
    private JTextPane coachMsg;
    private JButton coachDetailButton;
    private JButton homeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonDetailMember.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonDetailMember frame = new LessonDetailMember();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}