package com.company;

import java.util.Scanner;

class Triangle extends Shapes {
    private int base;
    private int sideOne;
    private int sideTwo;
    private int height;

    void getParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set base");
        base = scanner.nextInt();
        System.out.println("Set side one");
        sideOne = scanner.nextInt();
        System.out.println("Set side two");
        sideTwo = scanner.nextInt();
        System.out.println("Set height");
        height = scanner.nextInt();
    }

    void getArea() {
        System.out.println("Triangle area is: " + (0.5 * base * height));
    }

    void getPerimeter() {
        System.out.println("Triangle perimeter is: " + (base + sideOne + sideTwo));
    }
}
