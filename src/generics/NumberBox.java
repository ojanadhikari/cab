package generics;

// Define a generic class with a bounded type parameter T
public class NumberBox<T extends Number> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // This is valid since Integer is a subclass of Number
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setContent(123);
        System.out.println("Number Box contains: " + integerBox.getContent());

        // This will cause a compile-time error because String is not a subclass of Number
//         NumberBox<String> stringBox = new NumberBox<>();
    }
}
