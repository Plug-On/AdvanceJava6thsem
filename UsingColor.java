import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class UsingColor
{
 UsingColor()
 {
 JFrame f=new JFrame("color");

 JLabel lblName=new JLabel("Name");
 lblName.setBounds(10, 10, 200, 20);
 lblName.setForeground(Color.BLUE);
 f.add(lblName);

 JTextField txtFirstNum=new JTextField();
 txtFirstNum.setBounds(150,10,200,20);
 txtFirstNum.setBackground(Color.CYAN);
 f.add(txtFirstNum);

 f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 f.setTitle("Using Color");
 f.getContentPane().setBackground(Color.yellow);
 }
 public static void main(String args[])
 {
 new UsingColor();
 }
}