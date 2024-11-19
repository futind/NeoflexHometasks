package ru.neoflex.factory.coffee;

public abstract class ACoffee {

    public CoffeeType getCoffeeType() {
        return this.coffeeType;
    }

    public boolean HasMilk() {
        return this.withMilk;
    }

    protected CoffeeType coffeeType;
    protected boolean withMilk;
}
