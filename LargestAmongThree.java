import javax.swing.*;
import java.awt.event.*;

public class LargestAmongThree {
    // Constructor for GUI
    public LargestAmongThree() {
        JFrame jframe = new JFrame("Largest among three");

        JLabel a = new JLabel("First number");
        a.setBounds(20, 30, 150, 20);
        jframe.add(a);

        JTextField txta = new JTextField();
        txta.setBounds(150, 30, 150, 20);
        jframe.add(txta);

        JLabel b = new JLabel("Second Number");
        b.setBounds(20, 55, 150, 20);
        jframe.add(b);

        JTextField txtb = new JTextField();
        txtb.setBounds(150, 55, 150, 20);
        jframe.add(txtb);

        JLabel c = new JLabel("Third number");
        c.setBounds(20, 80, 150, 20);
        jframe.add(c);

        JTextField txtc = new JTextField();
        txtc.setBounds(150, 80, 150, 20);
        jframe.add(txtc);

        JLabel lblLarge = new JLabel("Largest no:");
        lblLarge.setBounds(20, 105, 150, 20);
        jframe.add(lblLarge);

        JTextField txtLarge = new JTextField();
        txtLarge.setBounds(150, 105, 150, 20);
        txtLarge.setEditable(false);
        jframe.add(txtLarge);

        JButton btnCalculate = new JButton("Largest");
        btnCalculate.setBounds(50, 135, 100, 30);
        jframe.add(btnCalculate);

        JButton btnCancel = new JButton("Clear");
        btnCancel.setBounds(170, 135, 100, 30);
        jframe.add(btnCancel);

        jframe.setLayout(null);
        jframe.setSize(400, 230);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Calculate Largest Number
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double num1 = Double.parseDouble(txta.getText());
                    double num2 = Double.parseDouble(txtb.getText());
                    double num3 = Double.parseDouble(txtc.getText());

                    double largest = Math.max(num1, Math.max(num2, num3));
                    txtLarge.setText(String.format("%.2f", largest));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(jframe, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Clear All Fields
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txta.setText("");
                txtb.setText("");
                txtc.setText("");
                txtLarge.setText("");
            }
        });
    }

    // Main method
    public static void main(String args[]) {
        new LargestAmongThree();
    }
}
