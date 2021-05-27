package gui.coach;

import controller.ClassFunction;
import gui.other.LessonBuffer;
import gui.other.UserBuffer;
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
        ClassData classData = LessonBuffer.getLessonBuffer();
        classData.setName(LessonBuffer.toEmpty(this.className.getText()));
        classData.setDetail(LessonBuffer.toEmpty(this.classDetail.getText()));
        classData.setCategory(LessonBuffer.toEmpty(this.classCategory.getText()));
        classData.setVedioAddress(LessonBuffer.toEmpty(this.classVedio.getText()));
        classData.setFileAddress(LessonBuffer.toEmpty(this.classFile.getText()));
        classData.setVIPLevel(LessonBuffer.toEmpty(this.needVIP.getSelectedItem().toString()));
        ClassFunction.updateClassInfo(classData);
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
        className = new JTextField();
        label2 = new JLabel();
        classDetail = new JTextField();
        videoSelectedButton = new JButton();
        deleteButton = new JButton();
        label3 = new JLabel();
        classCategory = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        needVIP = new JComboBox<>();
        label6 = new JLabel();
        classVedio = new JTextField();
        label7 = new JLabel();
        classFile = new JTextField();

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

            //---- className ----
            className.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            className.setMargin(new Insets(2, 10, 2, 6));
            className.setBorder(new EmptyBorder(5, 10, 5, 10));
            className.setCaretColor(Color.darkGray);
            className.setBackground(new Color(245, 245, 245));
            body.add(className);
            className.setBounds(35, 165, 730, 40);

            //---- label2 ----
            label2.setText("Lesson Description");
            label2.setBackground(Color.white);
            label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label2);
            label2.setBounds(35, 205, 265, 24);

            //---- classDetail ----
            classDetail.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            classDetail.setMargin(new Insets(5, 10, 5, 10));
            classDetail.setBorder(new EmptyBorder(5, 10, 5, 10));
            classDetail.setCaretColor(Color.darkGray);
            classDetail.setBackground(new Color(245, 245, 245));
            body.add(classDetail);
            classDetail.setBounds(35, 235, 730, 40);

            //---- videoSelectedButton ----
            videoSelectedButton.setBorderPainted(false);
            videoSelectedButton.setBackground(new Color(220, 220, 220));
            videoSelectedButton.setText("SELECT A FILE");
            videoSelectedButton.setForeground(Color.white);
            body.add(videoSelectedButton);
            videoSelectedButton.setBounds(35, 520, 175, 40);

            //---- deleteButton ----
            deleteButton.setBorderPainted(false);
            deleteButton.setBackground(new Color(240, 128, 128));
            deleteButton.setText("DELETE");
            deleteButton.setForeground(Color.white);
            deleteButton.addActionListener(e -> deleteButtonActionPerformed(e));
            body.add(deleteButton);
            deleteButton.setBounds(130, 585, 90, 40);

            //---- label3 ----
            label3.setText("Lessom Type");
            label3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label3);
            label3.setBounds(35, 285, 260, 25);

            //---- classCategory ----
            classCategory.setBackground(new Color(245, 245, 245));
            classCategory.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            classCategory.setCaretColor(Color.darkGray);
            classCategory.setBorder(new EmptyBorder(5, 10, 5, 10));
            body.add(classCategory);
            classCategory.setBounds(35, 310, 730, 40);

            //---- label4 ----
            label4.setText("VIP Level");
            label4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label4);
            label4.setBounds(35, 360, 390, label4.getPreferredSize().height);

            //---- label5 ----
            label5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label5);
            label5.setBounds(40, 440, 365, label5.getPreferredSize().height);

            //---- needVIP ----
            needVIP.setMaximumRowCount(4);
            needVIP.setModel(new DefaultComboBoxModel<>(new String[] {
                "0",
                "1",
                "2",
                "3"
            }));
            needVIP.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            needVIP.setBackground(new Color(245, 245, 245));
            body.add(needVIP);
            needVIP.setBounds(35, 385, 730, 40);

            //---- label6 ----
            label6.setText("Vedio Address");
            label6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label6);
            label6.setBounds(35, 460, 190, label6.getPreferredSize().height);

            //---- classVedio ----
            classVedio.setBackground(new Color(245, 245, 245));
            classVedio.setBorder(new EmptyBorder(5, 10, 5, 10));
            classVedio.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            body.add(classVedio);
            classVedio.setBounds(180, 455, 210, 40);

            //---- label7 ----
            label7.setText("File Address");
            label7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
            body.add(label7);
            label7.setBounds(425, 460, 190, label7.getPreferredSize().height);

            //---- classFile ----
            classFile.setBackground(new Color(245, 245, 245));
            classFile.setBorder(new EmptyBorder(5, 10, 5, 10));
            classFile.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            body.add(classFile);
            classFile.setBounds(550, 455, 210, 40);

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
        body.setBounds(5, 0, 800, 655);

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
    private JTextField className;
    private JLabel label2;
    private JTextField classDetail;
    private JButton videoSelectedButton;
    private JButton deleteButton;
    private JLabel label3;
    private JTextField classCategory;
    private JLabel label4;
    private JLabel label5;
    private JComboBox<String> needVIP;
    private JLabel label6;
    private JTextField classVedio;
    private JLabel label7;
    private JTextField classFile;
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
        String ID = LessonBuffer.getBuffer();
        ClassData classData = LessonBuffer.getLessonBuffer();
        System.out.println(classData);
        this.className.setText(LessonBuffer.dataIsEmpty(classData.getName()));
        this.classDetail.setText(LessonBuffer.dataIsEmpty(classData.getDetail()));
        this.classCategory.setText(LessonBuffer.dataIsEmpty(classData.getCategory()));
        this.classVedio.setText(LessonBuffer.dataIsEmpty(classData.getVedioAddress()));
        this.classFile.setText(LessonBuffer.dataIsEmpty(classData.getFileAddress()));
        this.needVIP.setSelectedItem(LessonBuffer.dataIsEmpty(classData.getVIPLevel()));
        //String isLive = classData.getIsLive();

    }
}
