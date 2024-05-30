package generics;

// Define a generic class with a type parameter T
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box contains: " + integerBox.getContent());

        // Create a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getContent());
    }
}
