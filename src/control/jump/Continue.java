package control.jump;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
}
