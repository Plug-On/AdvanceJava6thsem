import java.awt.event.*;
import javax.swing.*;
public class Rectangle
{
 Rectangle()
 {
 JFrame jframe=new JFrame("Sum of two numbers");

 JLabel lblFirstNumber=new JLabel("Length");
 lblFirstNumber.setBounds(20, 30, 150, 20);
 jframe.add(lblFirstNumber);

 JTextField txtFirstNumber = new JTextField();
 txtFirstNumber.setBounds(150, 30, 150, 20);
 jframe.add(txtFirstNumber);

 JLabel lblSecondNumber=new JLabel("Breadth");
 lblSecondNumber.setBounds(20, 55, 150, 20);
 jframe.add(lblSecondNumber);

 JTextField txtSecondNumber=new JTextField();
 txtSecondNumber.setBounds(150, 55, 150, 20);
 jframe.add(txtSecondNumber);

 JLabel lblSum=new JLabel("Area of rectangle");
 lblSum.setBounds(20,80,150,20);
 jframe.add(lblSum);

 JTextField txtSum=new JTextField();
 txtSum.setBounds(150, 80, 150,20);
 jframe.add(txtSum);

 JButton btnAdd=new JButton("Find Area");
 btnAdd.setBounds(50, 110, 80, 20);
 jframe.add(btnAdd);

 JButton btnCancel=new JButton("Erase");
 btnCancel.setBounds(170, 110, 80, 20);
 jframe.add(btnCancel);

 jframe.setLayout(null);
 jframe.setSize(400, 200);
 jframe.setVisible(true);
 jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 btnAdd.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent ae)
 {
 int a=Integer.parseInt(txtFirstNumber.getText());
 int b=Integer.parseInt(txtSecondNumber.getText());
 int c=a*b;
 txtSum.setText(" "+c);
 }
 }
 );

 btnCancel.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent ae)
 {
 txtFirstNumber.setText(null);
 txtSecondNumber.setText(null);
 txtSum.setText(null);
 }
 }
 );
 }
 public static void main(String args[])
 {
 new Rectangle();

 }
}
