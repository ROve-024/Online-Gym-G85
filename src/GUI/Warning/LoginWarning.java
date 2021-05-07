/*
 * Created by JFormDesigner on Thu May 06 22:31:36 CST 2021
 */

package GUI.Warning;

import java.awt.event.*;
import javax.swing.border.*;
import GUI.Other.Login;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class LoginWarning extends JFrame {
    public LoginWarning() {
        initComponents();
    }

    private void confirmButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainPenel = new JPanel();
        titlePanel = new JPanel();
        warningIcon = new JLabel();
        tips = new JLabel();
        confirmButton = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/warning.png")).getImage());
        setTitle("Warning");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== mainPenel ========
        {
            mainPenel.setBackground(Color.white);
            mainPenel.setBorder(null);
            mainPenel.setLayout(null);

            //======== titlePanel ========
            {
                titlePanel.setBackground(SystemColor.textHighlightText);
                titlePanel.setLayout(null);

                //---- warningIcon ----
                warningIcon.setIcon(new ImageIcon(getClass().getResource("/resources/icons/warning.png")));
                titlePanel.add(warningIcon);
                warningIcon.setBounds(30, 15, 25, 25);

                //---- tips ----
                tips.setText("Wrong password, please try again.");
                tips.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
                tips.setForeground(Color.gray);
                titlePanel.add(tips);
                tips.setBounds(65, 13, 310, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < titlePanel.getComponentCount(); i++) {
                        Rectangle bounds = titlePanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = titlePanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    titlePanel.setMinimumSize(preferredSize);
                    titlePanel.setPreferredSize(preferredSize);
                }
            }
            mainPenel.add(titlePanel);
            titlePanel.setBounds(10, 15, 400, 50);

            //---- confirmButton ----
            confirmButton.setText("  CONFIRM  ");
            confirmButton.setBackground(new Color(240, 128, 128));
            confirmButton.setForeground(Color.white);
            confirmButton.addActionListener(e -> confirmButtonActionPerformed(e));
            mainPenel.add(confirmButton);
            confirmButton.setBounds(150, 95, 120, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < mainPenel.getComponentCount(); i++) {
                    Rectangle bounds = mainPenel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = mainPenel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                mainPenel.setMinimumSize(preferredSize);
                mainPenel.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(mainPenel);
        mainPenel.setBounds(0, 0, 420, 150);

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
    private JPanel mainPenel;
    private JPanel titlePanel;
    private JLabel warningIcon;
    private JLabel tips;
    private JButton confirmButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        LoginWarning.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginWarning frame = new LoginWarning();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
