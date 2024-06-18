package oop.statics;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-17
 **/
public class Main {

    public static void main(String[] args) {
        NonStaticEx obj = new NonStaticEx();
        System.out.println(obj.getId());

        StaticEx.id =1;
        System.out.println(StaticEx.id);
    }
}
