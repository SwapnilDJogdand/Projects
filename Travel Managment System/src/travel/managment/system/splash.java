package travel.managment.system;

import javax.swing.*;
import java.awt.*;
public class splash {
    public static void main(String[] args){
      SplashFrame frame= new SplashFrame(); 
      frame.setVisible(true);
      int x = 1;
      for(int i = 1;i<=550;i+=6, x+=7){   // 750
      frame.setLocation(750 - (x + i)/2, 230 - (i/4));   // 800
      frame.setSize(x + i, i);
      try{
          Thread.sleep(10);  // 10
      }catch(Exception e){}
      }
      frame.setVisible(true);
    }
}

class SplashFrame extends JFrame implements Runnable{
   Thread t1;
    SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/dest8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1220, 700, Image.SCALE_DEFAULT);   // 1600, 700  ,,2400, 1300
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
         
       // setBounds(200, 200, 1600, 700); // location, size
       setUndecorated(true);
       t1 = new Thread(this);
       t1.start();
    }
    public void run(){
       try{
           Thread.sleep(7000);  // 7000
          this.setVisible(false);
          
          new Login().setVisible(true);
                   }catch(Exception e){}
       } 
    }

