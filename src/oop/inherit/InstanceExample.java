package oop.inherit;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class InstanceExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent instanceof GrandParent);
        GrandParent grandParent = new GrandParent();
        System.out.println(grandParent instanceof Parent);
    }
}
