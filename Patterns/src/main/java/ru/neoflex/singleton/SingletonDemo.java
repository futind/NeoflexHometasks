package ru.neoflex.singleton;

import ru.neoflex.IDemo;

public class SingletonDemo implements IDemo {

    @Override
    public void startDemo() {
        Thread thread = new Thread(new LoggerThread());
        thread.start();

        Logger logger = Logger.getInstance();

        /*
        В двух потоках будет вызван метод getInstance и double-checked locking
        обеспечит нам то, что не будет создано два объекта класса Logger
         */
        System.out.println("getInstance() was called from the first thread: " + logger);

        Integer integerInstance = 42;
        Double doubleInstance = 0.01;

        logger.classLog(integerInstance, "This is an instance of an Integer class with a value of " + integerInstance);
        logger.classLog(doubleInstance, "This is an instance of a Double class with a value of " + doubleInstance);
        logger.classLog(logger, "This is an instance of a Logger class :)");
    }

}
