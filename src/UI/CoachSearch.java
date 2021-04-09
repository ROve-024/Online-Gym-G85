package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 22:30:20 CST 2021
 */


/**
 * @author Anna
 */
public class CoachSearch extends JFrame {
    public CoachSearch() {
        initComponents();
    }

    private void detailButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        ViewCoachProfile.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        search = new JTextField();
        searchButton = new JButton();
        coachList1 = new JPanel();
        coachAvatar1 = new JPanel();
        coachName1 = new JLabel();
        detailButton1 = new JButton();
        nextPageButton = new JButton();
        coachList2 = new JPanel();
        coachAvatar2 = new JPanel();
        coachName2 = new JLabel();
        detailButton2 = new JButton();
        coachList3 = new JPanel();
        coachAvatar3 = new JPanel();
        coachName3 = new JLabel();
        detailButton3 = new JButton();
        coachList4 = new JPanel();
        coachAvatar4 = new JPanel();
        coachName4 = new JLabel();
        detailButton4 = new JButton();
        coachList5 = new JPanel();
        coachAvatar5 = new JPanel();
        coachName5 = new JLabel();
        detailButton5 = new JButton();
        coachList6 = new JPanel();
        coachAvatar6 = new JPanel();
        coachName6 = new JLabel();
        detailButton6 = new JButton();
        coachList7 = new JPanel();
        coachAvatar7 = new JPanel();
        coachName7 = new JLabel();
        detailButton7 = new JButton();
        coachList8 = new JPanel();
        coachAvatar8 = new JPanel();
        coachName8 = new JLabel();
        detailButton8 = new JButton();

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
            title.setText("Coach Search");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(25, 45, 270, title.getPreferredSize().height);

            //---- search ----
            search.setBackground(SystemColor.menu);
            search.setBorder(null);
            search.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(search);
            search.setBounds(430, 45, 300, 40);

            //---- searchButton ----
            searchButton.setBorderPainted(false);
            searchButton.setBackground(SystemColor.textHighlight);
            body.add(searchButton);
            searchButton.setBounds(730, 45, 40, 40);

            //======== coachList1 ========
            {
                coachList1.setLayout(null);

                //======== coachAvatar1 ========
                {
                    coachAvatar1.setBackground(Color.white);
                    coachAvatar1.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar1.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar1.setMinimumSize(preferredSize);
                        coachAvatar1.setPreferredSize(preferredSize);
                    }
                }
                coachList1.add(coachAvatar1);
                coachAvatar1.setBounds(22, 10, 130, 130);

                //---- coachName1 ----
                coachName1.setText("Coach Name");
                coachName1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName1.setBackground(Color.white);
                coachName1.setHorizontalAlignment(SwingConstants.CENTER);
                coachList1.add(coachName1);
                coachName1.setBounds(0, 135, 175, 42);

                //---- detailButton1 ----
                detailButton1.setBorderPainted(false);
                detailButton1.setBackground(Color.lightGray);
                detailButton1.setText("DETAIL");
                detailButton1.setForeground(Color.white);
                detailButton1.addActionListener(e -> detailButton1ActionPerformed(e));
                coachList1.add(detailButton1);
                detailButton1.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList1.getComponentCount(); i++) {
                        Rectangle bounds = coachList1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList1.setMinimumSize(preferredSize);
                    coachList1.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList1);
            coachList1.setBounds(35, 135, 175, 210);

            //---- nextPageButton ----
            nextPageButton.setBorderPainted(false);
            nextPageButton.setBackground(SystemColor.textHighlight);
            nextPageButton.setText("NEXT ");
            nextPageButton.setForeground(Color.white);
            body.add(nextPageButton);
            nextPageButton.setBounds(650, 590, 120, 40);

            //======== coachList2 ========
            {
                coachList2.setLayout(null);

                //======== coachAvatar2 ========
                {
                    coachAvatar2.setBackground(Color.white);
                    coachAvatar2.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar2.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar2.setMinimumSize(preferredSize);
                        coachAvatar2.setPreferredSize(preferredSize);
                    }
                }
                coachList2.add(coachAvatar2);
                coachAvatar2.setBounds(22, 10, 130, 130);

                //---- coachName2 ----
                coachName2.setText("Coach Name");
                coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName2.setBackground(Color.white);
                coachName2.setHorizontalAlignment(SwingConstants.CENTER);
                coachList2.add(coachName2);
                coachName2.setBounds(0, 135, 175, 42);

                //---- detailButton2 ----
                detailButton2.setBorderPainted(false);
                detailButton2.setBackground(Color.lightGray);
                detailButton2.setText("DETAIL");
                detailButton2.setForeground(Color.white);
                coachList2.add(detailButton2);
                detailButton2.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList2.getComponentCount(); i++) {
                        Rectangle bounds = coachList2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList2.setMinimumSize(preferredSize);
                    coachList2.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList2);
            coachList2.setBounds(590, 135, 175, 210);

            //======== coachList3 ========
            {
                coachList3.setLayout(null);

                //======== coachAvatar3 ========
                {
                    coachAvatar3.setBackground(Color.white);
                    coachAvatar3.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar3.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar3.setMinimumSize(preferredSize);
                        coachAvatar3.setPreferredSize(preferredSize);
                    }
                }
                coachList3.add(coachAvatar3);
                coachAvatar3.setBounds(22, 10, 130, 130);

                //---- coachName3 ----
                coachName3.setText("Coach Name");
                coachName3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName3.setBackground(Color.white);
                coachName3.setHorizontalAlignment(SwingConstants.CENTER);
                coachList3.add(coachName3);
                coachName3.setBounds(0, 135, 175, 42);

                //---- detailButton3 ----
                detailButton3.setBorderPainted(false);
                detailButton3.setBackground(Color.lightGray);
                detailButton3.setText("DETAIL");
                detailButton3.setForeground(Color.white);
                coachList3.add(detailButton3);
                detailButton3.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList3.getComponentCount(); i++) {
                        Rectangle bounds = coachList3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList3.setMinimumSize(preferredSize);
                    coachList3.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList3);
            coachList3.setBounds(220, 135, 175, 210);

            //======== coachList4 ========
            {
                coachList4.setLayout(null);

                //======== coachAvatar4 ========
                {
                    coachAvatar4.setBackground(Color.white);
                    coachAvatar4.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar4.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar4.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar4.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar4.setMinimumSize(preferredSize);
                        coachAvatar4.setPreferredSize(preferredSize);
                    }
                }
                coachList4.add(coachAvatar4);
                coachAvatar4.setBounds(22, 10, 130, 130);

                //---- coachName4 ----
                coachName4.setText("Coach Name");
                coachName4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName4.setBackground(Color.white);
                coachName4.setHorizontalAlignment(SwingConstants.CENTER);
                coachList4.add(coachName4);
                coachName4.setBounds(0, 135, 175, 42);

                //---- detailButton4 ----
                detailButton4.setBorderPainted(false);
                detailButton4.setBackground(Color.lightGray);
                detailButton4.setText("DETAIL");
                detailButton4.setForeground(Color.white);
                coachList4.add(detailButton4);
                detailButton4.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList4.getComponentCount(); i++) {
                        Rectangle bounds = coachList4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList4.setMinimumSize(preferredSize);
                    coachList4.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList4);
            coachList4.setBounds(405, 135, 175, 210);

            //======== coachList5 ========
            {
                coachList5.setLayout(null);

                //======== coachAvatar5 ========
                {
                    coachAvatar5.setBackground(Color.white);
                    coachAvatar5.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar5.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar5.setMinimumSize(preferredSize);
                        coachAvatar5.setPreferredSize(preferredSize);
                    }
                }
                coachList5.add(coachAvatar5);
                coachAvatar5.setBounds(22, 10, 130, 130);

                //---- coachName5 ----
                coachName5.setText("Coach Name");
                coachName5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName5.setBackground(Color.white);
                coachName5.setHorizontalAlignment(SwingConstants.CENTER);
                coachList5.add(coachName5);
                coachName5.setBounds(0, 135, 175, 42);

                //---- detailButton5 ----
                detailButton5.setBorderPainted(false);
                detailButton5.setBackground(Color.lightGray);
                detailButton5.setText("DETAIL");
                detailButton5.setForeground(Color.white);
                coachList5.add(detailButton5);
                detailButton5.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList5.getComponentCount(); i++) {
                        Rectangle bounds = coachList5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList5.setMinimumSize(preferredSize);
                    coachList5.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList5);
            coachList5.setBounds(35, 365, 175, 210);

            //======== coachList6 ========
            {
                coachList6.setLayout(null);

                //======== coachAvatar6 ========
                {
                    coachAvatar6.setBackground(Color.white);
                    coachAvatar6.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar6.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar6.setMinimumSize(preferredSize);
                        coachAvatar6.setPreferredSize(preferredSize);
                    }
                }
                coachList6.add(coachAvatar6);
                coachAvatar6.setBounds(22, 10, 130, 130);

                //---- coachName6 ----
                coachName6.setText("Coach Name");
                coachName6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName6.setBackground(Color.white);
                coachName6.setHorizontalAlignment(SwingConstants.CENTER);
                coachList6.add(coachName6);
                coachName6.setBounds(0, 135, 175, 42);

                //---- detailButton6 ----
                detailButton6.setBorderPainted(false);
                detailButton6.setBackground(Color.lightGray);
                detailButton6.setText("DETAIL");
                detailButton6.setForeground(Color.white);
                coachList6.add(detailButton6);
                detailButton6.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList6.getComponentCount(); i++) {
                        Rectangle bounds = coachList6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList6.setMinimumSize(preferredSize);
                    coachList6.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList6);
            coachList6.setBounds(220, 365, 175, 210);

            //======== coachList7 ========
            {
                coachList7.setLayout(null);

                //======== coachAvatar7 ========
                {
                    coachAvatar7.setBackground(Color.white);
                    coachAvatar7.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar7.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar7.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar7.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar7.setMinimumSize(preferredSize);
                        coachAvatar7.setPreferredSize(preferredSize);
                    }
                }
                coachList7.add(coachAvatar7);
                coachAvatar7.setBounds(22, 10, 130, 130);

                //---- coachName7 ----
                coachName7.setText("Coach Name");
                coachName7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName7.setBackground(Color.white);
                coachName7.setHorizontalAlignment(SwingConstants.CENTER);
                coachList7.add(coachName7);
                coachName7.setBounds(0, 135, 175, 42);

                //---- detailButton7 ----
                detailButton7.setBorderPainted(false);
                detailButton7.setBackground(Color.lightGray);
                detailButton7.setText("DETAIL");
                detailButton7.setForeground(Color.white);
                coachList7.add(detailButton7);
                detailButton7.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList7.getComponentCount(); i++) {
                        Rectangle bounds = coachList7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList7.setMinimumSize(preferredSize);
                    coachList7.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList7);
            coachList7.setBounds(405, 365, 175, 210);

            //======== coachList8 ========
            {
                coachList8.setLayout(null);

                //======== coachAvatar8 ========
                {
                    coachAvatar8.setBackground(Color.white);
                    coachAvatar8.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < coachAvatar8.getComponentCount(); i++) {
                            Rectangle bounds = coachAvatar8.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = coachAvatar8.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        coachAvatar8.setMinimumSize(preferredSize);
                        coachAvatar8.setPreferredSize(preferredSize);
                    }
                }
                coachList8.add(coachAvatar8);
                coachAvatar8.setBounds(22, 10, 130, 130);

                //---- coachName8 ----
                coachName8.setText("Coach Name");
                coachName8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                coachName8.setBackground(Color.white);
                coachName8.setHorizontalAlignment(SwingConstants.CENTER);
                coachList8.add(coachName8);
                coachName8.setBounds(0, 135, 175, 42);

                //---- detailButton8 ----
                detailButton8.setBorderPainted(false);
                detailButton8.setBackground(Color.lightGray);
                detailButton8.setText("DETAIL");
                detailButton8.setForeground(Color.white);
                coachList8.add(detailButton8);
                detailButton8.setBounds(40, 170, 90, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < coachList8.getComponentCount(); i++) {
                        Rectangle bounds = coachList8.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = coachList8.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    coachList8.setMinimumSize(preferredSize);
                    coachList8.setPreferredSize(preferredSize);
                }
            }
            body.add(coachList8);
            coachList8.setBounds(590, 365, 175, 210);

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
    private JTextField search;
    private JButton searchButton;
    private JPanel coachList1;
    private JPanel coachAvatar1;
    private JLabel coachName1;
    private JButton detailButton1;
    private JButton nextPageButton;
    private JPanel coachList2;
    private JPanel coachAvatar2;
    private JLabel coachName2;
    private JButton detailButton2;
    private JPanel coachList3;
    private JPanel coachAvatar3;
    private JLabel coachName3;
    private JButton detailButton3;
    private JPanel coachList4;
    private JPanel coachAvatar4;
    private JLabel coachName4;
    private JButton detailButton4;
    private JPanel coachList5;
    private JPanel coachAvatar5;
    private JLabel coachName5;
    private JButton detailButton5;
    private JPanel coachList6;
    private JPanel coachAvatar6;
    private JLabel coachName6;
    private JButton detailButton6;
    private JPanel coachList7;
    private JPanel coachAvatar7;
    private JLabel coachName7;
    private JButton detailButton7;
    private JPanel coachList8;
    private JPanel coachAvatar8;
    private JLabel coachName8;
    private JButton detailButton8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        CoachSearch.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CoachSearch frame = new CoachSearch();
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
