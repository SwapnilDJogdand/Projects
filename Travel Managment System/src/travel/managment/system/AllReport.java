/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.managment.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.awt.Color;

import net.proteanit.sql.*;
/**
 *
 * @author admin
 */
public class AllReport extends JFrame implements ActionListener{
    
    
    JButton b1,b2, b3, b4, b5;
    
    
    AllReport(){
        
        
        
         ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/splash5.jpeg"));
        Image i22 = i11.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel l12 = new JLabel(i33);
        l12.setBounds(350, 30, 300, 300);
        add(l12);
        
        
        JLabel l10 = new JLabel("AllReport");
         l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        l10.setBounds(200,10,400,30);
        l10.setForeground(Color.blue);
        add(l10);
        
       // all buttons...
        
        b1 = new JButton("Customer Report");
        b1.setBounds(50,100, 150, 30);   // 300, 600, 150, 30
        b1.addActionListener(this);
        add(b1);
        
        
         b2 = new JButton("Package Report");
        b2.setBounds(50,150, 150, 30);   // 300, 600, 150, 30
        b2.addActionListener(this);
        add(b2);
        
         b3 = new JButton("Hotel Report");
        b3.setBounds(50,200, 150, 30);   // 300, 600, 150, 30
        b3.addActionListener(this);
        add(b3);
        
        
         b5 = new JButton("Payment Report");
        b5.setBounds(50,250, 150, 30);   // 300, 600, 150, 30
        b5.addActionListener(this);
        add(b5);
        
         b4 = new JButton("Back");
        b4.setBounds(50,300, 150, 30);
         b4.addActionListener(this);
       add(b4);
        
        setLayout(null);
        setBounds(400,140,690,390);//230,60,1100, 700
         getContentPane().setBackground(new Color(204,204,255));   // 204,204,255
        setVisible(true);
        
     
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            new customerReport().setVisible(true);
        }  
        else if(ae.getSource()==b2){
           new packageReport().setVisible(true);
        }
         else if(ae.getSource()==b3){
           new hotelReport().setVisible(true);
         }
        else if(ae.getSource()==b4){
           this.setVisible(false);
        }
        else if(ae.getSource()==b5){
            new paymentreport().setVisible(true);
        }
    }
    public static void main(String[] args){
        new AllReport().setVisible(true);
    }
}
