package ru.neoflex.adapter.storage;

public interface IUsbDrive {
    String readFromUsb();
    void writeToUsb(String information);
}
