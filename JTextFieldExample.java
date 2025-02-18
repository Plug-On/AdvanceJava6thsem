import javax.swing.*;
class JTextFieldExample
{
public static void main(String args[])
 {
 JFrame f= new JFrame("TextField Example");
 JTextField t1,t2;
 t1=new JTextField(1);
 t1.setBounds(50,100, t1.getPreferredSize().width,30);

 t2=new JTextField("Bharatpur" ,50);
 t2.setBounds(50,150, 200,30);
 f.add(t1); f.add(t2);
 f.setSize(400,400);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 }
 } 