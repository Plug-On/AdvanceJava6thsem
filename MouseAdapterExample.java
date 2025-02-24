import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends MouseAdapter {
    Frame f;

    MouseAdapterExample() {
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);

        // Handle window close properly
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose(); // Close the window
                System.exit(0); // Terminate the program
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    // Draw a blue circle where the mouse is clicked
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
