
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class App {

    JMenu file, openRecents;
    JMenuItem newFile, save, exit, recent1, recent2;
    JCheckBoxMenuItem autoSave;

    JPopupMenu zoom;
    JRadioButtonMenuItem x10, x25, x50, x100;

    App() {
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        file = new JMenu("File");
        newFile = new JMenuItem("New");
        ImageIcon saveIcon = new ImageIcon("./save.png");
        save = new JMenuItem("Save", saveIcon);
        exit = new JMenuItem("Exit");
        autoSave = new JCheckBoxMenuItem("Auto Save");

        openRecents = new JMenu("Open Recents");
        recent1 = new JMenuItem("passwords.txt");
        recent1.setEnabled(false);
        recent2 = new JMenuItem("data.txt");
        openRecents.add(recent1);
        openRecents.add(recent2);

        file.add(newFile);
        file.add(save);
        file.add(openRecents);
        file.add(autoSave);
        file.add(exit);

        menuBar.add(file);

        // Radio
        zoom = new JPopupMenu("Zoom");
        ButtonGroup bg = new ButtonGroup();
        x10 = new JRadioButtonMenuItem("10x", true);
        x25 = new JRadioButtonMenuItem("25x");
        x50 = new JRadioButtonMenuItem("50x");
        x100 = new JRadioButtonMenuItem("100x");

        bg.add(x10);
        bg.add(x25);
        bg.add(x50);
        bg.add(x100);

        zoom.add(x10);
        zoom.add(x25);
        zoom.add(x50);
        zoom.add(x100);

        menuBar.add(zoom);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                zoom.show(f, 100, 100);
            }

        });

        f.add(zoom);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new App();
    }
}
