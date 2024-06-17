package oop.inherit;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-10
 **/
public class Parent extends GrandParent{
    protected int land = 2;

    public void parentMethod(){
        System.out.println("I am method from parent");
    }

    public void printproperty(){
        System.out.println("Grandparent's property="+super.land);
        System.out.println("Own property="+this.land);
    }
}
