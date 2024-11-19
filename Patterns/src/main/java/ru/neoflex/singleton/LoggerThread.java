package ru.neoflex.singleton;


public class LoggerThread implements Runnable {

    @Override
    public void run() {
        System.out.println("getInstance() was called from the second thread: " + Logger.getInstance());
    }
}
