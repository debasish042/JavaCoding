package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankAccount sbi = new BankAccount();

        Runnable task = new Runnable(){

            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
