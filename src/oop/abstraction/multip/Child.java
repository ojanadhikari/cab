package oop.abstraction.multip;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-17
 **/
public class Child implements Parent,Parent2{
    @Override
    public void run() {
        System.out.println("child run");
    }
}
