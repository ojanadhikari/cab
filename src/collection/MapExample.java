package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(4, "gsrey");

        System.out.println(map.size());
        System.out.println(map.get(2));
    }
}
