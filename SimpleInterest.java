import java.awt.event.*;
import javax.swing.*;

public class SimpleInterest {
    SimpleInterest() {
        JFrame jframe = new JFrame("Simple Interest");

        JLabel lblPrincipal = new JLabel("Principal");
        lblPrincipal.setBounds(20, 30, 150, 20);
        jframe.add(lblPrincipal);

        JTextField txtPrincipal = new JTextField();
        txtPrincipal.setBounds(150, 30, 150, 20);
        jframe.add(txtPrincipal);

        JLabel lblRate = new JLabel("Rate (%)");
        lblRate.setBounds(20, 55, 150, 20);
        jframe.add(lblRate);

        JTextField txtRate = new JTextField();
        txtRate.setBounds(150, 55, 150, 20);
        jframe.add(txtRate);

        JLabel lblTime = new JLabel("Time (years)");
        lblTime.setBounds(20, 80, 150, 20);
        jframe.add(lblTime);

        JTextField txtTime = new JTextField();
        txtTime.setBounds(150, 80, 150, 20);
        jframe.add(txtTime);

        JLabel lblSI = new JLabel("Simple Interest");
        lblSI.setBounds(20, 105, 150, 20);
        jframe.add(lblSI);

        JTextField txtSI = new JTextField();
        txtSI.setBounds(150, 105, 150, 20);
        txtSI.setEditable(false);
        jframe.add(txtSI);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(50, 135, 100, 30);
        jframe.add(btnCalculate);

        JButton btnCancel = new JButton("Clear");
        btnCancel.setBounds(170, 135, 100, 30);
        jframe.add(btnCancel);

        jframe.setLayout(null);
        jframe.setSize(400, 230);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Calculate Simple Interest
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double principal = Double.parseDouble(txtPrincipal.getText());
                    double rate = Double.parseDouble(txtRate.getText());
                    double time = Double.parseDouble(txtTime.getText());

                    double interest = (principal * rate * time) / 100;
                    txtSI.setText(String.format("%.2f", interest));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(jframe, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Clear All Fields
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtPrincipal.setText("");
                txtRate.setText("");
                txtTime.setText("");
                txtSI.setText("");
            }
        });
    }

    public static void main(String args[]) {
        new SimpleInterest();
    }
}
