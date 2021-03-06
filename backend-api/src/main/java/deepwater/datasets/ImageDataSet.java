package deepwater.datasets;

import java.io.IOException;
import java.util.List;

public class ImageDataSet {

    int channels;
    float[] meanData; //mean pixel value of the training data
    private int width;
    private int height;
    private int numClasses;

    public ImageDataSet(int width, int height, int channels, int numClasses){
        this.height = height;
        this.width = width;
        this.channels = channels;
        this.numClasses = numClasses;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public float[] getMeanData() {
        return meanData;
    }

    public void setMeanData(float[] meanData) {
        int dim = channels*width*height;
        if (meanData.length != dim) {
            throw new IllegalArgumentException("Invalid mean image data format. Expected length: " + dim + ", but has length: " + meanData.length);
        }

        this.meanData = meanData;
    }


    public int getNumClasses() {
        return numClasses;
    }

    public List<Pair<Integer,float[]>> loadImages(String... filename) throws IOException { return null; }
}

