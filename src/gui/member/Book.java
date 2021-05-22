package gui.member;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 21:58:01 CST 2021
 */


/**
 * @author Anna
 */
public class Book extends JFrame {
    public Book() {
        initComponents();
    }

    private void finishButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        PlanHomeMember.run();
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        bookIcon = new JLabel();
        finishButton = new JButton();
        startTime = new JTextField();
        endTime = new JPasswordField();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setLayout(null);

            //---- bookIcon ----
            bookIcon.setText("BOOK");
            bookIcon.setBackground(Color.white);
            bookIcon.setHorizontalAlignment(SwingConstants.CENTER);
            bookIcon.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            body.add(bookIcon);
            bookIcon.setBounds(300, 0, 120, 60);

            //---- finishButton ----
            finishButton.setText("FINISH");
            finishButton.setBackground(new Color(217, 0, 27));
            finishButton.setForeground(Color.white);
            finishButton.setBorderPainted(false);
            finishButton.addActionListener(e -> finishButtonActionPerformed(e));
            body.add(finishButton);
            finishButton.setBounds(205, 345, 300, 50);

            //---- startTime ----
            startTime.setBackground(new Color(242, 242, 242));
            startTime.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
            body.add(startTime);
            startTime.setBounds(160, 85, 475, 50);

            //---- endTime ----
            endTime.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
            endTime.setBackground(new Color(242, 242, 242));
            body.add(endTime);
            endTime.setBounds(160, 190, 475, 50);

            //---- label1 ----
            label1.setText("StartTime:");
            label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 26));
            body.add(label1);
            label1.setBounds(15, 90, 145, 40);

            //---- label2 ----
            label2.setText("EndTime:");
            label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 26));
            body.add(label2);
            label2.setBounds(30, 190, 130, 40);

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
        body.setBounds(0, 0, 735, 415);

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
    private JLabel bookIcon;
    private JButton finishButton;
    private JTextField startTime;
    private JPasswordField endTime;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        Book.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Book frame = new Book();
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
