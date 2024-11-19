package ru.neoflex.adapter.storage;

public class SDCard {

    public String getInformation() {
        return information;
    }

    public void writeInformation(String information) {
        this.information = information;
    }

    private String information;
}
