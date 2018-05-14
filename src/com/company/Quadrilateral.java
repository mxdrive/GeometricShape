package com.company;

import java.util.Scanner;

class Quadrilateral extends Shapes {
    private int sideOne;
    private int sideTwo;

    void getParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set first quadrilateral side length");
        sideOne = scanner.nextInt();
        System.out.println("Set second quadrilateral side length");
        sideTwo = scanner.nextInt();

    }

    void getArea() {
        System.out.println("Quadrilateral area is: " + (sideOne * sideTwo));
    }

    void getPerimeter() {
        System.out.println("Square perimeter is: " + (2 * sideOne + 2 * sideTwo));
    }
}
