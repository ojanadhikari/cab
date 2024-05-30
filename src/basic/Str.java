package basic;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-27
 **/
public class Str {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s);

        String terminated = s.substring(1);
        System.out.println(terminated);

        String terminated2 = s.substring(1,5);
        System.out.println(terminated2);
    }
}
