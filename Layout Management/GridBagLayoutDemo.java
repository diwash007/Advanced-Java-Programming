import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        f.setLayout(grid);
        GridBagLayout layout = new GridBagLayout();
        f.setLayout(layout);

        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(new Button("Button One"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(new Button("Button two"), gbc);

        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        f.add(new Button("Button Three"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        f.add(new Button("Button Four"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        f.add(new Button("Button Five"), gbc);

        f.setSize(300, 300);
        f.setVisible(true);
    }

}