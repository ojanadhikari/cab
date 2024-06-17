package oop;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Main {
    public static void main(String[] args) {
//        Person ram = new Person();
//        ram.height = 10;
//        ram.weight = 60;
//        ram.bmi();

        Person a = new Person();
        System.out.println(a.height);
        System.out.println(a.weight);

        Person b = new Person(10,20);
        System.out.println(b.height);
        System.out.println(b.weight);
    }
}
