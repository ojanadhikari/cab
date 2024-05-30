package generics;

import java.util.List;

public class WildcardExample {

    // Method with an upper bounded wildcard
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        // Both calls are valid
        printNumbers(intList);
        printNumbers(doubleList);
    }
}
