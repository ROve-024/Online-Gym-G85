package gui.coach;

import controller.ClassFunction;
import gui.other.LessonBuffer;
import io.classes.ClassData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Apr 09 11:08:16 CST 2021
 */


/**
 * @author Anna
 */
public class UploadModify extends JFrame {
    public UploadModify() {
        initComponents();
    }

    private void finishButtonActionPerformed(ActionEvent e) {
        // TODO add your code here

        LessonDetailCoach.run();
        this.dispose();
    }

    private void deleteButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        ClassFunction.deleteClassByID(lessonID);
        MyLessonCoach.run();
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        finishButton = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        videoSelectedButton = new JButton();
        deleteButton = new JButton();

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

            //---- finishButton ----
            finishButton.setBorderPainted(false);
            finishButton.setBackground(SystemColor.textHighlight);
            finishButton.setText("UPLOAD");
            finishButton.setForeground(Color.white);
            finishButton.addActionListener(e -> finishButtonActionPerformed(e));
            body.add(finishButton);
            finishButton.setBounds(35, 585, 90, 40);

            //---- label1 ----
            label1.setText("Lesson Title");
            label1.setBackground(Color.white);
            label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label1);
            label1.setBounds(35, 135, 130, label1.getPreferredSize().height);

            //---- textField1 ----
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            textField1.setMargin(new Insets(2, 10, 2, 6));
            textField1.setBorder(new EmptyBorder(5, 10, 5, 0));
            textField1.setCaretColor(Color.darkGray);
            textField1.setBackground(new Color(245, 245, 245));
            body.add(textField1);
            textField1.setBounds(35, 165, 730, textField1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("Lesson Description");
            label2.setBackground(Color.white);
            label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label2);
            label2.setBounds(35, 205, 265, 24);

            //======== scrollPane1 ========
            {

                //---- textArea1 ----
                textArea1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
                textArea1.setMargin(new Insets(5, 10, 5, 10));
                textArea1.setBorder(new EmptyBorder(5, 10, 5, 0));
                textArea1.setCaretColor(Color.darkGray);
                textArea1.setBackground(new Color(245, 245, 245));
                scrollPane1.setViewportView(textArea1);
            }
            body.add(scrollPane1);
            scrollPane1.setBounds(35, 235, 730, 235);

            //---- videoSelectedButton ----
            videoSelectedButton.setBorderPainted(false);
            videoSelectedButton.setBackground(new Color(220, 220, 220));
            videoSelectedButton.setText("SELECT A FILE");
            videoSelectedButton.setForeground(Color.white);
            body.add(videoSelectedButton);
            videoSelectedButton.setBounds(35, 485, 175, 40);

            //---- deleteButton ----
            deleteButton.setBorderPainted(false);
            deleteButton.setBackground(new Color(240, 128, 128));
            deleteButton.setText("DELETE");
            deleteButton.setForeground(Color.white);
            deleteButton.addActionListener(e -> deleteButtonActionPerformed(e));
            body.add(deleteButton);
            deleteButton.setBounds(130, 585, 90, 40);

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
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton videoSelectedButton;
    private JButton deleteButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        UploadModify.run();
    }

    private String lessonID = LessonBuffer.getBuffer();
    ClassData classData = ClassFunction.searchClassByID(this.lessonID);

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UploadModify frame = new UploadModify();
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
