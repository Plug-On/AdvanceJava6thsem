import java.awt.event.*;
import javax.swing.*;

public class SumDifference extends MouseAdapter {
    int a, b, c, d;
    JLabel lblFirstNumber = new JLabel("First Number");
    JTextField txtFirstNumber = new JTextField();
    JLabel lblSecondNumber = new JLabel("Second Number");
    JTextField txtSecondNumber = new JTextField();
    JLabel lblResult = new JLabel("Result");
    JTextField txtResult = new JTextField();

    SumDifference() {
        JFrame f = new JFrame("Sum & Difference");

        // First Number
        lblFirstNumber.setBounds(10, 10, 100, 20);
        f.add(lblFirstNumber);
        txtFirstNumber.setBounds(150, 10, 100, 20);
        f.add(txtFirstNumber);

        // Second Number
        lblSecondNumber.setBounds(10, 40, 100, 20);
        f.add(lblSecondNumber);
        txtSecondNumber.setBounds(150, 40, 100, 20);
        f.add(txtSecondNumber);

        // Result Label and Field
        lblResult.setBounds(10, 70, 100, 20);
        f.add(lblResult);
        txtResult.setBounds(150, 70, 100, 20);
        txtResult.setEditable(false);
        f.add(txtResult);

        // Add Mouse Listener
        f.addMouseListener(this);

        // Frame Settings
        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Main Method
    public static void main(String args[]) {
        new SumDifference();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            a = Integer.parseInt(txtFirstNumber.getText());
            b = Integer.parseInt(txtSecondNumber.getText());
            c = a + b;
            lblResult.setText("Sum:");
            txtResult.setText(String.valueOf(c));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            a = Integer.parseInt(txtFirstNumber.getText());
            b = Integer.parseInt(txtSecondNumber.getText());
            d = a - b;
            lblResult.setText("Difference:");
            txtResult.setText(String.valueOf(d));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
