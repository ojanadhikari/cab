package reflection;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class MyClass {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyClass() {
    }

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
