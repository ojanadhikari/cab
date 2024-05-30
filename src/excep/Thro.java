package excep;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Thro {
    public static void main(String[] args) {
        int a = 1 ;
        int b =0;
        try{
            System.out.println(divide(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static double divide(int d1, int d2) throws Exception{
        if(d2==0){
            throw new Exception("Divisor is zero");
        }
        return  d1 /d2;
    }
}
