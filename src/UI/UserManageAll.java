package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu Apr 08 18:58:00 CST 2021
 */


/**
 * @author Anna
 */
public class UserManageAll extends JFrame {
    public UserManageAll() {
        initComponents();
    }

    private void moreButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        UserManageAll.run();
    }

    private void moreButton9ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        ProfileCoach.run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        coachName = new JLabel();
        joinButton2 = new JButton();
        customer1 = new JPanel();
        avatar1 = new JPanel();
        firstName1 = new JLabel();
        lastName1 = new JLabel();
        moreButton1 = new JButton();
        customer2 = new JPanel();
        avatar2 = new JPanel();
        firstName2 = new JLabel();
        lastName2 = new JLabel();
        moreButton2 = new JButton();
        customer3 = new JPanel();
        avatar3 = new JPanel();
        firstName3 = new JLabel();
        lastName3 = new JLabel();
        moreButton3 = new JButton();
        customer4 = new JPanel();
        avatar4 = new JPanel();
        firstName4 = new JLabel();
        lastName4 = new JLabel();
        moreButton4 = new JButton();
        customer5 = new JPanel();
        avatar5 = new JPanel();
        firstName5 = new JLabel();
        lastName5 = new JLabel();
        moreButton5 = new JButton();
        customer6 = new JPanel();
        avatar6 = new JPanel();
        firstName6 = new JLabel();
        lastName6 = new JLabel();
        moreButton6 = new JButton();
        customer7 = new JPanel();
        avatar7 = new JPanel();
        firstName7 = new JLabel();
        lastName7 = new JLabel();
        moreButton7 = new JButton();
        customer8 = new JPanel();
        avatar8 = new JPanel();
        firstName8 = new JLabel();
        lastName8 = new JLabel();
        moreButton8 = new JButton();
        decorationLine2 = new JLabel();
        coachName2 = new JLabel();
        joinButton3 = new JButton();
        customer9 = new JPanel();
        avatar9 = new JPanel();
        firstName9 = new JLabel();
        lastName9 = new JLabel();
        moreButton9 = new JButton();
        customer10 = new JPanel();
        avatar10 = new JPanel();
        firstName10 = new JLabel();
        lastName10 = new JLabel();
        moreButton10 = new JButton();
        customer11 = new JPanel();
        avatar11 = new JPanel();
        firstName11 = new JLabel();
        lastName11 = new JLabel();
        moreButton11 = new JButton();
        customer12 = new JPanel();
        avatar12 = new JPanel();
        firstName12 = new JLabel();
        lastName12 = new JLabel();
        moreButton12 = new JButton();
        customer13 = new JPanel();
        avatar13 = new JPanel();
        firstName13 = new JLabel();
        lastName13 = new JLabel();
        moreButton13 = new JButton();
        customer14 = new JPanel();
        avatar14 = new JPanel();
        firstName14 = new JLabel();
        lastName14 = new JLabel();
        moreButton14 = new JButton();
        customer15 = new JPanel();
        avatar15 = new JPanel();
        firstName15 = new JLabel();
        lastName15 = new JLabel();
        moreButton15 = new JButton();
        customer16 = new JPanel();
        avatar16 = new JPanel();
        firstName16 = new JLabel();
        lastName16 = new JLabel();
        moreButton16 = new JButton();

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
            title.setText("User Management");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- coachName ----
            coachName.setText("Customer");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName.setBackground(Color.white);
            body.add(coachName);
            coachName.setBounds(35, 120, 190, 42);

            //---- joinButton2 ----
            joinButton2.setText("MORE");
            joinButton2.setBackground(SystemColor.menu);
            joinButton2.setBorder(null);
            body.add(joinButton2);
            joinButton2.setBounds(680, 125, 85, 35);

            //======== customer1 ========
            {
                customer1.setBackground(SystemColor.menu);
                customer1.setLayout(null);

                //======== avatar1 ========
                {
                    avatar1.setBackground(Color.white);
                    avatar1.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar1.getComponentCount(); i++) {
                            Rectangle bounds = avatar1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar1.setMinimumSize(preferredSize);
                        avatar1.setPreferredSize(preferredSize);
                    }
                }
                customer1.add(avatar1);
                avatar1.setBounds(10, 10, 75, 75);

                //---- firstName1 ----
                firstName1.setText("First Name");
                firstName1.setFont(firstName1.getFont().deriveFont(firstName1.getFont().getStyle() | Font.BOLD, firstName1.getFont().getSize() + 2f));
                firstName1.setBackground(SystemColor.menu);
                customer1.add(firstName1);
                firstName1.setBounds(90, 10, 80, firstName1.getPreferredSize().height);

                //---- lastName1 ----
                lastName1.setText("Last Name");
                lastName1.setFont(lastName1.getFont().deriveFont(lastName1.getFont().getStyle() | Font.BOLD, lastName1.getFont().getSize() + 2f));
                lastName1.setBackground(SystemColor.menu);
                customer1.add(lastName1);
                lastName1.setBounds(90, 27, 85, 17);

                //---- moreButton1 ----
                moreButton1.setText("MORE");
                moreButton1.setBackground(Color.white);
                moreButton1.setBorderPainted(false);
                moreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton1.addActionListener(e -> moreButton1ActionPerformed(e));
                customer1.add(moreButton1);
                moreButton1.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer1.getComponentCount(); i++) {
                        Rectangle bounds = customer1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer1.setMinimumSize(preferredSize);
                    customer1.setPreferredSize(preferredSize);
                }
            }
            body.add(customer1);
            customer1.setBounds(35, 165, 175, 100);

            //======== customer2 ========
            {
                customer2.setBackground(SystemColor.menu);
                customer2.setLayout(null);

                //======== avatar2 ========
                {
                    avatar2.setBackground(Color.white);
                    avatar2.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar2.getComponentCount(); i++) {
                            Rectangle bounds = avatar2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar2.setMinimumSize(preferredSize);
                        avatar2.setPreferredSize(preferredSize);
                    }
                }
                customer2.add(avatar2);
                avatar2.setBounds(10, 10, 75, 75);

                //---- firstName2 ----
                firstName2.setText("First Name");
                firstName2.setFont(firstName2.getFont().deriveFont(firstName2.getFont().getStyle() | Font.BOLD, firstName2.getFont().getSize() + 2f));
                firstName2.setBackground(SystemColor.menu);
                customer2.add(firstName2);
                firstName2.setBounds(90, 10, 80, firstName2.getPreferredSize().height);

                //---- lastName2 ----
                lastName2.setText("Last Name");
                lastName2.setFont(lastName2.getFont().deriveFont(lastName2.getFont().getStyle() | Font.BOLD, lastName2.getFont().getSize() + 2f));
                lastName2.setBackground(SystemColor.menu);
                customer2.add(lastName2);
                lastName2.setBounds(90, 27, 85, 17);

                //---- moreButton2 ----
                moreButton2.setText("MORE");
                moreButton2.setBackground(Color.white);
                moreButton2.setBorderPainted(false);
                moreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer2.add(moreButton2);
                moreButton2.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer2.getComponentCount(); i++) {
                        Rectangle bounds = customer2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer2.setMinimumSize(preferredSize);
                    customer2.setPreferredSize(preferredSize);
                }
            }
            body.add(customer2);
            customer2.setBounds(220, 165, 175, 100);

            //======== customer3 ========
            {
                customer3.setBackground(SystemColor.menu);
                customer3.setLayout(null);

                //======== avatar3 ========
                {
                    avatar3.setBackground(Color.white);
                    avatar3.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar3.getComponentCount(); i++) {
                            Rectangle bounds = avatar3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar3.setMinimumSize(preferredSize);
                        avatar3.setPreferredSize(preferredSize);
                    }
                }
                customer3.add(avatar3);
                avatar3.setBounds(10, 10, 75, 75);

                //---- firstName3 ----
                firstName3.setText("First Name");
                firstName3.setFont(firstName3.getFont().deriveFont(firstName3.getFont().getStyle() | Font.BOLD, firstName3.getFont().getSize() + 2f));
                firstName3.setBackground(SystemColor.menu);
                customer3.add(firstName3);
                firstName3.setBounds(90, 10, 80, firstName3.getPreferredSize().height);

                //---- lastName3 ----
                lastName3.setText("Last Name");
                lastName3.setFont(lastName3.getFont().deriveFont(lastName3.getFont().getStyle() | Font.BOLD, lastName3.getFont().getSize() + 2f));
                lastName3.setBackground(SystemColor.menu);
                customer3.add(lastName3);
                lastName3.setBounds(90, 27, 85, 17);

                //---- moreButton3 ----
                moreButton3.setText("MORE");
                moreButton3.setBackground(Color.white);
                moreButton3.setBorderPainted(false);
                moreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer3.add(moreButton3);
                moreButton3.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer3.getComponentCount(); i++) {
                        Rectangle bounds = customer3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer3.setMinimumSize(preferredSize);
                    customer3.setPreferredSize(preferredSize);
                }
            }
            body.add(customer3);
            customer3.setBounds(405, 165, 175, 100);

            //======== customer4 ========
            {
                customer4.setBackground(SystemColor.menu);
                customer4.setLayout(null);

                //======== avatar4 ========
                {
                    avatar4.setBackground(Color.white);
                    avatar4.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar4.getComponentCount(); i++) {
                            Rectangle bounds = avatar4.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar4.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar4.setMinimumSize(preferredSize);
                        avatar4.setPreferredSize(preferredSize);
                    }
                }
                customer4.add(avatar4);
                avatar4.setBounds(10, 10, 75, 75);

                //---- firstName4 ----
                firstName4.setText("First Name");
                firstName4.setFont(firstName4.getFont().deriveFont(firstName4.getFont().getStyle() | Font.BOLD, firstName4.getFont().getSize() + 2f));
                firstName4.setBackground(SystemColor.menu);
                customer4.add(firstName4);
                firstName4.setBounds(90, 10, 80, firstName4.getPreferredSize().height);

                //---- lastName4 ----
                lastName4.setText("Last Name");
                lastName4.setFont(lastName4.getFont().deriveFont(lastName4.getFont().getStyle() | Font.BOLD, lastName4.getFont().getSize() + 2f));
                lastName4.setBackground(SystemColor.menu);
                customer4.add(lastName4);
                lastName4.setBounds(90, 27, 85, 17);

                //---- moreButton4 ----
                moreButton4.setText("MORE");
                moreButton4.setBackground(Color.white);
                moreButton4.setBorderPainted(false);
                moreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer4.add(moreButton4);
                moreButton4.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer4.getComponentCount(); i++) {
                        Rectangle bounds = customer4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer4.setMinimumSize(preferredSize);
                    customer4.setPreferredSize(preferredSize);
                }
            }
            body.add(customer4);
            customer4.setBounds(590, 165, 175, 100);

            //======== customer5 ========
            {
                customer5.setBackground(SystemColor.menu);
                customer5.setLayout(null);

                //======== avatar5 ========
                {
                    avatar5.setBackground(Color.white);
                    avatar5.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar5.getComponentCount(); i++) {
                            Rectangle bounds = avatar5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar5.setMinimumSize(preferredSize);
                        avatar5.setPreferredSize(preferredSize);
                    }
                }
                customer5.add(avatar5);
                avatar5.setBounds(10, 10, 75, 75);

                //---- firstName5 ----
                firstName5.setText("First Name");
                firstName5.setFont(firstName5.getFont().deriveFont(firstName5.getFont().getStyle() | Font.BOLD, firstName5.getFont().getSize() + 2f));
                firstName5.setBackground(SystemColor.menu);
                customer5.add(firstName5);
                firstName5.setBounds(90, 10, 80, firstName5.getPreferredSize().height);

                //---- lastName5 ----
                lastName5.setText("Last Name");
                lastName5.setFont(lastName5.getFont().deriveFont(lastName5.getFont().getStyle() | Font.BOLD, lastName5.getFont().getSize() + 2f));
                lastName5.setBackground(SystemColor.menu);
                customer5.add(lastName5);
                lastName5.setBounds(90, 27, 85, 17);

                //---- moreButton5 ----
                moreButton5.setText("MORE");
                moreButton5.setBackground(Color.white);
                moreButton5.setBorderPainted(false);
                moreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer5.add(moreButton5);
                moreButton5.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer5.getComponentCount(); i++) {
                        Rectangle bounds = customer5.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer5.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer5.setMinimumSize(preferredSize);
                    customer5.setPreferredSize(preferredSize);
                }
            }
            body.add(customer5);
            customer5.setBounds(35, 275, 175, 100);

            //======== customer6 ========
            {
                customer6.setBackground(SystemColor.menu);
                customer6.setLayout(null);

                //======== avatar6 ========
                {
                    avatar6.setBackground(Color.white);
                    avatar6.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar6.getComponentCount(); i++) {
                            Rectangle bounds = avatar6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar6.setMinimumSize(preferredSize);
                        avatar6.setPreferredSize(preferredSize);
                    }
                }
                customer6.add(avatar6);
                avatar6.setBounds(10, 10, 75, 75);

                //---- firstName6 ----
                firstName6.setText("First Name");
                firstName6.setFont(firstName6.getFont().deriveFont(firstName6.getFont().getStyle() | Font.BOLD, firstName6.getFont().getSize() + 2f));
                firstName6.setBackground(SystemColor.menu);
                customer6.add(firstName6);
                firstName6.setBounds(90, 10, 80, firstName6.getPreferredSize().height);

                //---- lastName6 ----
                lastName6.setText("Last Name");
                lastName6.setFont(lastName6.getFont().deriveFont(lastName6.getFont().getStyle() | Font.BOLD, lastName6.getFont().getSize() + 2f));
                lastName6.setBackground(SystemColor.menu);
                customer6.add(lastName6);
                lastName6.setBounds(90, 27, 85, 17);

                //---- moreButton6 ----
                moreButton6.setText("MORE");
                moreButton6.setBackground(Color.white);
                moreButton6.setBorderPainted(false);
                moreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer6.add(moreButton6);
                moreButton6.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer6.getComponentCount(); i++) {
                        Rectangle bounds = customer6.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer6.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer6.setMinimumSize(preferredSize);
                    customer6.setPreferredSize(preferredSize);
                }
            }
            body.add(customer6);
            customer6.setBounds(220, 275, 175, 100);

            //======== customer7 ========
            {
                customer7.setBackground(SystemColor.menu);
                customer7.setLayout(null);

                //======== avatar7 ========
                {
                    avatar7.setBackground(Color.white);
                    avatar7.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar7.getComponentCount(); i++) {
                            Rectangle bounds = avatar7.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar7.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar7.setMinimumSize(preferredSize);
                        avatar7.setPreferredSize(preferredSize);
                    }
                }
                customer7.add(avatar7);
                avatar7.setBounds(10, 10, 75, 75);

                //---- firstName7 ----
                firstName7.setText("First Name");
                firstName7.setFont(firstName7.getFont().deriveFont(firstName7.getFont().getStyle() | Font.BOLD, firstName7.getFont().getSize() + 2f));
                firstName7.setBackground(SystemColor.menu);
                customer7.add(firstName7);
                firstName7.setBounds(90, 10, 80, firstName7.getPreferredSize().height);

                //---- lastName7 ----
                lastName7.setText("Last Name");
                lastName7.setFont(lastName7.getFont().deriveFont(lastName7.getFont().getStyle() | Font.BOLD, lastName7.getFont().getSize() + 2f));
                lastName7.setBackground(SystemColor.menu);
                customer7.add(lastName7);
                lastName7.setBounds(90, 27, 85, 17);

                //---- moreButton7 ----
                moreButton7.setText("MORE");
                moreButton7.setBackground(Color.white);
                moreButton7.setBorderPainted(false);
                moreButton7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer7.add(moreButton7);
                moreButton7.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer7.getComponentCount(); i++) {
                        Rectangle bounds = customer7.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer7.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer7.setMinimumSize(preferredSize);
                    customer7.setPreferredSize(preferredSize);
                }
            }
            body.add(customer7);
            customer7.setBounds(405, 275, 175, 100);

            //======== customer8 ========
            {
                customer8.setBackground(SystemColor.menu);
                customer8.setLayout(null);

                //======== avatar8 ========
                {
                    avatar8.setBackground(Color.white);
                    avatar8.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar8.getComponentCount(); i++) {
                            Rectangle bounds = avatar8.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar8.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar8.setMinimumSize(preferredSize);
                        avatar8.setPreferredSize(preferredSize);
                    }
                }
                customer8.add(avatar8);
                avatar8.setBounds(10, 10, 75, 75);

                //---- firstName8 ----
                firstName8.setText("First Name");
                firstName8.setFont(firstName8.getFont().deriveFont(firstName8.getFont().getStyle() | Font.BOLD, firstName8.getFont().getSize() + 2f));
                firstName8.setBackground(SystemColor.menu);
                customer8.add(firstName8);
                firstName8.setBounds(90, 10, 80, firstName8.getPreferredSize().height);

                //---- lastName8 ----
                lastName8.setText("Last Name");
                lastName8.setFont(lastName8.getFont().deriveFont(lastName8.getFont().getStyle() | Font.BOLD, lastName8.getFont().getSize() + 2f));
                lastName8.setBackground(SystemColor.menu);
                customer8.add(lastName8);
                lastName8.setBounds(90, 27, 85, 17);

                //---- moreButton8 ----
                moreButton8.setText("MORE");
                moreButton8.setBackground(Color.white);
                moreButton8.setBorderPainted(false);
                moreButton8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer8.add(moreButton8);
                moreButton8.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer8.getComponentCount(); i++) {
                        Rectangle bounds = customer8.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer8.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer8.setMinimumSize(preferredSize);
                    customer8.setPreferredSize(preferredSize);
                }
            }
            body.add(customer8);
            customer8.setBounds(590, 275, 175, 100);

            //---- decorationLine2 ----
            decorationLine2.setBackground(Color.black);
            decorationLine2.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine2);
            decorationLine2.setBounds(35, 380, 730, 2);

            //---- coachName2 ----
            coachName2.setText("Coach");
            coachName2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName2.setBackground(Color.white);
            body.add(coachName2);
            coachName2.setBounds(35, 385, 190, 42);

            //---- joinButton3 ----
            joinButton3.setText("MORE");
            joinButton3.setBackground(SystemColor.menu);
            joinButton3.setBorder(null);
            body.add(joinButton3);
            joinButton3.setBounds(680, 390, 85, 35);

            //======== customer9 ========
            {
                customer9.setBackground(SystemColor.menu);
                customer9.setLayout(null);

                //======== avatar9 ========
                {
                    avatar9.setBackground(Color.white);
                    avatar9.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar9.getComponentCount(); i++) {
                            Rectangle bounds = avatar9.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar9.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar9.setMinimumSize(preferredSize);
                        avatar9.setPreferredSize(preferredSize);
                    }
                }
                customer9.add(avatar9);
                avatar9.setBounds(10, 10, 75, 75);

                //---- firstName9 ----
                firstName9.setText("First Name");
                firstName9.setFont(firstName9.getFont().deriveFont(firstName9.getFont().getStyle() | Font.BOLD, firstName9.getFont().getSize() + 2f));
                firstName9.setBackground(SystemColor.menu);
                customer9.add(firstName9);
                firstName9.setBounds(90, 10, 80, firstName9.getPreferredSize().height);

                //---- lastName9 ----
                lastName9.setText("Last Name");
                lastName9.setFont(lastName9.getFont().deriveFont(lastName9.getFont().getStyle() | Font.BOLD, lastName9.getFont().getSize() + 2f));
                lastName9.setBackground(SystemColor.menu);
                customer9.add(lastName9);
                lastName9.setBounds(90, 27, 85, 17);

                //---- moreButton9 ----
                moreButton9.setText("MORE");
                moreButton9.setBackground(Color.white);
                moreButton9.setBorderPainted(false);
                moreButton9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                moreButton9.addActionListener(e -> moreButton9ActionPerformed(e));
                customer9.add(moreButton9);
                moreButton9.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer9.getComponentCount(); i++) {
                        Rectangle bounds = customer9.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer9.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer9.setMinimumSize(preferredSize);
                    customer9.setPreferredSize(preferredSize);
                }
            }
            body.add(customer9);
            customer9.setBounds(35, 430, 175, 100);

            //======== customer10 ========
            {
                customer10.setBackground(SystemColor.menu);
                customer10.setLayout(null);

                //======== avatar10 ========
                {
                    avatar10.setBackground(Color.white);
                    avatar10.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar10.getComponentCount(); i++) {
                            Rectangle bounds = avatar10.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar10.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar10.setMinimumSize(preferredSize);
                        avatar10.setPreferredSize(preferredSize);
                    }
                }
                customer10.add(avatar10);
                avatar10.setBounds(10, 10, 75, 75);

                //---- firstName10 ----
                firstName10.setText("First Name");
                firstName10.setFont(firstName10.getFont().deriveFont(firstName10.getFont().getStyle() | Font.BOLD, firstName10.getFont().getSize() + 2f));
                firstName10.setBackground(SystemColor.menu);
                customer10.add(firstName10);
                firstName10.setBounds(90, 10, 80, firstName10.getPreferredSize().height);

                //---- lastName10 ----
                lastName10.setText("Last Name");
                lastName10.setFont(lastName10.getFont().deriveFont(lastName10.getFont().getStyle() | Font.BOLD, lastName10.getFont().getSize() + 2f));
                lastName10.setBackground(SystemColor.menu);
                customer10.add(lastName10);
                lastName10.setBounds(90, 27, 85, 17);

                //---- moreButton10 ----
                moreButton10.setText("MORE");
                moreButton10.setBackground(Color.white);
                moreButton10.setBorderPainted(false);
                moreButton10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer10.add(moreButton10);
                moreButton10.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer10.getComponentCount(); i++) {
                        Rectangle bounds = customer10.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer10.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer10.setMinimumSize(preferredSize);
                    customer10.setPreferredSize(preferredSize);
                }
            }
            body.add(customer10);
            customer10.setBounds(220, 430, 175, 100);

            //======== customer11 ========
            {
                customer11.setBackground(SystemColor.menu);
                customer11.setLayout(null);

                //======== avatar11 ========
                {
                    avatar11.setBackground(Color.white);
                    avatar11.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar11.getComponentCount(); i++) {
                            Rectangle bounds = avatar11.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar11.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar11.setMinimumSize(preferredSize);
                        avatar11.setPreferredSize(preferredSize);
                    }
                }
                customer11.add(avatar11);
                avatar11.setBounds(10, 10, 75, 75);

                //---- firstName11 ----
                firstName11.setText("First Name");
                firstName11.setFont(firstName11.getFont().deriveFont(firstName11.getFont().getStyle() | Font.BOLD, firstName11.getFont().getSize() + 2f));
                firstName11.setBackground(SystemColor.menu);
                customer11.add(firstName11);
                firstName11.setBounds(90, 10, 80, firstName11.getPreferredSize().height);

                //---- lastName11 ----
                lastName11.setText("Last Name");
                lastName11.setFont(lastName11.getFont().deriveFont(lastName11.getFont().getStyle() | Font.BOLD, lastName11.getFont().getSize() + 2f));
                lastName11.setBackground(SystemColor.menu);
                customer11.add(lastName11);
                lastName11.setBounds(90, 27, 85, 17);

                //---- moreButton11 ----
                moreButton11.setText("MORE");
                moreButton11.setBackground(Color.white);
                moreButton11.setBorderPainted(false);
                moreButton11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer11.add(moreButton11);
                moreButton11.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer11.getComponentCount(); i++) {
                        Rectangle bounds = customer11.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer11.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer11.setMinimumSize(preferredSize);
                    customer11.setPreferredSize(preferredSize);
                }
            }
            body.add(customer11);
            customer11.setBounds(405, 430, 175, 100);

            //======== customer12 ========
            {
                customer12.setBackground(SystemColor.menu);
                customer12.setLayout(null);

                //======== avatar12 ========
                {
                    avatar12.setBackground(Color.white);
                    avatar12.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar12.getComponentCount(); i++) {
                            Rectangle bounds = avatar12.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar12.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar12.setMinimumSize(preferredSize);
                        avatar12.setPreferredSize(preferredSize);
                    }
                }
                customer12.add(avatar12);
                avatar12.setBounds(10, 10, 75, 75);

                //---- firstName12 ----
                firstName12.setText("First Name");
                firstName12.setFont(firstName12.getFont().deriveFont(firstName12.getFont().getStyle() | Font.BOLD, firstName12.getFont().getSize() + 2f));
                firstName12.setBackground(SystemColor.menu);
                customer12.add(firstName12);
                firstName12.setBounds(90, 10, 80, firstName12.getPreferredSize().height);

                //---- lastName12 ----
                lastName12.setText("Last Name");
                lastName12.setFont(lastName12.getFont().deriveFont(lastName12.getFont().getStyle() | Font.BOLD, lastName12.getFont().getSize() + 2f));
                lastName12.setBackground(SystemColor.menu);
                customer12.add(lastName12);
                lastName12.setBounds(90, 27, 85, 17);

                //---- moreButton12 ----
                moreButton12.setText("MORE");
                moreButton12.setBackground(Color.white);
                moreButton12.setBorderPainted(false);
                moreButton12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer12.add(moreButton12);
                moreButton12.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer12.getComponentCount(); i++) {
                        Rectangle bounds = customer12.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer12.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer12.setMinimumSize(preferredSize);
                    customer12.setPreferredSize(preferredSize);
                }
            }
            body.add(customer12);
            customer12.setBounds(590, 430, 175, 100);

            //======== customer13 ========
            {
                customer13.setBackground(SystemColor.menu);
                customer13.setLayout(null);

                //======== avatar13 ========
                {
                    avatar13.setBackground(Color.white);
                    avatar13.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar13.getComponentCount(); i++) {
                            Rectangle bounds = avatar13.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar13.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar13.setMinimumSize(preferredSize);
                        avatar13.setPreferredSize(preferredSize);
                    }
                }
                customer13.add(avatar13);
                avatar13.setBounds(10, 10, 75, 75);

                //---- firstName13 ----
                firstName13.setText("First Name");
                firstName13.setFont(firstName13.getFont().deriveFont(firstName13.getFont().getStyle() | Font.BOLD, firstName13.getFont().getSize() + 2f));
                firstName13.setBackground(SystemColor.menu);
                customer13.add(firstName13);
                firstName13.setBounds(90, 10, 80, firstName13.getPreferredSize().height);

                //---- lastName13 ----
                lastName13.setText("Last Name");
                lastName13.setFont(lastName13.getFont().deriveFont(lastName13.getFont().getStyle() | Font.BOLD, lastName13.getFont().getSize() + 2f));
                lastName13.setBackground(SystemColor.menu);
                customer13.add(lastName13);
                lastName13.setBounds(90, 27, 85, 17);

                //---- moreButton13 ----
                moreButton13.setText("MORE");
                moreButton13.setBackground(Color.white);
                moreButton13.setBorderPainted(false);
                moreButton13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer13.add(moreButton13);
                moreButton13.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer13.getComponentCount(); i++) {
                        Rectangle bounds = customer13.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer13.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer13.setMinimumSize(preferredSize);
                    customer13.setPreferredSize(preferredSize);
                }
            }
            body.add(customer13);
            customer13.setBounds(35, 540, 175, 100);

            //======== customer14 ========
            {
                customer14.setBackground(SystemColor.menu);
                customer14.setLayout(null);

                //======== avatar14 ========
                {
                    avatar14.setBackground(Color.white);
                    avatar14.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar14.getComponentCount(); i++) {
                            Rectangle bounds = avatar14.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar14.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar14.setMinimumSize(preferredSize);
                        avatar14.setPreferredSize(preferredSize);
                    }
                }
                customer14.add(avatar14);
                avatar14.setBounds(10, 10, 75, 75);

                //---- firstName14 ----
                firstName14.setText("First Name");
                firstName14.setFont(firstName14.getFont().deriveFont(firstName14.getFont().getStyle() | Font.BOLD, firstName14.getFont().getSize() + 2f));
                firstName14.setBackground(SystemColor.menu);
                customer14.add(firstName14);
                firstName14.setBounds(90, 10, 80, firstName14.getPreferredSize().height);

                //---- lastName14 ----
                lastName14.setText("Last Name");
                lastName14.setFont(lastName14.getFont().deriveFont(lastName14.getFont().getStyle() | Font.BOLD, lastName14.getFont().getSize() + 2f));
                lastName14.setBackground(SystemColor.menu);
                customer14.add(lastName14);
                lastName14.setBounds(90, 27, 85, 17);

                //---- moreButton14 ----
                moreButton14.setText("MORE");
                moreButton14.setBackground(Color.white);
                moreButton14.setBorderPainted(false);
                moreButton14.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer14.add(moreButton14);
                moreButton14.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer14.getComponentCount(); i++) {
                        Rectangle bounds = customer14.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer14.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer14.setMinimumSize(preferredSize);
                    customer14.setPreferredSize(preferredSize);
                }
            }
            body.add(customer14);
            customer14.setBounds(220, 540, 175, 100);

            //======== customer15 ========
            {
                customer15.setBackground(SystemColor.menu);
                customer15.setLayout(null);

                //======== avatar15 ========
                {
                    avatar15.setBackground(Color.white);
                    avatar15.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar15.getComponentCount(); i++) {
                            Rectangle bounds = avatar15.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar15.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar15.setMinimumSize(preferredSize);
                        avatar15.setPreferredSize(preferredSize);
                    }
                }
                customer15.add(avatar15);
                avatar15.setBounds(10, 10, 75, 75);

                //---- firstName15 ----
                firstName15.setText("First Name");
                firstName15.setFont(firstName15.getFont().deriveFont(firstName15.getFont().getStyle() | Font.BOLD, firstName15.getFont().getSize() + 2f));
                firstName15.setBackground(SystemColor.menu);
                customer15.add(firstName15);
                firstName15.setBounds(90, 10, 80, firstName15.getPreferredSize().height);

                //---- lastName15 ----
                lastName15.setText("Last Name");
                lastName15.setFont(lastName15.getFont().deriveFont(lastName15.getFont().getStyle() | Font.BOLD, lastName15.getFont().getSize() + 2f));
                lastName15.setBackground(SystemColor.menu);
                customer15.add(lastName15);
                lastName15.setBounds(90, 27, 85, 17);

                //---- moreButton15 ----
                moreButton15.setText("MORE");
                moreButton15.setBackground(Color.white);
                moreButton15.setBorderPainted(false);
                moreButton15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer15.add(moreButton15);
                moreButton15.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer15.getComponentCount(); i++) {
                        Rectangle bounds = customer15.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer15.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer15.setMinimumSize(preferredSize);
                    customer15.setPreferredSize(preferredSize);
                }
            }
            body.add(customer15);
            customer15.setBounds(405, 540, 175, 100);

            //======== customer16 ========
            {
                customer16.setBackground(SystemColor.menu);
                customer16.setLayout(null);

                //======== avatar16 ========
                {
                    avatar16.setBackground(Color.white);
                    avatar16.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < avatar16.getComponentCount(); i++) {
                            Rectangle bounds = avatar16.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = avatar16.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        avatar16.setMinimumSize(preferredSize);
                        avatar16.setPreferredSize(preferredSize);
                    }
                }
                customer16.add(avatar16);
                avatar16.setBounds(10, 10, 75, 75);

                //---- firstName16 ----
                firstName16.setText("First Name");
                firstName16.setFont(firstName16.getFont().deriveFont(firstName16.getFont().getStyle() | Font.BOLD, firstName16.getFont().getSize() + 2f));
                firstName16.setBackground(SystemColor.menu);
                customer16.add(firstName16);
                firstName16.setBounds(90, 10, 80, firstName16.getPreferredSize().height);

                //---- lastName16 ----
                lastName16.setText("Last Name");
                lastName16.setFont(lastName16.getFont().deriveFont(lastName16.getFont().getStyle() | Font.BOLD, lastName16.getFont().getSize() + 2f));
                lastName16.setBackground(SystemColor.menu);
                customer16.add(lastName16);
                lastName16.setBounds(90, 27, 85, 17);

                //---- moreButton16 ----
                moreButton16.setText("MORE");
                moreButton16.setBackground(Color.white);
                moreButton16.setBorderPainted(false);
                moreButton16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                customer16.add(moreButton16);
                moreButton16.setBounds(100, 60, 65, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < customer16.getComponentCount(); i++) {
                        Rectangle bounds = customer16.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = customer16.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    customer16.setMinimumSize(preferredSize);
                    customer16.setPreferredSize(preferredSize);
                }
            }
            body.add(customer16);
            customer16.setBounds(590, 540, 175, 100);

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
    private JLabel coachName;
    private JButton joinButton2;
    private JPanel customer1;
    private JPanel avatar1;
    private JLabel firstName1;
    private JLabel lastName1;
    private JButton moreButton1;
    private JPanel customer2;
    private JPanel avatar2;
    private JLabel firstName2;
    private JLabel lastName2;
    private JButton moreButton2;
    private JPanel customer3;
    private JPanel avatar3;
    private JLabel firstName3;
    private JLabel lastName3;
    private JButton moreButton3;
    private JPanel customer4;
    private JPanel avatar4;
    private JLabel firstName4;
    private JLabel lastName4;
    private JButton moreButton4;
    private JPanel customer5;
    private JPanel avatar5;
    private JLabel firstName5;
    private JLabel lastName5;
    private JButton moreButton5;
    private JPanel customer6;
    private JPanel avatar6;
    private JLabel firstName6;
    private JLabel lastName6;
    private JButton moreButton6;
    private JPanel customer7;
    private JPanel avatar7;
    private JLabel firstName7;
    private JLabel lastName7;
    private JButton moreButton7;
    private JPanel customer8;
    private JPanel avatar8;
    private JLabel firstName8;
    private JLabel lastName8;
    private JButton moreButton8;
    private JLabel decorationLine2;
    private JLabel coachName2;
    private JButton joinButton3;
    private JPanel customer9;
    private JPanel avatar9;
    private JLabel firstName9;
    private JLabel lastName9;
    private JButton moreButton9;
    private JPanel customer10;
    private JPanel avatar10;
    private JLabel firstName10;
    private JLabel lastName10;
    private JButton moreButton10;
    private JPanel customer11;
    private JPanel avatar11;
    private JLabel firstName11;
    private JLabel lastName11;
    private JButton moreButton11;
    private JPanel customer12;
    private JPanel avatar12;
    private JLabel firstName12;
    private JLabel lastName12;
    private JButton moreButton12;
    private JPanel customer13;
    private JPanel avatar13;
    private JLabel firstName13;
    private JLabel lastName13;
    private JButton moreButton13;
    private JPanel customer14;
    private JPanel avatar14;
    private JLabel firstName14;
    private JLabel lastName14;
    private JButton moreButton14;
    private JPanel customer15;
    private JPanel avatar15;
    private JLabel firstName15;
    private JLabel lastName15;
    private JButton moreButton15;
    private JPanel customer16;
    private JPanel avatar16;
    private JLabel firstName16;
    private JLabel lastName16;
    private JButton moreButton16;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        UserManageAll.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserManageAll frame = new UserManageAll();
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
