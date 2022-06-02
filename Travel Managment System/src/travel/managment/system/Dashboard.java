package travel.managment.system;

import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b12, b15, b16, b17, b18, b19, b20;
    String username;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 60);
        p1.setBackground(new Color(0, 0, 102));
        // p1.setBackground(Color.white);
        add(p1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/house.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(0, 0, 70, 70);
        p1.add(l2);

        JLabel l3 = new JLabel("Tourism Mangment System");
        l3.setFont(new Font("Tahoma", Font.BOLD, 30));
        l3.setForeground(Color.white);
        l3.setBounds(500, 10, 450, 40);
        p1.add(l3);

        b17 = new JButton("  LogOut");
        b17.setBackground(new Color(51, 153, 255));
        //b17.setBackground(Color.green);
        b17.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b17.setForeground(Color.black);
        b17.setMargin(new Insets(0, 0, 0, 30));
        b17.setBounds(1230, 10, 120, 30);
        b17.addActionListener(this);
        p1.add(b17);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 60, 300, 1000);
        p2.setBackground(new Color(0, 0, 102));
        // p2.setBackground(Color.orange);
        add(p2);

        b1 = new JButton("Add Personal Detail");
        b1.setBackground(new Color(51, 153, 255));
        // b1.setBackground(Color.red);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 50));
        b1.setBounds(0, 10, 300, 40); // 0,10,300,40
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Update Personal Detail");
        b2.setBackground(new Color(0, 0, 102));
        // b2.setBackground(new Color(51,153,255));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 50));
        b2.setBounds(0, 50, 300, 40);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("View Personal Details");
        //b3.setBackground(new Color(0,0,102));
        b3.setBackground(new Color(51, 153, 255));
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 50));
        b3.setBounds(0, 90, 300, 40);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Delete Personal Detail");
        b4.setBackground(new Color(0, 0, 102));
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 50));
        b4.setBounds(0, 130, 300, 40);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Available Package");
        b5.setBackground(new Color(51, 153, 255));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0, 0, 0, 50));
        b5.setBounds(0, 170, 300, 40);
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("Book Package");
        b6.setBackground(new Color(0, 0, 102));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0, 0, 0, 50));
        b6.setBounds(0, 210, 300, 40);
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("View Package");
        b7.setBackground(new Color(51, 153, 255));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0, 0, 0, 50));
        b7.setBounds(0, 250, 300, 40);
        b7.addActionListener(this);
        p2.add(b7);

        b8 = new JButton("View Hotels");
        b8.setBackground(new Color(0, 0, 102));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
        b8.setMargin(new Insets(0, 0, 0, 50));
        b8.setBounds(0, 290, 300, 40);
        b8.addActionListener(this);
        p2.add(b8);

        b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(51, 153, 255));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setForeground(Color.WHITE);
        b9.setMargin(new Insets(0, 0, 0, 50));
        b9.setBounds(0, 330, 300, 40);
        b9.addActionListener(this);
        p2.add(b9);

        b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(0, 0, 102));
        b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b10.setForeground(Color.WHITE);
        b10.setMargin(new Insets(0, 0, 0, 50));
        b10.setBounds(0, 370, 300, 40);
        b10.addActionListener(this);
        p2.add(b10);

        b12 = new JButton("Payment");
        b12.setBackground(new Color(0, 0, 102));
        b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b12.setForeground(Color.WHITE);
        b12.setMargin(new Insets(0, 0, 0, 50));
        b12.setBounds(0, 410, 300, 40);
        b12.addActionListener(this);
        p2.add(b12);

        b18 = new JButton("DevloperInfo");
        b18.setBackground(new Color(51, 153, 255));
        b18.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b18.setForeground(Color.black); // white
        b18.setMargin(new Insets(0, 0, 0, 30)); // 50
        b18.setBounds(0, 450, 300, 40);  // 800,10,100,30
        b18.addActionListener(this);
        p2.add(b18);

        b15 = new JButton("About");
        b15.setBackground(new Color(0, 0, 102));
        b15.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b15.setForeground(Color.white); // white
        b15.setMargin(new Insets(0, 0, 0, 30)); // 50
        b15.setBounds(0, 490, 300, 40);  // 800,10,100,30
        b15.addActionListener(this);
        p2.add(b15);

        b19 = new JButton("Close");
        b19.setBackground(new Color(51, 153, 255));
        b19.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b19.setForeground(Color.white); // white
        b19.setMargin(new Insets(0, 0, 0, 30)); // 50
        b19.setBounds(0, 530, 300, 40);  // 800,10,100,30
        b19.addActionListener(this);
        p2.add(b19);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel Managment System\\src\\travel\\managment\\system\\icons\\destination3.jpg")); //travel/managment/system/icons/destination3.jpg
        Image i2 = i1.
                getImage().getScaledInstance(1750, 900, Image.SCALE_DEFAULT); // 1750, 1000
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1750, 900); //1950, 1000
        add(l1);

        /*  JLabel l4  = new  JLabel("Tourism Managment System");
       l4.setFont(new Font("Tahoma", Font.PLAIN, 45));
       l4.setForeground(Color.white);
       l4.setBounds(380,60,1000,70);
       p1.add(l4);  */
    }

    Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new AddCustomer(username).setVisible(true);
        } else if (ae.getSource() == b2) {
            new UpdateCustomer(username).setVisible(true);
        } else if (ae.getSource() == b3) {
            new ViewCustomers(username).setVisible(true);
        } else if (ae.getSource() == b5) {
            new CheckPackage().setVisible(true);
        } else if (ae.getSource() == b6) {
            new BookPackage(username).setVisible(true);
        } else if (ae.getSource() == b7) {
            new ViewPackage(username).setVisible(true);
        } else if (ae.getSource() == b8) {
            new CheckHotels().setVisible(true);
        } else if (ae.getSource() == b9) {
            new BookHotel(username).setVisible(true);
        } else if (ae.getSource() == b10) {
            new ViewBookedHotel(username).setVisible(true);
        } else if (ae.getSource() == b12) {
            new Payment(username).setVisible(true);
        } else if (ae.getSource() == b15) {
            new About().setVisible(true);
        } else if (ae.getSource() == b4) {
            new DeleteCustomer(username).setVisible(true);
        } else if (ae.getSource() == b17) {
            setVisible(false);
            new Login().setVisible(true);
        } else if (ae.getSource() == b18) {
            new devloperinfo().setVisible(true);
        } else if (ae.getSource() == b19) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
}
