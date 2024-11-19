package ru.neoflex.factory.coffee;

public class LatteCoffee extends ACoffee {
    public LatteCoffee() {
        this.coffeeType = CoffeeType.LATTE;
        this.withMilk = true;
    }
}
