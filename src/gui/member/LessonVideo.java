package gui.member;

import controller.ClassFunction;
import gui.other.LessonBuffer;
import io.classes.ClassData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 21:24:43 CST 2021
 */


/**
 * @author Anna
 */
public class LessonVideo extends JFrame {
    public LessonVideo() {
        initComponents();
    }

    private void lessonHomeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonHomeMember.run();
        this.dispose();
    }

    private void homeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonHomeMember.run();
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        panel1 = new JPanel();
        lessonName = new JLabel();
        lessonMsg = new JTextPane();
        homeButton2 = new JButton();
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
            title.setText("Lesson Video");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //======== panel1 ========
            {
                panel1.setBackground(SystemColor.menu);
                panel1.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            body.add(panel1);
            panel1.setBounds(30, 130, 750, 350);

            //---- lessonName ----
            lessonName.setText("Lesson Name");
            lessonName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 32));
            lessonName.setBackground(Color.white);
            body.add(lessonName);
            lessonName.setBounds(30, 485, 267, 42);

            //---- lessonMsg ----
            lessonMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessonMsg.setBackground(Color.white);
            lessonMsg.setBorder(null);
            lessonMsg.setCaretColor(Color.white);
            lessonMsg.setDisabledTextColor(Color.white);
            lessonMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessonMsg.setEditable(false);
            body.add(lessonMsg);
            lessonMsg.setBounds(30, 535, 750, 138);

            //---- homeButton2 ----
            homeButton2.setBorderPainted(false);
            homeButton2.setBackground(SystemColor.menu);
            homeButton2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
            homeButton2.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton2);
            homeButton2.setBounds(675, 45, 100, 40);

            //---- lessonType ----
            lessonType.setText("Lesson Type");
            lessonType.setBackground(Color.white);
            lessonType.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            body.add(lessonType);
            lessonType.setBounds(305, 500, 125, lessonType.getPreferredSize().height);

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
    private JPanel panel1;
    private JLabel lessonName;
    private JTextPane lessonMsg;
    private JButton homeButton2;
    private JLabel lessonType;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonVideo.run();
    }

    private String lessonID = LessonBuffer.getBuffer();
    ClassData classData = ClassFunction.searchClassByID(this.lessonID);

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonVideo frame = new LessonVideo();
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
    private void init() {
        this.lessonName.setText(this.classData.getName());
        this.lessonMsg.setText(this.classData.getDetail());
        this.lessonType.setText(this.classData.getCategory());
    }
}
