package threading;

/**
 * @author Ozads
 * @version v1.0
 * @project CAB
 * @since 2024-05-29
 **/
public class Threads extends Thread {
   @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
           System.out.println(i);
       }
   }

   public static void main(String[] args) throws InterruptedException {
//       Thread.sleep(1000);
       Threads t = new Threads();
       Threads t2 = new Threads();
       t.start();
       t2.start();
   }
}
