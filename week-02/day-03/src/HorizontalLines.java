import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        graphics.setColor(new Color(65, 184, 244));
        graphics.fillOval(0,0,320,320);

        graphics.setColor(Color.ORANGE);
        graphics.fillOval(55,55,210,210);

        graphics.setColor(Color.YELLOW);
        graphics.fillOval(105,105,105,105);

        graphics.setColor(new Color(244, 66, 66));

        int shifter = 0;
        for (int i = 0; i <= 3; i++){
            drawingEasy(graphics, 0,shifter);
            shifter += 5;
        }
    }

    public static void drawingEasy(Graphics gra, int a, int b){
        for (int i = 0; i <= 50; i++){
            gra.drawLine(a,b,320, b);
            b += 10;
        }
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