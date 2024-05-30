package basic;

import java.util.Scanner;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Enter an double: ");
        double d = scanner.nextDouble();
        System.out.println(d);

        System.out.println("Enter an string: ");
        String s = scanner.nextLine();
        System.out.println(s);

    }
}
