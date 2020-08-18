package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        miles = input.nextDouble();
        System.out.println("Gas consumed in gallons: ");
        gas = input.nextDouble();
        input.close();


        mpg = miles / gas;
        System.out.println("Miles per gallon: " + mpg);
    }
}
