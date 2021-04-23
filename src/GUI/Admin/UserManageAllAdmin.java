/*
 * Created by JFormDesigner on Fri Apr 23 10:37:03 CST 2021
 */

package GUI.Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class UserManageAllAdmin extends JFrame {
    public UserManageAllAdmin() {
        initComponents();
    }

    private void memberNextButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberPrevButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachPrevButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachNextButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton7ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void memberMoreButton8ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton7ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void coachMoreButton8ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        coachName = new JLabel();
        memberNextButton = new JButton();
        customer1 = new JPanel();
        avatar1 = new JLabel();
        firstName1 = new JLabel();
        lastName1 = new JLabel();
        memberMoreButton1 = new JButton();
        customer2 = new JPanel();
        avatar2 = new JLabel();
        firstName2 = new JLabel();
        lastName2 = new JLabel();
        memberMoreButton2 = new JButton();
        customer3 = new JPanel();
        avatar3 = new JLabel();
        firstName3 = new JLabel();
        lastName3 = new JLabel();
        memberMoreButton3 = new JButton();
        customer4 = new JPanel();
        avatar4 = new JLabel();
        firstName4 = new JLabel();
        lastName4 = new JLabel();
        memberMoreButton4 = new JButton();
        customer5 = new JPanel();
        avatar5 = new JLabel();
        firstName5 = new JLabel();
        lastName5 = new JLabel();
        memberMoreButton5 = new JButton();
        customer6 = new JPanel();
        avatar6 = new JLabel();
        firstName6 = new JLabel();
        lastName6 = new JLabel();
        memberMoreButton6 = new JButton();
        customer7 = new JPanel();
        avatar7 = new JLabel();
        firstName7 = new JLabel();
        lastName7 = new JLabel();
        memberMoreButton7 = new JButton();
        customer8 = new JPanel();
        avatar8 = new JLabel();
        firstName8 = new JLabel();
        lastName8 = new JLabel();
        memberMoreButton8 = new JButton();
        decorationLine2 = new JLabel();
        coachName2 = new JLabel();
        customer9 = new JPanel();
        avatar9 = new JLabel();
        firstName9 = new JLabel();
        lastName9 = new JLabel();
        coachMoreButton1 = new JButton();
        customer10 = new JPanel();
        avatar10 = new JLabel();
        firstName10 = new JLabel();
        lastName10 = new JLabel();
        coachMoreButton2 = new JButton();
        customer11 = new JPanel();
        avatar11 = new JLabel();
        firstName11 = new JLabel();
        lastName11 = new JLabel();
        coachMoreButton3 = new JButton();
        customer12 = new JPanel();
        avatar12 = new JLabel();
        firstName12 = new JLabel();
        lastName12 = new JLabel();
        coachMoreButton4 = new JButton();
        customer13 = new JPanel();
        avatar13 = new JLabel();
        firstName13 = new JLabel();
        lastName13 = new JLabel();
        coachMoreButton5 = new JButton();
        customer14 = new JPanel();
        avatar14 = new JLabel();
        firstName14 = new JLabel();
        lastName14 = new JLabel();
        coachMoreButton6 = new JButton();
        customer15 = new JPanel();
        avatar15 = new JLabel();
        firstName15 = new JLabel();
        lastName15 = new JLabel();
        coachMoreButton7 = new JButton();
        customer16 = new JPanel();
        avatar16 = new JLabel();
        firstName16 = new JLabel();
        lastName16 = new JLabel();
        coachMoreButton8 = new JButton();
        memberPrevButton = new JButton();
        coachPrevButton = new JButton();
        coachNextButton = new JButton();

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
            coachName.setText("Member");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName.setBackground(Color.white);
            body.add(coachName);
            coachName.setBounds(35, 120, 190, 42);

            //---- memberNextButton ----
            memberNextButton.setBackground(SystemColor.menu);
            memberNextButton.setBorder(null);
            memberNextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            memberNextButton.addActionListener(e -> memberNextButtonActionPerformed(e));
            body.add(memberNextButton);
            memberNextButton.setBounds(725, 120, 40, 40);

            //======== customer1 ========
            {
                customer1.setBackground(SystemColor.window);
                customer1.setBorder(new LineBorder(Color.lightGray));
                customer1.setLayout(null);

                //---- avatar1 ----
                avatar1.setBackground(Color.white);
                avatar1.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar1.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton1 ----
                memberMoreButton1.setText("MORE");
                memberMoreButton1.setBackground(SystemColor.menu);
                memberMoreButton1.setBorderPainted(false);
                memberMoreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton1.addActionListener(e -> memberMoreButton1ActionPerformed(e));
                customer1.add(memberMoreButton1);
                memberMoreButton1.setBounds(100, 60, 65, 25);

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
                customer2.setBackground(SystemColor.window);
                customer2.setBorder(new LineBorder(Color.lightGray));
                customer2.setLayout(null);

                //---- avatar2 ----
                avatar2.setBackground(Color.white);
                avatar2.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar2.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton2 ----
                memberMoreButton2.setText("MORE");
                memberMoreButton2.setBackground(SystemColor.menu);
                memberMoreButton2.setBorderPainted(false);
                memberMoreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton2.addActionListener(e -> memberMoreButton2ActionPerformed(e));
                customer2.add(memberMoreButton2);
                memberMoreButton2.setBounds(100, 60, 65, 25);

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
                customer3.setBackground(SystemColor.window);
                customer3.setBorder(new LineBorder(Color.lightGray));
                customer3.setLayout(null);

                //---- avatar3 ----
                avatar3.setBackground(Color.white);
                avatar3.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar3.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton3 ----
                memberMoreButton3.setText("MORE");
                memberMoreButton3.setBackground(SystemColor.menu);
                memberMoreButton3.setBorderPainted(false);
                memberMoreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton3.addActionListener(e -> memberMoreButton3ActionPerformed(e));
                customer3.add(memberMoreButton3);
                memberMoreButton3.setBounds(100, 60, 65, 25);

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
                customer4.setBackground(SystemColor.window);
                customer4.setBorder(new LineBorder(Color.lightGray));
                customer4.setLayout(null);

                //---- avatar4 ----
                avatar4.setBackground(Color.white);
                avatar4.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar4.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton4 ----
                memberMoreButton4.setText("MORE");
                memberMoreButton4.setBackground(SystemColor.menu);
                memberMoreButton4.setBorderPainted(false);
                memberMoreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton4.addActionListener(e -> memberMoreButton4ActionPerformed(e));
                customer4.add(memberMoreButton4);
                memberMoreButton4.setBounds(100, 60, 65, 25);

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
                customer5.setBackground(SystemColor.window);
                customer5.setBorder(new LineBorder(Color.lightGray));
                customer5.setLayout(null);

                //---- avatar5 ----
                avatar5.setBackground(Color.white);
                avatar5.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar5.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton5 ----
                memberMoreButton5.setText("MORE");
                memberMoreButton5.setBackground(SystemColor.menu);
                memberMoreButton5.setBorderPainted(false);
                memberMoreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton5.addActionListener(e -> memberMoreButton5ActionPerformed(e));
                customer5.add(memberMoreButton5);
                memberMoreButton5.setBounds(100, 60, 65, 25);

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
                customer6.setBackground(SystemColor.window);
                customer6.setBorder(new LineBorder(Color.lightGray));
                customer6.setLayout(null);

                //---- avatar6 ----
                avatar6.setBackground(Color.white);
                avatar6.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar6.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton6 ----
                memberMoreButton6.setText("MORE");
                memberMoreButton6.setBackground(SystemColor.menu);
                memberMoreButton6.setBorderPainted(false);
                memberMoreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton6.addActionListener(e -> memberMoreButton6ActionPerformed(e));
                customer6.add(memberMoreButton6);
                memberMoreButton6.setBounds(100, 60, 65, 25);

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
                customer7.setBackground(SystemColor.window);
                customer7.setBorder(new LineBorder(Color.lightGray));
                customer7.setLayout(null);

                //---- avatar7 ----
                avatar7.setBackground(Color.white);
                avatar7.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar7.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton7 ----
                memberMoreButton7.setText("MORE");
                memberMoreButton7.setBackground(SystemColor.menu);
                memberMoreButton7.setBorderPainted(false);
                memberMoreButton7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton7.addActionListener(e -> memberMoreButton7ActionPerformed(e));
                customer7.add(memberMoreButton7);
                memberMoreButton7.setBounds(100, 60, 65, 25);

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
                customer8.setBackground(SystemColor.window);
                customer8.setBorder(new LineBorder(Color.lightGray));
                customer8.setLayout(null);

                //---- avatar8 ----
                avatar8.setBackground(Color.white);
                avatar8.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (1).jpg")));
                avatar8.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- memberMoreButton8 ----
                memberMoreButton8.setText("MORE");
                memberMoreButton8.setBackground(SystemColor.menu);
                memberMoreButton8.setBorderPainted(false);
                memberMoreButton8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                memberMoreButton8.addActionListener(e -> memberMoreButton8ActionPerformed(e));
                customer8.add(memberMoreButton8);
                memberMoreButton8.setBounds(100, 60, 65, 25);

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

            //======== customer9 ========
            {
                customer9.setBackground(SystemColor.window);
                customer9.setBorder(new LineBorder(Color.lightGray));
                customer9.setLayout(null);

                //---- avatar9 ----
                avatar9.setBackground(Color.white);
                avatar9.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar9.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton1 ----
                coachMoreButton1.setText("MORE");
                coachMoreButton1.setBackground(SystemColor.menu);
                coachMoreButton1.setBorderPainted(false);
                coachMoreButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton1.addActionListener(e -> coachMoreButton1ActionPerformed(e));
                customer9.add(coachMoreButton1);
                coachMoreButton1.setBounds(100, 60, 65, 25);

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
                customer10.setBackground(SystemColor.window);
                customer10.setBorder(new LineBorder(Color.lightGray));
                customer10.setLayout(null);

                //---- avatar10 ----
                avatar10.setBackground(Color.white);
                avatar10.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar10.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton2 ----
                coachMoreButton2.setText("MORE");
                coachMoreButton2.setBackground(SystemColor.menu);
                coachMoreButton2.setBorderPainted(false);
                coachMoreButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton2.addActionListener(e -> coachMoreButton2ActionPerformed(e));
                customer10.add(coachMoreButton2);
                coachMoreButton2.setBounds(100, 60, 65, 25);

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
                customer11.setBackground(SystemColor.window);
                customer11.setBorder(new LineBorder(Color.lightGray));
                customer11.setLayout(null);

                //---- avatar11 ----
                avatar11.setBackground(Color.white);
                avatar11.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar11.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton3 ----
                coachMoreButton3.setText("MORE");
                coachMoreButton3.setBackground(SystemColor.menu);
                coachMoreButton3.setBorderPainted(false);
                coachMoreButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton3.addActionListener(e -> coachMoreButton3ActionPerformed(e));
                customer11.add(coachMoreButton3);
                coachMoreButton3.setBounds(100, 60, 65, 25);

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
                customer12.setBackground(SystemColor.window);
                customer12.setBorder(new LineBorder(Color.lightGray));
                customer12.setLayout(null);

                //---- avatar12 ----
                avatar12.setBackground(Color.white);
                avatar12.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar12.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton4 ----
                coachMoreButton4.setText("MORE");
                coachMoreButton4.setBackground(SystemColor.menu);
                coachMoreButton4.setBorderPainted(false);
                coachMoreButton4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton4.addActionListener(e -> coachMoreButton4ActionPerformed(e));
                customer12.add(coachMoreButton4);
                coachMoreButton4.setBounds(100, 60, 65, 25);

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
                customer13.setBackground(SystemColor.window);
                customer13.setBorder(new LineBorder(Color.lightGray));
                customer13.setLayout(null);

                //---- avatar13 ----
                avatar13.setBackground(Color.white);
                avatar13.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar13.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton5 ----
                coachMoreButton5.setText("MORE");
                coachMoreButton5.setBackground(SystemColor.menu);
                coachMoreButton5.setBorderPainted(false);
                coachMoreButton5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton5.addActionListener(e -> coachMoreButton5ActionPerformed(e));
                customer13.add(coachMoreButton5);
                coachMoreButton5.setBounds(100, 60, 65, 25);

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
                customer14.setBackground(SystemColor.window);
                customer14.setBorder(new LineBorder(Color.lightGray));
                customer14.setLayout(null);

                //---- avatar14 ----
                avatar14.setBackground(Color.white);
                avatar14.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar14.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton6 ----
                coachMoreButton6.setText("MORE");
                coachMoreButton6.setBackground(SystemColor.menu);
                coachMoreButton6.setBorderPainted(false);
                coachMoreButton6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton6.addActionListener(e -> coachMoreButton6ActionPerformed(e));
                customer14.add(coachMoreButton6);
                coachMoreButton6.setBounds(100, 60, 65, 25);

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
                customer15.setBackground(SystemColor.window);
                customer15.setBorder(new LineBorder(Color.lightGray));
                customer15.setLayout(null);

                //---- avatar15 ----
                avatar15.setBackground(Color.white);
                avatar15.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar15.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton7 ----
                coachMoreButton7.setText("MORE");
                coachMoreButton7.setBackground(SystemColor.menu);
                coachMoreButton7.setBorderPainted(false);
                coachMoreButton7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton7.addActionListener(e -> coachMoreButton7ActionPerformed(e));
                customer15.add(coachMoreButton7);
                coachMoreButton7.setBounds(100, 60, 65, 25);

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
                customer16.setBackground(SystemColor.window);
                customer16.setBorder(new LineBorder(Color.lightGray));
                customer16.setLayout(null);

                //---- avatar16 ----
                avatar16.setBackground(Color.white);
                avatar16.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/Acatar (17).jpg")));
                avatar16.setHorizontalAlignment(SwingConstants.CENTER);
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

                //---- coachMoreButton8 ----
                coachMoreButton8.setText("MORE");
                coachMoreButton8.setBackground(SystemColor.menu);
                coachMoreButton8.setBorderPainted(false);
                coachMoreButton8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 9));
                coachMoreButton8.addActionListener(e -> coachMoreButton8ActionPerformed(e));
                customer16.add(coachMoreButton8);
                coachMoreButton8.setBounds(100, 60, 65, 25);

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

            //---- memberPrevButton ----
            memberPrevButton.setBackground(SystemColor.menu);
            memberPrevButton.setBorder(null);
            memberPrevButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            memberPrevButton.addActionListener(e -> memberPrevButtonActionPerformed(e));
            body.add(memberPrevButton);
            memberPrevButton.setBounds(680, 120, 40, 40);

            //---- coachPrevButton ----
            coachPrevButton.setBackground(SystemColor.menu);
            coachPrevButton.setBorder(null);
            coachPrevButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/previous.png")));
            coachPrevButton.addActionListener(e -> coachPrevButtonActionPerformed(e));
            body.add(coachPrevButton);
            coachPrevButton.setBounds(680, 385, 40, 40);

            //---- coachNextButton ----
            coachNextButton.setBackground(SystemColor.menu);
            coachNextButton.setBorder(null);
            coachNextButton.setIcon(new ImageIcon(getClass().getResource("/resources/icons/next.png")));
            coachNextButton.addActionListener(e -> coachNextButtonActionPerformed(e));
            body.add(coachNextButton);
            coachNextButton.setBounds(725, 385, 40, 40);

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
    private JButton memberNextButton;
    private JPanel customer1;
    private JLabel avatar1;
    private JLabel firstName1;
    private JLabel lastName1;
    private JButton memberMoreButton1;
    private JPanel customer2;
    private JLabel avatar2;
    private JLabel firstName2;
    private JLabel lastName2;
    private JButton memberMoreButton2;
    private JPanel customer3;
    private JLabel avatar3;
    private JLabel firstName3;
    private JLabel lastName3;
    private JButton memberMoreButton3;
    private JPanel customer4;
    private JLabel avatar4;
    private JLabel firstName4;
    private JLabel lastName4;
    private JButton memberMoreButton4;
    private JPanel customer5;
    private JLabel avatar5;
    private JLabel firstName5;
    private JLabel lastName5;
    private JButton memberMoreButton5;
    private JPanel customer6;
    private JLabel avatar6;
    private JLabel firstName6;
    private JLabel lastName6;
    private JButton memberMoreButton6;
    private JPanel customer7;
    private JLabel avatar7;
    private JLabel firstName7;
    private JLabel lastName7;
    private JButton memberMoreButton7;
    private JPanel customer8;
    private JLabel avatar8;
    private JLabel firstName8;
    private JLabel lastName8;
    private JButton memberMoreButton8;
    private JLabel decorationLine2;
    private JLabel coachName2;
    private JPanel customer9;
    private JLabel avatar9;
    private JLabel firstName9;
    private JLabel lastName9;
    private JButton coachMoreButton1;
    private JPanel customer10;
    private JLabel avatar10;
    private JLabel firstName10;
    private JLabel lastName10;
    private JButton coachMoreButton2;
    private JPanel customer11;
    private JLabel avatar11;
    private JLabel firstName11;
    private JLabel lastName11;
    private JButton coachMoreButton3;
    private JPanel customer12;
    private JLabel avatar12;
    private JLabel firstName12;
    private JLabel lastName12;
    private JButton coachMoreButton4;
    private JPanel customer13;
    private JLabel avatar13;
    private JLabel firstName13;
    private JLabel lastName13;
    private JButton coachMoreButton5;
    private JPanel customer14;
    private JLabel avatar14;
    private JLabel firstName14;
    private JLabel lastName14;
    private JButton coachMoreButton6;
    private JPanel customer15;
    private JLabel avatar15;
    private JLabel firstName15;
    private JLabel lastName15;
    private JButton coachMoreButton7;
    private JPanel customer16;
    private JLabel avatar16;
    private JLabel firstName16;
    private JLabel lastName16;
    private JButton coachMoreButton8;
    private JButton memberPrevButton;
    private JButton coachPrevButton;
    private JButton coachNextButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        UserManageAllAdmin.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserManageAllAdmin frame = new UserManageAllAdmin();
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
