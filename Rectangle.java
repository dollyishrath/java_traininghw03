package com.trimindtech.training.home03;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length:");
        double l = s.nextDouble();
        System.out.println("Enter the breadth:");
        double b = s.nextDouble();


        double area = l * b;
        System.out.println("Area of Rectangle is: " + area);

        double perimeter = 2 * (l + b);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
}