package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        System.out.println(set.size());
    }
}
