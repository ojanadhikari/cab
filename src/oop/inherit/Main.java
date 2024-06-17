package oop.inherit;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Main {
    public static void main(String[] args) {
        GrandParent g = new GrandParent();
        g.grandParentMethod();

        Parent p = new Parent();
        p.parentMethod();
        p.grandParentMethod();
        p.printproperty();
    }
}
