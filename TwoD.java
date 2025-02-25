import java.awt.*;
import javax.swing.*;
public class TwoD extends Canvas
{
public void paint(Graphics g)
{
 g.setColor(Color.BLACK);
 g.drawLine(200, 300, 400, 200);
 g.drawOval(60, 80, 100, 90);
 g.drawRect(200, 100, 150, 80);
 g.drawRoundRect(10,200,150, 80, 60, 90);
 int x[]={10, 30, 40, 50, 110, 140};
 int y[]={140, 110, 50, 40, 30, 10};
 int noofpoints=6;
 g.drawPolygon(x, y, noofpoints);
}
public static void main(String args[])
{
 TwoD c=new TwoD();
 JFrame f=new JFrame("2D Drawing");
 f.setSize(500, 500);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.getContentPane().add(c);
 f.setVisible(true);
}
}