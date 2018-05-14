package com.company;

import java.util.Scanner;

class Square extends Shapes {
    private Scanner scanner = new Scanner(System.in);
    private int side;

    void getParameter() {
        System.out.println("Set square side length");
        side = scanner.nextInt();
    }

    void getArea() {
        System.out.println("Square area is: " + (side * side));
    }

    void getPerimeter() {
        System.out.println("Square perimeter is: " + (4 * side));
    }
}
