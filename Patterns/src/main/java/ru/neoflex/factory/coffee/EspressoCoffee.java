package ru.neoflex.factory.coffee;

public class EspressoCoffee extends ACoffee {
    public EspressoCoffee() {
        this.coffeeType = CoffeeType.ESPRESSO;
        this.withMilk = false;
    }
}
