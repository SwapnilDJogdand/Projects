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
public class customerReport extends JFrame implements ActionListener{
    
    JLabel l10;
    JTable t1;
    JButton b1,b2;
    
    
    customerReport(){
        
        JLabel l10 = new JLabel("Customer Report");
         l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        l10.setBounds(440,10,400,30);
        l10.setForeground(Color.blue);
        add(l10);
        
        
        t1=new JTable();
        t1.setBounds(0,80,1040,500);
        add(t1);
        
        //username, ID, number, name,gender, country, address,  phone no, email
        
        
        JLabel l1 = new JLabel("Name");
        l1.setBounds(30,50,70,20);
        add(l1);
        
         JLabel l2 = new JLabel("ID");
        l2.setBounds(150,50,70,20);
        add(l2);
        
         JLabel l3 = new JLabel("Number");
        l3.setBounds(240,50,70,20);
        add(l3);
        
         JLabel l4 = new JLabel("Name");
        l4.setBounds(330,50,70,20);
        add(l4);
        
         JLabel l5 = new JLabel("Gender");
        l5.setBounds(440,50,70,20);
        add(l5);
       
         JLabel l6 = new JLabel("Country");
        l6.setBounds(560,50,70,20);
        add(l6);
        
        JLabel l7 = new JLabel("Address");
        l7.setBounds(660,50,70,20);
        add(l7);
        
        
        JLabel l8 = new JLabel("Phone No");
        l8.setBounds(760,50,70,20);
        add(l8);
        
         JLabel l9 = new JLabel("Email");
        l9.setBounds(860,50,70,20);
        add(l9);
        
        
        
        b1 = new JButton("Load Data");
        b1.setBounds(300,600, 130, 30);
        b1.addActionListener(this);
        add(b1);
        
         b2 = new JButton("Back");
        b2.setBounds(500,600, 130, 30);
         b2.addActionListener(this);
       add(b2);
        
        setLayout(null);
        setBounds(230,60,1100,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            try{
               Conn c = new Conn(); 
               String str = "select *from customer";
               ResultSet rs = c.s.executeQuery(str);
               
               t1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
                
            }
            
            
        }else if(ae.getSource()==b2){
           this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new customerReport().setVisible(true);
    }
}
