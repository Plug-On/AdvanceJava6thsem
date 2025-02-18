import java.awt.*;
import javax.swing.*;
class JPanelExample extends JFrame{
 static JFrame f;
 static JButton b,b1,b2;
 public static void main(String[] args)
 {
 f=new JFrame("panel");
 b=new JButton("Bibas");
 b1=new JButton("Asha");
 b2=new JButton("Rojana");
 JPanel p=new JPanel();
 p.add(b);
 p.add(b1);
 p.add(b2);
 p.setBounds(40,80,300,300);
 p.setBackground(Color.red);
 f.add(p);
 f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 }
 }