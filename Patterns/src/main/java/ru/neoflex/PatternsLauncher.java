package ru.neoflex;

import ru.neoflex.adapter.AdapterDemo;
import ru.neoflex.factory.FactoryDemo;
import ru.neoflex.proxy.ProxyDemo;
import ru.neoflex.singleton.SingletonDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatternsLauncher {
    public static void main(String[] args) {
        System.out.println("Print 0 to exit.");
        System.out.println("Print 1 to see Singleton demonstration.");
        System.out.println("Print 2 to see Factory demonstration.");
        System.out.println("Print 3 to see Adapter demonstration.");
        System.out.println("Print 4 to see Proxy demonstration.");
        System.out.print("Enter your choice: ");

        try(Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                return;
            }

            IDemo demo = chooseDemo(choice);
            demo.startDemo();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("You have to input a number between 0 and 4.");
        }


    }

    private static IDemo chooseDemo(int number) {

        return switch (number) {
            case 1 -> new SingletonDemo();
            case 2 -> new FactoryDemo();
            case 3 -> new AdapterDemo();
            case 4 -> new ProxyDemo();
            default -> throw new IllegalArgumentException("Number must be from 1 to 4.");
        };
    }
}