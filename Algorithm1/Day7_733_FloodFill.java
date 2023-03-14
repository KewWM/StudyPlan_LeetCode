package Algorithm1;

public class Day7_733_FloodFill
{
    public int[][] floodFill(int[][] image, int i, int j, int color)
    {
        if(color == image[i][j])
            return image;
        paintPixel(i, j, image.length, image[0].length, image, color, image[i][j]);
        return image;
    }
    void paintPixel(int i, int j, int n, int m, int[][] grid, int c, int v)
    {
        if(grid[i][j] == v )
        {
            grid[i][j] = c;
            if(isValidPixel(i+1, j, n, m))
                paintPixel(i+1, j, n, m, grid, c, v);
            if(isValidPixel(i, j+1, n, m))
                paintPixel(i, j+1, n, m, grid,c, v);
            if(isValidPixel(i-1, j, n, m))
                paintPixel(i-1, j, n, m, grid, c, v);
            if(isValidPixel(i, j-1, n, m))
                paintPixel(i, j-1, n, m, grid, c, v);
        }
    }

    boolean isValidPixel(int i, int j, int n, int m)
    {
        return (i >= 0 && j >= 0 && i < n && j < m );
    }
}
