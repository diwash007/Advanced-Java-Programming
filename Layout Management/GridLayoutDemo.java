import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setSize(300, 300);
        f.setLayout(new GridLayout(2, 2, 10, 10));
        f.setVisible(true);
    }
}
