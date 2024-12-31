
import javax.swing.*;

class RadioButtonMenu {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu zoom = new JMenu("Zoom");
        JRadioButtonMenuItem x10 = new JRadioButtonMenuItem("x10", true);
        JRadioButtonMenuItem x25 = new JRadioButtonMenuItem("x25");
        JRadioButtonMenuItem x50 = new JRadioButtonMenuItem("x50");
        JRadioButtonMenuItem x100 = new JRadioButtonMenuItem("x100");

        ButtonGroup bg = new ButtonGroup();
        bg.add(x50);
        bg.add(x10);
        bg.add(x25);
        bg.add(x100);

        zoom.add(x10);
        zoom.add(x25);
        zoom.add(x50);
        zoom.add(x100);

        menuBar.add(zoom);

        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
