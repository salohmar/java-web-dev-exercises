package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        if (radius <= 0) {
            System.out.println("You must enter a positive number.");
        }

        input.close();
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
