package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock(true);

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("outerMethod");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("innerMethod");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        example.outerMethod();
    }
}
