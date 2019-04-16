import javax.swing.*;
import java.awt.*;

public class bucky {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Peach2 p = new Peach2();
        p.setBackground(Color.WHITE);
        f.add(p);
        f.setSize(500, 270);
        f.setVisible(true);
    }
}