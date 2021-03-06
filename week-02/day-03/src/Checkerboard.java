import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        Color[] colors = {Color.WHITE, Color.BLACK};

        int colorCounter = 0;

        for (int column = 0; column <= WIDTH; column += WIDTH / 8){
            for (int row = 0; row <= HEIGHT; row += HEIGHT / 8) {
                checkerBoard(graphics, column, row, colors[colorCounter]);
                colorCounter++;
                if (colorCounter == 2) {
                    colorCounter = 0;
                }
            }
        }
    }

    public static void checkerBoard(Graphics graph, int x, int y, Color color){
        int squareWidth = WIDTH / 8;
        int squareHeight = HEIGHT / 8;

        graph.setColor(color);
        graph.fillRect(x, y, squareWidth,squareHeight);
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