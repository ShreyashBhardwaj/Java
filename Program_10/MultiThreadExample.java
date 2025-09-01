package Program_10;
//Done
public class MultiThreadExample {
    public static void main(String args[])
    {
        for (int i = 0; i <3 ; i++) {
            Thread t1 = new GoodMorningThread();
            t1.start();
            try { t1.join(); Thread.sleep(1000); } catch (Exception e) {}

            Thread t2 = new HelloThread();
            t2.start();
            try { t2.join(); Thread.sleep(2000); } catch (Exception e) {}

            Thread t3 = new WelcomeThread();
            t3.start();
            try { t3.join(); Thread.sleep(3000); } catch (Exception e) {}
        }
    }
}
