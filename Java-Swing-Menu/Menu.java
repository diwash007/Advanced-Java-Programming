
import javax.swing.*;

class Menu {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        JMenu openRecents = new JMenu("Open Recents");
        JMenuItem recent1 = new JMenuItem("passwords.txt");
        recent1.setEnabled(false);
        JMenuItem recent2 = new JMenuItem("data.txt");
        openRecents.add(recent1);
        openRecents.add(recent2);

        file.add(newFile);
        file.add(openRecents);
        file.add(save);
        file.add(exit);

        menuBar.add(file);

        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
