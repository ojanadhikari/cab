package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class ArraysandCollections {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,8,0,3};
        for(int i : a){
            System.out.println(i);
        }
        Arrays.sort(a);
        System.out.println("________Sorted Array_________");
        for(int i : a){
            System.out.println(i);
        }

        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(0);
        list.add(6);
        list.add(8);
        list.add(2);
        for (int i : list){
            System.out.println(i);
        }
        Collections.sort(list);
        for (int i : list){
            System.out.println(i);
        }

    }
}
