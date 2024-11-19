package ru.neoflex.adapter.storage;

public class UsbDrive implements IUsbDrive {

    @Override
    public String readFromUsb() {
        return information;
    }

    @Override
    public void writeToUsb(String information) {
        this.information = information;
    }

    private String information;
}
