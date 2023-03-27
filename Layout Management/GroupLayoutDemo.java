import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 600);

        Container c = f.getContentPane();
        GroupLayout gl = new GroupLayout(c);
        c.setLayout(gl);

        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(btn1)
                .addGroup(
                        gl.createParallelGroup()
                                .addComponent(btn2)
                                .addComponent(btn3)));

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(btn1)
                .addGroup(
                        gl.createSequentialGroup()
                                .addComponent(btn2)
                                .addComponent(btn3)));

        f.setVisible(true);
    }
}