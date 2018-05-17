package com.company;

import java.util.Scanner;

class Trapezoid extends Shapes {
    private int baseOne;
    private int baseTwo;
    private int sideOne;
    private int sideTwo;
    private int height;

    void getParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set base one");
        baseOne = scanner.nextInt();
        System.out.println("Set base two");
        baseTwo = scanner.nextInt();
        System.out.println("Set side one");
        sideOne = scanner.nextInt();
        System.out.println("Set side two");
        sideTwo = scanner.nextInt();
        System.out.println("Set height");
        height = scanner.nextInt();
    }

    void getArea() {
        System.out.println("Trapezoid area is: " + ((baseOne + baseTwo)/2 + height));
    }

    void getPerimeter() {
        System.out.println("Trapezoid perimeter is: " + (baseOne + baseTwo + sideOne + sideTwo));
    }
}
