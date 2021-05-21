/*
 * Created by JFormDesigner on Mon May 10 11:04:47 CST 2021
 */

package gui.member;

import controller.ClientFunction;
import gui.coach.ProfileCoach;
import gui.other.UserBuffer;
import io.client.ClientData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Anna
 */
public class OpenVip extends JFrame {
    public OpenVip() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {     //PURCHASE Action
        // TODO add your code here
        ClientData clientData = UserBuffer.getClientSession();
        if(levelChoice1.isSelected()){
            clientData.setVIPlevel("1");
        }
        else if(levelChoice2.isSelected()){
            clientData.setVIPlevel("2");
        }
        else{
            clientData.setVIPlevel("3");
        }
        ClientFunction.updateClientInfo(clientData);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        currentLevelTips = new JLabel();
        currentLevel = new JLabel();
        currentLevelTips2 = new JLabel();
        vipPanel1 = new JPanel();
        vipIcon = new JLabel();
        decorationLine2 = new JLabel();
        levelTips1 = new JLabel();
        vipFeature1 = new JLabel();
        levelChoice1 = new JRadioButton();
        reduceNumb = new JLabel();
        reduceTips1 = new JLabel();
        PriceTips1 = new JLabel();
        PriceTips2 = new JLabel();
        vipPanel2 = new JPanel();
        vipIcon2 = new JLabel();
        decorationLine3 = new JLabel();
        levelTips2 = new JLabel();
        vipFeature2 = new JLabel();
        levelChoice2 = new JRadioButton();
        reduceNumb2 = new JLabel();
        reduceTips2 = new JLabel();
        PriceTips3 = new JLabel();
        PriceTips4 = new JLabel();
        vipFeature4 = new JLabel();
        vipPanel3 = new JPanel();
        vipIcon3 = new JLabel();
        decorationLine4 = new JLabel();
        levelTips3 = new JLabel();
        levelChoice3 = new JRadioButton();
        reduceNumb3 = new JLabel();
        reduceTips3 = new JLabel();
        vipFeature3 = new JLabel();
        vipFeature5 = new JLabel();
        vipFeature6 = new JLabel();
        PriceTips5 = new JLabel();
        PriceTips6 = new JLabel();
        button1 = new JButton();

        //======== this ========
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
            title.setText("VIP Purchase ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(25, 45, 245, title.getPreferredSize().height);

            //---- currentLevelTips ----
            currentLevelTips.setText("You are a distinguished ");
            currentLevelTips.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            body.add(currentLevelTips);
            currentLevelTips.setBounds(30, 125, 145, currentLevelTips.getPreferredSize().height);

            //---- currentLevel ----
            currentLevel.setText("Level 1");
            currentLevel.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 14));
            body.add(currentLevel);
            currentLevel.setBounds(168, 124, 55, 17);

            //---- currentLevelTips2 ----
            currentLevelTips2.setText(" member.");
            currentLevelTips2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            body.add(currentLevelTips2);
            currentLevelTips2.setBounds(218, 125, 75, 17);

            //======== vipPanel1 ========
            {
                vipPanel1.setBackground(Color.white);
                vipPanel1.setBorder(new LineBorder(Color.lightGray));
                vipPanel1.setLayout(null);

                //---- vipIcon ----
                vipIcon.setBackground(Color.lightGray);
                vipIcon.setIcon(new ImageIcon(getClass().getResource("/resources/icons/VIP1.png")));
                vipPanel1.add(vipIcon);
                vipIcon.setBounds(75, 30, 80, 80);

                //---- decorationLine2 ----
                decorationLine2.setBackground(Color.black);
                decorationLine2.setBorder(new LineBorder(Color.lightGray));
                vipPanel1.add(decorationLine2);
                decorationLine2.setBounds(15, 145, 200, 2);

                //---- levelTips1 ----
                levelTips1.setText("Level 1");
                levelTips1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                levelTips1.setHorizontalAlignment(SwingConstants.CENTER);
                vipPanel1.add(levelTips1);
                levelTips1.setBounds(65, 160, 100, 17);

                //---- vipFeature1 ----
                vipFeature1.setText("Basic Vip Videos");
                vipFeature1.setForeground(Color.gray);
                vipFeature1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel1.add(vipFeature1);
                vipFeature1.setBounds(70, 195, 100, vipFeature1.getPreferredSize().height);

                //---- levelChoice1 ----
                levelChoice1.setBackground(Color.white);
                vipPanel1.add(levelChoice1);
                levelChoice1.setBounds(105, 365, 20, 20);

                //---- reduceNumb ----
                reduceNumb.setText("35");
                reduceNumb.setFont(reduceNumb.getFont().deriveFont(reduceNumb.getFont().getSize() + 4f));
                reduceNumb.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel1.add(reduceNumb);
                reduceNumb.setBounds(85, 295, 25, reduceNumb.getPreferredSize().height);

                //---- reduceTips1 ----
                reduceTips1.setText("%off");
                vipPanel1.add(reduceTips1);
                reduceTips1.setBounds(110, 299, 35, reduceTips1.getPreferredSize().height);

                //---- PriceTips1 ----
                PriceTips1.setText("$");
                PriceTips1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                PriceTips1.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel1.add(PriceTips1);
                PriceTips1.setBounds(95, 330, 15, 30);

                //---- PriceTips2 ----
                PriceTips2.setText("6");
                PriceTips2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 26));
                vipPanel1.add(PriceTips2);
                PriceTips2.setBounds(115, 330, 15, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < vipPanel1.getComponentCount(); i++) {
                        Rectangle bounds = vipPanel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = vipPanel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    vipPanel1.setMinimumSize(preferredSize);
                    vipPanel1.setPreferredSize(preferredSize);
                }
            }
            body.add(vipPanel1);
            vipPanel1.setBounds(30, 155, 230, 400);

            //======== vipPanel2 ========
            {
                vipPanel2.setBackground(Color.white);
                vipPanel2.setBorder(new LineBorder(Color.lightGray));
                vipPanel2.setLayout(null);

                //---- vipIcon2 ----
                vipIcon2.setBackground(Color.lightGray);
                vipIcon2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/VIP2.png")));
                vipPanel2.add(vipIcon2);
                vipIcon2.setBounds(75, 30, 80, 80);

                //---- decorationLine3 ----
                decorationLine3.setBackground(Color.black);
                decorationLine3.setBorder(new LineBorder(Color.lightGray));
                vipPanel2.add(decorationLine3);
                decorationLine3.setBounds(15, 145, 200, 2);

                //---- levelTips2 ----
                levelTips2.setText("Level 2");
                levelTips2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                levelTips2.setHorizontalAlignment(SwingConstants.CENTER);
                vipPanel2.add(levelTips2);
                levelTips2.setBounds(65, 160, 100, 17);

                //---- vipFeature2 ----
                vipFeature2.setText("Basic Vip Videos");
                vipFeature2.setForeground(Color.gray);
                vipFeature2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel2.add(vipFeature2);
                vipFeature2.setBounds(70, 195, 105, vipFeature2.getPreferredSize().height);

                //---- levelChoice2 ----
                levelChoice2.setBackground(Color.white);
                vipPanel2.add(levelChoice2);
                levelChoice2.setBounds(105, 365, 20, 20);

                //---- reduceNumb2 ----
                reduceNumb2.setText("35");
                reduceNumb2.setFont(reduceNumb2.getFont().deriveFont(reduceNumb2.getFont().getSize() + 4f));
                reduceNumb2.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel2.add(reduceNumb2);
                reduceNumb2.setBounds(85, 295, 25, reduceNumb2.getPreferredSize().height);

                //---- reduceTips2 ----
                reduceTips2.setText("%off");
                vipPanel2.add(reduceTips2);
                reduceTips2.setBounds(110, 299, 35, reduceTips2.getPreferredSize().height);

                //---- PriceTips3 ----
                PriceTips3.setText("$");
                PriceTips3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                PriceTips3.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel2.add(PriceTips3);
                PriceTips3.setBounds(90, 330, 15, 30);

                //---- PriceTips4 ----
                PriceTips4.setText("16");
                PriceTips4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 26));
                vipPanel2.add(PriceTips4);
                PriceTips4.setBounds(110, 330, 40, 30);

                //---- vipFeature4 ----
                vipFeature4.setText("More Vip Videos");
                vipFeature4.setForeground(Color.gray);
                vipFeature4.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel2.add(vipFeature4);
                vipFeature4.setBounds(69, 215, 111, 17);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < vipPanel2.getComponentCount(); i++) {
                        Rectangle bounds = vipPanel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = vipPanel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    vipPanel2.setMinimumSize(preferredSize);
                    vipPanel2.setPreferredSize(preferredSize);
                }
            }
            body.add(vipPanel2);
            vipPanel2.setBounds(285, 155, 230, 400);

            //======== vipPanel3 ========
            {
                vipPanel3.setBackground(Color.white);
                vipPanel3.setBorder(new LineBorder(Color.lightGray));
                vipPanel3.setLayout(null);

                //---- vipIcon3 ----
                vipIcon3.setBackground(Color.lightGray);
                vipIcon3.setIcon(new ImageIcon(getClass().getResource("/resources/icons/VIP3.png")));
                vipPanel3.add(vipIcon3);
                vipIcon3.setBounds(75, 30, 80, 80);

                //---- decorationLine4 ----
                decorationLine4.setBackground(Color.black);
                decorationLine4.setBorder(new LineBorder(Color.lightGray));
                vipPanel3.add(decorationLine4);
                decorationLine4.setBounds(15, 145, 200, 2);

                //---- levelTips3 ----
                levelTips3.setText("Level 3");
                levelTips3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                levelTips3.setHorizontalAlignment(SwingConstants.CENTER);
                vipPanel3.add(levelTips3);
                levelTips3.setBounds(65, 160, 100, 17);

                //---- levelChoice3 ----
                levelChoice3.setBackground(Color.white);
                vipPanel3.add(levelChoice3);
                levelChoice3.setBounds(105, 365, 20, 20);

                //---- reduceNumb3 ----
                reduceNumb3.setText("35");
                reduceNumb3.setFont(reduceNumb3.getFont().deriveFont(reduceNumb3.getFont().getSize() + 4f));
                reduceNumb3.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel3.add(reduceNumb3);
                reduceNumb3.setBounds(85, 295, 25, reduceNumb3.getPreferredSize().height);

                //---- reduceTips3 ----
                reduceTips3.setText("%off");
                vipPanel3.add(reduceTips3);
                reduceTips3.setBounds(110, 299, 35, reduceTips3.getPreferredSize().height);

                //---- vipFeature3 ----
                vipFeature3.setText("Basic Vip Videos");
                vipFeature3.setForeground(Color.gray);
                vipFeature3.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel3.add(vipFeature3);
                vipFeature3.setBounds(70, 195, 105, 17);

                //---- vipFeature5 ----
                vipFeature5.setText("More Vip Videos");
                vipFeature5.setForeground(Color.gray);
                vipFeature5.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel3.add(vipFeature5);
                vipFeature5.setBounds(69, 215, 111, 17);

                //---- vipFeature6 ----
                vipFeature6.setText("Book Offline Courses");
                vipFeature6.setHorizontalAlignment(SwingConstants.CENTER);
                vipFeature6.setForeground(Color.gray);
                vipFeature6.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
                vipPanel3.add(vipFeature6);
                vipFeature6.setBounds(50, 235, 135, 17);

                //---- PriceTips5 ----
                PriceTips5.setText("$");
                PriceTips5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                PriceTips5.setHorizontalAlignment(SwingConstants.RIGHT);
                vipPanel3.add(PriceTips5);
                PriceTips5.setBounds(85, 330, 15, 30);

                //---- PriceTips6 ----
                PriceTips6.setText("26");
                PriceTips6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 26));
                vipPanel3.add(PriceTips6);
                PriceTips6.setBounds(105, 330, 40, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < vipPanel3.getComponentCount(); i++) {
                        Rectangle bounds = vipPanel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = vipPanel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    vipPanel3.setMinimumSize(preferredSize);
                    vipPanel3.setPreferredSize(preferredSize);
                }
            }
            body.add(vipPanel3);
            vipPanel3.setBounds(535, 155, 230, 400);

            //---- button1 ----
            button1.setText("PURCHASE");
            button1.setBackground(new Color(240, 128, 128));
            button1.setForeground(Color.white);
            button1.addActionListener(e -> button1ActionPerformed(e));
            body.add(button1);
            button1.setBounds(340, 585, 120, 45);

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
        body.setBounds(0, 5, 800, 655);

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

        //---- purchChoice ----
        var purchChoice = new ButtonGroup();
        purchChoice.add(levelChoice1);
        purchChoice.add(levelChoice2);
        purchChoice.add(levelChoice3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel body;
    private JLabel decorationLine;
    private JLabel title;
    private JLabel currentLevelTips;
    private JLabel currentLevel;
    private JLabel currentLevelTips2;
    private JPanel vipPanel1;
    private JLabel vipIcon;
    private JLabel decorationLine2;
    private JLabel levelTips1;
    private JLabel vipFeature1;
    private JRadioButton levelChoice1;
    private JLabel reduceNumb;
    private JLabel reduceTips1;
    private JLabel PriceTips1;
    private JLabel PriceTips2;
    private JPanel vipPanel2;
    private JLabel vipIcon2;
    private JLabel decorationLine3;
    private JLabel levelTips2;
    private JLabel vipFeature2;
    private JRadioButton levelChoice2;
    private JLabel reduceNumb2;
    private JLabel reduceTips2;
    private JLabel PriceTips3;
    private JLabel PriceTips4;
    private JLabel vipFeature4;
    private JPanel vipPanel3;
    private JLabel vipIcon3;
    private JLabel decorationLine4;
    private JLabel levelTips3;
    private JRadioButton levelChoice3;
    private JLabel reduceNumb3;
    private JLabel reduceTips3;
    private JLabel vipFeature3;
    private JLabel vipFeature5;
    private JLabel vipFeature6;
    private JLabel PriceTips5;
    private JLabel PriceTips6;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        OpenVip.run();
    }

    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OpenVip frame = new OpenVip();
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
    private void init(){
        ClientData clientData = UserBuffer.getClientSession();
        this.currentLevel.setText("Level" + clientData.getVIPlevel());
    }

}
