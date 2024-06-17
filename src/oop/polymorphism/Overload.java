package oop.polymorphism;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-17
 **/
public class Overload {

    void run(){
        System.out.println("Run 1");
    }

    int run(int a ){
        System.out.println("Run 2");
        return a;
    }

    void run(int a, int b){
        System.out.println("Run 3");
    }


}
