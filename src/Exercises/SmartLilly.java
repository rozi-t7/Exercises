package Exercises;

import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int presentPrice = Integer.parseInt(scanner.nextLine());
        int numberOfToys = 0;
        int savedMoney = 0;
        int moneyForBirthDay = 10;

        for(int currentYear = 1; currentYear <= age; currentYear++) {
            if (currentYear % 2 == 0) {
                savedMoney += (moneyForBirthDay - 1);
                moneyForBirthDay += 10;
            }else {
                numberOfToys++;

            }

        }
        savedMoney += numberOfToys * presentPrice;
        System.out.println((savedMoney >= priceOfWashingMachine ?
               String.format("Yes! %.2f", (savedMoney - priceOfWashingMachine))
                : String.format("No! %.2f", (priceOfWashingMachine - savedMoney))));

    }

}
