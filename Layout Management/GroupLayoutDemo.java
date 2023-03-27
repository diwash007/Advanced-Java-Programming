import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        JLabel label = new JLabel("Label");
        JButton button1 = new JButton("First");
        JButton button2 = new JButton("Second");

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(label)
                        .addGroup(
                                groupLayout.createParallelGroup()
                                        .addComponent(button1)
                                        .addComponent(button2)));

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup().addGroup(
                        groupLayout.createParallelGroup()
                                .addComponent(label)
                                .addGroup(
                                        groupLayout.createSequentialGroup()
                                                .addComponent(button1)
                                                .addComponent(button2))));

        frame.setVisible(true);
    }
}