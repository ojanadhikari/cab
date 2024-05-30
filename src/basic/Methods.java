package basic;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Methods {

    public static void main(String[] args) {
        f1();
        f2(1,"Hello");
        System.out.println(f3(1));
        System.out.println(f4());
    }

    static void f1() {
        System.out.println("Hello World");
    }

    static void f2(int a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static int f3(int a) {
        return a;
    }

    static int f4() {
        return 1;
    }
}
