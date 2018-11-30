package image;
import javafx.scene.paint.Color;
import java.util.Scanner;


public class BruteRasterImage implements Image{
    private final int width, height;
    Color pixelColor;
    private final Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        this.width =  width;
        this.height = height;
        this.pixels = new Color[width][height];

        for(int x = 1; x < pixels.length; x++){
            if(pixels[x].length != pixels[0].length){
                throw new IllegalArgumentException("The matrix should be rectangular.");
            }
        }
    }

    public BruteRasterImage(Color[][] pixels){
        this.width = pixels.length;
        if(width == 0){
            throw new IllegalArgumentException("The matrix should not have a dimension equals to 0.");
        }
        this.height = pixels[0].length;
        this.pixels = pixels.clone();
    }

    public void createRepresentation(){
        Color[][] matrix = this.pixels;
    }

    public void setPixelColor(Color color, int x, int y){
        Pixel pixel = new Pixel(x, y, color);
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){
          color = this.pixelColor;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    protected void setWidth(int width){


    }

    protected void setHeight(int height){

    }
}
