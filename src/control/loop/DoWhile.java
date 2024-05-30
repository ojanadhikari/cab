package control.loop;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
        }while (counter < 10);
    }
}
