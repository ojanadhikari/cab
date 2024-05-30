package generics;

public class GenericMethodExample {

    // Define a generic method with a type parameter T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        // Call the generic method with Integer array
        printArray(intArray);

        // Call the generic method with String array
        printArray(stringArray);
    }
}
