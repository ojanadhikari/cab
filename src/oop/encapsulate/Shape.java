package oop.encapsulate;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Shape {
    private int height;
    private int width;
    private int length;

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public void printVolume(){
        System.out.println(this.height*this.width*this.length);
    }

    public Shape(){

    }

    public Shape(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
