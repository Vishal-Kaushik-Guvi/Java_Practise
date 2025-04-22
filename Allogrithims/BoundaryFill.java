import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoundaryFill extends JPanel {
    private int[][] canvas;
    private final int WIDTH = 400, HEIGHT = 400;
    private final int boundaryColor = Color.BLACK.getRGB();
    private final int fillColor = Color.RED.getRGB();

    public BoundaryFill() {
        canvas = new int[WIDTH][HEIGHT];

        // Draw a simple closed boundary (rectangle)
        for (int i = 50; i <= 250; i++) {
            canvas[i][50] = boundaryColor;
            canvas[i][250] = boundaryColor;
        }
        for (int j = 50; j <= 250; j++) {
            canvas[50][j] = boundaryColor;
            canvas[250][j] = boundaryColor;
        }

        // Start Boundary Fill at a point inside the rectangle
        boundaryFill(100, 100, fillColor, boundaryColor);
    }

    public void boundaryFill(int x, int y, int fillColor, int boundaryColor) {
        if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) return;
        if (canvas[x][y] == boundaryColor || canvas[x][y] == fillColor) return;

        // Fill the pixel
        canvas[x][y] = fillColor;

        // Recursive calls for 4-connected pixels
        boundaryFill(x + 1, y, fillColor, boundaryColor);
        boundaryFill(x - 1, y, fillColor, boundaryColor);
        boundaryFill(x, y + 1, fillColor, boundaryColor);
        boundaryFill(x, y - 1, fillColor, boundaryColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (canvas[x][y] == boundaryColor) {
                    g.setColor(Color.BLACK);
                } else if (canvas[x][y] == fillColor) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(x, y, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boundary Fill Algorithm");
        BoundaryFill panel = new BoundaryFill();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
