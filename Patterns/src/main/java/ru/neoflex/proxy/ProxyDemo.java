package ru.neoflex.proxy;

import ru.neoflex.IDemo;

public class ProxyDemo implements IDemo {

    @Override
    public void startDemo() {
        IConnection databaseConnection = new DatabaseConnection();
        IConnection databaseProxy = new DatabaseProxy();

        databaseConnection.connect("testDB");
        databaseProxy.connect("testDB");
    }
}
