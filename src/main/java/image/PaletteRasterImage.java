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
        this.width = indexesOfColors.length;
        if(width == 0){
            throw new IllegalArgumentException("The matrix should not have a dimension equals to 0.");
        }
        this.height = indexesOfColors[0].length;
        this.indexesOfColors = indexesOfColors;
    }

    public void createRepresentation(){
    }

    public void setPixelColor(Color color, int x, int y){
    }

    public Color getPixelColor(int x, int y){
    }

    private void setPixelsColor(Color[][] pixels){
    }

    private void setPixelsColor(Color color){
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
