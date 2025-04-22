import java.util.Arrays;
public class FloodFill {

    static final int ROW = 8;
    static final int COL = 8;

    // Recursive function for flood fill
    static void floodFill(int[][] screen, int x, int y, int newColor, int prevColor) {
        // Base cases
        if (x < 0 || x >= ROW || y < 0 || y >= COL) return;
        if (screen[x][y] != prevColor || screen[x][y] == newColor) return;

        // Change the color
        screen[x][y] = newColor;

        // Recur for 4 adjacent pixels
        floodFill(screen, x + 1, y, newColor, prevColor);
        floodFill(screen, x - 1, y, newColor, prevColor);
        floodFill(screen, x, y + 1, newColor, prevColor);
        floodFill(screen, x, y - 1, newColor, prevColor);
    }

    // Function to start the flood fill
    static void startFloodFill(int[][] screen, int x, int y, int newColor) {
        int prevColor = screen[x][y];
        if (prevColor != newColor) {
            floodFill(screen, x, y, newColor, prevColor);
        }
    }

    // Utility function to print the screen
    static void printScreen(int[][] screen) {
        for (int[] row : screen) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] screen = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 2, 2, 2, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 1, 1},
            {1, 2, 2, 3, 3, 2, 1, 1},
            {1, 2, 3, 3, 3, 2, 1, 1},
            {1, 2, 2, 3, 2, 2, 1, 1},
            {1, 1, 2, 2, 2, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1}
        };

        int x = 4, y = 4, newColor = 9;

        System.out.println("Original Screen:");
        printScreen(screen);

        startFloodFill(screen, x, y, newColor);

        System.out.println("\nScreen after Flood Fill:");
        printScreen(screen);
    }
}
