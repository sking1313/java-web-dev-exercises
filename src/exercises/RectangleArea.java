package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle's length: ");
        length = input.nextDouble();
        System.out.println("Enter the rectangle's width: ");
        width = input.nextDouble();
        input.close();


        area = length * width;
        System.out.println("The area of the triangle is: " + area);
    }

}
