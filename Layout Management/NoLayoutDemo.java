import javax.swing.*;

public class NoLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JLabel label1 = new JLabel("Hello");
        label1.setBounds(100, 100, 100, 30);

        JLabel label2 = new JLabel("World");
        label2.setBounds(100, 150, 100, 30);

        f.add(label1);
        f.add(label2);

        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }
}