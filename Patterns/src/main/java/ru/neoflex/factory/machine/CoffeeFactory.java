package ru.neoflex.factory.machine;

import ru.neoflex.factory.coffee.*;

public class CoffeeFactory {
    // Собственно наш фабричный метод
    public ACoffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case CoffeeType.AMERICANO -> new AmericanoCoffee();
            case CoffeeType.ESPRESSO -> new EspressoCoffee();
            case CoffeeType.LATTE -> new LatteCoffee();
        };
    }
}
