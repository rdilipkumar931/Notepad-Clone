
package notepad;
/**
 *
 * @author dilip
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener{
    JButton b1;
    
    About(){
        setBounds(400, 100, 600 ,500);
        setLayout(null);
        
        ImageIcon il =new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 =il.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70, 40, 400, 80);
        add(headerIcon);
        
        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 =i4.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(50, 180, 70, 70);
        add(icon);
        
        JLabel text = new JLabel("<html>This is Coded By DILIP KUMAR ROY<br> Version 0.1.0 (Os Build java)<br>"
                + "Code for Interview. all right reserved.</html>");
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        text.setBounds(150, 130, 500, 200);
        add(text);
        
        JButton b1= new JButton("OK");
        b1.setBounds(150,350,120,25);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }

    
    
}
