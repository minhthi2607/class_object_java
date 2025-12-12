package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double delta = qe.getDiscriminant();
        if (delta < 0) {
            System.out.println("Chương trình vô nghiệm");
        } else if (delta > 0) {
            System.out.println("Chương trình có 2 nghiêm:");
            System.out.println("x1 = " + qe.getRoot1() + " ");
            System.out.println("x2 = " + qe.getRoot2() + " ");
        } else if (delta == 0) {
            System.out.println("Chương trình có 1 nghiệm");
            System.out.println("x1 = x2 = " + qe.getRoot1());
        }
        ;

    }
}
