import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        graphics.fillRect(0,0,320,320);

        HashMap<Integer, Color> color = new HashMap<>();

        color.put(0, Color.GRAY);
        color.put(1, Color.RED);
        color.put(2, Color.ORANGE);
        color.put(3, Color.MAGENTA);
        color.put(4, Color.YELLOW);
        color.put(5, Color.CYAN);

        lineDrawing(graphics,0, 180, Color.WHITE);

        int[] xpoints = {80, 160, 240};
        int[] ypoints = {200, 60, 200};

        graphics.fillPolygon(xpoints, ypoints, 3);

        int anotherLneY = 0;
        int c = 0;

        for (int i = 0; i <= 30; i++){
            lineDrawing(graphics, 320, anotherLneY, color.get(c));
            anotherLneY += 10;
            c ++;
            if(c == 5){
                c = 0;
            }
        }
    }

    public static void lineDrawing(Graphics gra, int a, int b, Color col){
        gra.setColor(col);
        gra.drawLine(a,b,WIDTH / 2,HEIGHT / 2);
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