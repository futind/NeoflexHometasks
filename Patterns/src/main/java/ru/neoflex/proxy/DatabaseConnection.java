package ru.neoflex.proxy;

public class DatabaseConnection implements IConnection {

    @Override
    public void connect(String destination) {
        System.out.println("Connected to " + destination);
    }
}
