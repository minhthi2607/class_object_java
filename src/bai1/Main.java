package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width :");
        double width = scanner.nextDouble();
        System.out.println("Enter height :");
        double height = scanner.nextDouble();

        Reactangle rectangle = new Reactangle(width, height);

        System.out.println("Your Rectangle " + rectangle.display());
        System.out.println("Perimeter: " + rectangle.getPerimeter() + " Area: " + rectangle.getArea() + "");
    }
}
