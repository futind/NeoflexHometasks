package ru.neoflex.adapter;

import ru.neoflex.IDemo;
import ru.neoflex.adapter.storage.IUsbDrive;
import ru.neoflex.adapter.storage.SDCard;
import ru.neoflex.adapter.storage.UsbDrive;

public class AdapterDemo implements IDemo {

    @Override
    public void startDemo() {
        Computer computer = new Computer();

        IUsbDrive usbDrive = new UsbDrive();
        usbDrive.writeToUsb("Information on USB Drive.");
        computer.readUSB(usbDrive);

        SDCard sdCard = new SDCard();
        sdCard.writeInformation("Information on SD Card.");

        IUsbDrive cardReader = new CardReader(sdCard);
        computer.readUSB(cardReader);
    }
}
