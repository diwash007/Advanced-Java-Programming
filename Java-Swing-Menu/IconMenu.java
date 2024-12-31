
import javax.swing.*;

class IconMenu {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        ImageIcon saveIcon = new ImageIcon("./save.png");
        JMenuItem save = new JMenuItem("Save", saveIcon);
        file.add(save);

        menuBar.add(file);

        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
