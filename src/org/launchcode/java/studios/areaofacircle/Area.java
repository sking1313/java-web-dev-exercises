package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + area);
    }
}
