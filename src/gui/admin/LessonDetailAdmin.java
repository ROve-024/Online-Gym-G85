package gui.admin;

import controller.ClassFunction;
import controller.CoachFunction;
import controller.PlanFunction;
import gui.coach.ProfileCoach;
import gui.others.LessonBuffer;
import io.classes.ClassData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 19:38:51 CST 2021
 */


/**
 * <p>
 *     This class provides course details.
 * </p>
 * @author Anna
 */
public class LessonDetailAdmin extends JFrame {
    public LessonDetailAdmin() {
        initComponents();
    }

    /**
     * <p>
     *     This function allows administrators to modify lesson information.
     * </p>
     * @param e
     */
    private void editButtonActionPerformed(ActionEvent e) {
        UploadModify.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function allows the administrator to view the details of the coach in charge of the lesson.
     * </p>
     * @param e
     */
    private void coachDetailButtonActionPerformed(ActionEvent e) {
        ProfileCoach.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function returns a list of courses.
     * </p>
     * @param e
     */
    private void homeButtonActionPerformed(ActionEvent e) {
        ALLLessonAdmin.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function allows the administrator to delete the class.
     * </p>
     * @param e
     */
    private void deleteButtonActionPerformed(ActionEvent e) {
        System.out.println("删除lesson：ID="+lessonID);
        ClassFunction.deleteClassByID(lessonID);
        PlanFunction.deletePlanByClassID(lessonID);
        ALLLessonAdmin.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
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
        coachDetailButton = new JButton();
        editButton = new JButton();
        deleteButton = new JButton();
        homeButton = new JButton();
        lessonType = new JLabel();
        needVIP = new JLabel();

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
            lessonPicture.setBackground(SystemColor.menu);
            lessonPicture.setIcon(null);
            body.add(lessonPicture);
            lessonPicture.setBounds(30, 165, 300, 250);

            //---- lessonName ----
            lessonName.setText("Lesson Name");
            lessonName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 32));
            lessonName.setBackground(Color.white);
            body.add(lessonName);
            lessonName.setBounds(350, 155, 320, 42);

            //---- lessonMsg ----
            lessonMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessonMsg.setBackground(Color.white);
            lessonMsg.setBorder(null);
            lessonMsg.setCaretColor(Color.white);
            lessonMsg.setDisabledTextColor(Color.white);
            lessonMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessonMsg.setEditable(false);
            body.add(lessonMsg);
            lessonMsg.setBounds(350, 240, 398, 175);

            //---- coachAvatar ----
            coachAvatar.setBorder(new LineBorder(Color.white));
            coachAvatar.setHorizontalAlignment(SwingConstants.CENTER);
            coachAvatar.setIcon(null);
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

            //---- coachDetailButton ----
            coachDetailButton.setText("DETAIL");
            coachDetailButton.setBackground(SystemColor.menu);
            coachDetailButton.setBorder(null);
            coachDetailButton.addActionListener(e -> coachDetailButtonActionPerformed(e));
            body.add(coachDetailButton);
            coachDetailButton.setBounds(660, 460, 100, 50);

            //---- editButton ----
            editButton.setText("EDITOR");
            editButton.setBackground(SystemColor.menu);
            editButton.setBorder(null);
            editButton.addActionListener(e -> editButtonActionPerformed(e));
            body.add(editButton);
            editButton.setBounds(30, 570, 100, 50);

            //---- deleteButton ----
            deleteButton.setText("DELETE");
            deleteButton.setBackground(new Color(217, 0, 27));
            deleteButton.setBorder(null);
            deleteButton.setForeground(Color.white);
            deleteButton.addActionListener(e -> deleteButtonActionPerformed(e));
            body.add(deleteButton);
            deleteButton.setBounds(130, 570, 100, 50);

            //---- homeButton ----
            homeButton.setBorderPainted(false);
            homeButton.setBackground(SystemColor.menu);
            homeButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
            homeButton.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton);
            homeButton.setBounds(675, 45, 100, 40);

            //---- lessonType ----
            lessonType.setText("lessonType");
            lessonType.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            body.add(lessonType);
            lessonType.setBounds(350, 210, 400, lessonType.getPreferredSize().height);

            //---- needVIP ----
            needVIP.setText("VIP");
            needVIP.setBackground(Color.white);
            needVIP.setForeground(new Color(255, 100, 100));
            needVIP.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 16));
            body.add(needVIP);
            needVIP.setBounds(685, 175, 70, needVIP.getPreferredSize().height);

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
    private JButton coachDetailButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton homeButton;
    private JLabel lessonType;
    private JLabel needVIP;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonDetailAdmin.run();
    }

    private String lessonID = LessonBuffer.getBuffer();
    ClassData classData = ClassFunction.searchClassByID(this.lessonID);

    /**
     * <p>
     *     This function provides the ability to run.
     * </p>
     */
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonDetailAdmin frame = new LessonDetailAdmin();
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

    /**
     * <p>
     *     This function initializes the contents of the GUI.
     * </p>
     */
    private void init(){
        this.lessonName.setText(this.classData.getName());
        this.needVIP.setText("VIP " + this.classData.getVIPLevel());
        this.lessonMsg.setText(this.classData.getDetail());
        this.lessonType.setText(this.classData.getCategory());
        CoachData coachData = CoachFunction.searchCoachByID(this.classData.getCoachID());
        this.coachName.setText("Name: " + coachData.getName());
        this.coachMsg.setText("Phome: " + coachData.getPhonenumber());
        try{
            this.coachAvatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/" + coachData.getFileAddress())));
        }catch (NullPointerException miss){
            this.coachAvatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/404.jpg")));
        }
        try{
            this.lessonPicture.setIcon(new ImageIcon(getClass().getResource("/resources/images/lessonPic/" + classData.getFileAddress())));
        }catch (NullPointerException miss){
            this.lessonPicture.setIcon(new ImageIcon(getClass().getResource("/resources/images/lessonPic/404.png")));
        }
    }
}
