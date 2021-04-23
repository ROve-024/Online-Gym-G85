package GUI.Member;

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
        this.dispose();
        LessonHomeMember.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        panel1 = new JPanel();
        lessonName = new JLabel();
        lessionMsg = new JTextPane();
        lessonHomeButton = new JButton();

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

            //---- lessionMsg ----
            lessionMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessionMsg.setBackground(Color.white);
            lessionMsg.setBorder(null);
            lessionMsg.setCaretColor(Color.white);
            lessionMsg.setDisabledTextColor(Color.white);
            lessionMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessionMsg.setEditable(false);
            body.add(lessionMsg);
            lessionMsg.setBounds(30, 535, 750, 138);

            //---- lessonHomeButton ----
            lessonHomeButton.setBorderPainted(false);
            lessonHomeButton.setBackground(SystemColor.textHighlight);
            lessonHomeButton.setText("LESSON HOME");
            lessonHomeButton.setForeground(Color.white);
            lessonHomeButton.addActionListener(e -> lessonHomeButtonActionPerformed(e));
            body.add(lessonHomeButton);
            lessonHomeButton.setBounds(640, 45, 140, 40);

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
    private JTextPane lessionMsg;
    private JButton lessonHomeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonVideo.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonVideo frame = new LessonVideo();
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
