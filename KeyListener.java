import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyListenerExample extends JFrame implements KeyListener {
    JLabel l;
    JTextArea area;

    KeyListenerExample() {
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);

        area = new JTextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);

        setTitle("Key Event");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
