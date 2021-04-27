package exercises;

import java.util.Scanner;

public class MPH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed? ");
        double gallonsGas = input.nextDouble();

        input.close();

        double milesPerGallon = milesDriven / gallonsGas;
        System.out.println("You have driven " + milesPerGallon + "miles per gallon.");

    }
}
