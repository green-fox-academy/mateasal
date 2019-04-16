import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        drawLeftLines(graphics, 4);
        drawRightLines(graphics, 4);
    }

    public static void drawLeftLines(Graphics grp, int numberOfLines){

        int x1 = 0;
        int y2 = HEIGHT;

        grp.setColor(Color.green);

        for (int l = 0; l <= WIDTH; l+= WIDTH / numberOfLines){
            grp.drawLine(x1, l, l, y2);
        }
    }

    public static void drawRightLines (Graphics grp, int numberOfLines){

        int y1 = 0;
        int x2 = WIDTH;

        grp.setColor(new Color(212, 66, 244));

        for (int l = 0; l <= HEIGHT; l+= HEIGHT / numberOfLines){
            grp.drawLine(l, y1, x2, l);
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