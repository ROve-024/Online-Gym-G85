package gui.coach;

import controller.ClassFunction;
import controller.CoachFunction;
import gui.other.LessonBuffer;
import io.classes.ClassData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 16:56:55 CST 2021
 */


/**
 * @author Anna
 */
public class LessonDetailCoach extends JFrame {
    public LessonDetailCoach() {
        initComponents();
    }

    private void editButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        UploadModify.run();
        this.dispose();
    }

    private void homeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        MyLessonCoach.run();
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        lessonPicture = new JLabel();
        lessonName = new JLabel();
        lessonMsg = new JTextPane();
        coachAvatar = new JLabel();
        coachName = new JLabel();
        coachMsg = new JTextPane();
        editButton = new JButton();
        homeButton = new JButton();
        lessonType = new JLabel();

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
            title.setText("Detail of Lesson ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- lessonPicture ----
            lessonPicture.setBorder(new LineBorder(Color.lightGray));
            lessonPicture.setHorizontalAlignment(SwingConstants.CENTER);
            lessonPicture.setIcon(new ImageIcon(getClass().getResource("/resources/images/lessonPic/synthesize.png")));
            body.add(lessonPicture);
            lessonPicture.setBounds(30, 165, 300, 251);

            //---- lessonName ----
            lessonName.setText("Lesson Name");
            lessonName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 32));
            lessonName.setBackground(Color.white);
            body.add(lessonName);
            lessonName.setBounds(350, 165, 267, 42);

            //---- lessonMsg ----
            lessonMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessonMsg.setBackground(Color.white);
            lessonMsg.setBorder(null);
            lessonMsg.setCaretColor(Color.white);
            lessonMsg.setDisabledTextColor(Color.white);
            lessonMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessonMsg.setEditable(false);
            body.add(lessonMsg);
            lessonMsg.setBounds(350, 215, 398, 130);

            //---- coachAvatar ----
            coachAvatar.setBorder(new LineBorder(Color.white));
            coachAvatar.setHorizontalAlignment(SwingConstants.CENTER);
            coachAvatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (10).jpg")));
            body.add(coachAvatar);
            coachAvatar.setBounds(30, 440, 75, 75);

            //---- coachName ----
            coachName.setText("Coach Name");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName.setBackground(Color.white);
            body.add(coachName);
            coachName.setBounds(115, 440, 190, 42);

            //---- coachMsg ----
            coachMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo.");
            coachMsg.setBackground(Color.white);
            coachMsg.setBorder(null);
            coachMsg.setCaretColor(Color.white);
            coachMsg.setDisabledTextColor(Color.white);
            coachMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            coachMsg.setEditable(false);
            body.add(coachMsg);
            coachMsg.setBounds(115, 475, 525, 45);

            //---- editButton ----
            editButton.setText("EDIT");
            editButton.setBackground(new Color(217, 0, 27));
            editButton.setBorder(null);
            editButton.setForeground(Color.white);
            editButton.addActionListener(e -> editButtonActionPerformed(e));
            body.add(editButton);
            editButton.setBounds(30, 570, 100, 50);

            //---- homeButton ----
            homeButton.setBorderPainted(false);
            homeButton.setBackground(SystemColor.menu);
            homeButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
            homeButton.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton);
            homeButton.setBounds(675, 45, 100, 40);

            //---- lessonType ----
            lessonType.setText("Type");
            lessonType.setBackground(new Color(240, 128, 128));
            body.add(lessonType);
            lessonType.setBounds(350, 345, 75, lessonType.getPreferredSize().height);

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
    private JTextPane lessonMsg;
    private JLabel coachAvatar;
    private JLabel coachName;
    private JTextPane coachMsg;
    private JButton editButton;
    private JButton homeButton;
    private JLabel lessonType;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonDetailCoach.run();
    }

    private String lessonID = LessonBuffer.getBuffer();
    ClassData classData = ClassFunction.searchClassByID(this.lessonID);

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonDetailCoach frame = new LessonDetailCoach();
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
        this.lessonName.setText(this.classData.getName());
//        this.lessonMsg.setText();
        this.lessonType.setText(this.classData.getProfile());
        CoachData coachData = CoachFunction.searchCoachByID(this.classData.getCoachID());
        this.coachName.setText(coachData.getName());
//        this.coachMsg.setText();

    }
}
