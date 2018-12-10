package main.java.image;
import javafx.scene.paint.Color;

import java.awt.Image;


public class BruteRasterImage extends RasterImage implements Image{

    //TODO : tester s'il n'y a pas eu de changements de comportement depuis l'écriture de la classe abstraite RasterImage

    private int width, height;
    Color pixelColor;
    private Color[][] pixels;

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
        this.pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        this.pixels = pixels;
    }

    private void setPixelsColor(Color color){
        this.pixelColor = color;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}
