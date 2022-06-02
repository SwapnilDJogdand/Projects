package travel.managment.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(380,80,900,600);
        
        String[] package1 = new String[]{"Platanium PACKAGE", " Economy + 3 nights", "Flight + Hotel Deals", "Half Day City Tour", "Daily Buffet", "Welcome Drinks on Arrival", "Full Day 2 Island Cruise", "English speaking Guid + Hindi", "BOOK NOW", "SUMMER SPECIAL", "Rs 45000/-", "hotel10.jpg"};
        String[] package2 = new String[]{"Diamond PACKAGE", "Economy + 2 nights", "Explore the area", "Meet and Greet at Airport", "Welcome Drinks at Arrival", "Night Safari", "Half Day Cruise", "Cruise with Dinner", "BOOK NOW", "WINTER SPECIAL", "Rs 30000/-", "package2.jpg"};
        String[] package3 = new String[]{"Gold PACKAGE", "Economy + 6 nights", "Return Airfare", "Free Clubbing", "Horse Riding and Other Games", "Drinks on arriaval Safari", "Stay in 4 star hotel", "BBQ Dinner", "BOOK NOW", "WINTER SPECIAL", "Rs 25000/-", "package3.jpg"};
        String[] package4 = new String[]{"Silver PACKAGE", "Economy + 7 nights", "Flight", "Free Pool", " Games Tennis and also included other games", "Drinks and brakfast", "Stay in 5 star hotel", "Circa Dinner", "BOOK NOW", "Summer SPECIAL", "Rs 20000/-", "package3.jpg"};
        String[] package5 = new String[]{"Bronze PACKAGE", "Economy + 5 nights", "Only Hotel Deals", "Free  Wifi + Pool + Parking included", " Pool Games", "Goodtime Safari", "Stay in 3 star hotel", "BlueMoon Dinner", "BOOK NOW", "WINTER SPECIAL", "Rs 15000/-", "package3.jpg"};   
        
        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        pane.addTab(" Platanium",null, p1);
  
       JPanel p2 = createPackage(package2);
       pane.addTab("Diamond",null, p2);
    
       JPanel p3 = createPackage(package3);
        pane.addTab("Gold ",null, p3);
        
        JPanel p4 = createPackage(package4);
        pane.addTab("Silver ",null, p4);
        
        JPanel p5 = createPackage(package5);
        pane.addTab("Bronze ",null, p5);

    add(pane,BorderLayout.CENTER);
    
    
    }
    public JPanel createPackage(String[] pack){
        
         JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
         JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,30));
        p1.add(l1);
        
          JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);
        
         
         JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);
        
         
         JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.blue);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);
        
         
         JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);
        
          
         JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30,270,300,30);
        l6.setForeground(Color.blue);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l6);
        
          
         JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30,320,300,30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30,370,300,30);
        l8.setForeground(Color.blue);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(30,430,300,30);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(300,470,300,30);
        l10.setForeground(Color.blue);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(600,470,300,30);
        l11.setForeground(Color.RED);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l11);
        
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 0, 500, 400);
        p1.add(l12);
        
    
        
         return p1;
    }
    

    public static void main(String[] args){
        new CheckPackage().setVisible(true);
    }
    
}
