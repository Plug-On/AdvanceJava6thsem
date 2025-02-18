import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
 JFrame f;
 JTable j;
 JTableExample()
 {
 f = new JFrame();
 f.setTitle("JTable Example");
 String[][] data = {
 { "Rabin Shrestha", "BCA" },
 { "Suhana Baral","BIT" },
 {"Adarsha Parajuli","BSCCSIT"}
 };
 String[] columnNames = { "Name", "Department" };
 j = new JTable(data, columnNames);
 j.setBounds(30, 40, 200, 300);
 JScrollPane sp = new JScrollPane(j);
 f.add(sp);
 f.setSize(500, 200);
 f.setVisible(true);
 }
 public static void main(String[] args)
 {
 new JTableExample();
 }
}
