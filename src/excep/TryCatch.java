package excep;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class TryCatch {
    public static void main(String[] args) {
        int a = 1 ;
        int b =0;
        System.out.println(divide(a,b));
//        try{
//            System.out.println(divide(a,b));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    static double divide(int d1, int d2){
        return  d1 /d2;
    }


}
