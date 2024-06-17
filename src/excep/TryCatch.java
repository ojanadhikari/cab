package excep;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class TryCatch {


    /*This is my
    main method */
    public static void main(String[] args) {
        int a = 6 ;
        int b =2;
//        System.out.println(divide(a,b));
        try{
            System.out.println(divide(a,b));
        }catch (Exception e){
            System.out.println("cannot divide , check input");
        }finally{
            System.out.println("Completed");
        }
    }

    //This method divides
    static double divide(int d1, int d2){
        return  d1 /d2;
    }


}
