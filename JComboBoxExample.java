import javax.swing.*;
public class JComboBoxExample {
 JFrame f;
 JComboBoxExample() {
 f = new JFrame("ComboBox Example");
 String p[] = {"BCA", "BIT", "BSCCSIT", "BE Computer",
"BIM",};
 JComboBox cb = new JComboBox(p);
 cb.setBounds(50, 50, 90, 20);
 f.add(cb);
 f.setLayout(null);
 f.setSize(400, 500);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);

 }
 public static void main(String[] args) {
 new JComboBoxExample();
 }
}