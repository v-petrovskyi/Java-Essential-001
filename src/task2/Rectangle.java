package task2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть довжини сторін");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        System.out.println("Area = " + rectangle.areaCalculator(side1, side2));
        System.out.println("Perimeter = " + rectangle.perimeterCalculator(side1, side2));

    }

    double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }


}
