
package travel.managment.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
       

public class ViewPaymentDetails extends JFrame implements ActionListener{
    
   JButton b2;
    ViewPaymentDetails(String username){
        setBounds(480,90,550,425);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
       JLabel l1 = new JLabel("Username :");
        l1.setBounds(30,50,150,25);
        add(l1);
        
       JLabel l11 = new JLabel("");
        l11.setBounds(220,50,150,25);
        add(l11);
      
        JLabel l2 = new JLabel("ID :");
        l2.setBounds(30,110,150,25);
        add(l2);
        
         JLabel l12 = new JLabel("");
        l12.setBounds(220,110,150,25);
        add(l12);
        
        
        JLabel l3 = new JLabel("Number :");
        l3.setBounds(30,170,150,25);
        add(l3);
        
        JLabel l13 = new JLabel("");
        l13.setBounds(200,170,150,25);
        add(l13);
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220,280,150,25);
        b2.addActionListener(this);
        add(b2);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from payment where username = '"+username+"'");
           while(rs.next()){
               l11.setText(rs.getString("username"));
               l12.setText(rs.getString("totalbill"));
               l13.setText(rs.getString("paymentmode"));
         
             }
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    ViewPaymentDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == b2){
            this.setVisible(false);
        }
        }
    
    public static void main(String[] args){
        new ViewPaymentDetails("").setVisible(true);
    }
}
