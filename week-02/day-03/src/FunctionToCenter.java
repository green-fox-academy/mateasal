import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        graphics.setColor(Color.BLACK);


        for (int x = 0; x <= 320; x += 20){
            if (x == 0){
                for (int y = 0; y <= 320; y += 20){
                    lineDraww(graphics, 0, y);
                }
            } else if (x == 320){
                for (int y = 0; y <= 320; y += 20){
                    lineDraww(graphics, 320, y);
                }
            }
        }

        for (int y = 0; y <= 320; y += 20){
            if (y == 0){
                for (int x = 0; x <= 320; x += 20){
                    lineDraww(graphics, x, 0);
                }
            } else if (y == 320){
                for (int x = 0; x <= 320; x += 20){
                    lineDraww(graphics, x, 320);
                }
            }
        }
    }

    public static void lineDraww(Graphics grapp, int x, int y){
        grapp.drawLine(x, y, 160, 160);
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