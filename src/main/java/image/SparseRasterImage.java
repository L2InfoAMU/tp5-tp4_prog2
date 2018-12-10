package src.main.java.image;
import java.awt.*;
import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage {

    private int width, height;
    private Color pixelColor;
    private Color[][] pixels;
    private HashMap<Point,Color> map = new HashMap<Point,Color>();

    public SparseRasterImage(Color color, int width, int height){
        this.width =  width;
        this.height = height;
        this.pixels = new Color[width][height];

        for(int x = 1; x < pixels.length; x++){
            if(pixels[x].length != pixels[0].length){
                throw new IllegalArgumentException("The matrix should be rectangular.");
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){
        this.width = pixels.length;
        if(width == 0){
            throw new IllegalArgumentException("The matrix should not have a dimension equals to 0.");
        }
        this.height = pixels[0].length;
        this.pixels = pixels.clone();
    }

    public void createRepresentation(){
        HashMap<Point,Color> map = new HashMap<Point,Color>();
    }

    public void setPixelColor(Color color, int x, int y){
        Point point = new Point(x,y);
        map.put(point, color);
    }

    public Color getPixelColor(int x, int y){
        Point point = new Point(x,y);
        return map.get(point);
    }

    private void setPixelsColor(Color[][] pixels){
        SparseRasterImage matrix = new SparseRasterImage(pixels);
    }

    private void setPixelsColor(Color color){
        for(int i = 0; i < pixels.length; i++){
            for(int j = 0; j < pixels.length; j++){
                Color pixelColor = getPixelColor(i, j);
                pixelColor = color;
            }
        }
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }

}
