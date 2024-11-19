package ru.neoflex.adapter;

import ru.neoflex.adapter.storage.IUsbDrive;

public class Computer {
    public void readUSB(IUsbDrive usbDrive) {
        System.out.println("Computer reads: " + usbDrive.readFromUsb());
    }
}
