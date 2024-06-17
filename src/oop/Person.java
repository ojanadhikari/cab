package oop;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Person {
    int height;
    int weight;

    void bmi(){
        System.out.println("BMI ="+height*weight);
    }

    Person(){
        weight = 4;
        height = 1;
    }

    Person(int height, int weight){
        this.height = height;
        this.weight = weight;
    }
}
