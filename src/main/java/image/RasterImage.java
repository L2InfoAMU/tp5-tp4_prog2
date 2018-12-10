package image;

public abstract class RasterImage {
    private int width, height;

    public RasterImage(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
