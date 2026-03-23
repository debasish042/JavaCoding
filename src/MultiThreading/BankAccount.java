package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 200;

    private final Lock lock = new ReentrantLock(true);

    void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw" + amount);

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >=amount){
                    try {
                    System.out.println(Thread.currentThread().getName()+"proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+"Completed withdrawn . Remaining balance" + balance);

                    } catch (Exception e) {
                        Thread.currentThread().interrupt();

                    } finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + "Not enough balance");
                }
            } else  {
                System.out.println(Thread.currentThread().getName() + "could not acquire lock plz try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();

        }
    }
}
