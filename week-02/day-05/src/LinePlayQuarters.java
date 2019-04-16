import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
            drawLeftLines(graphics, 10,4);
            drawRightLines(graphics, 10,4);
            }

    public static void drawLeftLines(Graphics grp, int numberOfLines, int divisor){

        int x1 = 0;
        int y2 = HEIGHT / divisor;
        int width = WIDTH / divisor;

        grp.setColor(Color.green);

        for (int l = 0; l <= width; l+= width / numberOfLines){
            grp.drawLine(x1, l, l, y2);
        }
    }

    public static void drawRightLines (Graphics grp, int numberOfLines, int divisor){

        int y1 = 0;
        int x2 = WIDTH / divisor;
        int height = HEIGHT / divisor;

        grp.setColor(new Color(212, 66, 244));

        for (int l = 0; l <= height; l+= height / numberOfLines){
            grp.drawLine(l, y1, x2, l);
        }
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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