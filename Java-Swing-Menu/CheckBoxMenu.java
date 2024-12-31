
import javax.swing.*;

class CheckBoxMenu {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        JCheckBoxMenuItem autoSave = new JCheckBoxMenuItem("Auto Save", true);
        file.add(autoSave);

        menuBar.add(file);

        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
