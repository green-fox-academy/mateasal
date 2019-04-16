import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        HashMap<Integer, Color> color = new HashMap<>();

        color.put(0, Color.GRAY);
        color.put(1, Color.RED);
        color.put(2, Color.ORANGE);
        color.put(3, Color.MAGENTA);
        color.put(4, Color.YELLOW);
        color.put(5, Color.CYAN);

        int s = 320;
        int c = 0;

        for (int i = 0; i <= 32; i++){
            rainbowSquared(graphics, s, color.get(c));
            s -= 10;
            c ++;
            if (c == 5){
                c = 0;
            }
        }
    }

    public static void rainbowSquared(Graphics gra, int b, Color color){
        int w = b;
        int h = b;
        int x = (320 - w) / 2;
        int y = (320 - h) / 2;
        gra.setColor(color);
        gra.fillRect(x, y, w, h);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}