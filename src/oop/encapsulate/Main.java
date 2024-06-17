package oop.encapsulate;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Main {
    public static void main(String[] args) {
        Shape cube = new Shape(3,3,3);
        Shape cuboid  = new Shape();
        cuboid.setHeight(2);
        cuboid.setWidth(3);
        cuboid.setLength(4);

        cuboid.printVolume();
        cube.printVolume();
    }
}
