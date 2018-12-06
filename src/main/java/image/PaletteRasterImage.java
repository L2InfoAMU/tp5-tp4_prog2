package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {
    private List<Color> palette;
    private int[][] indexesOfColors;
    private int width, height;

    public PaletteRasterImage(Color color, int width, int height){
        this.width =  width;
        this.height = height;
        this.palette = new ArrayList<Color>();
    }

    public PaletteRasterImage(Color[][] pixels){
        this.indexesOfColors = indexesOfColors;
        this.width = indexesOfColors.length;
        if(width == 0){
            throw new IllegalArgumentException("The matrix should not have a dimension equals to 0.");
        }
        this.height = indexesOfColors[0].length;
    }

    public void createRepresentation(){
        List<Color> palette = this.palette;
        int[][] indexesOfColors = this.indexesOfColors;
    }

    public void setPixelColor(Color color, int x, int y){
        Color pixelColor = palette.get(indexesOfColors[x][y]);
        pixelColor = color;

        for(int i = 0; i < indexesOfColors.length; i++){
            for(int j = 0; j < indexesOfColors.length; j++){
                if(palette.get(indexesOfColors[i][j]) != color){
                    palette.add(color);
                }
            }
        }
    }

    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    /*private void setPixelsColor(Color[][] pixels){
        Color[][] matrix = new PaletteRasterImage(pixels);
      }*/

    private void setPixelsColor(Color color){
        for(int i = 0; i < indexesOfColors.length; i++){
            for(int j = 0; j < indexesOfColors.length; j++){
                Color pixelColor = getPixelColor(i, j);
                pixelColor = color;
            }
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }

}
