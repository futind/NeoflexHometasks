package ru.neoflex.factory;

import ru.neoflex.IDemo;
import ru.neoflex.factory.coffee.ACoffee;
import ru.neoflex.factory.coffee.CoffeeType;
import ru.neoflex.factory.machine.CoffeeFactory;
import ru.neoflex.factory.machine.CoffeeMachine;

public class FactoryDemo implements IDemo {

    @Override
    public void startDemo() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);

        ACoffee coffeeAmericano = coffeeMachine.brewCoffee(CoffeeType.AMERICANO);
        ACoffee coffeeEspresso = coffeeMachine.brewCoffee(CoffeeType.ESPRESSO);
        ACoffee coffeeLatte = coffeeMachine.brewCoffee(CoffeeType.LATTE);
    }
}
