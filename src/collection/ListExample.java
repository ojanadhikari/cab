package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(list.size());
    }
}
