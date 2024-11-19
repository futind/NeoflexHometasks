package ru.neoflex.factory.machine;

import ru.neoflex.factory.coffee.ACoffee;
import ru.neoflex.factory.coffee.CoffeeType;

public class CoffeeMachine {

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        if (coffeeFactory == null) {
            throw new NullPointerException("coffeeFactory is null");
        }

        this.coffeeFactory = coffeeFactory;
    }

    public ACoffee brewCoffee(CoffeeType coffeeType) {
        ACoffee coffee = coffeeFactory.createCoffee(coffeeType);

        System.out.println("Brewing your coffee: " + coffee.getCoffeeType().toString().toLowerCase());

        if (coffee.HasMilk()) {
            addMilk();
        }

        System.out.println("Pouring your coffee into a cup.");

        return coffee;
    }

    private void addMilk() {
        System.out.println("Adding milk to your coffee");
    }

    private final CoffeeFactory coffeeFactory;
}
