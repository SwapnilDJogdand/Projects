/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.managment.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class devloperinfo extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public devloperinfo() {

        setLayout(null);
        
        
        JButton b1 = new JButton("Back");
        add(b1);
       b1.setBackground(new Color(204,153,255));
        b1.setBounds(180, 430, 120, 20);  // 180, 430, 120, 20
        b1.addActionListener(this);
    
        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                    Devloper Information          \n  "
                +"\n Hii I am Swapnil, Seeking a responsible position                                                            "
                + "\nin an organisation, whiich gives me a chance to improve" 
                + "knowledge enhance my skills and enable me to strive towards "
                + " the overall devlopment of the organistion. "
      
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);
        t1.setBackground(new Color(204,255,229));  // 204, 204, 255
        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("Devloper Information");
        add(l1);
        l1.setBounds(150, 10, 200, 80);
        l1.setForeground(Color.blue);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(500, 150, 500, 550);   // 500, 150, 500, 500
       
        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
          
        dispose();
    }

    public static void main(String args[]) {
        new devloperinfo().setVisible(true);
    }

}