package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-06-24
 **/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class myClass = Class.forName("reflection.MyClass");
        Method[] myMethods = myClass.getDeclaredMethods();
        Constructor[] myConstructors = myClass.getDeclaredConstructors();
        Field[] myFields = myClass.getDeclaredFields();

        System.out.println("METHODS ______________");

        for (Method method : myMethods) {
            System.out.println(method.getName());
        }
        System.out.println("CONSTRUCTORS ______________");

        for (Constructor constructor : myConstructors) {
            System.out.println(constructor.getName());
            System.out.println(constructor.getParameterCount());
        }
        System.out.println("FIELDS ______________");
        for (Field field : myFields) {
            System.out.println(field.getName());
        }
    }
}
