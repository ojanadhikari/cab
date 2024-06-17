package oop.abstraction;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-17
 **/
public class Main {

    public static void main(String[] args) {
//        AbstractParent parent = new AbsChild();
//        AbstractParent parent1 = new AbsChild2();
//
//        parent1.run();
//        parent.run();

        Inter inter = new InterImpl();
        Inter inter1 = new InterImpl();

        inter1.run();
        inter.run();

    }
}
