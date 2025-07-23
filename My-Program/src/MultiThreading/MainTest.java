package MultiThreading;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
//
//        MultiTest m = new MultiTest();
//        System.out.println(m.getState()); //New
//        m.start();
//        System.out.println(m.getState()); //RUNNING or RUNNABLE
//        Thread.sleep(2000);
//        System.out.println(m.getState());//time waiter
//       m.join();
//        System.out.println(m.getState());//time terminated

        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter();
        Thread th1 = new Thread(()->oddEvenPrinter.evenprint());
        Thread th2 = new Thread(()->oddEvenPrinter.evenprint());
        th1.start();
        th2.start();


}
}
