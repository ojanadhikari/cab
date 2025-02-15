package control.selection;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class SwitchEx {
    public static void main(String[] args) {
        int a  = 8;

        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
