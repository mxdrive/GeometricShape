package com.company;

import java.util.Scanner;

class Circle extends Shapes {
    private int radius;

    void getParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set radius");
        radius = scanner.nextInt();
    }

    void getArea() {
        System.out.println("Circle area is: " + (3.14 * radius * radius));
    }

    void getPerimeter() {
        System.out.println("Circle perimeter is: " + (6.28 * radius));
    }
}
