package oop.statics;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-17
 **/
public class NonStaticEx {
    private int id;

    public NonStaticEx() {

    }

    public NonStaticEx(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
