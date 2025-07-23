package MultiThreading;

public class OddEvenPrinter extends Thread {

    final static int num= 10;
    private int start =1;
    public void evenprint()
    {
       while(start <= num)
       {
           synchronized (this) {
               if (start % 2 == 0) {
                   System.out.println("Even number: " + start);
                   start++;
                   this.notify();
               } else {
                   try {
                       this.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
       }
    }

    public void oddprint()
    {
        synchronized (this) {
            if (start % 2 == 1) {
                System.out.println("Odd number: " + start);
                start++;
                this.notify();
            }
            else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
