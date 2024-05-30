package control.selection;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class IfElseIf {
    public static void main(String[] args) {
        int marks =79;
        if(marks>=80 && marks<100){
            System.out.println("Distinction");
        }else if(marks>=70 && marks<80){
            System.out.println("1st div");
        }else if(marks>=60 && marks<70){
            System.out.println("2nd div");
        }else if(marks>=40 && marks<60){
            System.out.println("3rd div");
        }else {
            System.out.println("Fail");
        }
    }
}
