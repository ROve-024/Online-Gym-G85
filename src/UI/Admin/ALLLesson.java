package UI.Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 20:16:38 CST 2021
 */


/**
 * @author Anna
 */
public class ALLLesson extends JFrame {
    public ALLLesson() {
        initComponents();
    }

    private void moreButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        LessonDetailAdmin.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        lesson1 = new JPanel();
        lessonPicture1 = new JPanel();
        lessonName = new JLabel();
        lessonLevel1 = new JLabel();
        coachName1 = new JLabel();
        moreButton1 = new JButton();
        lesson2 = new JPanel();
        lessonName2 = new JLabel();
        lessonLevel2 = new JLabel();
        coachName2 = new JLabel();
        lessonPicture2 = new JPanel();
        moreButton2 = new JButton();
        lesson3 = new JPanel();
        lessonName3 = new JLabel();
        lessonLevel3 = new JLabel();
        moreButton3 = new JButton();
        coachName3 = new JLabel();
        lessonPicture3 = new JPanel();
        lesson4 = new JPanel();
        lessonName4 = new JLabel();
        lessonLevel4 = new JLabel();
        moreButton4 = new JButton();
        coachName4 = new JLabel();
        lessonPicture4 = new JPanel();
        lesson5 = new JPanel();
        lessonName5 = new JLabel();
        lessonLevel5 = new JLabel();
        coachName5 = new JLabel();
        lessonPicture5 = new JPanel();
        moreButton5 = new JButton();
        lesson6 = new JPanel();
        lessonPicture6 = new JPanel();
        lessonName6 = new JLabel();
        lessonLevel6 = new JLabel();
        coachName6 = new JLabel();
        moreButton6 = new JButton();
        search = new JTextField();
        searchButton = new JButton();
        nextPageButton = new JButton();

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
            title.setText("ALL Lesson ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //======== lesson1 ========
            {
                lesson1.setBackground(SystemColor.menu);
                lesson1.setLayout(null);

                //======== lessonPicture1 ========
                {
                    lessonPicture1.setBackground(SystemColor.activeCaption);
                    lessonPicture1.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture1.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture1.setMinimumSize(preferredSize);
                        lessonPicture1.setPreferredSize(preferredSize);
                    }
                }
                lesson1.add(lessonPicture1);
                lessonPicture1.setBounds(0, 0, 250, 160);

                //---- lessonName ----
                lessonName.setText("Lesson Name");
                lessonName.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName.setBackground(SystemColor.menu);
                lesson1.add(lessonName);
                lessonName.setBounds(5, 165, 195, lessonName.getPreferredSize().height);

                //---- lessonLevel1 ----
                lessonLevel1.setText("Lesson Level");
                lessonLevel1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel1.setBackground(SystemColor.menu);
                lessonLevel1.setForeground(new Color(150, 150, 150));
                lesson1.add(lessonLevel1);
                lessonLevel1.setBounds(5, 190, 85, 17);

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

                //---- lessonLevel2 ----
                lessonLevel2.setText("Lesson Level");
                lessonLevel2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel2.setBackground(SystemColor.menu);
                lessonLevel2.setForeground(new Color(150, 150, 150));
                lesson2.add(lessonLevel2);
                lessonLevel2.setBounds(5, 190, 85, 17);

                //---- coachName2 ----
                coachName2.setText("Coach Name");
                coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName2.setBackground(SystemColor.menu);
                coachName2.setForeground(new Color(120, 120, 120));
                lesson2.add(coachName2);
                coachName2.setBounds(5, 225, 85, 17);

                //======== lessonPicture2 ========
                {
                    lessonPicture2.setBackground(SystemColor.activeCaption);
                    lessonPicture2.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture2.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture2.setMinimumSize(preferredSize);
                        lessonPicture2.setPreferredSize(preferredSize);
                    }
                }
                lesson2.add(lessonPicture2);
                lessonPicture2.setBounds(0, 0, 250, 160);

                //---- moreButton2 ----
                moreButton2.setText("MORE");
                moreButton2.setBackground(Color.white);
                moreButton2.setBorderPainted(false);
                moreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
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

                //---- lessonLevel3 ----
                lessonLevel3.setText("Lesson Level");
                lessonLevel3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel3.setBackground(SystemColor.menu);
                lessonLevel3.setForeground(new Color(150, 150, 150));
                lesson3.add(lessonLevel3);
                lessonLevel3.setBounds(5, 190, 85, 17);

                //---- moreButton3 ----
                moreButton3.setText("MORE");
                moreButton3.setBackground(Color.white);
                moreButton3.setBorderPainted(false);
                moreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                lesson3.add(moreButton3);
                moreButton3.setBounds(170, 220, 65, 25);

                //---- coachName3 ----
                coachName3.setText("Coach Name");
                coachName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName3.setBackground(SystemColor.menu);
                coachName3.setForeground(new Color(120, 120, 120));
                lesson3.add(coachName3);
                coachName3.setBounds(5, 225, 85, 17);

                //======== lessonPicture3 ========
                {
                    lessonPicture3.setBackground(SystemColor.activeCaption);
                    lessonPicture3.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture3.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture3.setMinimumSize(preferredSize);
                        lessonPicture3.setPreferredSize(preferredSize);
                    }
                }
                lesson3.add(lessonPicture3);
                lessonPicture3.setBounds(0, 0, 250, 160);

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

            //======== lesson4 ========
            {
                lesson4.setBackground(SystemColor.menu);
                lesson4.setLayout(null);

                //---- lessonName4 ----
                lessonName4.setText("Lesson Name");
                lessonName4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName4.setBackground(SystemColor.menu);
                lesson4.add(lessonName4);
                lessonName4.setBounds(5, 165, 195, lessonName4.getPreferredSize().height);

                //---- lessonLevel4 ----
                lessonLevel4.setText("Lesson Level");
                lessonLevel4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel4.setBackground(SystemColor.menu);
                lessonLevel4.setForeground(new Color(150, 150, 150));
                lesson4.add(lessonLevel4);
                lessonLevel4.setBounds(5, 190, 85, 17);

                //---- moreButton4 ----
                moreButton4.setText("MORE");
                moreButton4.setBackground(Color.white);
                moreButton4.setBorderPainted(false);
                moreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                lesson4.add(moreButton4);
                moreButton4.setBounds(170, 220, 65, 25);

                //---- coachName4 ----
                coachName4.setText("Coach Name");
                coachName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName4.setBackground(SystemColor.menu);
                coachName4.setForeground(new Color(120, 120, 120));
                lesson4.add(coachName4);
                coachName4.setBounds(5, 225, 85, 17);

                //======== lessonPicture4 ========
                {
                    lessonPicture4.setBackground(SystemColor.activeCaption);
                    lessonPicture4.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture4.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture4.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture4.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture4.setMinimumSize(preferredSize);
                        lessonPicture4.setPreferredSize(preferredSize);
                    }
                }
                lesson4.add(lessonPicture4);
                lessonPicture4.setBounds(0, 0, 250, 160);

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
            lesson4.setBounds(535, 385, 240, 250);

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

                //---- lessonLevel5 ----
                lessonLevel5.setText("Lesson Level");
                lessonLevel5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel5.setBackground(SystemColor.menu);
                lessonLevel5.setForeground(new Color(150, 150, 150));
                lesson5.add(lessonLevel5);
                lessonLevel5.setBounds(5, 190, 85, 17);

                //---- coachName5 ----
                coachName5.setText("Coach Name");
                coachName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName5.setBackground(SystemColor.menu);
                coachName5.setForeground(new Color(120, 120, 120));
                lesson5.add(coachName5);
                coachName5.setBounds(5, 225, 85, 17);

                //======== lessonPicture5 ========
                {
                    lessonPicture5.setBackground(SystemColor.activeCaption);
                    lessonPicture5.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture5.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture5.setMinimumSize(preferredSize);
                        lessonPicture5.setPreferredSize(preferredSize);
                    }
                }
                lesson5.add(lessonPicture5);
                lessonPicture5.setBounds(0, 0, 250, 160);

                //---- moreButton5 ----
                moreButton5.setText("MORE");
                moreButton5.setBackground(Color.white);
                moreButton5.setBorderPainted(false);
                moreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
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

            //======== lesson6 ========
            {
                lesson6.setBackground(SystemColor.menu);
                lesson6.setLayout(null);

                //======== lessonPicture6 ========
                {
                    lessonPicture6.setBackground(SystemColor.activeCaption);
                    lessonPicture6.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < lessonPicture6.getComponentCount(); i++) {
                            Rectangle bounds = lessonPicture6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = lessonPicture6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        lessonPicture6.setMinimumSize(preferredSize);
                        lessonPicture6.setPreferredSize(preferredSize);
                    }
                }
                lesson6.add(lessonPicture6);
                lessonPicture6.setBounds(0, 0, 250, 160);

                //---- lessonName6 ----
                lessonName6.setText("Lesson Name");
                lessonName6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                lessonName6.setBackground(SystemColor.menu);
                lesson6.add(lessonName6);
                lessonName6.setBounds(5, 165, 195, lessonName6.getPreferredSize().height);

                //---- lessonLevel6 ----
                lessonLevel6.setText("Lesson Level");
                lessonLevel6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                lessonLevel6.setBackground(SystemColor.menu);
                lessonLevel6.setForeground(new Color(150, 150, 150));
                lesson6.add(lessonLevel6);
                lessonLevel6.setBounds(5, 190, 85, 17);

                //---- coachName6 ----
                coachName6.setText("Coach Name");
                coachName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                coachName6.setBackground(SystemColor.menu);
                coachName6.setForeground(new Color(120, 120, 120));
                lesson6.add(coachName6);
                coachName6.setBounds(5, 225, 85, 17);

                //---- moreButton6 ----
                moreButton6.setText("MORE");
                moreButton6.setBackground(Color.white);
                moreButton6.setBorderPainted(false);
                moreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                lesson6.add(moreButton6);
                moreButton6.setBounds(170, 220, 65, 25);

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
            lesson6.setBounds(25, 385, 240, 250);

            //---- search ----
            search.setBackground(SystemColor.menu);
            search.setBorder(null);
            search.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(search);
            search.setBounds(300, 45, 300, 40);

            //---- searchButton ----
            searchButton.setBorderPainted(false);
            searchButton.setBackground(SystemColor.textHighlight);
            body.add(searchButton);
            searchButton.setBounds(600, 45, 40, 40);

            //---- nextPageButton ----
            nextPageButton.setBorderPainted(false);
            nextPageButton.setBackground(new Color(217, 0, 27));
            nextPageButton.setText("NEXT PAGE");
            nextPageButton.setForeground(Color.white);
            body.add(nextPageButton);
            nextPageButton.setBounds(655, 45, 120, 40);

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
    private JPanel lesson1;
    private JPanel lessonPicture1;
    private JLabel lessonName;
    private JLabel lessonLevel1;
    private JLabel coachName1;
    private JButton moreButton1;
    private JPanel lesson2;
    private JLabel lessonName2;
    private JLabel lessonLevel2;
    private JLabel coachName2;
    private JPanel lessonPicture2;
    private JButton moreButton2;
    private JPanel lesson3;
    private JLabel lessonName3;
    private JLabel lessonLevel3;
    private JButton moreButton3;
    private JLabel coachName3;
    private JPanel lessonPicture3;
    private JPanel lesson4;
    private JLabel lessonName4;
    private JLabel lessonLevel4;
    private JButton moreButton4;
    private JLabel coachName4;
    private JPanel lessonPicture4;
    private JPanel lesson5;
    private JLabel lessonName5;
    private JLabel lessonLevel5;
    private JLabel coachName5;
    private JPanel lessonPicture5;
    private JButton moreButton5;
    private JPanel lesson6;
    private JPanel lessonPicture6;
    private JLabel lessonName6;
    private JLabel lessonLevel6;
    private JLabel coachName6;
    private JButton moreButton6;
    private JTextField search;
    private JButton searchButton;
    private JButton nextPageButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        ALLLesson.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ALLLesson frame = new ALLLesson();
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
