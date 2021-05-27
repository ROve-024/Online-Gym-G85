package gui.member;

import controller.ClassFunction;
import controller.CoachFunction;
import gui.coach.MyLessonCoach;
import gui.other.LessonBuffer;
import gui.other.UserBuffer;
import gui.other.Warning;
import io.classes.ClassData;
import io.client.ClientData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Apr 09 12:10:09 CST 2021
 */


/**
 * @author Anna
 */
public class MyLessonMember extends JFrame {
    public MyLessonMember() {
        initComponents();
    }

    private void moreButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void homeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.list = saveList;
        this.page = 0;
        this.update();
    }

    private void previousButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(this.page == 0){
            Warning.run("No previous page here.");
        }
        else{
            this.page--;
            this.update();
        }
    }

    private void nextButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        int remainItem = this.list.size() - 6 * (this.page + 1);

        if(remainItem <= 0){
            Warning.run("No more page here.");
        }
        else{
            this.page++;
            this.update();
        }
    }

    private void moreButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6 + 1).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void moreButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6 + 2).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void moreButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6 + 3).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void moreButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6 + 4).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void moreButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonBuffer.setBuffer("");
        LessonBuffer.setBuffer(this.list.get(this.page*6 + 5).getClassID());
        LessonDetailMember.run();
        this.dispose();
    }

    private void searchButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(this.search.getText().trim().isEmpty()) {
            Warning.run("Please do not input empty content!");
        }
        else {
            list.clear();
            if(this.titleRadioButton.isSelected()){
                list.add(ClassFunction.searchClassByName(this.search.getText()));
            }else if(this.coachRadioButton.isSelected()){
                list = ClassFunction.searchClassByCoachName(this.search.getText());
                //System.out.println(list);
            }else if(this.typeRadioButton.isSelected()){
                list = ClassFunction.searchClassByProfile(this.search.getText());
                //System.out.println(list);
            }
            //System.out.println("4");
            this.update();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        lesson1 = new JPanel();
        lessonPicture1 = new JLabel();
        lessonName1 = new JLabel();
        lessonType1 = new JLabel();
        coachName1 = new JLabel();
        moreButton1 = new JButton();
        lesson2 = new JPanel();
        lessonName2 = new JLabel();
        lessonType2 = new JLabel();
        coachName2 = new JLabel();
        lessonPicture2 = new JLabel();
        moreButton2 = new JButton();
        lesson3 = new JPanel();
        lessonName3 = new JLabel();
        lessonType3 = new JLabel();
        moreButton3 = new JButton();
        coachName3 = new JLabel();
        lessonPicture3 = new JLabel();
        lesson6 = new JPanel();
        lessonName6 = new JLabel();
        lessonType6 = new JLabel();
        moreButton6 = new JButton();
        coachName6 = new JLabel();
        lessonPicture6 = new JLabel();
        lesson5 = new JPanel();
        lessonName5 = new JLabel();
        lessonType5 = new JLabel();
        coachName5 = new JLabel();
        lessonPicture5 = new JLabel();
        moreButton5 = new JButton();
        lesson4 = new JPanel();
        lessonPicture4 = new JLabel();
        lessonName4 = new JLabel();
        lessonType4 = new JLabel();
        coachName4 = new JLabel();
        moreButton4 = new JButton();
        search = new JTextField();
        searchButton = new JButton();
        homeButton = new JButton();
        previousButton = new JButton();
        nextButton = new JButton();
        titleRadioButton = new JRadioButton();
        coachRadioButton = new JRadioButton();
        typeRadioButton = new JRadioButton();

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
            title.setText("My Lesson ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //======== lesson1 ========
            {
                lesson1.setBackground(SystemColor.menu);
                lesson1.setLayout(null);

                //---- lessonPicture1 ----
                lessonPicture1.setBackground(SystemColor.activeCaption);
                lessonPicture1.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson1.add(lessonPicture1);
                lessonPicture1.setBounds(2, 1, 236, 160);

                //---- lessonName1 ----
                lessonName1.setText("Lesson Name");
                lessonName1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName1.setBackground(SystemColor.menu);
                lesson1.add(lessonName1);
                lessonName1.setBounds(5, 165, 195, lessonName1.getPreferredSize().height);

                //---- lessonType1 ----
                lessonType1.setText("Lesson Level");
                lessonType1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType1.setBackground(SystemColor.menu);
                lessonType1.setForeground(new Color(150, 150, 150));
                lesson1.add(lessonType1);
                lessonType1.setBounds(5, 190, 85, 17);

                //---- coachName1 ----
                coachName1.setText("Coach Name");
                coachName1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName1.setBackground(SystemColor.menu);
                coachName1.setForeground(new Color(120, 120, 120));
                lesson1.add(coachName1);
                coachName1.setBounds(5, 225, 85, 17);

                //---- moreButton1 ----
                moreButton1.setText("MORE");
                moreButton1.setBackground(Color.white);
                moreButton1.setBorderPainted(false);
                moreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton1.addActionListener(e -> moreButton1ActionPerformed(e));
                lesson1.add(moreButton1);
                moreButton1.setBounds(170, 220, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson1.getComponentCount(); i++) {
                        Rectangle bounds = lesson1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson1.setMinimumSize(preferredSize);
                    lesson1.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson1);
            lesson1.setBounds(25, 125, 240, 250);

            //======== lesson2 ========
            {
                lesson2.setBackground(SystemColor.menu);
                lesson2.setLayout(null);

                //---- lessonName2 ----
                lessonName2.setText("Lesson Name");
                lessonName2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName2.setBackground(SystemColor.menu);
                lesson2.add(lessonName2);
                lessonName2.setBounds(5, 165, 195, lessonName2.getPreferredSize().height);

                //---- lessonType2 ----
                lessonType2.setText("Lesson Level");
                lessonType2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType2.setBackground(SystemColor.menu);
                lessonType2.setForeground(new Color(150, 150, 150));
                lesson2.add(lessonType2);
                lessonType2.setBounds(5, 190, 85, 17);

                //---- coachName2 ----
                coachName2.setText("Coach Name");
                coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName2.setBackground(SystemColor.menu);
                coachName2.setForeground(new Color(120, 120, 120));
                lesson2.add(coachName2);
                coachName2.setBounds(5, 225, 85, 17);

                //---- lessonPicture2 ----
                lessonPicture2.setBackground(SystemColor.activeCaption);
                lessonPicture2.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson2.add(lessonPicture2);
                lessonPicture2.setBounds(2, 1, 236, 160);

                //---- moreButton2 ----
                moreButton2.setText("MORE");
                moreButton2.setBackground(Color.white);
                moreButton2.setBorderPainted(false);
                moreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton2.addActionListener(e -> moreButton2ActionPerformed(e));
                lesson2.add(moreButton2);
                moreButton2.setBounds(170, 220, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson2.getComponentCount(); i++) {
                        Rectangle bounds = lesson2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson2.setMinimumSize(preferredSize);
                    lesson2.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson2);
            lesson2.setBounds(280, 125, 240, 250);

            //======== lesson3 ========
            {
                lesson3.setBackground(SystemColor.menu);
                lesson3.setLayout(null);

                //---- lessonName3 ----
                lessonName3.setText("Lesson Name");
                lessonName3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName3.setBackground(SystemColor.menu);
                lesson3.add(lessonName3);
                lessonName3.setBounds(5, 165, 195, lessonName3.getPreferredSize().height);

                //---- lessonType3 ----
                lessonType3.setText("Lesson Level");
                lessonType3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType3.setBackground(SystemColor.menu);
                lessonType3.setForeground(new Color(150, 150, 150));
                lesson3.add(lessonType3);
                lessonType3.setBounds(5, 190, 85, 17);

                //---- moreButton3 ----
                moreButton3.setText("MORE");
                moreButton3.setBackground(Color.white);
                moreButton3.setBorderPainted(false);
                moreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton3.addActionListener(e -> moreButton3ActionPerformed(e));
                lesson3.add(moreButton3);
                moreButton3.setBounds(170, 220, 65, 25);

                //---- coachName3 ----
                coachName3.setText("Coach Name");
                coachName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName3.setBackground(SystemColor.menu);
                coachName3.setForeground(new Color(120, 120, 120));
                lesson3.add(coachName3);
                coachName3.setBounds(5, 225, 85, 17);

                //---- lessonPicture3 ----
                lessonPicture3.setBackground(SystemColor.activeCaption);
                lessonPicture3.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson3.add(lessonPicture3);
                lessonPicture3.setBounds(2, 1, 236, 160);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson3.getComponentCount(); i++) {
                        Rectangle bounds = lesson3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson3.setMinimumSize(preferredSize);
                    lesson3.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson3);
            lesson3.setBounds(535, 125, 240, 250);

            //======== lesson6 ========
            {
                lesson6.setBackground(SystemColor.menu);
                lesson6.setLayout(null);

                //---- lessonName6 ----
                lessonName6.setText("Lesson Name");
                lessonName6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName6.setBackground(SystemColor.menu);
                lesson6.add(lessonName6);
                lessonName6.setBounds(5, 165, 195, lessonName6.getPreferredSize().height);

                //---- lessonType6 ----
                lessonType6.setText("Lesson Level");
                lessonType6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType6.setBackground(SystemColor.menu);
                lessonType6.setForeground(new Color(150, 150, 150));
                lesson6.add(lessonType6);
                lessonType6.setBounds(5, 190, 85, 17);

                //---- moreButton6 ----
                moreButton6.setText("MORE");
                moreButton6.setBackground(Color.white);
                moreButton6.setBorderPainted(false);
                moreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton6.addActionListener(e -> moreButton6ActionPerformed(e));
                lesson6.add(moreButton6);
                moreButton6.setBounds(170, 220, 65, 25);

                //---- coachName6 ----
                coachName6.setText("Coach Name");
                coachName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName6.setBackground(SystemColor.menu);
                coachName6.setForeground(new Color(120, 120, 120));
                lesson6.add(coachName6);
                coachName6.setBounds(5, 225, 85, 17);

                //---- lessonPicture6 ----
                lessonPicture6.setBackground(SystemColor.activeCaption);
                lessonPicture6.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson6.add(lessonPicture6);
                lessonPicture6.setBounds(2, 1, 236, 160);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson6.getComponentCount(); i++) {
                        Rectangle bounds = lesson6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson6.setMinimumSize(preferredSize);
                    lesson6.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson6);
            lesson6.setBounds(535, 385, 240, 250);

            //======== lesson5 ========
            {
                lesson5.setBackground(SystemColor.menu);
                lesson5.setLayout(null);

                //---- lessonName5 ----
                lessonName5.setText("Lesson Name");
                lessonName5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName5.setBackground(SystemColor.menu);
                lesson5.add(lessonName5);
                lessonName5.setBounds(5, 165, 195, lessonName5.getPreferredSize().height);

                //---- lessonType5 ----
                lessonType5.setText("Lesson Level");
                lessonType5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType5.setBackground(SystemColor.menu);
                lessonType5.setForeground(new Color(150, 150, 150));
                lesson5.add(lessonType5);
                lessonType5.setBounds(5, 190, 85, 17);

                //---- coachName5 ----
                coachName5.setText("Coach Name");
                coachName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName5.setBackground(SystemColor.menu);
                coachName5.setForeground(new Color(120, 120, 120));
                lesson5.add(coachName5);
                coachName5.setBounds(5, 225, 85, 17);

                //---- lessonPicture5 ----
                lessonPicture5.setBackground(SystemColor.activeCaption);
                lessonPicture5.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson5.add(lessonPicture5);
                lessonPicture5.setBounds(2, 1, 236, 160);

                //---- moreButton5 ----
                moreButton5.setText("MORE");
                moreButton5.setBackground(Color.white);
                moreButton5.setBorderPainted(false);
                moreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton5.addActionListener(e -> moreButton5ActionPerformed(e));
                lesson5.add(moreButton5);
                moreButton5.setBounds(170, 220, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson5.getComponentCount(); i++) {
                        Rectangle bounds = lesson5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson5.setMinimumSize(preferredSize);
                    lesson5.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson5);
            lesson5.setBounds(280, 385, 240, 250);

            //======== lesson4 ========
            {
                lesson4.setBackground(SystemColor.menu);
                lesson4.setLayout(null);

                //---- lessonPicture4 ----
                lessonPicture4.setBackground(SystemColor.activeCaption);
                lessonPicture4.setIcon(new ImageIcon(getClass().getResource("/resources/images/preview/synthesize.png")));
                lesson4.add(lessonPicture4);
                lessonPicture4.setBounds(2, 1, 236, 160);

                //---- lessonName4 ----
                lessonName4.setText("Lesson Name");
                lessonName4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName4.setBackground(SystemColor.menu);
                lesson4.add(lessonName4);
                lessonName4.setBounds(5, 165, 195, lessonName4.getPreferredSize().height);

                //---- lessonType4 ----
                lessonType4.setText("Lesson Level");
                lessonType4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonType4.setBackground(SystemColor.menu);
                lessonType4.setForeground(new Color(150, 150, 150));
                lesson4.add(lessonType4);
                lessonType4.setBounds(5, 190, 85, 17);

                //---- coachName4 ----
                coachName4.setText("Coach Name");
                coachName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName4.setBackground(SystemColor.menu);
                coachName4.setForeground(new Color(120, 120, 120));
                lesson4.add(coachName4);
                coachName4.setBounds(5, 225, 85, 17);

                //---- moreButton4 ----
                moreButton4.setText("MORE");
                moreButton4.setBackground(Color.white);
                moreButton4.setBorderPainted(false);
                moreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton4.addActionListener(e -> moreButton4ActionPerformed(e));
                lesson4.add(moreButton4);
                moreButton4.setBounds(170, 220, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < lesson4.getComponentCount(); i++) {
                        Rectangle bounds = lesson4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = lesson4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    lesson4.setMinimumSize(preferredSize);
                    lesson4.setPreferredSize(preferredSize);
                }
            }
            body.add(lesson4);
            lesson4.setBounds(25, 385, 240, 250);

            //---- search ----
            search.setBackground(SystemColor.menu);
            search.setBorder(null);
            search.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(search);
            search.setBounds(275, 45, 300, 40);

            //---- searchButton ----
            searchButton.setBorderPainted(false);
            searchButton.setBackground(SystemColor.controlHighlight);
            searchButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/search.png")));
            searchButton.addActionListener(e -> searchButtonActionPerformed(e));
            body.add(searchButton);
            searchButton.setBounds(575, 45, 40, 40);

            //---- homeButton ----
            homeButton.setBorderPainted(false);
            homeButton.setBackground(SystemColor.menu);
            homeButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
            homeButton.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton);
            homeButton.setBounds(645, 45, 40, 40);

            //---- previousButton ----
            previousButton.setBorderPainted(false);
            previousButton.setBackground(SystemColor.menu);
            previousButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            previousButton.addActionListener(e -> previousButtonActionPerformed(e));
            body.add(previousButton);
            previousButton.setBounds(690, 45, 40, 40);

            //---- nextButton ----
            nextButton.setBorderPainted(false);
            nextButton.setBackground(SystemColor.menu);
            nextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            nextButton.addActionListener(e -> nextButtonActionPerformed(e));
            body.add(nextButton);
            nextButton.setBounds(735, 45, 40, 40);

            //---- titleRadioButton ----
            titleRadioButton.setText("Title");
            titleRadioButton.setBackground(Color.white);
            titleRadioButton.setForeground(Color.gray);
            body.add(titleRadioButton);
            titleRadioButton.setBounds(275, 85, 60, titleRadioButton.getPreferredSize().height);

            //---- coachRadioButton ----
            coachRadioButton.setText("Coach");
            coachRadioButton.setBackground(Color.white);
            coachRadioButton.setForeground(Color.gray);
            body.add(coachRadioButton);
            coachRadioButton.setBounds(335, 85, 75, coachRadioButton.getPreferredSize().height);

            //---- typeRadioButton ----
            typeRadioButton.setText("Type");
            typeRadioButton.setForeground(Color.gray);
            typeRadioButton.setBackground(Color.white);
            body.add(typeRadioButton);
            typeRadioButton.setBounds(410, 85, 70, typeRadioButton.getPreferredSize().height);

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

        //---- sreachType ----
        var sreachType = new ButtonGroup();
        sreachType.add(titleRadioButton);
        sreachType.add(coachRadioButton);
        sreachType.add(typeRadioButton);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel body;
    private JLabel decorationLine;
    private JLabel title;
    private JPanel lesson1;
    private JLabel lessonPicture1;
    private JLabel lessonName1;
    private JLabel lessonType1;
    private JLabel coachName1;
    private JButton moreButton1;
    private JPanel lesson2;
    private JLabel lessonName2;
    private JLabel lessonType2;
    private JLabel coachName2;
    private JLabel lessonPicture2;
    private JButton moreButton2;
    private JPanel lesson3;
    private JLabel lessonName3;
    private JLabel lessonType3;
    private JButton moreButton3;
    private JLabel coachName3;
    private JLabel lessonPicture3;
    private JPanel lesson6;
    private JLabel lessonName6;
    private JLabel lessonType6;
    private JButton moreButton6;
    private JLabel coachName6;
    private JLabel lessonPicture6;
    private JPanel lesson5;
    private JLabel lessonName5;
    private JLabel lessonType5;
    private JLabel coachName5;
    private JLabel lessonPicture5;
    private JButton moreButton5;
    private JPanel lesson4;
    private JLabel lessonPicture4;
    private JLabel lessonName4;
    private JLabel lessonType4;
    private JLabel coachName4;
    private JButton moreButton4;
    private JTextField search;
    private JButton searchButton;
    private JButton homeButton;
    private JButton previousButton;
    private JButton nextButton;
    private JRadioButton titleRadioButton;
    private JRadioButton coachRadioButton;
    private JRadioButton typeRadioButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        MyLessonMember.run();
    }

    private int page = 0;
    private List<ClassData> list;
    private List<ClassData> saveList;
    private int lessonRemainNumb = 0;
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyLessonMember frame = new MyLessonMember();
                    frame.init();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-1100/2,screenSize.height/2-700/2);
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void init() {
        this.search.setText("");
        list = ClassFunction.getWholeClass();
        saveList = ClassFunction.getWholeClass();
        this.update();
    }
    private void update() {
        int i = 0;
        int remainPage = this.list.size() - this.page * 6;
        CoachData coachDataTemp;
        ClassData[] classData = new ClassData[6];

        switch (this.lessonRemainNumb){
            case 0:
                break;
            case 1:
                this.lessonName2.setOpaque(false);
                this.lessonType2.setOpaque(false);
                this.coachName2.setOpaque(false);
                this.moreButton2.setVisible(true);
            case 2:
                this.lessonName3.setOpaque(false);
                this.lessonType3.setOpaque(false);
                this.coachName3.setOpaque(false);
                this.moreButton3.setVisible(true);
            case 3:
                this.lessonName4.setOpaque(false);
                this.lessonType4.setOpaque(false);
                this.coachName4.setOpaque(false);
                this.moreButton4.setVisible(true);
            case 4:
                this.lessonName5.setOpaque(false);
                this.lessonType5.setOpaque(false);
                this.coachName5.setOpaque(false);
                this.moreButton5.setVisible(true);
            case 5:
                this.lessonName6.setOpaque(false);
                this.lessonType6.setOpaque(false);
                this.coachName6.setOpaque(false);
                this.moreButton6.setVisible(true);
        }

        if((remainPage / 6) > 0){
            for(i = 0; i < 6; i++){
                classData[i] = this.list.get(i + this.page*6);
            }
            this.lessonName1.setText(classData[0].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[0].getCoachID());
            this.coachName1.setText(coachDataTemp.getName());
            this.lessonType1.setText(classData[0].getCategory());

            this.lessonName2.setText(classData[1].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[1].getCoachID());
            this.coachName2.setText(coachDataTemp.getName());
            this.lessonType2.setText(classData[1].getCategory());

            this.lessonName3.setText(classData[2].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[2].getCoachID());
            this.coachName3.setText(coachDataTemp.getName());
            this.lessonType3.setText(classData[2].getCategory());

            this.lessonName4.setText(classData[3].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[3].getCoachID());
            this.coachName4.setText(coachDataTemp.getName());
            this.lessonType4.setText(classData[3].getCategory());

            this.lessonName5.setText(classData[4].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[4].getCoachID());
            this.coachName5.setText(coachDataTemp.getName());
            this.lessonType5.setText(classData[4].getCategory());

            this.lessonName6.setText(classData[5].getName());
            coachDataTemp = CoachFunction.searchCoachByID(classData[5].getCoachID());
            this.coachName6.setText(coachDataTemp.getName());
            this.lessonType6.setText(classData[5].getCategory());
        } else {
            this.lessonRemainNumb = this.list.size() % 6;
            for (i = 0; i < lessonRemainNumb; i++) {
                classData[i] = this.list.get(i + this.page * 6);
            }
            //Set text for the remaining lessons
            switch (lessonRemainNumb) {
                case 5:
                    this.lessonName5.setText(classData[4].getName());
                    coachDataTemp = CoachFunction.searchCoachByID(classData[4].getCoachID());
                    this.coachName5.setText(coachDataTemp.getName());
                    this.lessonType5.setText(classData[4].getCategory());
                case 4:
                    this.lessonName4.setText(classData[3].getName());
                    coachDataTemp = CoachFunction.searchCoachByID(classData[3].getCoachID());
                    this.coachName4.setText(coachDataTemp.getName());
                    this.lessonType4.setText(classData[3].getCategory());
                case 3:
                    this.lessonName3.setText(classData[2].getName());
                    coachDataTemp = CoachFunction.searchCoachByID(classData[2].getCoachID());
                    this.coachName3.setText(coachDataTemp.getName());
                    this.lessonType3.setText(classData[2].getCategory());
                case 2:
                    this.lessonName2.setText(classData[1].getName());
                    coachDataTemp = CoachFunction.searchCoachByID(classData[1].getCoachID());
                    this.coachName2.setText(coachDataTemp.getName());
                    this.lessonType2.setText(classData[1].getCategory());
                case 1:
                    this.lessonName1.setText(classData[0].getName());
                    coachDataTemp = CoachFunction.searchCoachByID(classData[0].getCoachID());
                    this.coachName1.setText(coachDataTemp.getName());
                    this.lessonType1.setText(classData[0].getCategory());
            }
            //Set style for the remaining lessons
            switch (lessonRemainNumb){
                case 1:
                    this.lessonName2.setText("");
                    this.lessonName2.setBackground(new Color(230,230,230));
                    this.lessonName2.setOpaque(true);
                    this.lessonType2.setText("");
                    this.lessonType2.setBackground(new Color(230,230,230));
                    this.lessonType2.setOpaque(true);
                    this.coachName2.setText("");
                    this.coachName2.setBackground(new Color(230,230,230));
                    this.coachName2.setOpaque(true);
                    this.moreButton2.setVisible(false);
                case 2:
                    this.lessonName3.setText("");
                    this.lessonName3.setBackground(new Color(230,230,230));
                    this.lessonName3.setOpaque(true);
                    this.lessonType3.setText("");
                    this.lessonType3.setBackground(new Color(230,230,230));
                    this.lessonType3.setOpaque(true);
                    this.coachName3.setText("");
                    this.coachName3.setBackground(new Color(230,230,230));
                    this.coachName3.setOpaque(true);
                    this.moreButton3.setVisible(false);
                case 3:
                    this.lessonName4.setText("");
                    this.lessonName4.setBackground(new Color(230,230,230));
                    this.lessonName4.setOpaque(true);
                    this.lessonType4.setText("");
                    this.lessonType4.setBackground(new Color(230,230,230));
                    this.lessonType4.setOpaque(true);
                    this.coachName4.setText("");
                    this.coachName4.setBackground(new Color(230,230,230));
                    this.coachName4.setOpaque(true);
                    this.moreButton4.setVisible(false);
                case 4:
                    this.lessonName5.setText("");
                    this.lessonName5.setBackground(new Color(230,230,230));
                    this.lessonName5.setOpaque(true);
                    this.lessonType5.setText("");
                    this.lessonType5.setBackground(new Color(230,230,230));
                    this.lessonType5.setOpaque(true);
                    this.coachName5.setText("");
                    this.coachName5.setBackground(new Color(230,230,230));
                    this.coachName5.setOpaque(true);
                    this.moreButton5.setVisible(false);
                case 5:
                    this.lessonName6.setText("");
                    this.lessonName6.setBackground(new Color(230,230,230));
                    this.lessonName6.setOpaque(true);
                    this.lessonType6.setText("");
                    this.lessonType6.setBackground(new Color(230,230,230));
                    this.lessonType6.setOpaque(true);
                    this.coachName6.setText("");
                    this.coachName6.setBackground(new Color(230,230,230));
                    this.coachName6.setOpaque(true);
                    this.moreButton6.setVisible(false);
            }
        }
    }
}
