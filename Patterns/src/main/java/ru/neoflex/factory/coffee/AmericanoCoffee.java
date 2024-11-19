package ru.neoflex.factory.coffee;

public class AmericanoCoffee extends ACoffee {
    public AmericanoCoffee() {
        this.coffeeType = CoffeeType.AMERICANO;
        this.withMilk = false;
    }
}
