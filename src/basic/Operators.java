package basic;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        boolean c  = true;
        boolean d = false;

        System.out.println(c&&d);
        System.out.println(c||d);
        System.out.println(!c);

        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
    }
}
